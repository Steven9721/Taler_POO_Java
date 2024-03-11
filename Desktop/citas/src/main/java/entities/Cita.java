package entities;
import java.time.LocalDate;
public class Cita {
protected int id;
protected LocalDate fecha;
protected paciente paciente;
protected consultorio Consultorio;




public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public LocalDate getFecha() {
    return fecha;
}
public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
}

//CONSTRUCTOR
public Cita(int id, LocalDate fecha) {
    this.id = id;
    this.fecha = fecha;
}
public paciente getPaciente() {
    return paciente;
}
public void setPaciente(paciente paciente) {
    this.paciente = paciente;
}



}



