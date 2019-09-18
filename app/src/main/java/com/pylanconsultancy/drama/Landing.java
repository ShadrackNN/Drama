package com.pylanconsultancy.drama;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.pylanconsultancy.drama.movies;

import java.io.IOException;
import java.util.ArrayList;

public class Landing extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, TextureView.SurfaceTextureListener {

    //Web api url to
    public static final String DATA_URL = "www.feisaconstruction.co.ke/android/movies/kanyoni.mp4";
    public TextView sectionHeading;

    // Log tag.
    private static final String TAG = Landing.class.getName();

   // MediaPlayer instance to control playback of video file.
    private MediaPlayer mMediaPlayer;

    //Data values to retrieve from Json.
    public static final String TAG_Movie_Name = "PO_Movie";
    public static final String TAG_Name = "PO_Name";
    public static final String TAG_Advert ="PO_Advert";


    //GridView Object
    private GridView gridView;

    public TextureView textureView;

    //ArrayList for Storing video urls and titles
    private static ArrayList<String> movies;
    private static ArrayList<String> movie_url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sectionHeading =findViewById(R.id.sectionTitle);

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

        if (id == R.id.nav_poems) {
            // Take user to Poems page
            //setContentView(R.layout.activity_poems);


        } else if (id == R.id.nav_films) {
            // Take user to Films page
            //setContentView(R.layout.activity_films);


        } else if (id == R.id.nav_comedy) {
            // Take user to Comedy page
            //setContentView(R.layout.activity_comedy);


        } else if (id == R.id.nav_folkSongs) {
            // Take user to Folk Songs UI
            //setContentView(R.layout.activity_folksongs);


        } else if (id == R.id.nav_dances) {
            // Take user to Folk Dances page
            //setContentView(R.layout.activity_dances);

        }  else if (id == R.id.nav_share) {
            // Provide user with options through which they can share app.
            //Set app url in Play Store in set text

        } else if (id == R.id.nav_rating) {
            //Provide user with Google's rating UI or take user to Google Play store and focus on rating section

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void initView() {

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
