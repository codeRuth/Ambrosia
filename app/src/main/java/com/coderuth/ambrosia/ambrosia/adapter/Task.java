package com.coderuth.ambrosia.ambrosia.adapter;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.coderuth.ambrosia.ambrosia.R;
import com.coderuth.ambrosia.ambrosia.models.Site;
import java.util.List;

public class Task extends RecyclerView.Adapter<Task.ViewHolder> {

    private List<Site> songList;
    private Context mCtx;
    private PopupMenu popup;
    private ColorGenerator generator = ColorGenerator.MATERIAL;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvRank, tvSongName,buttonOption, tvSinger;
        public ImageView letter;

        public ViewHolder(View v) {
            super(v);
            tvRank = (TextView) v.findViewById(R.id.textView2);
            tvSongName = (TextView) v.findViewById(R.id.title);
            tvSinger = (TextView) v.findViewById(R.id.category);
            letter = (ImageView) v.findViewById(R.id.imageView);
            buttonOption = (TextView) v.findViewById(R.id.textViewOptions);
        }
    }

    public Task(List<Site> songList, Context mCtx){
        this.songList = songList;
        this.mCtx = mCtx;
    }

    @Override
    public Task.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final Task.ViewHolder holder, final int position) {
        Site song = songList.get(position);
        String letter = String.valueOf(song.getName().charAt(0));
        popup = new PopupMenu(mCtx, holder.buttonOption);
        TextDrawable drawable = TextDrawable.builder().buildRound(letter, generator.getColor(song.getName()));
        holder.tvRank.setText(String.valueOf(song.getRank()));
        holder.tvSongName.setText(song.getName());
        holder.tvSinger.setText(song.getSinger());
        holder.letter.setImageDrawable(drawable);

        holder.buttonOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(mCtx, holder.buttonOption);
                popupMenu.inflate(R.menu.item_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                Toast.makeText(mCtx, "Saved", Toast.LENGTH_LONG).show();
                                break;
                            case R.id.menu2:
                                Toast.makeText(mCtx, "Deleted", Toast.LENGTH_LONG).show();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
}
