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
import io.github.edgardobarriam.educademy.fragment.ResumenCarreraEspFragment;
import io.github.edgardobarriam.educademy.model.CarreraEspecifica;

public class FichaCarreraEspActivity extends AppCompatActivity {
    private CarreraEspecifica carreraEspecifica;

    private TextView txvTituloCarreraEsp;
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_carrera_esp);
        carreraEspecifica = getIntent().getParcelableExtra("CarreraEsp");

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

    private void initView() {
        txvTituloCarreraEsp = findViewById(R.id.txvTituloCarreraEsp);
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.viewPagerCarreraEsp);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(ResumenCarreraEspFragment.newInstance(carreraEspecifica), "Resumen");
        viewPager.setAdapter(adapter);
        initTabLayout();
    }

    private void initTabLayout() {
        tabLayout = findViewById(R.id.tabsSeccionesCarreraEsp);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initData() {
        txvTituloCarreraEsp.setText(carreraEspecifica.getNombreCarreraEsp());
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
