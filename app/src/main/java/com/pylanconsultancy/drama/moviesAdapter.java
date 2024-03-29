package com.pylanconsultancy.drama;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class moviesAdapter extends BaseAdapter {
    private Context mContext;
    int imageTotal = 6;

    public static String[] mThumbIds = {
            "http://www.feisaconstruction.co.ke/android/movies/pic.jpg",
            "http://www.feisaconstruction.co.ke/android/movies/pic1.jpg",
            "http://www.feisaconstruction.co.ke/android/movies/pic2.jpg",
            "http://www.feisaconstruction.co.ke/android/movies/pic3.jpg",
            "http://www.feisaconstruction.co.ke/android/movies/pic4.jpg",
            "http://www.feisaconstruction.co.ke/android/movies/pic5.jpg",
    };

    public moviesAdapter (Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return imageTotal;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        return convertView;
    }
}

//                .placeholder(R.drawable.loader)