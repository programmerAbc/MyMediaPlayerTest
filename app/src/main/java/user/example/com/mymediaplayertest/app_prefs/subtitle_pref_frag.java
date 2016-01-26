package user.example.com.mymediaplayertest.app_prefs;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import user.example.com.mymediaplayertest.R;

/**
 * Created by user1 on 2016/1/15.
 */
public class subtitle_pref_frag extends PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.subtitle_preference);
    }
}
