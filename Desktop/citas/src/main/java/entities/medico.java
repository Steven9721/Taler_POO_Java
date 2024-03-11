package entities;

public class medico extends Usuario {

private int registroMedico;

private Long Especialidad;

public Long getEspecialidad() {
    return Especialidad;
}
public void setEspecialidad(Long especialidad) {
    Especialidad = especialidad;
}





public int getRegistroMedico() {
    return registroMedico;
}
public void setRegistroMedico(int registroMedico) {
    this.registroMedico = registroMedico;
}


public medico(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroidentificacion, int registroMedico, Long Especialidad) {
    //SUPER: Invocando al constructor
    //clase padre
    //La invocacion a super
    super(id,
     nombres, 
     apellidos,
     tipoIdentificacion,
     numeroidentificacion);
     //Despues de los atributos de la clase hija
    this.registroMedico=registroMedico;
    this.Especialidad=Especialidad;
}



} 


