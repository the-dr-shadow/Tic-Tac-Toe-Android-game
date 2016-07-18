package interns.tictactoe;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

public class scores extends Activity {

    TextView totalmatches,wins,losses,draws;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        totalmatches=(TextView)findViewById(R.id.totalmatchcount);
        wins=(TextView)findViewById(R.id.wincount);
        losses=(TextView)findViewById(R.id.losscount);
        draws=(TextView)findViewById(R.id.drawcount);
    }
}
