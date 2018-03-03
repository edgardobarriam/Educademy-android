package io.github.edgardobarriam.educademy.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

/**
 * Created by edgar on 03-03-2018.
 */

public class CarrerasSedeRecyclerAdapter  extends RecyclerView.Adapter<CarrerasSedeRecyclerAdapter.CarreraSedeViewHolder>{
    private final List<CarreraEspecifica> listaCarreras;
    private final OnItemClickListener onItemClickListener;

    public CarrerasSedeRecyclerAdapter(List<CarreraEspecifica> listaCarreras, OnItemClickListener onItemClickListener) {
        this.listaCarreras = listaCarreras;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public CarreraSedeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_carrera_sede, parent, false);
        return new CarreraSedeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarreraSedeViewHolder holder, int position) {
        CarreraEspecifica carreraBindeada = listaCarreras.get(position);
        holder.nombreCarrera.setText(carreraBindeada.getNombreCarreraEsp());
        holder.areaConocimientoCarrera.setText(carreraBindeada.getAreaConocimientoCarreraEsp());
        holder.bind(carreraBindeada, onItemClickListener);
    }

    @Override
    public int getItemCount() {
        return listaCarreras.size();
    }

    public static class CarreraSedeViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView nombreCarrera;
        TextView areaConocimientoCarrera;

        public CarreraSedeViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.crvCarreraSede);
            nombreCarrera = itemView.findViewById(R.id.txvNombreCarreraSede);
            areaConocimientoCarrera = itemView.findViewById(R.id.txvAreaConocimientoCarreraSede);
        }

        public void bind(final CarreraEspecifica item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(CarreraEspecifica item);
    }
}
