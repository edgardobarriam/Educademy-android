package io.github.edgardobarriam.educademy.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.activity.FichaCarreraEspActivity;
import io.github.edgardobarriam.educademy.adapter.CarrerasSedeRecyclerAdapter;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;
import io.github.edgardobarriam.educademy.model.FacultadesSede;
import io.github.edgardobarriam.educademy.model.SedeInstitucion;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CarrerasSedeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarrerasSedeFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String SEDE = "Sede";
    private RecyclerView rcvCarrerasSede;
    private SedeInstitucion sede;


    public CarrerasSedeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param sede Sede que contiene las carreras.
     * @return A new instance of fragment CarrerasSedeFragment.
     */
    public static CarrerasSedeFragment newInstance(SedeInstitucion sede) {
        CarrerasSedeFragment fragment = new CarrerasSedeFragment();
        Bundle args = new Bundle();
        args.putParcelable(SEDE, sede);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            sede = getArguments().getParcelable(SEDE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_carreras_sede, container, false);
        rcvCarrerasSede = view.findViewById(R.id.rcvCarrerasSede);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvCarrerasSede.setLayoutManager(linearLayoutManager);

        List<CarreraEspecifica> allCarrerasSede = new ArrayList<>();

        for(FacultadesSede facultad : sede.getFacultadesSede()) {
            allCarrerasSede.addAll(facultad.getCarrerasFacultad());
        }

        rcvCarrerasSede.setAdapter(new CarrerasSedeRecyclerAdapter(allCarrerasSede, new CarrerasSedeRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(CarreraEspecifica item) {
                Intent intent = new Intent(getContext(), FichaCarreraEspActivity.class);
                intent.putExtra("CarreraEsp", item);
                startActivity(intent);
            }
        }));
        return view;
    }

}
