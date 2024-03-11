package entities;
import java.time.LocalDate;

import interfaces.Agendable;
public class CitaMedico extends Cita implements Agendable{
    private medico medico;
    private String motivo;
    private EstadoCita EstadoCita;
    public CitaMedico(int id,
     LocalDate fecha,
     medico me,
     String motivo,
     EstadoCita estado) {
        
        
        
        
        super(id, fecha);
       this.medico=me;
       this.motivo=motivo;
       this.EstadoCita=estado;
    }
    public medico getMedico() {
        return medico;
    }
    public void setMedico(medico medico) {
        this.medico = medico;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public EstadoCita getEstadoCita() {
        return EstadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        EstadoCita = estadoCita;
    }
    @Override
    public void agendarCita(LocalDate fecha) {
      super.setFecha(fecha);
      this.EstadoCita=estado;
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public void cancelarCita() {
       
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }
    @Override
    public void reagendarCita(LocalDate fecha) {
        
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }

}
