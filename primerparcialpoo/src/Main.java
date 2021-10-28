public class Main {
    public static void main(String[] args) {
        Actor primerActor = new Actor("Alberto", "Perciavalle", "Argentina", 1980);
        Actor segundoActor = new Actor("Kevin", "Perciavalle", "Argentina", 1980);
        Actor tercerActor = new Actor("Kev", "Perciavalle", "Argentina", 1980);
        Actor cuartoActor = new Actor("Alber", "Perciavalle", "Argentina", 1980);

        Pelicula primerPelicula = new Pelicula("Titanic", 120, 2000, "Romance");
        Pelicula segundaPelicula = new Pelicula("El Rey Leon", 120,2000, "infantil");

        Cine nuevoCine = new Cine("Nuevo Cine", "Buenos Aires");

        primerPelicula.agregarActor(primerActor);
        primerPelicula.agregarActor(segundoActor);

        segundaPelicula.agregarActor(tercerActor);
        segundaPelicula.agregarActor(cuartoActor);

        nuevoCine.agregarPelicula(primerPelicula);
        nuevoCine.agregarPelicula(segundaPelicula);

        primerPelicula.mostrarActores();
        segundaPelicula.mostrarActores();

        nuevoCine.mostrarPelicula();
    }




}
