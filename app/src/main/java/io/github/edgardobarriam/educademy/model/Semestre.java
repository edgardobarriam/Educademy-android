package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

class Semestre {
    @SerializedName("numeroSemestre")
    @Expose
    private String numeroSemestre;
    @SerializedName("ramosSemestre")
    @Expose
    private List<String> ramosSemestre = null;

    public Semestre(String numeroSemestre, List<String> ramosSemestre) {
        this.numeroSemestre = numeroSemestre;
        this.ramosSemestre = ramosSemestre;
    }

    public String getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(String numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public List<String> getRamosSemestre() {
        return ramosSemestre;
    }

    public void setRamosSemestre(List<String> ramosSemestre) {
        this.ramosSemestre = ramosSemestre;
    }
}
