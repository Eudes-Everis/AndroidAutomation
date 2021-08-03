#language: pt
#encoding: utf-8

@leilao
Funcionalidade: Navegar no aplicativo leilao do android

  @test1
  Cenario: Não deve conseguir logar com usuário e senhas que são inexistentes
    Dado que acessei o app android
    Quando logar com usuário "user123" e senha "123"
    Então Exibe mensagem de erro "Usuário ou senha inválidos"

#  OBS: Para o "Então continua na página", deverá escolher uma dessas opções abaixo:
#  "Pagamentos", "Comprar", "Cadastro", "Login" ou "Home"

  @test2
  Cenario: Não deve conseguir cadastrar usuário usando senhas que não conferem
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "456"
    Então Exibe mensagem de erro "Senhas não conferem"

  @test3
  Cenario: Deve conseguir cadastrar usuário usando senhas que conferem
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Então continua na página "Home"

  @test4
  Cenario: Não deve conseguir cadastrar usuário usando usuário existente
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "456" e confirmação de senha "456"
    Então Exibe mensagem de erro "Usuario já Cadastrado"

  @test5
  Cenario: Deve clicar em um produto e ao comprar não deve conseguir aprovar pagamento sem passar dados do cartão
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Quando comprar o item "Camisa"
    E clicar em comprar
    E clicar comprar na pagina pagamentos
    Então continua na página "Pagamentos"

  @test6
  Cenario: Deve clicar em um produto e ao comprar deve conseguir aprovar pagamento com dados do cartão
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Quando comprar o item "Camisa"
    E clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    Então continua na página "Home"

  @test7
  Cenario: Deve comprar um produto e verificar se o produto que foi comprado está na lista de compras
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Quando comprar o item "Camisa"
    E clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    Quando entrar na lista de pagamentos
    E conferir quantidade de compras se é igual à "1"
    Então continua na página "Home"

  @test8
  Cenario: Quando não comprar produto e verificar se não contém produtos comprados na lista de compras
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Quando entrar na lista de pagamentos
    E conferir quantidade de compras se é igual à "0"
    Então continua na página "Home"

  @test9
  Cenario: Deve comprar dois produto, verificar lista de compras e verificar se volta para a lista de produtos
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    Quando comprar o item "Camisa"
    E clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    Quando comprar o item "Bermuda"
    E clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    Quando entrar na lista de pagamentos
    E conferir quantidade de compras se é igual à "2"
    E voltar para lista de produtos
    Então continua na página "Home"

  @test10
  Cenario: Deve comprar quatro produto e verificar se os produto que foram comprados estão na lista de compras
    Dado que acessei o app android
    Quando acesso à tela de cadastro
    E realizar cadastro com usuario "user123", senha "123" e confirmação de senha "123"
    E logar com usuário "user123" e senha "123"
    E comprar o item "Camisa"
    Quando clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    E comprar o item "Chuteira"
    Quando clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    E comprar o item "Bola de futebol"
    Quando clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    E comprar o item "Bermuda"
    Quando clicar em comprar
    E realizar pagamento com numero do cartao "123", data de validade "01/01/2022" e CVC "123"
    E entrar na lista de pagamentos
    Então conferir quantidade de compras se é igual à "4"

