
package LBtrabajopractico2;


import java.time.LocalDate;
import java.time.LocalTime;

public class RelojFit extends Reloj {
    

    public RelojFit(LocalDate dia, LocalTime hora, String modelo, String numSerie) {
        super(dia, hora, modelo, numSerie);
        
    }

    
    public int cuentaPasos(int x, int y) {
        return x + y; 
    }

    
    public double frecuenciaAleatoria() {
        return 50 + Math.random() * 100; 
    }
}
