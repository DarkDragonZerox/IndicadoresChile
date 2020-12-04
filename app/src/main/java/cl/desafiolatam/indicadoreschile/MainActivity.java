package cl.desafiolatam.indicadoreschile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
Requerimientos:
    [] MVP
    [] Data binding
    [] Retrofit (API)
    [] Recycleview
 Tareas por hacer
    [] Crear clase modelo
          *POJO´s
          *RetrofitClient
    [] Activar  databinding
    [] Implemantar retrofit - recycleview
    [] Crear clase presentador
          *Interfaz presentador
    [] Clase Adapter, viewholder, recycleview
    [] Layout
          +Instanciar databinding
          +Configurar  databinding
    [] Enlazar vista con presentador
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}