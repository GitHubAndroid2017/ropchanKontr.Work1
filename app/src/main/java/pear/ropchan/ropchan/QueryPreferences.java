package pear.ropchan.ropchan;

import android.content.Context;
import android.preference.PreferenceManager;

public class QueryPreferences{

    public static String getStoredQuery(Context context, String valueKey) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(valueKey, null);
    }
    public static void setStoredQuery(Context context, String valueKey, String value) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(valueKey, value)
                .apply();
    }


}
