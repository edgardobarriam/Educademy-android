package io.github.edgardobarriam.educademy.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by edgar on 27-02-2018.
 */

public class Semestre implements Parcelable{
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

    protected Semestre(Parcel in) {
        numeroSemestre = in.readString();
        ramosSemestre = in.createStringArrayList();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(numeroSemestre);
        dest.writeStringList(ramosSemestre);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Semestre> CREATOR = new Creator<Semestre>() {
        @Override
        public Semestre createFromParcel(Parcel in) {
            return new Semestre(in);
        }

        @Override
        public Semestre[] newArray(int size) {
            return new Semestre[size];
        }
    };

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
