package module3.aula_2_pratica_integrada_2_excercice_1;

public class Technical extends Employee implements Payment {
    private final double BONIFICACAO = 0.03;
    private final double SALARIO_BASE = 3.200;
    private boolean metaBatida;

    @Override
    public double paySalary() {
        if (isMetaBatida()) {
            return SALARIO_BASE + (SALARIO_BASE * BONIFICACAO);
        }
        return getSalary();
    }


    public boolean isMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(boolean metaBatida) {
        this.metaBatida = metaBatida;
    }

    public Technical(String name, boolean metaBatida) {
        super(name);
        this.metaBatida = metaBatida;
    }

    @Override
    public String toString() {
        return "Technical{" +
                "BONIFICACAO=" + BONIFICACAO +
                ", SALARIO_BASE=" + SALARIO_BASE +
                ", metaBatida=" + metaBatida +
                '}';
    }
}
