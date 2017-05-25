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
public class GuideFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> restaurants = new ArrayList<Tour>();
        restaurants.add(new Tour(R.drawable.family_older_brother, getString(R.string.guide1), getString(R.string.guide1_disc)));
        restaurants.add(new Tour(R.drawable.family_mother, getString(R.string.guide2), getString(R.string.guide2_disc)));
        restaurants.add(new Tour(R.drawable.family_daughter, getString(R.string.guide3), getString(R.string.guide3_disc)));
        restaurants.add(new Tour(R.drawable.family_older_sister, getString(R.string.guide4), getString(R.string.guide4_disc)));

        TourAdapter adapter = new TourAdapter(getActivity(), restaurants, R.color.guides_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
