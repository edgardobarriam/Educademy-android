package io.github.edgardobarriam.educademy.activity;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import io.github.edgardobarriam.educademy.R;
import io.github.edgardobarriam.educademy.adapter.NavDrawerItemAdapter;
import io.github.edgardobarriam.educademy.fragment.CarrerasMainFragment;
import io.github.edgardobarriam.educademy.fragment.InicioFragment;
import io.github.edgardobarriam.educademy.fragment.InstitucionesMainFragment;
import io.github.edgardobarriam.educademy.fragment.ListaInstitucionesFragment;
import io.github.edgardobarriam.educademy.model.NavDrawerItemModel;

public class MainActivity
        extends
            AppCompatActivity
        implements
            InicioFragment.OnFragmentInteractionListener,
            InstitucionesMainFragment.OnFragmentInteractionListener,
            CarrerasMainFragment.OnFragmentInteractionListener,
            ListaInstitucionesFragment.OnFragmentInteractionListener{

    private String[] navigationDrawerItemTitles;
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    Toolbar toolbar;
    private CharSequence drawerTitle;
    private CharSequence title;
    android.support.v7.app.ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivity();
    }

    private void initActivity() {
        setContentView(R.layout.activity_main);
        title = drawerTitle = getTitle();

        initToolbar();
        initNavigationDrawer();
        initHomeFragment();
    }

    void initToolbar(){
        toolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    void initNavigationDrawer() {
        navigationDrawerItemTitles= getResources().getStringArray(R.array.navigation_drawer_items_array);
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerList = findViewById(R.id.nav_drawer);

        NavDrawerItemModel[] drawerItem = new NavDrawerItemModel[4];
        drawerItem[0] = new NavDrawerItemModel(R.drawable.ic_home, navigationDrawerItemTitles[0]);
        drawerItem[1] = new NavDrawerItemModel(R.drawable.ic_instituciones, navigationDrawerItemTitles[1]);
        drawerItem[2] = new NavDrawerItemModel(R.drawable.ic_carreras, navigationDrawerItemTitles[2]);
        drawerItem[3] = new NavDrawerItemModel(R.drawable.ic_exit, navigationDrawerItemTitles[3]);

        NavDrawerItemAdapter adapter = new NavDrawerItemAdapter(this, R.layout.list_view_item_row, drawerItem);
        drawerList.setAdapter(adapter);
        drawerList.setOnItemClickListener(new DrawerItemClickListener());
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.addDrawerListener(drawerToggle);
        setupDrawerToggle();
    }

    void setupDrawerToggle(){
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name, R.string.app_name);
        //This is necessary to change the icon of the Drawer Toggle upon state change.
        drawerToggle.syncState();
    }

    private void initHomeFragment() {
        Fragment fragment = new InicioFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                       .replace(R.id.content_container, fragment)
                       .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(CharSequence title) {
        this.title = title;
        getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }

    }

    private void selectItem(int position) {

        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new InicioFragment();
                break;
            case 1:
                fragment = new InstitucionesMainFragment();
                break;
            case 2:
                fragment = new CarrerasMainFragment();
                break;
            case 3:
                finish();
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                           .replace(R.id.content_container, fragment)
                           .commit();

            drawerList.setItemChecked(position, true);
            drawerList.setSelection(position);
            setTitle(navigationDrawerItemTitles[position]);
            drawerLayout.closeDrawer(drawerList);

        } else {
            Log.e("MainActivity", "Error in creating fragment");
        }
    }


}