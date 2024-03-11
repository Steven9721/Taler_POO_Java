package entities;
import java.time.LocalDate;
import interfaces.Agendable;

public class CitaEnfermero extends Cita implements Agendable{
private String procedimiento;
private Enfermero enfermero;
    public CitaEnfermero(int id, LocalDate fecha, Enfermero e, String procedimiento) {
        
        
        
        super(id, fecha);
        
    this.enfermero=e;
    this.procedimiento=procedimiento;
    }
    public String getProcedimiento() {
        return procedimiento;
    }
    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    @Override
    public void agendarCita(LocalDate fecha) {
       super.fecha=fecha;
       
    }
    @Override
    public void cancelarCita() {
        System.out.println("Cita cancelada");
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }
    @Override
    public void reagendarCita(LocalDate fecha) {
     super.fecha=fecha;
    }

    
}
