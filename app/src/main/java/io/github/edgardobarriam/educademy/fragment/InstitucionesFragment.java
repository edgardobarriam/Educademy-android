package io.github.edgardobarriam.educademy.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import io.github.edgardobarriam.educademy.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InstitucionesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InstitucionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InstitucionesFragment extends Fragment {

    private CardView crvUniversidades;
    private CardView crvInstitutosProfesionales;
    private CardView crvCFTS;
    private OnFragmentInteractionListener mListener;

    public InstitucionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InstitucionesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InstitucionesFragment newInstance(String param1, String param2) {
        InstitucionesFragment fragment = new InstitucionesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
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



    // TODO: Rename method, update argument and hook method into UI event
    public void onTipoInstitucionButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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
        void onFragmentInteraction(String uri);
    }
}
