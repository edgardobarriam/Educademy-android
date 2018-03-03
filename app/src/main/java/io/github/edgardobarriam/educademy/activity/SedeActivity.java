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
import io.github.edgardobarriam.educademy.fragment.CarrerasSedeFragment;
import io.github.edgardobarriam.educademy.fragment.NoticiasPlaceholderFragment;
import io.github.edgardobarriam.educademy.model.SedeInstitucion;

public class SedeActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private SedeInstitucion sede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sede);
        sede = getIntent().getParcelableExtra("Sede");

        initToolbar();
        initViewPager();
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.sedeToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle(sede.getNombreSede());
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.viewPagerContenidoSede);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(CarrerasSedeFragment.newInstance(sede), "Carreras");
        adapter.addFragment(new NoticiasPlaceholderFragment(), "Noticias");
        viewPager.setAdapter(adapter);
        initTabLayout();
    }

    private void initTabLayout() {
        tabLayout = findViewById(R.id.tabsSeccionesSede);
        tabLayout.setupWithViewPager(viewPager);
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
