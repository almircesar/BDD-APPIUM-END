#language: pt
#coding: utf-8
@PesquisaPorTexto
Funcionalidade: Pesquisa por texto
Eu como usuario
Desejo pesquisar um produto pela caixa de texto
	
	Contexto:
		Dado que eu esteja com o app aberto
		
		@Valido
		Cenario: Pesquisa por texto valida
			Quando eu pesquisar na barra de pesquisa por um produto valido
			E clicar no produto desejado
			Entao a tela do produto deverá ser exibida
		
		@Invalido
		Cenario: Pesquisa por texto invalida
			Quando eu pesquisar na barra de pesquisa por um produto invalido
			Entao será exibido na tela uma mensagem dizendo que o produto não foi encontrado
	