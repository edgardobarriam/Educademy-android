package io.github.edgardobarriam.educademy.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.SedeInstitucion;

/**
 * Created by edgar on 02-03-2018.
 */

public class SedesInstitucionRecyclerAdapter extends RecyclerView.Adapter<SedesInstitucionRecyclerAdapter.SedeViewHolder>{
    private final List<SedeInstitucion> listaSedes;
    private final OnItemClickListener onItemClickListener;

    public SedesInstitucionRecyclerAdapter(List<SedeInstitucion> listaSedes, OnItemClickListener onItemClickListener) {
        this.listaSedes = listaSedes;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public SedeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_sede_institucion, parent, false);
        return new SedeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SedeViewHolder holder, int position) {
        SedeInstitucion sedeBindeada = listaSedes.get(position);

        holder.nombreSede.setText(sedeBindeada.getNombreSede());
        holder.direccionSede.setText(sedeBindeada.getDireccionSede());
        holder.bind(sedeBindeada, onItemClickListener);
    }


    @Override
    public int getItemCount() {
        return listaSedes.size();
    }

    public static class SedeViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView nombreSede;
        TextView direccionSede;

        public SedeViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.crvSede);
            nombreSede = itemView.findViewById(R.id.txvNombreSede);
            direccionSede = itemView.findViewById(R.id.txvDireccionSede);
        }

        public void bind(final SedeInstitucion item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(SedeInstitucion item);
    }
}
