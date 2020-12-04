package cl.desafiolatam.indicadoreschile.model;

import android.util.Log;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositorio {
    private static final String TAG = "Repositorio";

    public void setPr(PresenterRepositorio pr) {
        this.pr = pr;
    }

    private PresenterRepositorio pr;



    public void loadinfo(){
        RetrofitClient.getRetrofitInstance().getIndicadores().enqueue(new Callback<AllIndicadores>() {
            @Override
            public void onResponse(Call<AllIndicadores> call, Response<AllIndicadores> response) {
                Log.d(TAG, "onResponse: "+ response.body());
                List<Indicador> listaIndicadores= new ArrayList<>();
                listaIndicadores.add(response.body().getIpc());
                listaIndicadores.add(response.body().getDolar());
                pr.showInfo(listaIndicadores);
            }

            @Override
            public void onFailure(Call<AllIndicadores> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.toString());
            }
        });
    }

}
