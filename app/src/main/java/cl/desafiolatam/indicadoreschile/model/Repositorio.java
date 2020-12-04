package cl.desafiolatam.indicadoreschile.model;

import android.util.Log;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositorio {
    private static final String TAG = "Repositorio";

    public void loadinfo(){
        RetrofitClient.getRetrofitInstance().getIndicadores().enqueue(new Callback<AllIndicadores>() {
            @Override
            public void onResponse(Call<AllIndicadores> call, Response<AllIndicadores> response) {
                Log.d(TAG, "onResponse: "+ response.body());
            }

            @Override
            public void onFailure(Call<AllIndicadores> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }
        });
    }

}
