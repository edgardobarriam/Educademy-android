package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class SedeInstitucion {
    @SerializedName("nombreSede")
    @Expose
    private String nombreSede;
    @SerializedName("direccionSede")
    @Expose
    private String direccionSede;
    @SerializedName("fonoSede")
    @Expose
    private String fonoSede;
    @SerializedName("facultadesSede")
    @Expose
    private List<FacultadesSede> facultadesSede = null;

    public SedeInstitucion(String nombreSede, String direccionSede, String fonoSede, List<FacultadesSede> facultadesSede) {
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
        this.fonoSede = fonoSede;
        this.facultadesSede = facultadesSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getFonoSede() {
        return fonoSede;
    }

    public void setFonoSede(String fonoSede) {
        this.fonoSede = fonoSede;
    }

    public List<FacultadesSede> getFacultadesSede() {
        return facultadesSede;
    }

    public void setFacultadesSede(List<FacultadesSede> facultadesSede) {
        this.facultadesSede = facultadesSede;
    }
}
