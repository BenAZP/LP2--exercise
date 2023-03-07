
public class Funcionario extends Pessoa{
	private String rg;
	private String cpf;
	
	public Funcionario() {
		super();
		this.rg = "";
		this.cpf = "";
	}
	
	public Funcionario (String nome, Integer ano, Integer mes, Integer dia, String rg, String cpf) {
		super(nome, ano, mes, dia);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return super.toString()+"Rg:"+this.rg+"Cpf:"+this.cpf;
	}
	

}
