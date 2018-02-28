package io.github.edgardobarriam.educademy.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.InstitucionAPI;

/**
 * Created by Edgardo Barría Melián on 03-12-2017.
 */

public class InstitucionesRecyclerAdapter  extends RecyclerView.Adapter<InstitucionesRecyclerAdapter.InstitucionViewHolder>{
    private final List<InstitucionAPI> listaInstituciones;
    private final OnItemClickListener onItemClickListener;

    public InstitucionesRecyclerAdapter(List<InstitucionAPI> listaInstituciones, OnItemClickListener listener) {
        this.listaInstituciones = listaInstituciones;
        this.onItemClickListener = listener;
    }

    @Override
    public InstitucionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instituciones_recycler_item, parent, false);
        return new InstitucionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InstitucionViewHolder holder, int position) {
        // holder.logoInstitucion.setImageResource(listaInstituciones.get(position).getId());
        holder.nombreInstitucion.setText(listaInstituciones.get(position).getNombreInstitucion());
        holder.nombreCortoInstitucion.setText(listaInstituciones.get(position).getNombreCortoInstitucion());
        holder.bind(listaInstituciones.get(position), onItemClickListener);

    }

    @Override
    public int getItemCount() {
        return listaInstituciones.size();
    }

    public static class InstitucionViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView nombreInstitucion;
        TextView nombreCortoInstitucion;
        ImageView logoInstitucion;

        InstitucionViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.crvInstitucion);
            logoInstitucion = itemView.findViewById(R.id.imvLogoInstitucion);
            nombreInstitucion = itemView.findViewById(R.id.txvNombreInstitucion);
            nombreCortoInstitucion = itemView.findViewById(R.id.txvNombreCortoInstitucion);
        }

        public void bind(final InstitucionAPI item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(InstitucionAPI item);
    }

}
