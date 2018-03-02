package io.github.edgardobarriam.educademy.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class SedeInstitucion implements Parcelable{
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

    protected SedeInstitucion(Parcel in) {
        nombreSede = in.readString();
        direccionSede = in.readString();
        fonoSede = in.readString();
        facultadesSede = in.createTypedArrayList(FacultadesSede.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombreSede);
        dest.writeString(direccionSede);
        dest.writeString(fonoSede);
        dest.writeTypedList(facultadesSede);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SedeInstitucion> CREATOR = new Creator<SedeInstitucion>() {
        @Override
        public SedeInstitucion createFromParcel(Parcel in) {
            return new SedeInstitucion(in);
        }

        @Override
        public SedeInstitucion[] newArray(int size) {
            return new SedeInstitucion[size];
        }
    };

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
