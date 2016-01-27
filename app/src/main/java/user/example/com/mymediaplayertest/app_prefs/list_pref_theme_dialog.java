package user.example.com.mymediaplayertest.app_prefs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

import user.example.com.mymediaplayertest.R;

/**
 * Created by user1 on 2016/1/26.
 */
public class list_pref_theme_dialog extends DialogPreference implements View.OnClickListener {
    SharedPreferences pref = null;
    ImageButton theme0_ib;
    ImageButton theme1_ib;
    ImageButton theme2_ib;
    ImageButton theme3_ib;
    CheckBox italics_cb;

    public list_pref_theme_dialog(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setDialogLayoutResource(R.layout.list_pref_theme_dialog_layout);
        setPersistent(false);
        pref = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public list_pref_theme_dialog(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDialogLayoutResource(R.layout.list_pref_theme_dialog_layout);
        setPersistent(false);
        pref = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton(null, null);
        builder.setNegativeButton(null, null);
        builder.setTitle(null);

    }

    @Override
    protected View onCreateDialogView() {
        View rootView = super.onCreateDialogView();
        theme0_ib = (ImageButton) rootView.findViewById(R.id.pref_list_theme0);
        theme1_ib = (ImageButton) rootView.findViewById(R.id.pref_list_theme1);
        theme2_ib = (ImageButton) rootView.findViewById(R.id.pref_list_theme2);
        theme3_ib = (ImageButton) rootView.findViewById(R.id.pref_list_theme3);
        italics_cb = (CheckBox) rootView.findViewById(R.id.pref_list_display_in_italics);
        theme0_ib.setOnClickListener(this);
        theme1_ib.setOnClickListener(this);
        theme2_ib.setOnClickListener(this);
        theme3_ib.setOnClickListener(this);
        italics_cb.setOnClickListener(this);
        int currentTheme = pref.getInt(getContext().getString(R.string.pref_key_list_theme), 0);
        switch (currentTheme) {
            case 0: {
                theme0_ib.setBackgroundResource(R.drawable.menu_item_selected);
                break;
            }
            case 1: {
                theme1_ib.setBackgroundResource(R.drawable.menu_item_selected);
                break;
            }
            case 2: {
                theme2_ib.setBackgroundResource(R.drawable.menu_item_selected);
                break;
            }
            case 3: {
                theme3_ib.setBackgroundResource(R.drawable.menu_item_selected);
                break;
            }
            default:{
                break;
            }
        }
        italics_cb.setChecked(pref.getBoolean(getContext().getString(R.string.pref_key_list_display_last_played_media_in_italics), false));
        return rootView;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.pref_list_theme0: {
                pref.edit().putInt(getContext().getString(R.string.pref_key_list_theme), 0).commit();
                getDialog().dismiss();
                break;
            }
            case R.id.pref_list_theme1: {
                pref.edit().putInt(getContext().getString(R.string.pref_key_list_theme), 1).commit();
                getDialog().dismiss();
                break;
            }
            case R.id.pref_list_theme2: {
                pref.edit().putInt(getContext().getString(R.string.pref_key_list_theme), 2).commit();
                getDialog().dismiss();
                break;
            }
            case R.id.pref_list_theme3: {
                pref.edit().putInt(getContext().getString(R.string.pref_key_list_theme), 3).commit();
                getDialog().dismiss();
                break;
            }
            case R.id.pref_list_display_in_italics: {
                pref.edit().putBoolean(getContext().getString(R.string.pref_key_list_display_last_played_media_in_italics), italics_cb.isChecked()).commit();
                break;
            }
            default: {
                break;
            }
        }

    }
}
