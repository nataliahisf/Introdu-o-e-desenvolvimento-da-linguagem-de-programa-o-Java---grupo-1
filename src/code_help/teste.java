package code_help;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int pedido = Integer.parseInt(JOptionPane.showInputDialog("Fa�a seu pedido\n1 - amarelo\n2 - vermelho\n3 - roxo\n4 - verde"));
	
	if (pedido==1)
	{
		System.out.println("Voc� ser� direcionado(a) para um(a) atendente...");
	}
	else if(pedido==2)
	{
		System.out.println("Seu pedido est� a caminho do endere�o!"); //risco iminente a vida, uma viatura seria enviada
	}
	else if(pedido==3)
	{
		System.out.println("Seu pedido est� indo at� voc�!");
	}
	else if (pedido==4)
	{
		int verde = Integer.parseInt(JOptionPane.showInputDialog("Deseja falar com um atendente agora?\n1 - sim\n2 - n�o"));
   	  
		if (verde==1){
				System.out.println("Estamos direcionando seu contato, por gentileza, aguarde.");
		}else {
		verde = Integer.parseInt(JOptionPane.showInputDialog("Deseja registrar o seu contato?\n1 - sim\n2 - n�o"));
		
		if (verde==2)
			{
				System.out.printf("O sil�ncio Mata!");
				int caixa2=entrada.nextInt();
			}
			else
			{
				System.out.println("Orienta��es em tela para procedimento da denuncia.");
				}
			}
		Vitima perigo = new Vitima("Maria da Penha",945177343,"Rua Ford n�20","Marido"); 
		System.out.println("\nA vitima �: "+perigo.getNomeDaVitima()+"\nO telefone registrado no aplicativo �: "+perigo.getTelefone()+"\nO endere�o �: "+perigo.getEndere�o()+". \nE o suspeito � o(a): "+perigo.getSuspeito());
		}
	}
}