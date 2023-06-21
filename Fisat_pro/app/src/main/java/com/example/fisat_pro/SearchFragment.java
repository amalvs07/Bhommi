package com.example.fisat_pro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fisat_pro.Adapters.FragmentAdaperHome;
import com.example.fisat_pro.fragmentdata.Details;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View v;
    RecyclerView recyclerView;
    List<Details> listCont;
    Button k1,k2,k3;




    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
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
        listCont = new ArrayList<>();
        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Aug 6");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Aug 1");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("July 5");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("July 8");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("July 9");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("July 20");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("July 21");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("July 22");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("July 23");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_search, container, false);
        k1 = (Button) v.findViewById(R.id.Nosstification);
        k2 = (Button) v.findViewById(R.id.approvedMore);
        k3 = (Button) v.findViewById(R.id.DeclinedMore);
        k1.setText("more");
        k2.setText("more");
        k3.setText("more");

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        RecyclerViewAdapter viewAdapter = new RecyclerViewAdapter(getContext(), mNames,mImageUrls);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setAdapter(viewAdapter);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerView1);
        RecyclerViewAdapter viewAdapter2 = new RecyclerViewAdapter(getContext(), mNames,mImageUrls);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager2);
        recyclerView.setAdapter(viewAdapter2);


        recyclerView = (RecyclerView) v.findViewById(R.id.Declined);
        RecyclerViewAdapter viewAdapter3 = new RecyclerViewAdapter(getContext(), mNames,mImageUrls);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager3);
        recyclerView.setAdapter(viewAdapter3);
        return v;
    }
}