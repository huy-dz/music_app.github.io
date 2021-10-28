package com.example.musicapp.homefragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musicapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<Item> itemArrayList;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        itemArrayList = new ArrayList<>();

        Item item1 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item1);
        Item item2 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item2);
        Item item3 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item3);
        Item item4 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item4);
        Item item5 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item5);
        Item item6 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item6);
        Item item7 = new Item(R.drawable.icon_img, "Files");
        itemArrayList.add(item7);

        recyclerView.setAdapter(new ItemAdapter(itemArrayList));
        return view;
    }
}