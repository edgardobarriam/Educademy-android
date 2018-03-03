package io.github.edgardobarriam.educademy.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class FacultadesSede implements Parcelable{
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

    protected FacultadesSede(Parcel in) {
        nombreFacultad = in.readString();
        carrerasFacultad = in.createTypedArrayList(CarreraEspecifica.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombreFacultad);
        dest.writeTypedList(carrerasFacultad);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FacultadesSede> CREATOR = new Creator<FacultadesSede>() {
        @Override
        public FacultadesSede createFromParcel(Parcel in) {
            return new FacultadesSede(in);
        }

        @Override
        public FacultadesSede[] newArray(int size) {
            return new FacultadesSede[size];
        }
    };

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public List<CarreraEspecifica> getCarrerasFacultad() {
        return carrerasFacultad;
    }

    public void setCarrerasFacultad(List<CarreraEspecifica> carrerasFacultad) {
        this.carrerasFacultad = carrerasFacultad;
    }
}
