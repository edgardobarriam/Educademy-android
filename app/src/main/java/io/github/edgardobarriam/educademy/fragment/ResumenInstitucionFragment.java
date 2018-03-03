package io.github.edgardobarriam.educademy.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.Institucion;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResumenInstitucionFragment extends Fragment {
    private static final String ARG_INSTITUCION = "arg_institucion";
    private Institucion institucion;

    private TextView txvInfoNombreInstitucion;
    private TextView txvInfoTipoInstitucion;
    private TextView txvInfoTipoPerfil;
    private TextView txvInfoRanking;
    private TextView txvInfoAcreditada;


    public ResumenInstitucionFragment() {
        // Required empty public constructor
    }

    public static ResumenInstitucionFragment newInstance(Institucion institucion) {
        ResumenInstitucionFragment fragment = new ResumenInstitucionFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resumen_institucion, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txvInfoNombreInstitucion = getView().findViewById(R.id.txvInfoNombreInstitucion);
        txvInfoTipoInstitucion = getView().findViewById(R.id.txvInfoTipoInstitucion);
        txvInfoTipoPerfil = getView().findViewById(R.id.txvInfoTipoPerfil);
        txvInfoRanking = getView().findViewById(R.id.txvInfoRanking);
        txvInfoAcreditada = getView().findViewById(R.id.txvInfoAcreditada);

        txvInfoNombreInstitucion.setText(institucion.getNombreInstitucion());
        txvInfoTipoInstitucion.setText(institucion.getGradoInstitucion());
        txvInfoTipoPerfil.setText(institucion.getTipoInstitucion());
        txvInfoRanking.setText(institucion.getRankingInstitucion());

        String acreditacionInstitucion = institucion.getAcreditadaInstitucion() ? "Si" : "No";
        txvInfoAcreditada.setText(acreditacionInstitucion);
    }
}
