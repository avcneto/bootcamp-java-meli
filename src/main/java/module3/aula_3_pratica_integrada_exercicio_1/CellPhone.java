package module3.aula_3_pratica_integrada_exercicio_1;

public class CellPhone implements Precedente<CellPhone> {
    private String number, holder;

    public CellPhone(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public CellPhone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public int precedeA(CellPhone cellPhone) {
        return this.number.compareTo(cellPhone.number);
    }
}
