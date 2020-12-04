package cl.desafiolatam.indicadoreschile.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("api")
    Call<AllIndicadores> getIndicadores();
}
