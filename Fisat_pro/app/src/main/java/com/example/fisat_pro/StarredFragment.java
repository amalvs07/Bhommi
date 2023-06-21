package com.example.fisat_pro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fisat_pro.Adapters.FragmentAdaperHome;
import com.example.fisat_pro.fragmentdata.Details;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StarredFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StarredFragment extends Fragment {
    View v;
    RecyclerView recyclerView;
    List<Details> listCont;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public StarredFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StarredFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StarredFragment newInstance(String param1, String param2) {
        StarredFragment fragment = new StarredFragment();
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
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Details("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView) v.findViewById(R.id.contact_recycleView);
        FragmentAdaperHome viewAdapter = new FragmentAdaperHome(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }
}