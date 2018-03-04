package io.github.edgardobarriam.educademy.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.edgardobarriam.educademy.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InstitucionesMainFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class InstitucionesMainFragment extends Fragment {

    private CardView crvUniversidades;
    private CardView crvInstitutosProfesionales;
    private CardView crvCFTS;
    private OnFragmentInteractionListener mListener;

    public InstitucionesMainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_instituciones, container, false);

        crvUniversidades = view.findViewById(R.id.crvUniversidades);
        crvInstitutosProfesionales = view.findViewById(R.id.crvInstitutosProfesionales);
        crvCFTS = view.findViewById(R.id.crvCFTS);

        crvUniversidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListaInstitucionesFragment newFragment = ListaInstitucionesFragment.newInstance("u");
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_container, newFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        crvInstitutosProfesionales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListaInstitucionesFragment newFragment = ListaInstitucionesFragment.newInstance("ip");
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_container,newFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        crvCFTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListaInstitucionesFragment newFragment = ListaInstitucionesFragment.newInstance("cft");
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.content_container,newFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
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
    }
}
