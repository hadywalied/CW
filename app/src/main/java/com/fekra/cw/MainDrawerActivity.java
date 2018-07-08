package com.fekra.cw;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.rupins.drawercardbehaviour.CardDrawerLayout;

public class MainDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Do you wish to add a place??", Snackbar.LENGTH_LONG)
                        .setAction("add", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainDrawerActivity.this, "Open the Creation Activity", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });

        CardDrawerLayout drawer = (CardDrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        drawer.useCustomBehavior(Gravity.START);
        drawer.setViewScale(Gravity.START, 0.9f); //set height scale for main view (0f to 1f)
        drawer.setViewElevation(Gravity.START, 20);//set main view elevation when drawer open (dimension)
        drawer.setViewScrimColor(Gravity.START, Color.TRANSPARENT);//set drawer overlay coloe (color)
        drawer.setDrawerElevation(Gravity.START, 20);//set drawer elevation (dimension)

        drawer.setRadius(Gravity.START, 25);//set end container's corner radius (dimension

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {



            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_featured:

                Toast.makeText(MainDrawerActivity.this, "Open the Freatured fragment", Toast.LENGTH_SHORT).show();

                break;
            case R.id.nav_map:

                Toast.makeText(MainDrawerActivity.this, "Open the Map Activity", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainDrawerActivity.this,Map.class));

                break;
            case R.id.nav_favourites:
                Toast.makeText(MainDrawerActivity.this, "Open the Favourites Fragment", Toast.LENGTH_SHORT).show();


                break;
            case R.id.nav_add:
                Toast.makeText(MainDrawerActivity.this, "Open the Creation Activity", Toast.LENGTH_SHORT).show();

                break;
            case R.id.nav_share:
                Toast.makeText(MainDrawerActivity.this, "Open the sharing Intent", Toast.LENGTH_SHORT).show();

                break;
            case R.id.nav_send:
                Toast.makeText(MainDrawerActivity.this, "Open the IDk!!!", Toast.LENGTH_SHORT).show();


                break;
            case R.id.nav_logout:
                Toast.makeText(MainDrawerActivity.this, "Open the logout AlertDialog", Toast.LENGTH_SHORT).show();

                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
