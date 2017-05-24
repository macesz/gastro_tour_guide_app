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
public class CookingFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> restaurants = new ArrayList<Tour>();
        restaurants.add(new Tour(R.drawable.humus, getString(R.string.cooking_course_humus), getString(R.string.cooking_course_humus_disc)));
        restaurants.add(new Tour(R.drawable.saksuka, getString(R.string.cooking_course_saksuka), getString(R.string.cooking_course_saksuka_disc)));
        restaurants.add(new Tour(R.drawable.kube, getString(R.string.cooking_course_kube), getString(R.string.cooking_course_kube_disc)));
        restaurants.add(new Tour(R.drawable.leves, getString(R.string.cooking_course_leves), getString(R.string.cooking_course_leves_disc)));
        restaurants.add(new Tour(R.drawable.karfiol, getString(R.string.cooking_course_karfiol), getString(R.string.cooking_course_karfiol_disc)));
        restaurants.add(new Tour(R.drawable.eggplant, getString(R.string.cooking_course_eggplant), getString(R.string.cooking_course_eggplant_disc)));

        TourAdapter adapter = new TourAdapter(getActivity(), restaurants, R.color.cooking_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
