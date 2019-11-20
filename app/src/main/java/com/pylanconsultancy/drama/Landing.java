package com.pylanconsultancy.drama;

import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class Landing extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, TextureView.SurfaceTextureListener {

    public TextView sectionHeading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //sectionHeading =findViewById(R.id.sectionTitle);

        getData();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Please login to add a new clip", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.landing, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...

                return true;

            case R.id.action_search:
                // User chose the "Search" action

                return true;

            case R.id.action_account:
                // User chose the "Account" action

                return true;

            case R.id.action_favorite:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch (id){

            case R.id.nav_poems:
                // Take user to Poems page
                Intent poemsIntent = new Intent(Landing.this, Poems.class);
                startActivity(poemsIntent);
                break;


            case R.id.nav_films:
                // Take user to Films page
                Intent filmsIntent = new Intent(Landing.this, Films.class);
                startActivity(filmsIntent);
                break;


            case R.id.nav_comedy:
                // Take user to Comedy page
                Intent comedyIntent = new Intent(Landing.this, Comedy.class);
                startActivity(comedyIntent);
                break;


            case R.id.nav_folkSongs:
                // Take user to Folk Songs UI
                Intent folksongsIntent = new Intent(Landing.this, Folksongs.class);
                startActivity(folksongsIntent);
                break;


            case R.id.nav_dances:
                // Take user to Folk Dances page
                Intent dancesIntent = new Intent(Landing.this, Dances.class);
                startActivity(dancesIntent);
                break;

            case R.id.nav_share:
                // Provide user with options through which they can share app.
                //Set app url in Play Store in set text
                break;

            case  R.id.nav_rating:
                //Provide user with Google's rating UI or take user to Google Play store and focus on rating section
                break;

            }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void getData(){

    }



    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {



    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
