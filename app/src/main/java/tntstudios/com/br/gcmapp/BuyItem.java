package tntstudios.com.br.gcmapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by pnroy on 12/3/15.
 */
public class BuyItem extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ebay.com/itm/Lenovo-IdeaPad-N20p-11-6-2-in-1-Touchscreen-Chromebook/391334077986?hash=item5b1d542622"));
        startActivity(browserIntent);
    }
}
