package br.com.generation.collections.exercicios;

public class Estoque {

	private String produto;
	private String codProduto;
	private String marcaProduto;
	private String precoProduto;
	
	public Estoque(String produto, String codProduto, String marcaProduto, String precoProduto) {
		super();
		this.produto = produto;
		this.codProduto = codProduto;
		this.marcaProduto = marcaProduto;
		this.precoProduto = precoProduto;
		
		
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getMarcaProduto() {
		return marcaProduto;
	}

	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	public String getPre�oProduto() {
		return precoProduto;
	}

	public void setPre�oProduto(String pre�oProduto) {
		this.precoProduto = pre�oProduto;
	}
	
	
	public String toString() {
		return "[Produto: "+ this.produto + " C�digo do Produto: "+ this.codProduto+ " Marca do produto: "+this.marcaProduto+" Pre�o do Produto: R$ "+ this.precoProduto+"]";
				
	}
	
}
