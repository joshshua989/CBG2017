package ellen.joshua.craftbeerguru;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Josh on 8/8/2017.
 */

public class BrowseSubStyleFragment extends Fragment {

    public BrowseSubStyleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_browse_sub_style, container, false);


        return view;
    }
}
