package io.github.edgardobarriam.educademy.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.adapter.CarrerasRecyclerAdapter;
import io.github.edgardobarriam.educademy.model.ApiResponseCarreras;
import io.github.edgardobarriam.educademy.model.Carrera;
import io.github.edgardobarriam.educademy.request.ApiClient;
import io.github.edgardobarriam.educademy.request.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListaCarrerasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaCarrerasFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String AREA_CONOCIMIENTO = "areaConocimiento";

    private String areaConocimiento;

    private RecyclerView rcvListaCarreras;

    public ListaCarrerasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param areaConocimiento Area del conocimiento para la lista de carreras.
     * @return A new instance of fragment ListaCarrerasFragment.
     */
    public static ListaCarrerasFragment newInstance(String areaConocimiento) {
        ListaCarrerasFragment fragment = new ListaCarrerasFragment();
        Bundle args = new Bundle();
        args.putString(AREA_CONOCIMIENTO, areaConocimiento);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            areaConocimiento = getArguments().getString(AREA_CONOCIMIENTO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_lista_carreras, container, false);
        rcvListaCarreras = view.findViewById(R.id.rcvListaCarreras);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvListaCarreras.setLayoutManager(linearLayoutManager);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ApiResponseCarreras> call = apiService.getCarreras(areaConocimiento);
        call.enqueue(new Callback<ApiResponseCarreras>() {
            @Override
            public void onResponse(Call<ApiResponseCarreras> call, Response<ApiResponseCarreras> response) {
                //TODO: inicializar recyclerview con las carreras del area
                CarrerasRecyclerAdapter adapter = new CarrerasRecyclerAdapter(response.body().getResultado(), new CarrerasRecyclerAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(Carrera item) {
                        //Intent intent = new Intent(getContext(), tudu);

                    }
                });
                rcvListaCarreras.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ApiResponseCarreras> call, Throwable t) {

            }
        });

        return view;
    }

}
