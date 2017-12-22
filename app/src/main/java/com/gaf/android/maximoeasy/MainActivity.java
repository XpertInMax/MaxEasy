package com.gaf.android.maximoeasy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.gaf.android.maximoeasy.utilities.NetworkUtils;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText mSearchBoxEditorText;

    TextView mUrlDisplayTextView;

    TextView mSearchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchBoxEditorText = (EditText) findViewById(R.id.mx_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.mx_url_display);

        mSearchResults = (TextView) findViewById(R.id.mxSearchResultsJson);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemThatWasSelected = item.getItemId();
        if(menuItemThatWasSelected == R.id.action_search){
            Context context = MainActivity.this;
            String message = "Search Clicked";
            //Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            makeMaximoSearchQuery();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void makeMaximoSearchQuery(){
        String poNumber = mSearchBoxEditorText.getText().toString();
        URL maximoSearchUrl = NetworkUtils.buildUrl(poNumber);
        mUrlDisplayTextView.setText(maximoSearchUrl.toString());

    }
}
