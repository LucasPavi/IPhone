package funcionalidades.smartphone;

import funcionalidades.navegador.Navegador;
import funcionalidades.reprodutor.Reprodutor;
import funcionalidades.telefone.Chamadas;

public class Smartphone implements Navegador, Reprodutor, Chamadas {


	public void ligar() {
		System.out.println("Ligando para o numero discado");
	}
	public void atender() {
		System.out.println("Atendendo a chamada");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo mensagens no correio de voz");
	}
	public void tocar() {
		System.out.println("Tocando musica selecionada");
	}
	public void pausar() {
		System.out.println("Pausando musica");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}
	public void exibirPagina() {
		System.out.println("Exibindo conteudo da pagina");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba ao navegador");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando conteudo da pagina no navegador");
	}

}
