import java.util.AbstractCollection;
import java.util.ArrayList;

public class Pelicula {

    //ATRIBUTOS
    String titulo;
    int duracion;
    int anio;
    String categoria;
    ArrayList<Actor> actor = new ArrayList<Actor>();

    //CONSTRUCTORES

    public Pelicula(String titulo, int duracion, int anio, String categoria) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.anio = anio;
        this.categoria = categoria;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    //METODOS
    public void agregarActor(Actor actores){
        this.actor.add(actores);
    }
    public void eliminarActor(Actor actores){
        this.actor.remove(actores);
    }
    public void mostrarActores(){
        System.out.println("Actores de la pelicula " + this.titulo);
        for (int i = 0; i < this.actor.size(); i++) {
            System.out.println(this.actor.get(i));
        }
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "anio=" + anio +
                '}';
    }
}
