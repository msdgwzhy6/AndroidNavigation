package com.navigation.sharedelement;

import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.navigation.R;
import com.navigation.library.AwesomeFragment;


/**
 * Display details for a given kitten
 *
 * @author bherbst
 */
public class DetailsFragment extends AwesomeFragment {
    private static final String ARG_KITTEN_NUMBER = "argKittenNumber";

    /**
     * Create a new DetailsFragment
     * @param kittenNumber The number (between 1 and 6) of the kitten to display
     */
    public static DetailsFragment newInstance(@IntRange(from = 1, to = 6) int kittenNumber) {
        Bundle args = new Bundle();
        args.putInt(ARG_KITTEN_NUMBER, kittenNumber);

        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shared_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView image = (ImageView) view.findViewById(R.id.image);

        Bundle args = getArguments();
        int kittenNumber = args.containsKey(ARG_KITTEN_NUMBER) ? args.getInt(ARG_KITTEN_NUMBER) : 1;

        switch (kittenNumber) {
            case 1:
                image.setImageResource(R.drawable.placekitten_1);
                break;
            case 2:
                image.setImageResource(R.drawable.placekitten_2);
                break;
            case 3:
                image.setImageResource(R.drawable.placekitten_3);
                break;
            case 4:
                image.setImageResource(R.drawable.placekitten_4);
                break;
            case 5:
                image.setImageResource(R.drawable.placekitten_5);
                break;
            case 6:
                image.setImageResource(R.drawable.placekitten_6);
                break;
        }
    }
}
