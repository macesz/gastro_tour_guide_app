package com.example.android.gastrotourguide;

/**
 * Created by orsi on 22/05/2017.
 */

public class Tour {

    private String mAttractionTitleId;

    private String mDescriptionId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor
    public Tour(String attractionTitleId, String descriptionId) {
        mAttractionTitleId = attractionTitleId;
        mDescriptionId = descriptionId;
    }

    //Constructor for Tour with images
    public Tour(int imageResourceId, String attractionTitleId, String descriptionId) {
        mAttractionTitleId = attractionTitleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    //Getter Methods
    public String getDescriptionId() {
        return mDescriptionId;
    }

    public String getTourTitleId() {
        return mAttractionTitleId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
