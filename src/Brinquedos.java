public class Brinquedos extends Produto implements IMetodos{
    private String indicEspecieBrinquedo;
    private String materialBrinquedo;

    public Brinquedos(int codigoProduto, String tipoProduto, String descrProduto, double precoProduto, String chaveCT_e, String nomeFornecedor, String nomeFabricante, int qtdEstoqueProduto, String indicEspecieBrinquedo, String materialBrinquedo) {
        super(codigoProduto, tipoProduto, descrProduto, precoProduto, chaveCT_e, nomeFornecedor, nomeFabricante, qtdEstoqueProduto);
        this.indicEspecieBrinquedo = indicEspecieBrinquedo;
        this.materialBrinquedo = materialBrinquedo;
    }

    public String getIndicEspecieBrinquedo() {
        return indicEspecieBrinquedo;
    }

    public void setIndicEspecieBrinquedo(String indicEspecieBrinquedo) {
        this.indicEspecieBrinquedo = indicEspecieBrinquedo;
    }

    public String getMaterialBrinquedo() {
        return materialBrinquedo;
    }

    public void setMaterialBrinquedo(String materialBrinquedo) {
        this.materialBrinquedo = materialBrinquedo;
    }

    @Override
    public void mostrarDados(){
        System.out.println(getCodigoProduto());
        System.out.println(getTipoProduto());
        System.out.println(getDescrProduto());
        System.out.println(getPrecoProduto());
        System.out.println(getChaveCT_e());
        System.out.println(getNomeFornecedor());
        System.out.println(getNomeFabricante());
        System.out.println(getQtdEstoqueProduto());
        System.out.println(getIndicEspecieBrinquedo());
        System.out.println(getMaterialBrinquedo());
    }
}
