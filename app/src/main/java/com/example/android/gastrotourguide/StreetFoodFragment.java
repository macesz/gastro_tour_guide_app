package com.example.android.gastrotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class StreetFoodFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.miznon, getString(R.string.food_miznon), getString(R.string.food_miznon_disc)));
        tour.add(new Tour(R.drawable.hasomer, getString(R.string.food_hasomer), getString(R.string.food_hasomer_disc)));
        tour.add(new Tour(R.drawable.hakosem, getString(R.string.food_hakosem), getString(R.string.food_hakosem_disc)));
        tour.add(new Tour(R.drawable.barochel, getString(R.string.food_barochel), getString(R.string.food_barochel_disc)));
        tour.add(new Tour(R.drawable.malabia, getString(R.string.food_malabia), getString(R.string.food_malabia_disc)));
        tour.add(new Tour(R.drawable.sabich, getString(R.string.food_sabich), getString(R.string.food_sabich_disc)));
        tour.add(new Tour(R.drawable.jachnun, getString(R.string.food_jachnun), getString(R.string.food_jachnun)));

        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.streetfood_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
