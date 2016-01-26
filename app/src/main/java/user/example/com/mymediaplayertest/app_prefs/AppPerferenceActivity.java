package user.example.com.mymediaplayertest.app_prefs;

import android.app.ActionBar;
import android.preference.PreferenceActivity;
import android.view.MenuItem;

import java.util.List;

import user.example.com.mymediaplayertest.R;

/**
 * Created by user1 on 2016/1/26.
 */
public class AppPerferenceActivity extends PreferenceActivity {
    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        ActionBar actionBar=getActionBar();
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
        loadHeadersFromResource(R.xml.preference_header,target);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:{
                this.setResult(RESULT_OK);
                this.finish();
                break;
            }
                default: {
                    break;
                }
        }

        return super.onOptionsItemSelected(item);
    }
}
