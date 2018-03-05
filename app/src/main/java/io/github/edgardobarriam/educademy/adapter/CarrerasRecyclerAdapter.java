package io.github.edgardobarriam.educademy.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.Carrera;

/**
 * Created by edgar on 05-03-2018.
 */

public class CarrerasRecyclerAdapter extends RecyclerView.Adapter<CarrerasRecyclerAdapter.CarrerasViewHolder>{
    private final List<Carrera> listaCarreras;
    private final OnItemClickListener onItemClickListener;


    public CarrerasRecyclerAdapter(List<Carrera> listaCarreras, OnItemClickListener onItemClickListener) {
        this.listaCarreras = listaCarreras;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public CarrerasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_carrera, parent, false);
        return new CarrerasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrerasViewHolder holder, int position) {
        Carrera carreraBindeada = listaCarreras.get(position);

        holder.nombreCarrera.setText(carreraBindeada.getNombreCarrera());
        holder.bind(carreraBindeada, onItemClickListener);

    }

    @Override
    public int getItemCount() {
        return listaCarreras.size();
    }

    public static class CarrerasViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView nombreCarrera;

        CarrerasViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.crvCarrera);
            nombreCarrera  = itemView.findViewById(R.id.txvNombreCarrera);
        }

        public void bind(final Carrera item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Carrera item);
    }

}
