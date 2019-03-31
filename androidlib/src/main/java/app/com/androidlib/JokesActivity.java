package app.com.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKES_EXTRA = "lib.jokes.extra";
    protected TextView jokesTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        jokesTv = (TextView) findViewById(R.id.jokes_textView);
        String jokes = getIntent().getStringExtra(JOKES_EXTRA);
        if(jokes != null){
            jokesTv.setText(jokes);
        }

    }


}
