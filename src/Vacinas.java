public class Vacinas extends Produto implements IMetodos
{
    private String indicEspecieVacina;
    private String duracaoVacina;
    private String validadeVacina;
    private String numeroLoteVacina;

    public Vacinas(int codigoProduto, String tipoProduto, String descrProduto, double precoProduto, String chaveCT_e, String nomeFornecedor, String nomeFabricante, int qtdEstoqueProduto, String indicEspecieVacina,String duracaoVacina, String validadeVacina, String numeroLoteVacina) {
        super(codigoProduto, tipoProduto, descrProduto, precoProduto, chaveCT_e, nomeFornecedor, nomeFabricante, qtdEstoqueProduto);
        this.indicEspecieVacina = indicEspecieVacina;
        this.duracaoVacina = duracaoVacina;
        this.validadeVacina = validadeVacina;
        this.numeroLoteVacina = numeroLoteVacina;
    }

    public String getValidadeVacina() {
        return validadeVacina;
    }

    public void setValidadeVacina(String validadeVacina) {
        this.validadeVacina = validadeVacina;
    }

    public String getNumeroLoteVacina() {
        return numeroLoteVacina;
    }

    public void setNumeroLoteVacina(String numeroLoteVacina) {
        this.numeroLoteVacina = numeroLoteVacina;
    }

    public String getIndicEspecieVacina() {
        return indicEspecieVacina;
    }

    public void setIndicEspecieVacina(String indicEspecieVacina) {
        this.indicEspecieVacina = indicEspecieVacina;
    }

    public String getDuracaoVacina() {
        return duracaoVacina;
    }

    public void setDuracaoVacina(String duracaoVacina) {
        this.duracaoVacina = duracaoVacina;
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
        System.out.println(getIndicEspecieVacina());
        System.out.println(getValidadeVacina());
        System.out.println(getNumeroLoteVacina());
        System.out.println("vacinar novamente após " + getDuracaoVacina() + " ano");
    }
    /*tipo de aplicação da vacina
local da vacina
validade da vacina
numer do lote da vacina
nome do fabricante
    private int codigoProduto;
    private String descrProduto;
    private double precoProduto;
    private String chaveCT_e;
    private String nomeFornecedor;
    private int qtdEstoqueProduto;
*/
}
