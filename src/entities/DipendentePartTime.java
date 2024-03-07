package entities;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime(double stipendio, entities.Dipartimento dipartimento) {
        super(stipendio, dipartimento);
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
}
