package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 05-03-2018.
 */

    public class ApiResponseCarreras {

        @SerializedName("resultado")
        @Expose
        private List<Carrera> resultado = null;

    public List<Carrera> getResultado() {
        return resultado;
    }

    public void setResultado(List<Carrera> resultado) {
        this.resultado = resultado;
    }
}
