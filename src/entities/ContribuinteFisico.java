package entities;

public class ContribuinteFisico extends Contribuinte {

    private Double gastosSaude;

    public ContribuinteFisico() {
        super();
    }

    public ContribuinteFisico(String name, Double renda, Double gastosSaude) {
        super(name, renda);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double tax() {
        double basicTax = (getRenda() < 20000.00) ? getRenda() * 0.15 : getRenda() * 0.25;
        basicTax = basicTax - (getGastosSaude() * 0.5);
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}