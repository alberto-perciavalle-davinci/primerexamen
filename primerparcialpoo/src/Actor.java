public class Actor {

    //ATRIBUTOS
    String nombre;
    String apellido;
    String pais;
    int anioNacimiento;

    //CONSTRUCTORES

    public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
    }

    //METODOS
    public void calcularEdad(int añoActual){
        añoActual = añoActual - anioNacimiento;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
