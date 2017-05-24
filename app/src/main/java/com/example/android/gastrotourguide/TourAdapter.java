package com.example.android.gastrotourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by orsi on 22/05/2017.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Tour object located at this position in the list
        Tour currentTour = getItem(position);

        // Get the tour Title Textview, and set the text to the Tour Tittle
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.tourTitle);
        titleTextView.setText(currentTour.getTourTitleId());

        // Add the Tour description the same way as the Title
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.tourDescription);
        descriptionTextView.setText(currentTour.getDescriptionId());

        // Find and set the color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Find and set the image to the ImageView, if the image exists
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }

}
