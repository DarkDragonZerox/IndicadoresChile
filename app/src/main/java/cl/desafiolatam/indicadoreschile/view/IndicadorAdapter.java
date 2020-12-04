package cl.desafiolatam.indicadoreschile.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.desafiolatam.indicadoreschile.R;
import cl.desafiolatam.indicadoreschile.model.Indicador;

public class IndicadorAdapter extends RecyclerView.Adapter<IndicadorAdapter.IndicadorVH> {

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
        holder.bind(indicador);
    }

    @Override
    public int getItemCount() {
        return indicadores.size();
    }

    public class IndicadorVH extends RecyclerView.ViewHolder {
        public IndicadorVH(@NonNull View itemView) {
            super(itemView);
        }
        public void bind (Indicador i) {

    }




    }
}
