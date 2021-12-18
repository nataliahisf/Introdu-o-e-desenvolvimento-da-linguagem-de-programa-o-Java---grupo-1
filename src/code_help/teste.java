package code_help;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class teste 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		int pedido = Integer.parseInt(JOptionPane.showInputDialog("Faça seu pedido\n1 - amarelo\n2 - vermelho\n3 - roxo\n4 - verde"));
	
	if (pedido==1)
	{
		System.out.println("Você será direcionado(a) para um(a) atendente...");
	}
	else if(pedido==2)
	{
		System.out.println("Seu pedido está a caminho do endereço!"); //risco iminente a vida, uma viatura seria enviada
	}
	else if(pedido==3)
	{
		System.out.println("Seu pedido está indo até você!");
	}
	else if (pedido==4)
	{
		int atendente = Integer.parseInt(JOptionPane.showInputDialog("Deseja falar com um atendente agora?\n1 - sim\n2 - não"));
		int verde=entrada.nextInt();
		
	if (verde==1)
	{
		System.out.println("Estamos direcionando seu contato, por gentileza, aguarde.");
	}
	else if (verde==2)
	{
		verde = Integer.parseInt(JOptionPane.showInputDialog("Deseja registrar o seu contato?\n1 - sim\n2 - não"));
		
			if (verde==1)
			{
				System.out.println("Digite aqui seu contato: ");
				int caixa2=entrada.nextInt();
			}
			else
			{
				System.out.println("Orientações em tela para procedimento da denuncia.");
			}
	}
	}
}	

}
