package cl.desafiolatam.indicadoreschile.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.indicadoreschile.R;
import cl.desafiolatam.indicadoreschile.model.Indicador;

public class IndicadorAdapter extends RecyclerView.Adapter<IndicadorAdapter.IndicadorVH> {

    private static final String TAG = "Repositorio";



    private final List<Indicador> indicadores;


    public IndicadorAdapter(List<Indicador> indicadores) {
        this.indicadores = indicadores;
    }


    @NonNull
    @Override
    public IndicadorVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_indicadores,parent,false);

        return new IndicadorVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IndicadorVH holder, int position) {

        Indicador indicador = indicadores.get(position);
        Log.d(TAG, "onBindViewHolder: "+indicador);
        holder.bind(indicador);
    }

    @Override
    public int getItemCount() {
        return indicadores.size();
    }

    public void update(List<Indicador> listaIndicadores) {
        indicadores.clear();
        indicadores.addAll(listaIndicadores);
        notifyDataSetChanged();
    }

    public class IndicadorVH extends RecyclerView.ViewHolder {
        private TextView tvName;
        public IndicadorVH(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvNombre);
        }
        public void bind (Indicador i) {
            Log.d(TAG, "bind: "+i.getNombre());
        tvName.setText(i.getNombre());

    }




    }
}
