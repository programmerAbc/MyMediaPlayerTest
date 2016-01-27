package user.example.com.mymediaplayertest.app_prefs;


import android.app.ActionBar;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import user.example.com.mymediaplayertest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class list_file_ext_pref_frag extends Fragment {
    public list_file_ext_pref_frag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActivity().getActionBar();
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list_file_ext_pref_layout,container,false);
        return view;
    }

}
