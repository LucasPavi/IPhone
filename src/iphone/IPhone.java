package iphone;

import java.util.Scanner;
import funcionalidades.smartphone.Smartphone;

public class IPhone {
	 public static void main(String[] args) {
		 
		 Smartphone iphone = new Smartphone();
		 
		 System.out.println("Escolha sua funcionalidade: ");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String funcionalidadeEscolhida = scanner.next();
		
		 scanner.close();
		 
		 if(funcionalidadeEscolhida.equals("Safari")) {
			iphone.adicionarNovaAba();
		 	iphone.atualizarPagina();
		 	iphone.exibirPagina();
		 }else if (funcionalidadeEscolhida.equals("IPod")) { 
			iphone.selecionarMusica();
			iphone.tocar();
			iphone.pausar();
		 }else if(funcionalidadeEscolhida.equals("Telefone")) {
			iphone.ligar();
			iphone.atender();
			iphone.iniciarCorreioVoz();
		 }
	
	 }
}
