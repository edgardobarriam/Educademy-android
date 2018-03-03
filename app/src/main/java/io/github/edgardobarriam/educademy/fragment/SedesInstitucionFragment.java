package io.github.edgardobarriam.educademy.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.adapter.SedesRecyclerAdapter;
import io.github.edgardobarriam.educademy.model.Institucion;
import io.github.edgardobarriam.educademy.model.SedeInstitucion;

/**
 * A simple {@link Fragment} subclass.
 */
public class SedesInstitucionFragment extends Fragment {
    private Institucion institucion;
    private static final String ARG_INSTITUCION = "institucion";
    private RecyclerView rcvListaSedes;

    public SedesInstitucionFragment() {
        // Required empty public constructor
    }

    public static SedesInstitucionFragment newInstance(Institucion institucion) {
        SedesInstitucionFragment fragment = new SedesInstitucionFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_INSTITUCION, institucion);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            institucion = getArguments().getParcelable(ARG_INSTITUCION);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sedes_institucion, container, false);
        rcvListaSedes = view.findViewById(R.id.rcvListaSedes);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvListaSedes.setLayoutManager(linearLayoutManager);
        rcvListaSedes.setAdapter(new SedesRecyclerAdapter(institucion.getSedesInstitucion(), new SedesRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(SedeInstitucion item) {
                // Iniciar activity de la sede con item
            }
        }));

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //TODO: Init sedes recyclerview
    }
}
