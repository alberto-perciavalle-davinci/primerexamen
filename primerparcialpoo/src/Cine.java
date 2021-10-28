import java.util.ArrayList;

public class Cine {

    //ATRIBUTOS
    String nombre;
    String ciudad;
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    //CONSTRUCTORES

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Cine(String nombre) {
        this.nombre = nombre;
    }

    //METODOS
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    public void eliminarPelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    public void mostrarPelicula(){
        System.out.println("Peliculas de la cartelera " + this.peliculas);
        for (int i = 0; i < this.peliculas.size(); i++) {
            System.out.println(this.peliculas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Bienvenido al cine: " + this.nombre;
    }
}
