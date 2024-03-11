package entities;

import java.time.LocalDate;

public class paciente extends Usuario {

private String correoElectronico;
private int celular;
private LocalDate fechanacimiento;
private Double altura;
private Double Peso;
private char factorRH;
private Long TipoSangre;

public Long getTipoSangre() {
    return TipoSangre;
}
public void setTipoSangre(Long tipoSangre) {
    TipoSangre = tipoSangre;
}




public String getCorreoElectronico() {
    return correoElectronico;
}
public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}
public int getCelular() {
    return celular;
}
public void setCelular(int celular) {
    this.celular = celular;
}
public LocalDate getFechanacimiento() {
    return fechanacimiento;
}
public void setFechanacimiento(LocalDate fechanacimiento) {
    this.fechanacimiento = fechanacimiento;
}
public Double getAltura() {
    return altura;
}
public void setAltura(Double altura) {
    this.altura = altura;
}
public Double getPeso() {
    return Peso;
}
public void setPeso(Double peso) {
    Peso = peso;
}

public char getFactorRH() {
    return factorRH;
}
public void setFactorRH(char factorRH) {
    this.factorRH = factorRH;
}

public paciente(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroidentificacion) {
    super(id,
        nombres, apellidos,
        tipoIdentificacion,
        numeroidentificacion);

}


}


