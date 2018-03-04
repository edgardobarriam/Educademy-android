package io.github.edgardobarriam.educademy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

public class FichaCarreraEspActivity extends AppCompatActivity {
    private CarreraEspecifica carreraEspecifica;

    private TextView txvTituloCarreraEsp;
    private TextView txvDescCarreraEsp;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_carrera_esp);
        carreraEspecifica = getIntent().getParcelableExtra("CarreraEsp");

        initToolbar();
        initView();
        initData();
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbarCarreraEsp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle(carreraEspecifica.getAreaConocimientoCarreraEsp());
    }

    private void initView() {
        txvTituloCarreraEsp = findViewById(R.id.txvTituloCarreraEsp);
        txvDescCarreraEsp = findViewById(R.id.txvDescCarreraEsp);
    }

    private void initData() {
        txvTituloCarreraEsp.setText(carreraEspecifica.getNombreCarreraEsp());
        txvDescCarreraEsp.setText(carreraEspecifica.getDescCarreraEsp());
    }
}
