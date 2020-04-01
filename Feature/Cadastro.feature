#language: pt
#coding: utf-8
@Cadastro
Funcionalidade: Cadastro de usuarios

	Contexto:
		Dado que eu esteja com o app aberto
		Quando eu navegar até a página de cadastro

		@Valido		
		Cenario: Cadastro com dados válidos
		E eu inserir dados válidos nos campos
		E clicar no botão de Registrar
		Então o usuario deverá ser redirecionado para a tela inicial logado na conta cadastrada

		@Invalido
		Cenario: Cadastro com dados inválidos
		E eu inserir dados inválidos nos campos
		Então não será possível clicar no botão de registrar