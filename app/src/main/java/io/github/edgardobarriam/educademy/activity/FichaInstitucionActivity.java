package io.github.edgardobarriam.educademy.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.fragment.CarrerasInstitucionFragment;
import io.github.edgardobarriam.educademy.fragment.ResumenInstitucionFragment;
import io.github.edgardobarriam.educademy.fragment.SedesInstitucionFragment;

public class FichaInstitucionActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_institucion);

        initToolbar();
        initViewPager();

    }

    private void initViewPager() {
        viewPager = findViewById(R.id.viewPagerInstitucion);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ResumenInstitucionFragment(), "Resumen");
        adapter.addFragment(new SedesInstitucionFragment(), "Sedes");
        adapter.addFragment(new CarrerasInstitucionFragment(), "Carreras");
        viewPager.setAdapter(adapter);


        initTabLayout();
    }

    private void initTabLayout() {
        tabLayout = findViewById(R.id.tabsSeccionesInstitucion);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void initToolbar() {
        toolbar = findViewById(R.id.toolbarFichaInstitucion);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("UTFSM");
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
