package com.sanved.submissionportal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RVAdapt extends RecyclerView.Adapter<RVAdapt.DataHolder> {

    ArrayList<AssignmentData> list;
    static ArrayList<AssignmentData> list2;
    static int player;
    Typeface font;

    Context context;

    RVAdapt(ArrayList<AssignmentData> list, Context context, int player) {

        this.list = list;
        list2 = list;
        this.context = context;
        this.player = player;

        font = Typeface.createFromAsset(context.getAssets(),"gravity.otf");

    }

    public static class DataHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView percentage, name, year, duration, imdb, tomato;
        CardView cv;

        DataHolder(final View v) {
            super(v);
            /*imageView = (ImageView) v.findViewById(R.id.ivPoster);
            percentage = (TextView) v.findViewById(R.id.percentage);
            name = (TextView) v.findViewById(R.id.tvName);
            year = (TextView) v.findViewById(R.id.tvYear);
            duration = (TextView) v.findViewById(R.id.tvDuration);
            imdb = (TextView) v.findViewById(R.id.tvIMDB);
            tomato = (TextView) v.findViewById(R.id.tvTomato);
            cv = (CardView) v.findViewById(R.id.cvList);
            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO: 3/15/2019  add intent
                }
            });*/
        }

    }

    @Override
    public DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        DataHolder dh = new DataHolder(v);
        return dh;
    }

    @Override
    public void onBindViewHolder(DataHolder holder1, int position) {
        final DataHolder holder = holder1;

        /*holder.name.setTypeface(font);
        holder.name.setText(list.get(position).getName());
        holder.year.setText("("+list.get(position).getYear()+")");

        if(list.get(position).getSeasons().contains("999")){
            holder.duration.setText(list.get(position).getDuration());
        }
        else{
            holder.duration.setText(list.get(position).getSeasons());
        }

        if(list.get(position).getRateimdb().contains("999")){
            holder.imdb.setText("");
        }else {
            holder.imdb.setText(list.get(position).getRateimdb());
        }

        if(list.get(position).getRatetoma().contains("999")){
            holder.tomato.setText("");
        }else {
            holder.tomato.setText(list.get(position).getRatetoma());
        }

        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageForEmptyUri(R.drawable.ic_error_black_48dp) // resource or drawable
                .showImageOnFail(R.drawable.ic_error_black_48dp)
                .cacheInMemory(false)
                .cacheOnDisk(true)
                .build();*/


        /*imageLoader.displayImage(list.get(position).getLink(), holder.imageView, options , new SimpleImageLoadingListener() {

            @Override
            public void onLoadingStarted(String imageUri, View view) {
                holder.cp.setProgress(0);
                holder.percentage.setText("0%");
                holder.percentage.setVisibility(View.VISIBLE);
                holder.cp.setVisibility(View.VISIBLE);
            }

            @Override
            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                super.onLoadingFailed(imageUri, view, failReason);
                holder.cp.setVisibility(View.GONE);
                holder.percentage.setVisibility(View.GONE);
            }

            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                holder.cp.setVisibility(View.GONE);
                holder.percentage.setVisibility(View.GONE);
                //notifyDataSetChanged();
            }
        }, new ImageLoadingProgressListener() {
            @Override
            public void onProgressUpdate(String imageUri, View view, int current, int total) {
                holder.cp.setProgress(Math.round(100.0f * current / total));
                holder.percentage.setText( Math.round(100.0f * current / total) + "%");
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

