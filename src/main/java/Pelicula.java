public class Pelicula {

  private int idVideo;
  private Reproductor reproductor;
  private int tiempoEntero;
  private int tiempoRestante;

  public void parar(int tiempo) {
    tiempoRestante = tiempoEntero - tiempo;
    reproductor.stop();
  }
  public void empezar() {
    reproductor.play(idVideo, tiempoEntero);
  }
  public int getIdVideo() {
    return idVideo;
  }

}
