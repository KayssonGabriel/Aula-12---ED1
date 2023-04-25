package aula12;

public class Pessoa {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private int numero;

	public Pessoa(String nome, String telefone, String endereco, String cpf, int numero) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Pessoa [Número " + numero + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", cpf=" + cpf + "]";
	}

}
