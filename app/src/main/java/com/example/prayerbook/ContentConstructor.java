package com.example.prayerbook;


import android.app.Activity;

public class ContentConstructor {
    private ContentItem[] resource;

    public ContentResource makeResource(int numberOfItems, MainActivity parent){
        resource = new ContentItem[numberOfItems];

        resource[0] = new ContentItem(parent.getResources().getString(R.string.our_father_name),
                parent.getResources().getString(R.string.our_father));

        resource[1] = new ContentItem(parent.getResources().getString(R.string.jesus_prayer_name),
                parent.getResources().getString(R.string.jesus_prayer));

        resource[2] = new ContentItem(parent.getResources().getString(R.string.honest_cross_name),
                parent.getResources().getString(R.string.honest_cross));

        resource[3] = new ContentItem(parent.getResources().getString(R.string.thanksgiving_name),
                parent.getResources().getString(R.string.thanksgiving));

        resource[4] = new ContentItem(parent.getResources().getString(R.string.morning_prayers_name),
                parent.getResources().getString(R.string.morning_prayers));

        resource[5] = new ContentItem(parent.getResources().getString(R.string.morning_prayers_name_ending),
                parent.getResources().getString(R.string.morning_prayers_ending));

        resource[6] = new ContentItem(parent.getResources().getString(R.string.sleep_prayers_name),
                parent.getResources().getString(R.string.sleep_prayers));

        resource[7] = new ContentItem(parent.getResources().getString(R.string.repentance_canon_name),
                parent.getResources().getString(R.string.repentance_canon));

        resource[8] = new ContentItem(parent.getResources().getString(R.string.virgin_canon_name),
                parent.getResources().getString(R.string.virgin_canon));

        resource[9] = new ContentItem(parent.getResources().getString(R.string.angel_canon_name),
                parent.getResources().getString(R.string.angel_canon));

        resource[10] = new ContentItem(parent.getResources().getString(R.string.before_communion_name),
                parent.getResources().getString(R.string.before_communion));

        resource[11] = new ContentItem(parent.getResources().getString(R.string.before_communion_name_ending),
                parent.getResources().getString(R.string.before_communion_ending));

        resource[12] = new ContentItem(parent.getResources().getString(R.string.jesus_akathist_name),
                parent.getResources().getString(R.string.jesus_akathist));

        resource[13] = new ContentItem(parent.getResources().getString(R.string.virgin_akathist_name),
                parent.getResources().getString(R.string.virgin_akathist));

        resource[14] = new ContentItem(parent.getResources().getString(R.string.after_communion_name),
                parent.getResources().getString(R.string.after_communion));

        resource[15] = new ContentItem(parent.getResources().getString(R.string.creed_symbol_name),
                parent.getResources().getString(R.string.creed_symbol));

        ContentResource result = new ContentResource(resource);
        return result;
    }
}
