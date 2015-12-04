package tntstudios.com.br.gcmapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by pnroy on 12/3/15.
 */
public class FirstActivity extends Activity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first);

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hello");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "http://www.ebay.com");
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
