
package LBtrabajopractico2;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private Reloj reloj;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Reloj getReloj() {
        return reloj;
    }
    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    //Metodos Extra
    
    public void hablar() {
        System.out.println("Hola, soy " + nombre);
    }

    public void decirHora() {
        System.out.println("La hora es: " + reloj.getHora());
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

}
