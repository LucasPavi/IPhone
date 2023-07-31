package funcionalidades.navegador;

public class Safari implements Navegador{
	
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
