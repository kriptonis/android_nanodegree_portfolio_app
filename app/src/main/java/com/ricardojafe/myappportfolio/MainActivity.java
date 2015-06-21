package com.ricardojafe.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void showToastSpotify(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.spotify_streamer_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastFootballScores(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.football_scores_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastLibrary(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.library_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastXyzReader(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.xyz_reader_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastBuildItBigger(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.build_it_bigger_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastCapstone(View view) {
        Toast toast;
        toast = Toast.makeText(getApplicationContext(), R.string.capstone_toast_text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
