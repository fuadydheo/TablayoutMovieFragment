package com.example.fragmentmoviecatalogue.adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentmoviecatalogue.R;
import com.example.fragmentmoviecatalogue.model.Movie;
import com.example.fragmentmoviecatalogue.model.TvShow;

import java.util.List;

public class TvShowRecyclerView extends RecyclerView.Adapter<TvShowRecyclerView.MyViewHolder> {

    Context iContext;
    List<TvShow> iData;
    Dialog iDetailTvShow;

    public TvShowRecyclerView (Context iContext, List<TvShow> iData) {
        this.iContext = iContext;
        this.iData = iData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(iContext).inflate(R.layout.item_tvshowlist,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        iDetailTvShow = new Dialog(iContext);
        iDetailTvShow.setContentView(R.layout.activity_tv_shows_detail);

        vHolder.item_tvshow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView detail_tvshow_name = (TextView) iDetailTvShow.findViewById(R.id.tv_detail_title_tv);
                TextView detail_tvshow_description = (TextView) iDetailTvShow.findViewById(R.id.tv_detail_description_tv);
                ImageView detail_tvshow_image = (ImageView) iDetailTvShow.findViewById(R.id.img_detail_photo_tv);

                detail_tvshow_name.setText(iData.get(vHolder.getAdapterPosition()).getName());
                detail_tvshow_description.setText(iData.get(vHolder.getAdapterPosition()).getDetail());
                detail_tvshow_image.setImageResource(iData.get(vHolder.getAdapterPosition()).getPhoto());


                iDetailTvShow.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(iData.get(position).getName());
        holder.tv_phone.setText(iData.get(position).getDetail());
        holder.img.setImageResource(iData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {

        return iData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout item_tvshow;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewHolder(View itemView) {

            super(itemView);
            item_tvshow = (RelativeLayout) itemView.findViewById(R.id.item_tvshowlist);
            tv_name = (TextView) itemView.findViewById(R.id.item_listchat);
            tv_phone = (TextView) itemView.findViewById(R.id.item_numberphone);
            img = (ImageView) itemView.findViewById(R.id.img_item_photo);
        }
    }

}
