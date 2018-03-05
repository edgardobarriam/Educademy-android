package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by edgar on 05-03-2018.
 */

public class Carrera {
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("nombreCarrera")
    @Expose
    private String nombreCarrera;
    @SerializedName("areaConocimientoCarrera")
    @Expose
    private String areaConocimientoCarrera;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getAreaConocimientoCarrera() {
        return areaConocimientoCarrera;
    }

    public void setAreaConocimientoCarrera(String areaConocimientoCarrera) {
        this.areaConocimientoCarrera = areaConocimientoCarrera;
    }
}
