package code_help;

import javax.swing.JOptionPane;

public class APIEMJAVA 
{
	private String nomeDaVitima;
	private int telefone; 
	private String endereço;
	private String suspeito;
	
	public APIEMJAVA (String n,int t,String e,String s) {

		this.setNomeDaVitima(n);
		this.setTelefone(t);
		this.setEndereço(e);
		this.setSuspeito(s);
	}
	public String getNomeDaVitima() {
		return nomeDaVitima;
	}
	public void setNomeDaVitima(String nomeDaVitima) {
		this.nomeDaVitima = nomeDaVitima;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getSuspeito() {
		return suspeito;
	}
	public void setSuspeito(String suspeito) {
		this.suspeito = suspeito;
	}
	
	public void setProvasDeImagens() {
		System.out.println("\nPedido Recebido");
	}
}
