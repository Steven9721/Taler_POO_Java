package interfaces;

import java.time.LocalDate;

public interface Agendable {
  //COMPORTAMIENTO QUE OTRAS CLASES DEBEN IMPLEMENTAR
  public void agendarCita(LocalDate fecha);
  public void cancelarCita();
  public void reagendarCita(LocalDate fecha);

  

}
