package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class ApiResponse {
    @Expose
    @SerializedName("resultado")
    private List<InstitucionAPI> listaInstituciones;

    public List<InstitucionAPI> getListaInstituciones() {
        return listaInstituciones;
    }

    public void setListaInstituciones(List<InstitucionAPI> listaInstituciones) {
        this.listaInstituciones = listaInstituciones;
    }
}
