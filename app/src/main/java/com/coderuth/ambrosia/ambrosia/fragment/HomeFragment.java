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
import com.coderuth.ambrosia.ambrosia.models.Task;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    public static final String TITLE = "Home";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<Task> songList;
    private com.coderuth.ambrosia.ambrosia.adapter.Task task;

    String[] names = {"Karnataka Examination Authority, Government of Karnataka", "The Android Arsenal - Badges - A categorized directory of libraries and tools for Android", "CardView: Expand & Collapse – Akshay Shinde – Medium", "How to Run a Remote Desktop on Raspberry Pi with VNC", "Never Forget You", "Don't Let Me Down",
            "Love Yourself", "Me, Myself & I", "Cake By The Ocean", "Dangerous Woman", "My House", "Stressed Out", "One Dance", "Middle", "No"};

    String[] singers = {"Last Checked 25 min. ago", "Last Checked 2 min. ago", "Last Checked 10 min. ago",
            "Last Checked 45 min. ago", "Zara Larsson & MNEK", "The Chainsmokers",
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

        for (int i = 0; i < names.length; i++) {
            Task song = new Task(names[i], singers[i], "http://www.makeuseof.com/tag/run-remote-desktop-raspberry-pi-vnc/");
            songList.add(song);
        }
        //initializing adapter
        task = new com.coderuth.ambrosia.ambrosia.adapter.Task(songList, getContext());

        //specifying an adapter to access data, create views and replace the content
        mRecyclerView.setAdapter(task);
        task.notifyDataSetChanged();

//        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                Toast.makeText(getActivity(), "Card at " + position + " is clicked", Toast.LENGTH_SHORT).show();
//            }
//        }));
    }
}