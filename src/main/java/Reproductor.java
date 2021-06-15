public interface Reproductor {

  void stop();
  boolean play(int idVideo, Integer minutoInicio);

  void registerOnPlay(PlayListener playListener);
  void registerOnStop(StopListener stopListener);
  void registerOnFinish(FinishListener finishListener);
}
