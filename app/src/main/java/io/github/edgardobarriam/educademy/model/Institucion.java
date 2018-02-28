package io.github.edgardobarriam.educademy.model;

/**
 * Created by Edgardo Barría Melián on 03-12-2017.
 */

public class Institucion {
    public int idInstitucion;
    public String nombre;
    public String nombreCorto;
    public String colorPrimario;
    public String urlLogo;

    public Institucion(int idInstitucion, String nombre, String nombreCorto, String colorPrimario, String urlLogo) {
        this.idInstitucion = idInstitucion;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.colorPrimario = colorPrimario;
        this.urlLogo = urlLogo;
    }
}
