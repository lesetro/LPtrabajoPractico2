
package LBtrabajopractico2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {
    protected LocalDate dia;
    protected LocalTime hora;
    protected String modelo;
    protected String numSerie;

    public Reloj() {
    }

    public Reloj(LocalDate dia, LocalTime hora, String modelo, String numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public LocalDate getDia() {
        return dia;
    }
    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    // Métodos Extra
    public void incrementarDia(){
        this.dia = this.dia.plusDays(1);
        System.out.println("Se incrementó un día: " + this.dia);
    }

    public void incrementarHora(){
        this.hora = this.hora.plusHours(1);
        System.out.println("Se incrementó una hora: " + this.hora);
    }

    public void limpiarPantalla(){
        System.out.println("Se limpió la pantalla satisfactoriamente");
    }

    
}