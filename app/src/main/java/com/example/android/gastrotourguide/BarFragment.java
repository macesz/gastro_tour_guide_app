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
public class BarFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(getString(R.string.bar_title_kuli), getString(R.string.bar_desc_kuli)));
        tour.add(new Tour(getString(R.string.bar_title_spice), getString(R.string.bar_desc_spice)));
        tour.add(new Tour(getString(R.string.bar_title_Hoodna), getString(R.string.bar_desc_Hoodna)));
        tour.add(new Tour(getString(R.string.bar_title_Block), getString(R.string.bar_desc_Block)));
        tour.add(new Tour(getString(R.string.bar_title_Teder), getString(R.string.bar_title_Teder)));
        tour.add(new Tour(getString(R.string.bar_title_Pasaz), getString(R.string.bar_desc_Pasaz)));
        tour.add(new Tour(getString(R.string.bar_title_Imperial), getString(R.string.bar_desc_Imperial)));

        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.bars_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
