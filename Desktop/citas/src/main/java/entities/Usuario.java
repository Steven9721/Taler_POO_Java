package entities;

public class Usuario {
    //LO PROTECTED EN CLASE PADRE SERA PRIVADO
    //EN CLASES HIJAS.
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected String TipoIdentificacion;
    protected int numeroidentificacion;
    
    public Usuario(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroidentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        TipoIdentificacion = tipoIdentificacion;
        this.numeroidentificacion = numeroidentificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        TipoIdentificacion = tipoIdentificacion;
    }

    public int getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(int numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }




}


