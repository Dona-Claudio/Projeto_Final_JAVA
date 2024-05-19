abstract class Produto {
    private int codigoProduto;
    private String tipoProduto;
    private String descrProduto;
    private double precoProduto;
    private String chaveCT_e;
    private String nomeFornecedor;
    private String nomeFabricante;
    private int qtdEstoqueProduto;

    public Produto(int codigoProduto, String tipoProduto, String descrProduto, double precoProduto, String chaveCT_e, String nomeFornecedor,String nomeFabricante, int qtdEstoqueProduto) {
        this.codigoProduto = codigoProduto;
        this.tipoProduto = tipoProduto;
        this.descrProduto = descrProduto;
        this.precoProduto = precoProduto;
        this.chaveCT_e = chaveCT_e;
        this.nomeFornecedor = nomeFornecedor;
        this.nomeFabricante = nomeFabricante;
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getDescrProduto() {
        return descrProduto;
    }

    public void setDescrProduto(String descrProduto) {
        this.descrProduto = descrProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getChaveCT_e() {
        return chaveCT_e;
    }

    public void setChaveCT_e(String chaveCT_e) {
        this.chaveCT_e = chaveCT_e;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(int qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }
}
