package funcionalidades.reprodutor;

public class IPod implements Reprodutor{
	
	public void tocar() {
		System.out.println("Tocando musica selecionada");
	}
	public void pausar() {
		System.out.println("Pausando musica");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}
}
