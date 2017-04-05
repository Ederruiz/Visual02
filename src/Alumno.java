/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eder0
 */
public class Alumno {
    private String nombre;
    private String comentario;
    private Character sexo;
    private String edocivil;
    private String carrera;
    private Integer semestre;
    private Boolean condicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEdocivil() {
        return edocivil;
    }

    public void setEdocivil(String edocivil) {
        this.edocivil = edocivil;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Boolean getCondicion() {
        return condicion;
    }

    public void setCondicion(Boolean condicion) {
        this.condicion = condicion;
    }
    
    @Override
    public String toString(){
       return " "+sexo+" "+nombre+" "+" "+semestre+" "+carrera+" " +condicion+" "+comentario+" "+edocivil; 
    }
    
}
