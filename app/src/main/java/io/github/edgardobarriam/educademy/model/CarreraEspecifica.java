package io.github.edgardobarriam.educademy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class CarreraEspecifica {


    @SerializedName("nombreCarreraEsp")
    @Expose
    private String nombreCarreraEsp;
    @SerializedName("areaConocimientoCarreraEsp")
    @Expose
    private String areaConocimientoCarreraEsp;
    @SerializedName("jornadaCarreraEsp")
    @Expose
    private String jornadaCarreraEsp;
    @SerializedName("modalidadCarreraEsp")
    @Expose
    private String modalidadCarreraEsp;
    @SerializedName("descCarreraEsp")
    @Expose
    private String descCarreraEsp;
    @SerializedName("arancelCarreraEsp")
    @Expose
    private String arancelCarreraEsp;
    @SerializedName("vacantesCarreraEsp")
    @Expose
    private String vacantesCarreraEsp;
    @SerializedName("isPsuCarreraEsp")
    @Expose
    private Boolean isPsuCarreraEsp;
    @SerializedName("primerPsuCarreraEsp")
    @Expose
    private String primerPsuCarreraEsp;
    @SerializedName("ultimoPsuCarreraEsp")
    @Expose
    private String ultimoPsuCarreraEsp;
    @SerializedName("lenPsuCarreraEsp")
    @Expose
    private String lenPsuCarreraEsp;
    @SerializedName("matPsuCarreraEsp")
    @Expose
    private String matPsuCarreraEsp;
    @SerializedName("cienPsuCarreraEsp")
    @Expose
    private String cienPsuCarreraEsp;
    @SerializedName("hisPsuCarreraEsp")
    @Expose
    private String hisPsuCarreraEsp;
    @SerializedName("nemPsuCarreraEsp")
    @Expose
    private String nemPsuCarreraEsp;
    @SerializedName("ranPsuCarreraEsp")
    @Expose
    private String ranPsuCarreraEsp;
    @SerializedName("isAcreditadaCarreraEsp")
    @Expose
    private Boolean isAcreditadaCarreraEsp;
    @SerializedName("semestresCarreraEsp")
    @Expose
    private List<Semestre> semestresCarreraEsp = null;

    public CarreraEspecifica(String nombreCarreraEsp, String areaConocimientoCarreraEsp, String jornadaCarreraEsp, String modalidadCarreraEsp, String descCarreraEsp, String arancelCarreraEsp, String vacantesCarreraEsp, Boolean isPsuCarreraEsp, String primerPsuCarreraEsp, String ultimoPsuCarreraEsp, String lenPsuCarreraEsp, String matPsuCarreraEsp, String cienPsuCarreraEsp, String hisPsuCarreraEsp, String nemPsuCarreraEsp, String ranPsuCarreraEsp, Boolean isAcreditadaCarreraEsp, List<Semestre> semestresCarreraEsp) {
        this.nombreCarreraEsp = nombreCarreraEsp;
        this.areaConocimientoCarreraEsp = areaConocimientoCarreraEsp;
        this.jornadaCarreraEsp = jornadaCarreraEsp;
        this.modalidadCarreraEsp = modalidadCarreraEsp;
        this.descCarreraEsp = descCarreraEsp;
        this.arancelCarreraEsp = arancelCarreraEsp;
        this.vacantesCarreraEsp = vacantesCarreraEsp;
        this.isPsuCarreraEsp = isPsuCarreraEsp;
        this.primerPsuCarreraEsp = primerPsuCarreraEsp;
        this.ultimoPsuCarreraEsp = ultimoPsuCarreraEsp;
        this.lenPsuCarreraEsp = lenPsuCarreraEsp;
        this.matPsuCarreraEsp = matPsuCarreraEsp;
        this.cienPsuCarreraEsp = cienPsuCarreraEsp;
        this.hisPsuCarreraEsp = hisPsuCarreraEsp;
        this.nemPsuCarreraEsp = nemPsuCarreraEsp;
        this.ranPsuCarreraEsp = ranPsuCarreraEsp;
        this.isAcreditadaCarreraEsp = isAcreditadaCarreraEsp;
        this.semestresCarreraEsp = semestresCarreraEsp;
    }

    public String getNombreCarreraEsp() {
        return nombreCarreraEsp;
    }

    public void setNombreCarreraEsp(String nombreCarreraEsp) {
        this.nombreCarreraEsp = nombreCarreraEsp;
    }

    public String getAreaConocimientoCarreraEsp() {
        return areaConocimientoCarreraEsp;
    }

    public void setAreaConocimientoCarreraEsp(String areaConocimientoCarreraEsp) {
        this.areaConocimientoCarreraEsp = areaConocimientoCarreraEsp;
    }

    public String getJornadaCarreraEsp() {
        return jornadaCarreraEsp;
    }

    public void setJornadaCarreraEsp(String jornadaCarreraEsp) {
        this.jornadaCarreraEsp = jornadaCarreraEsp;
    }

    public String getModalidadCarreraEsp() {
        return modalidadCarreraEsp;
    }

    public void setModalidadCarreraEsp(String modalidadCarreraEsp) {
        this.modalidadCarreraEsp = modalidadCarreraEsp;
    }

    public String getDescCarreraEsp() {
        return descCarreraEsp;
    }

    public void setDescCarreraEsp(String descCarreraEsp) {
        this.descCarreraEsp = descCarreraEsp;
    }

    public String getArancelCarreraEsp() {
        return arancelCarreraEsp;
    }

    public void setArancelCarreraEsp(String arancelCarreraEsp) {
        this.arancelCarreraEsp = arancelCarreraEsp;
    }

    public String getVacantesCarreraEsp() {
        return vacantesCarreraEsp;
    }

    public void setVacantesCarreraEsp(String vacantesCarreraEsp) {
        this.vacantesCarreraEsp = vacantesCarreraEsp;
    }

    public Boolean getPsuCarreraEsp() {
        return isPsuCarreraEsp;
    }

    public void setPsuCarreraEsp(Boolean psuCarreraEsp) {
        isPsuCarreraEsp = psuCarreraEsp;
    }

    public String getPrimerPsuCarreraEsp() {
        return primerPsuCarreraEsp;
    }

    public void setPrimerPsuCarreraEsp(String primerPsuCarreraEsp) {
        this.primerPsuCarreraEsp = primerPsuCarreraEsp;
    }

    public String getUltimoPsuCarreraEsp() {
        return ultimoPsuCarreraEsp;
    }

    public void setUltimoPsuCarreraEsp(String ultimoPsuCarreraEsp) {
        this.ultimoPsuCarreraEsp = ultimoPsuCarreraEsp;
    }

    public String getLenPsuCarreraEsp() {
        return lenPsuCarreraEsp;
    }

    public void setLenPsuCarreraEsp(String lenPsuCarreraEsp) {
        this.lenPsuCarreraEsp = lenPsuCarreraEsp;
    }

    public String getMatPsuCarreraEsp() {
        return matPsuCarreraEsp;
    }

    public void setMatPsuCarreraEsp(String matPsuCarreraEsp) {
        this.matPsuCarreraEsp = matPsuCarreraEsp;
    }

    public String getCienPsuCarreraEsp() {
        return cienPsuCarreraEsp;
    }

    public void setCienPsuCarreraEsp(String cienPsuCarreraEsp) {
        this.cienPsuCarreraEsp = cienPsuCarreraEsp;
    }

    public String getHisPsuCarreraEsp() {
        return hisPsuCarreraEsp;
    }

    public void setHisPsuCarreraEsp(String hisPsuCarreraEsp) {
        this.hisPsuCarreraEsp = hisPsuCarreraEsp;
    }

    public String getNemPsuCarreraEsp() {
        return nemPsuCarreraEsp;
    }

    public void setNemPsuCarreraEsp(String nemPsuCarreraEsp) {
        this.nemPsuCarreraEsp = nemPsuCarreraEsp;
    }

    public String getRanPsuCarreraEsp() {
        return ranPsuCarreraEsp;
    }

    public void setRanPsuCarreraEsp(String ranPsuCarreraEsp) {
        this.ranPsuCarreraEsp = ranPsuCarreraEsp;
    }

    public Boolean getAcreditadaCarreraEsp() {
        return isAcreditadaCarreraEsp;
    }

    public void setAcreditadaCarreraEsp(Boolean acreditadaCarreraEsp) {
        isAcreditadaCarreraEsp = acreditadaCarreraEsp;
    }

    public List<Semestre> getSemestresCarreraEsp() {
        return semestresCarreraEsp;
    }

    public void setSemestresCarreraEsp(List<Semestre> semestresCarreraEsp) {
        this.semestresCarreraEsp = semestresCarreraEsp;
    }
}
