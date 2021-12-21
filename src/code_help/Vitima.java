package code_help;

public class Vitima extends APIEMJAVA implements APIEMJAVAINTERFACE {
	private boolean denuncia;
	
	public Vitima (String nomeDaVitima,int telefone,String endereço,String suspeito) {
		super(nomeDaVitima,telefone,endereço,suspeito);
		this.denuncia = denuncia;
	}
	public boolean isDenuncia() {
		return denuncia;
	}
	public void setDenuncia(boolean denuncia) {
		this.denuncia = denuncia;
	}
	public void pessoaInfo() {
		System.out.println("\nO Boletim de Ocorrência foi registrado em nome do solicitante: "+getNomeDaVitima()+". \nO(s) telefone(s) registrados pelo aplicativo: "+getTelefone()+". \nO endereço registrado: "+getEndereço()+". \nO possível suspeito: "+getSuspeito());
	}
	@Override
	public String getendereço() {
		return null;
	}
}
