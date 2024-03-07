package entities;

public class DipendentePartTime extends Dipendente {
    private int oreLavorative;
    public DipendentePartTime(Dipartimento dipartimento) {
        super( dipartimento);
        this.oreLavorative = 25;
    }

    @Override
    public double calculateSalary() {
        return (5*25*20);
    }
}
