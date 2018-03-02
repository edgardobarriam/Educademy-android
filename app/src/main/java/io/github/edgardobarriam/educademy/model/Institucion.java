package io.github.edgardobarriam.educademy.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.github.edgardobarriam.educademy.R;

/**
 * Created by edgar on 27-02-2018.
 */

public class Institucion implements Parcelable{

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
    @SerializedName("urlLogoInstitucion")
    @Expose
    private String urlLogoInstitucion;

    public Institucion(String id, String nombreInstitucion, String nombreCortoInstitucion, String rankingInstitucion, String tipoInstitucion, String gradoInstitucion, Boolean isAcreditadaInstitucion, List<SedeInstitucion> sedesInstitucion, String urlLogoInstitucion) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.nombreCortoInstitucion = nombreCortoInstitucion;
        this.rankingInstitucion = rankingInstitucion;
        this.tipoInstitucion = tipoInstitucion;
        this.gradoInstitucion = gradoInstitucion;
        this.isAcreditadaInstitucion = isAcreditadaInstitucion;
        this.sedesInstitucion = sedesInstitucion;
        this.urlLogoInstitucion = urlLogoInstitucion;
    }

    protected Institucion(Parcel in) {
        id = in.readString();
        nombreInstitucion = in.readString();
        nombreCortoInstitucion = in.readString();
        rankingInstitucion = in.readString();
        tipoInstitucion = in.readString();
        gradoInstitucion = in.readString();
        byte tmpIsAcreditadaInstitucion = in.readByte();
        isAcreditadaInstitucion = tmpIsAcreditadaInstitucion == 0 ? null : tmpIsAcreditadaInstitucion == 1;
        sedesInstitucion = in.createTypedArrayList(SedeInstitucion.CREATOR);
        urlLogoInstitucion = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(nombreInstitucion);
        dest.writeString(nombreCortoInstitucion);
        dest.writeString(rankingInstitucion);
        dest.writeString(tipoInstitucion);
        dest.writeString(gradoInstitucion);
        dest.writeByte((byte) (isAcreditadaInstitucion == null ? 0 : isAcreditadaInstitucion ? 1 : 2));
        dest.writeTypedList(sedesInstitucion);
        dest.writeString(urlLogoInstitucion);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Institucion> CREATOR = new Creator<Institucion>() {
        @Override
        public Institucion createFromParcel(Parcel in) {
            return new Institucion(in);
        }

        @Override
        public Institucion[] newArray(int size) {
            return new Institucion[size];
        }
    };

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

    public String getUrlLogoInstitucion() {
        return urlLogoInstitucion;
    }

    public void setUrlLogoInstitucion(String urlLogoInstitucion) {
        this.urlLogoInstitucion = urlLogoInstitucion;
    }

}
