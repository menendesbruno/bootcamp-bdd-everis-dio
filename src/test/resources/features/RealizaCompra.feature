#language: pt
#encoding: utf-8


Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar

	@test
  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com/"
  	E pesquisa pelo produto "Blouse"
  	Quando adiciona o produto "Blouse" ao carrinho
  	Entao o produto "Blouse" deve estar presente no carrinho

	Cenario: Aumentar a quantidade de produto atraves do detalhes do produto
		Dado que um usuario acessa o site "http://automationpractice.com/"
		E pesquisa pelo produto "Dress"
		E acessa o produto "Printed Chiffon Dress"
		E aumenta a quantidade produto
		Quando adiciona o produto "Printed Chiffon Dress" ao carrinho
		Entao  o produto "Printed Chiffon Dress" deve possuir a quantidade 2

	Cenario: Realizar Compra
		Dado que um usuario acessa o site "http://automationpractice.com/"
		E pesquisa pelo produto "Blouse"
		E adiciona o produto "Blouse" ao carrinho
		E acessa o checkout
		E realiza o login
		E confirma o endereco de entrega
		E escolhe a forma de transporte
		Quando o pagamento for confirmado
		Entao deve ser apresentado a mensagem "Your order on My store is complete."