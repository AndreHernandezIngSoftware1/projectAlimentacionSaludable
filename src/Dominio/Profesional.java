package Dominio;

import java.util.Date;

/*
 * @author André Hernández  ---- Numero de Estudiante: 193234 
 * SEGUNDO OBLIGARORIO      ---- Ingenieria de Software I
 * CLASE Profesional
 * 17/11/2017
 */
public class Profesional extends Persona {

    private String nombreTituloProfesional;
    private Date fechaGraduacion;
    private String paisObtuvoTitulo;

    public String getNombreTituloProfesional() {
        return nombreTituloProfesional;
    }

    public Date getFechaGraduacion() {
        return fechaGraduacion;
    }

    public String getPaisObtuvoTitulo() {
        return paisObtuvoTitulo;
    }

    public void setNombreTituloProfesional(String nombreTituloProfesional) {
        this.nombreTituloProfesional = nombreTituloProfesional;
    }

    public void setFechaGraduacion(Date fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    public void setPaisObtuvoTitulo(String paisObtuvoTitulo) {
        this.paisObtuvoTitulo = paisObtuvoTitulo;
    }


}
