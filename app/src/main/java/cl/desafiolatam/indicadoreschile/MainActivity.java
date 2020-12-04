package cl.desafiolatam.indicadoreschile;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.indicadoreschile.model.Indicador;
import cl.desafiolatam.indicadoreschile.model.Repositorio;
import cl.desafiolatam.indicadoreschile.presenter.Presenter;
import cl.desafiolatam.indicadoreschile.presenter.PresenterView;
import cl.desafiolatam.indicadoreschile.view.IndicadorAdapter;

/*
Requerimientos:
    [] MVP
    [] Data binding
    [] Retrofit (API)
    [] Recycleview
 Tareas por hacer
   4. [X] Crear clase modelo
          *POJO´s
          *RetrofitClient
   1. [X] Activar  databinding
   2. [X] Implemantar retrofit - recycleview
   5. [X] Crear clase presentador
          *Interfaz presentador
   6. [X] Clase Adapter, viewholder, recycleview
   3. [X] Layout
          +Instanciar databinding
          +Configurar  databinding
   7. [] Enlazar vista con presentador
 */
public class MainActivity extends AppCompatActivity implements PresenterView {


    private static final String TAG = "Repositorio";
    private Presenter presenter;
    private IndicadorAdapter adapter;
    private RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this, new Repositorio());
        adapter=new IndicadorAdapter(new ArrayList<>());
        recyclerview=findViewById(R.id.viewRecicler);
        recyclerview.setLayoutManager(new LinearLayoutManager(getParent()));
        recyclerview.setAdapter(adapter);


    }


    @Override
    public void showInfo(List<Indicador> listaIndicadores) {
        Log.d(TAG, "showInfo: Mostrando la info en Main Activity" + listaIndicadores.toString());
        adapter.update(listaIndicadores);
    }
}