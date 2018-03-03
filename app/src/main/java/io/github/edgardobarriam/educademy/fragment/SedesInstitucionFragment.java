package io.github.edgardobarriam.educademy.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.activity.SedeActivity;
import io.github.edgardobarriam.educademy.adapter.SedesInstitucionRecyclerAdapter;
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
        rcvListaSedes.setAdapter(new SedesInstitucionRecyclerAdapter(institucion.getSedesInstitucion(), new SedesInstitucionRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(SedeInstitucion item) {
                Intent intent = new Intent(getContext(), SedeActivity.class);
                intent.putExtra("Sede", item);
                startActivity(intent);
            }
        }));

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
