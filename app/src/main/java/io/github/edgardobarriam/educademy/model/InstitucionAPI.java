package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class InstitucionAPI {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("nombreInstitucion")
    @Expose
    private String nombreInstitucion;
    @SerializedName("nombreCortoInstitucion")
    @Expose
    private String nombreCortoInstitucion;
    @SerializedName("rankingInstitucion")
    @Expose
    private String rankingInstitucion;
    @SerializedName("tipoInstitucion")
    @Expose
    private String tipoInstitucion;
    @SerializedName("gradoInstitucion")
    @Expose
    private String gradoInstitucion;
    @SerializedName("isAcreditadaInstitucion")
    @Expose
    private Boolean isAcreditadaInstitucion;
    @SerializedName("sedesInstitucion")
    @Expose
    private List<SedeInstitucion> sedesInstitucion = null;

    public InstitucionAPI(String id, String nombreInstitucion, String nombreCortoInstitucion, String rankingInstitucion, String tipoInstitucion, String gradoInstitucion, Boolean isAcreditadaInstitucion, List<SedeInstitucion> sedesInstitucion) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.nombreCortoInstitucion = nombreCortoInstitucion;
        this.rankingInstitucion = rankingInstitucion;
        this.tipoInstitucion = tipoInstitucion;
        this.gradoInstitucion = gradoInstitucion;
        this.isAcreditadaInstitucion = isAcreditadaInstitucion;
        this.sedesInstitucion = sedesInstitucion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getNombreCortoInstitucion() {
        return nombreCortoInstitucion;
    }

    public void setNombreCortoInstitucion(String nombreCortoInstitucion) {
        this.nombreCortoInstitucion = nombreCortoInstitucion;
    }

    public String getRankingInstitucion() {
        return rankingInstitucion;
    }

    public void setRankingInstitucion(String rankingInstitucion) {
        this.rankingInstitucion = rankingInstitucion;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public String getGradoInstitucion() {
        return gradoInstitucion;
    }

    public void setGradoInstitucion(String gradoInstitucion) {
        this.gradoInstitucion = gradoInstitucion;
    }

    public Boolean getAcreditadaInstitucion() {
        return isAcreditadaInstitucion;
    }

    public void setAcreditadaInstitucion(Boolean acreditadaInstitucion) {
        isAcreditadaInstitucion = acreditadaInstitucion;
    }

    public List<SedeInstitucion> getSedesInstitucion() {
        return sedesInstitucion;
    }

    public void setSedesInstitucion(List<SedeInstitucion> sedesInstitucion) {
        this.sedesInstitucion = sedesInstitucion;
    }
}
