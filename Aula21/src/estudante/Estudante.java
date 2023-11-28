 import java.util.Date;
	 import java.text.SimpleDateFormat;
package estudante;



public class Estudante {
	
	private String nome;
	private String cpf;
	private Date datanascimento;
	
	
	 public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public void armazenardata() {
	    	this.nome;
	    	this.cpf;
	    	this.datanascimento = datanascimento;
	        System.out.println("");
}

	     public void mostrarDataNascimento() {
	         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	         System.out.println("Data de nascimento: " + formato.format(dataNascimento));
	     }
 class main {
	 
	 
	 
 }
	   
	 }
