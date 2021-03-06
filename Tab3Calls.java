package com.example.adity.whatsup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Tab3Calls extends Fragment {
    private RecyclerView recyclerView;
    private ReAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3calls, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.list3);
        adapter=new ReAdapter(getActivity(),getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        return rootView;
    }
    public static List<Item> getData(){
        List<Item> data=new ArrayList<>();
        int[] icons={R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a,
                R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
        String[] titles={"Jarvis block","Dont call","Busy","Missed","Dialled",
                "Call","Pick up pick up","Ringing","Busy"};
        String[] description={"Iron Man","Cap America","Batman","Black Widow","Flash","Witch","Joker","Hawkeye","Wonderwoman"};
        for(int i=0;i<titles.length && i<icons.length && i<description.length;i++){
            Item current=new Item();
            current.iconid=icons[i];
            current.title=titles[i];
            current.descript=description[i];
            data.add(current);
        }
        return data;
    }

}
