package entities;

public class ContribuinteJuridico extends Contribuinte{

    private Integer numeroFuncionarios;

    public ContribuinteJuridico() {
        super();
    }

    public ContribuinteJuridico(String name, Double renda, Integer numeroFuncionarios) {
        super(name, renda);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double tax(){
        if (numeroFuncionarios > 10) {
            return getRenda() * 0.14;
        } return getRenda() * 0.16;
    }
}
