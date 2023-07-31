package funcionalidades.telefone;

public class Telefone implements Chamadas{
	
	public void ligar() {
		System.out.println("Ligando para o numero discado");
	}
	public void atender() {
		System.out.println("Atendendo a chamada");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo mensagens no correio de voz");
	}
	
}
