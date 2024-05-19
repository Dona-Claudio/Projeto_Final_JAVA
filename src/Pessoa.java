import java.math.BigInteger;

abstract class Pessoa {
    private BigInteger rg;
    private int cpf = 0;
    private String nomeDono;
    private int idadeDono;
    private String enderecoDono;

    public Pessoa(BigInteger rg, int cpf, String nomeDono, int idadeDono, String enderecoDono) {
        this.rg = rg;
        this.cpf = cpf;
        this.nomeDono = nomeDono;
        this.idadeDono = idadeDono;
        this.enderecoDono = enderecoDono;
    }

    public BigInteger getRg() {
        return rg;
    }

    public void setRg(BigInteger rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getIdadeDono() {
        return idadeDono;
    }

    public void setIdadeDono(int idadeDono) {
        this.idadeDono = idadeDono;
    }

    public String getEnderecoDono() {
        return enderecoDono;
    }

    public void setEnderecoDono(String enderecoDono) {
        this.enderecoDono = enderecoDono;
    }
}
