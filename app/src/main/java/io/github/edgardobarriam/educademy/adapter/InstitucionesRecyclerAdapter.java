package io.github.edgardobarriam.educademy.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.Institucion;

/**
 * Created by Edgardo Barría Melián on 03-12-2017.
 */

public class InstitucionesRecyclerAdapter  extends RecyclerView.Adapter<InstitucionesRecyclerAdapter.InstitucionViewHolder>{
    private final List<Institucion> listaInstituciones;
    private final OnItemClickListener onItemClickListener;
    private Context context;

    public InstitucionesRecyclerAdapter(Context context, List<Institucion> listaInstituciones, OnItemClickListener listener) {
        this.context = context;
        this.listaInstituciones = listaInstituciones;
        this.onItemClickListener = listener;
    }

    @Override
    public InstitucionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instituciones_recycler_item, parent, false);
        return new InstitucionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final InstitucionViewHolder holder, int position) {
        final Institucion institucionBindeada = listaInstituciones.get(position);

        // Render Logo
        Picasso.with(context).load(institucionBindeada.getUrlLogoInstitucion()).into(holder.logoInstitucion);

        holder.nombreInstitucion.setText(institucionBindeada.getNombreInstitucion());
        holder.nombreCortoInstitucion.setText(institucionBindeada.getNombreCortoInstitucion());
        holder.bind(institucionBindeada, onItemClickListener);

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

        public void bind(final Institucion item, final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Institucion item);
    }

}
