
package main;


public class Doctores {
    private String nombreC;
    private String especialidad;
    private String id;
    private String contra;
    private String user;
    private int rol;

    public Doctores(String nombreC, String especialidad, String id, String contra, String user, int rol) {
        this.nombreC = nombreC;
        this.especialidad = especialidad;
        this.id = id;
        this.contra = contra;
        this.user = user;
        this.rol = rol;
    }

    public Doctores() {
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    

}




    

