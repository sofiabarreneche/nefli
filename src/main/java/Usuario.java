import java.util.ArrayList;
import java.util.List;


public class Usuario {

  private List<Pelicula> peliculasVistas = new ArrayList<>();
  private List<Pelicula> peliculasVistasHasta = new ArrayList<>();

  public void pausarPelicula(Pelicula pelicula, int timpoDePausa) {
    pelicula.parar(timpoDePausa);
    peliculasVistasHasta.add(pelicula);
  }
  public void empezarPelicula(Pelicula pelicula) {
    pelicula.empezar();
  }
  public List<Pelicula> mostrarPeliculasPendientes() {
    return peliculasVistasHasta;
  }
  public void continuarPelicula(Pelicula pelicula) {
    peliculasVistasHasta.remove(pelicula);
    pelicula.empezar();
    peliculasVistas.add(pelicula);
  }

}
