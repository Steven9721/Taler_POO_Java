package entities;

public class consultorio {
private int id;
private String direccion;
private int numero;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getDireccion() {
    return direccion;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
//CONSTRUCTOR.
public consultorio(int id, String direccion, int numero) {
    this.id = id;
    this.direccion = direccion;
    this.numero = numero;
}
}




