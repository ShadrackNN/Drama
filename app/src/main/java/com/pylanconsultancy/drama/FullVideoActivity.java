package com.pylanconsultancy.drama;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.InputStream;

public class FullVideoActivity extends Activity {
    ProgressDialog pDialog;
    ImageView img;
    Bitmap bitmap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullvideoview);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        moviesAdapter moviesAdapter = new moviesAdapter(this);

        img = findViewById(R.id.image);
        String url = (String) moviesAdapter.getItem(position);

        new DownloadImage().execute(url);
    }
    private class DownloadImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... URL) {
            String imageURL = URL[0];
            Bitmap bitmap = null;
            try {
                InputStream input = new java.net.URL(imageURL).openStream();
                bitmap = BitmapFactory.decodeStream(input);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }
        @Override
        protected void onPostExecute(Bitmap result) {
            img.setImageBitmap(result);
        }
    }
}