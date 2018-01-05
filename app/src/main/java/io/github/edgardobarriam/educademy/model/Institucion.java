package io.github.edgardobarriam.educademy.model;

/**
 * Created by Edgardo Barría Melián on 03-12-2017.
 */

public class Institucion {
    public int idLogo;
    public String nombre;
    public String nombreCorto;
    public String colorPrimario;

    public Institucion(int idLogo, String nombre, String nombreCorto, String colorPrimario) {
        this.idLogo = idLogo;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.colorPrimario = colorPrimario;
    }
}
