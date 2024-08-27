
package LBtrabajopractico2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Practico2LP {

   
    public static void main(String[] args) {
 
      RelojFit Reloj = new RelojFit(LocalDate.of(2024, Month.MARCH, 25), LocalTime.of(12, 30), "relojTZ", "ADM");

        
        Persona Persona = new Persona("alberto", "palacio", 32, 1.80, Reloj);

       
        System.out.println("La hora es: " + Persona.getReloj().getHora());

        int pasos = ((RelojFit) Persona.getReloj()).cuentaPasos(50, 5);
        System.out.println("Cantidad de pasos: " + pasos);

        double frecuencia = ((RelojFit) Persona.getReloj()).frecuenciaAleatoria();
        System.out.println("Frecuencia aleatoria: " + frecuencia);

       
        Persona.getReloj().incrementarHora();
        Persona.getReloj().incrementarDia();
    }
}