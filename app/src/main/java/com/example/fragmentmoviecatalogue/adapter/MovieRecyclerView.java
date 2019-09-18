package com.example.fragmentmoviecatalogue.adapter;

import android.app.Dialog;
import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentmoviecatalogue.R;
import com.example.fragmentmoviecatalogue.model.Movie;

import java.util.List;

public class MovieRecyclerView extends RecyclerView.Adapter<MovieRecyclerView.MyViewHolder> {

    Context mContext;
    List<Movie> mData;
    Dialog myDetailMovie;

    public MovieRecyclerView (Context mContext, List<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_movielist,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        myDetailMovie = new Dialog(mContext);
        myDetailMovie.setContentView(R.layout.activity_movies_detail);

        vHolder.item_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView detail_movie_name = (TextView) myDetailMovie.findViewById(R.id.tv_detail_title);
                TextView detail_movie_description = (TextView) myDetailMovie.findViewById(R.id.tv_detail_description);
                ImageView detail_movie_image = (ImageView) myDetailMovie.findViewById(R.id.img_detail_photo);

                detail_movie_name.setText(mData.get(vHolder.getAdapterPosition()).getName());
                detail_movie_description.setText(mData.get(vHolder.getAdapterPosition()).getDetail());
                detail_movie_image.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());


                myDetailMovie.show();
            }
        });


        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getDetail());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout item_movie;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewHolder(View itemView) {

            super(itemView);
            item_movie = (RelativeLayout) itemView.findViewById(R.id.item_movielist);
            tv_name = (TextView) itemView.findViewById(R.id.item_listchat);
            tv_phone = (TextView) itemView.findViewById(R.id.item_numberphone);
            img = (ImageView) itemView.findViewById(R.id.img_item_photo);
        }
    }

}
