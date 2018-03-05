package io.github.edgardobarriam.educademy.request;

import java.util.List;

import io.github.edgardobarriam.educademy.model.ApiResponse;
import io.github.edgardobarriam.educademy.model.ApiResponseCarreras;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by edgar on 27-02-2018.
 */

public interface ApiInterface {
    @GET("instituciones/{tipoInstitucion}")
    Call<ApiResponse> getInstituciones(@Path("tipoInstitucion") String tipoInstitucion);

    @GET("carreras/{areaConocimiento}")
    Call<ApiResponseCarreras> getCarreras(@Path("areaConocimiento") String areaConocimiento);
}
