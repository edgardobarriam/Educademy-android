package io.github.edgardobarriam.educademy.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.fragment.MallaCarreraEspFragment;
import io.github.edgardobarriam.educademy.fragment.ResumenCarreraEspFragment;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

public class FichaCarreraEspActivity extends AppCompatActivity {
    public static final String CARRERA_ESPECIFICA = "CarreraEsp";

    private CarreraEspecifica carreraEspecifica;

    private TextView txvTituloCarreraEsp;
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_carrera_esp);
        carreraEspecifica = getIntent().getParcelableExtra(CARRERA_ESPECIFICA);

        initToolbar();
        initView();
        initViewPager();
        initData();
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbarCarreraEsp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle(carreraEspecifica.getAreaConocimientoCarreraEsp());
    }

    /**
     * Initializes the activity views.
     */
    //TODO
    private void initView() {
        txvTituloCarreraEsp = findViewById(R.id.txvTituloCarreraEsp);
    }

    /**
     * Initializes the activity View Pager and adds the corresponding fragments into it.
     */
    private void initViewPager() {
        viewPager = findViewById(R.id.viewPagerCarreraEsp);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(ResumenCarreraEspFragment.newInstance(carreraEspecifica), "Resumen");
        adapter.addFragment(MallaCarreraEspFragment.newInstance(carreraEspecifica), "Malla");
        viewPager.setAdapter(adapter);
        initTabLayout();
    }

    /**
     * Initializes the Tab Layout related to the activity View Pager
     */
    private void initTabLayout() {
        tabLayout = findViewById(R.id.tabsSeccionesCarreraEsp);
        tabLayout.setupWithViewPager(viewPager);
    }

    /**
     * Initializes the activity data from Carrera Específica.
     */
    private void initData() {
        txvTituloCarreraEsp.setText(carreraEspecifica.getNombreCarreraEsp());
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
