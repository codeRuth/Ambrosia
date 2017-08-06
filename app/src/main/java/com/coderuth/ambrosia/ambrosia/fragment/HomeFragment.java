package com.coderuth.ambrosia.ambrosia.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coderuth.ambrosia.ambrosia.R;
import com.coderuth.ambrosia.ambrosia.adapter.SongAdapter;
import com.coderuth.ambrosia.ambrosia.models.Site;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    public static final String TITLE = "Home";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Site> songList;
    private SongAdapter songAdapter;

    String[] names = {"Karnataka Examination Authority", "7 Years", "Pillow Talk", "Work From Home", "Never Forget You", "Don't Let Me Down",
            "Love Yourself", "Me, Myself & I", "Cake By The Ocean", "Dangerous Woman", "My House", "Stressed Out", "One Dance", "Middle", "No"};

    String[] singers = {"Last Checked 25 min. ago", "Last Checked 2 min. ago", "Last Checked 10 min. ago", "Fifth Harmony", "Zara Larsson & MNEK", "The Chainsmokers",
            "Justin Bieber", "G-Eazy x Bebe Rexha", "DNCE", "Ariana Grande", "Flo Rida",
            "Twenty one Pilots", "Drake", "DJ Snake", "Meghan Trainer"};

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        setUpRecylerView();
        return view;
    }

    private void setUpRecylerView() {
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
        }
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        songList = new ArrayList<>();

        //adding data from arrays to songlist
        for (int i = 0; i < names.length; i++) {
            Site song = new Site(names[i], singers[i], "kea.kar.nic.in/cet_2017.htm");
            songList.add(song);
        }
        //initializing adapter
        songAdapter = new SongAdapter(songList, getContext());

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(songAdapter);
        songAdapter.notifyDataSetChanged();

//        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Toast.makeText(getActivity(), "Card at " + position + " is clicked", Toast.LENGTH_SHORT).show();
//            }
//        }));
    }
}