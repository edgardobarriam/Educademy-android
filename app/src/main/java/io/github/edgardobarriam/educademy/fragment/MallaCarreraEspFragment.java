package io.github.edgardobarriam.educademy.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MallaCarreraEspFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MallaCarreraEspFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String CARRERA_ESP = "carreraEsp";

    private CarreraEspecifica carreraEspecifica;



    public MallaCarreraEspFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param carreraEspecifica Carrera Específica.

     * @return A new instance of fragment MallaCarreraEspFragment.
     */
    public static MallaCarreraEspFragment newInstance(CarreraEspecifica carreraEspecifica) {
        MallaCarreraEspFragment fragment = new MallaCarreraEspFragment();
        Bundle args = new Bundle();
        args.putParcelable(CARRERA_ESP, carreraEspecifica);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            carreraEspecifica = getArguments().getParcelable(CARRERA_ESP);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_malla_carrera_esp, container, false);
    }

}
