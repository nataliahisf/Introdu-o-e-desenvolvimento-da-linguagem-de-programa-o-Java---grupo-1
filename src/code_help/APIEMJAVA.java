package code_help;

import javax.swing.JOptionPane;

public class APIEMJAVA 
{
	protected String nomeDaVitima;
	protected int telefone; 
	protected String endere�o;
	protected String suspeito;
	
	public APIEMJAVA (String n,int t,String e,String s) {

		this.setNomeDaVitima(n);
		this.setTelefone(t);
		this.setEndere�o(e);
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
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
