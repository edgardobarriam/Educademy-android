package io.github.edgardobarriam.educademy.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResumenCarreraEspFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResumenCarreraEspFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String CARRERA_ESP = "carreraEsp";
    private CarreraEspecifica carreraEspecifica;

    private TextView txvAreaConocCarreraEsp;
    private TextView txvJornadaCarreraEsp;
    private TextView txvModalidadCarreraEsp;
    private TextView txvArancelConocCarreraEsp;
    private TextView txvVacantesCarreraEsp;
    private TextView txvRequierePsuCarreraEsp;
    private TextView txvMaxPsuCarreraEsp;
    private TextView txvMinPsuCarreraEsp;
    private TextView txvLenPsuCarreraEsp;
    private TextView txvMatPsuCarreraEsp;
    private TextView txvCiePsuCarreraEsp;
    private TextView txvHisPsuCarreraEsp;
    private TextView txvNemPsuCarreraEsp;
    private TextView txvRanPsuCarreraEsp;

    public ResumenCarreraEspFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param carreraEspecifica Carrera Específica.
     * @return A new instance of fragment ResumenCarreraEspFragment.
     */
    public static ResumenCarreraEspFragment newInstance(CarreraEspecifica carreraEspecifica) {
        ResumenCarreraEspFragment fragment = new ResumenCarreraEspFragment();
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
        return inflater.inflate(R.layout.fragment_resumen_carrera_esp, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
       initView(view);
       initData();

    }

    private void initView(View view) {
        txvAreaConocCarreraEsp = view.findViewById(R.id.txvAreaConocCarreraEsp);
        txvJornadaCarreraEsp = view.findViewById(R.id.txvJornadaCarreraEsp);
        txvModalidadCarreraEsp = view.findViewById(R.id.txvModalidadCarreraEsp);
        txvArancelConocCarreraEsp = view.findViewById(R.id.txvArancelCarreraEsp);
        txvVacantesCarreraEsp = view.findViewById(R.id.txvVacantesCarreraEsp);
        txvRequierePsuCarreraEsp = view.findViewById(R.id.txvRequierePsuCarreraEsp);
        txvMaxPsuCarreraEsp = view.findViewById(R.id.txvMaxPsuCarreraEsp);
        txvMinPsuCarreraEsp = view.findViewById(R.id.txvMinPsuCarreraEsp);
        txvLenPsuCarreraEsp = view.findViewById(R.id.txvLenPsuCarreraEsp);
        txvMatPsuCarreraEsp = view.findViewById(R.id.txvMatPsuCarreraEsp);
        txvCiePsuCarreraEsp = view.findViewById(R.id.txvCiePsuCarreraEsp);
        txvHisPsuCarreraEsp = view.findViewById(R.id.txvHisPsuCarreraEsp);
        txvNemPsuCarreraEsp = view.findViewById(R.id.txvNemPsuCarreraEsp);
        txvRanPsuCarreraEsp = view.findViewById(R.id.txvRanPsuCarreraEsp);
    }

    private void initData() {
        txvAreaConocCarreraEsp.setText(carreraEspecifica.getAreaConocimientoCarreraEsp());
        txvJornadaCarreraEsp.setText(carreraEspecifica.getJornadaCarreraEsp());
        txvModalidadCarreraEsp.setText(carreraEspecifica.getModalidadCarreraEsp());
        txvArancelConocCarreraEsp.setText(carreraEspecifica.getArancelCarreraEsp());
        txvVacantesCarreraEsp.setText(carreraEspecifica.getVacantesCarreraEsp());
        txvRequierePsuCarreraEsp.setText(carreraEspecifica.getPsuCarreraEsp() ? "Si" : "No");
        txvMaxPsuCarreraEsp.setText(carreraEspecifica.getPrimerPsuCarreraEsp());
        txvMinPsuCarreraEsp.setText(carreraEspecifica.getUltimoPsuCarreraEsp());
        txvLenPsuCarreraEsp.setText(carreraEspecifica.getLenPsuCarreraEsp());
        txvMatPsuCarreraEsp.setText(carreraEspecifica.getMatPsuCarreraEsp());
        txvCiePsuCarreraEsp.setText(carreraEspecifica.getCiePsuCarreraEsp());
        txvHisPsuCarreraEsp.setText(carreraEspecifica.getHisPsuCarreraEsp());
        txvNemPsuCarreraEsp.setText(carreraEspecifica.getNemPsuCarreraEsp());
        txvRanPsuCarreraEsp.setText(carreraEspecifica.getRanPsuCarreraEsp());
    }
}
