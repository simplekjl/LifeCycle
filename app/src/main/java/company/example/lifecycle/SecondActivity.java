package company.example.lifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txt1;

    public static final String TAG = "FT Activity 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Creating a good stuff
        Bundle extras = getIntent().getExtras();
        String message;
        if (extras != null)
        {
                message = extras.getString("text");
                txt1 = (TextView) findViewById(R.id.Etiqueta);
                txt1.setText(message);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Destroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Pause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Restart");
    }


}
