package entities;

public class Dirigente extends Dipendente {
    public Dirigente( Dipartimento dipartimento) {
        super( dipartimento);
    }

    @Override
    public double calculateSalary() {
        return   (1800 + (40*100));
    }

    @Override
    public void checkInAtWork() {
        System.out.println("Io lavoro dalle 8 alle 20");
    }
}
