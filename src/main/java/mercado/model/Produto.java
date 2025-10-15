package mercado.model;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal preco;
    private int quantidade;
    private String codigoProduto;

    public Produto(String codigoProduto, String nome, BigDecimal preco, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
