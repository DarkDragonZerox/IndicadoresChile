package cl.desafiolatam.indicadoreschile.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    private  static final String BASE_URL = "https://mindicador.cl/";

    public static Api getRetrofitInstance(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        Api api = retrofit.create(Api.class);
        return api;
    }

}
