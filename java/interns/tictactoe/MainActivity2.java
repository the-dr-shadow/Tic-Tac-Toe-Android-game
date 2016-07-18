package interns.tictactoe;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    TextView textview;
    Handler myhandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        textview=(TextView)findViewById(R.id.tv);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"CURLZ___.TTF");
        textview.setTypeface(typeface);
        myhandler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                launch();
            }
        },1500);
    }
    public void launch()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
