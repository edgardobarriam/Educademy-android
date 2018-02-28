package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class FacultadesSede {
    @SerializedName("nombreFacultad")
    @Expose
    private String nombreFacultad;
    @SerializedName("carrerasFacultad")
    @Expose
    private List<CarreraEspecifica> carrerasFacultad = null;

    public FacultadesSede(String nombreFacultad, List<CarreraEspecifica> carrerasFacultad) {
        this.nombreFacultad = nombreFacultad;
        this.carrerasFacultad = carrerasFacultad;
    }
}
