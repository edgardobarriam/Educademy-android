package io.github.edgardobarriam.educademy.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.activity.FichaInstitucionActivity;
import io.github.edgardobarriam.educademy.adapter.InstitucionesRecyclerAdapter;
import io.github.edgardobarriam.educademy.model.Institucion;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaInstitucionesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaInstitucionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaInstitucionesFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String TIPO_INSTITUCIONES = "tipo_instituciones";

    private int codigoTipoInstituciones;
    private OnFragmentInteractionListener mListener;
    private RecyclerView recyclerViewInstituciones;
    private ArrayList<Institucion> sampleListInstituciones;

    public ListaInstitucionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ListaInstitucionesFragment.
     */
    public static ListaInstitucionesFragment newInstance(int codigoTipoInstituciones) {
        ListaInstitucionesFragment fragment = new ListaInstitucionesFragment();
        Bundle args = new Bundle();
        args.putInt(TIPO_INSTITUCIONES,codigoTipoInstituciones);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            codigoTipoInstituciones = getArguments().getInt(TIPO_INSTITUCIONES);
            // TODO: Usar codigo tipo para el webservice
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_instituciones, container, false);
        recyclerViewInstituciones = view.findViewById(R.id.rcvListaInstituciones);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerViewInstituciones.setLayoutManager(linearLayoutManager);
        initSampleData();
        initAdapter();
        return view;
    }

    private void initSampleData() {
        sampleListInstituciones = new ArrayList<>();
        sampleListInstituciones.add(new Institucion(
                R.drawable.utfsm_logo,
                "Universidad Técnica Federico Santa María",
                "UTFSM",
                "#3F51B5"));

        sampleListInstituciones.add(new Institucion(R.drawable.ic_carreras, "Universidad de Chile", "UCh","#3F51B5"));
    }

    private void initAdapter() {
        InstitucionesRecyclerAdapter adapter = new InstitucionesRecyclerAdapter(
                sampleListInstituciones, new InstitucionesRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Institucion item) {
                startActivity(new Intent(getContext(), FichaInstitucionActivity.class));
            }
        });
        recyclerViewInstituciones.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
