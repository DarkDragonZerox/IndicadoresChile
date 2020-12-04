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
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}