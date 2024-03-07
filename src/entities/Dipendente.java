package entities;

import java.util.Random;
import static entities.Dipartimento.AMMINISTRAZIONE;
public abstract class Dipendente {
    private int matricola;
    private double stipendio;
    private String Dipartimento;

    public Dipendente(double stipendio, entities.Dipartimento dipartimento) {
        Random matricolaDipendente = new Random();
        this.matricola = matricolaDipendente.nextInt(1,1000);
        this.stipendio = stipendio;
        Dipartimento = String.valueOf(dipartimento);

    }

    public abstract int calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return Dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        Dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", Dipartimento='" + Dipartimento + '\'' +
                '}';
    }

}
