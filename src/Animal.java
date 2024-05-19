import java.math.BigInteger;

public class Animal {
    private BigInteger rgDono;
    private String nomeAnimal;
    private String sexo;
    private String raca;
    private String cor;
    private String dataNascimentoAnimal;
    private String microship;
    private BigInteger rga;

    public Animal() {
    }

    public Animal(BigInteger rgDono, String nomeAnimal, String sexo, String raca, String cor, String dataNascimentoAnimal, String microship, BigInteger rga) {
        this.rgDono = rgDono;
        this.nomeAnimal = nomeAnimal;
        this.sexo = sexo;
        this.raca = raca;
        this.cor = cor;
        this.dataNascimentoAnimal = dataNascimentoAnimal;
        this.microship = microship;
        this.rga = rga;
    }

    public BigInteger getRgDono() {
        return rgDono;
    }

    public void setRgDono(BigInteger rgDono) {
        this.rgDono = rgDono;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(String dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }

    public String getMicroship() {
        return microship;
    }

    public void setMicroship(String microship) {
        this.microship = microship;
    }

    public BigInteger getRga() {
        return rga;
    }

    public void setRga(BigInteger rga) {
        this.rga = rga;
    }
}
