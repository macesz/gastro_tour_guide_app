package com.example.android.gastrotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by orsi on 22/05/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * the following comment text copied from the Udacity Miwok app:
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MarketFragment();
        } else if (position == 1) {
            return new StreetFoodFragment();
        } else if (position == 2) {
            return new BarFragment();
        } else if (position == 3) {
            return new CookingFragment();
        } else {
            return new GuideFragment();
        }
    }

    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.category_market);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_drink);
        } else if (position == 3) {
            return mContext.getString(R.string.category_cooking);
        }else {
            return mContext.getString(R.string.category_guide);
        }
    }
}
