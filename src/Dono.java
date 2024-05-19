import java.math.BigInteger;

public class Dono extends Pessoa implements IMetodos{

    //Atributos--
    private int planoDono;
    private BigInteger codigoAnimal1 = null;
    private BigInteger codigoAnimal2 = null;
    private BigInteger codigoAnimal3 = null;


    //construtor com todos os argumentos
    public Dono(BigInteger rg, int cpf, String nomeDono, int idadeDono, String enderecoDono, int planoDono, BigInteger codigoAnimal1, BigInteger codigoAnimal2, BigInteger codigoAnimal3) {
        super(rg, cpf, nomeDono, idadeDono, enderecoDono);
        this.planoDono = planoDono;
        this.codigoAnimal1 = codigoAnimal1;
        this.codigoAnimal2 = codigoAnimal2;
        this.codigoAnimal3 = codigoAnimal3;
    }


    //todos os gets e sets
    public int getPlanoDono() {
        return planoDono;
    }

    public void setPlanoDono(int planoDono) {
        this.planoDono = planoDono;
    }

    public BigInteger getCodigoAnimal1() {
        return codigoAnimal1;
    }

    public void setCodigoAnimal1(BigInteger codigoAnimal1) {
        this.codigoAnimal1 = codigoAnimal1;
    }

    public BigInteger getCodigoAnimal2() {
        return codigoAnimal2;
    }

    public void setCodigoAnimal2(BigInteger codigoAnimal2) {
        this.codigoAnimal2 = codigoAnimal2;
    }

    public BigInteger getCodigoAnimal3() {
        return codigoAnimal3;
    }

    public void setCodigoAnimal3(BigInteger codigoAnimal3) {
        this.codigoAnimal3 = codigoAnimal3;
    }

    @Override
    public void mostrarDados(){
        System.out.println("codigo do dono - " + getRg());
        System.out.println("cpf do dono - " + getCpf());
        System.out.println("nome do dono - " + getNomeDono());
        System.out.println("idade do dono - " + getIdadeDono());
        System.out.println("endereço do dono - " + getEnderecoDono());
        System.out.println("plano do dono - " + getPlanoDono());
        System.out.println("codigo do animal 1 - " + getCodigoAnimal1());
        System.out.println("codigo do animal 2 - " + getCodigoAnimal2());
        System.out.println("codigo do animal 3 - " + getCodigoAnimal3());
    }
}
