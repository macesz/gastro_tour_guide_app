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

public class MarketFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.carmel, getString(R.string.carmel_market), getString(R.string.carmel_market_disc)));
        tour.add(new Tour(R.drawable.levinsky, getString(R.string.levinsky_market), getString(R.string.levinsky_market_disc)));
        tour.add(new Tour(R.drawable.hatikva, getString(R.string.hatikva_market), getString(R.string.hatikva_market_disc)));
        tour.add(new Tour(R.drawable.pispasim, getString(R.string.pispasim_market), getString(R.string.pispasim_market_disc)));

        TourAdapter adapter = new TourAdapter(getActivity(), tour, R.color.market_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
