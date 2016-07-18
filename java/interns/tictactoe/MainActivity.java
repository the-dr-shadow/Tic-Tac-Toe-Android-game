package interns.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{

    Button singleplayer,twoplayer,scores,exit,demo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singleplayer= (Button) findViewById(R.id.singleplayer);
        twoplayer= (Button) findViewById(R.id.twoplayer);
        scores=(Button)findViewById(R.id.score);
        exit=(Button)findViewById(R.id.exit);
        demo=(Button)findViewById(R.id.demo);
        textView=(TextView)findViewById(R.id.textview2);
        demo.setOnClickListener(this);
        singleplayer.setOnClickListener(this);
        twoplayer.setOnClickListener(this);
        scores.setOnClickListener(this);
        exit.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.textview2);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "VINERITC.TTF");
        Typeface typeface2=Typeface.createFromAsset(getAssets(),"CHILLER.TTF");
        textView.setTypeface(typeface2);
        singleplayer.setTypeface(typeFace);
        twoplayer.setTypeface(typeFace);
        scores.setTypeface(typeFace);
        exit.setTypeface(typeFace);
        demo.setTypeface(typeFace);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.singleplayer: {
                Intent intent1 = new Intent(this, singleplayer.class);
                startActivity(intent1);
                break;
            }
            case R.id.twoplayer:
            {
                Intent intent=new Intent(this,twoplayer.class);
                startActivity(intent);
                break;
            }

            case R.id.score:
            {
                Intent intent2=new Intent(this,scores.class);
                startActivity(intent2);
                break;
            }
            case R.id.demo:
            {
                Intent intent=new Intent(this,Demo.class);
                startActivity(intent);
                break;
            }
            case R.id.exit:
            {
                finish();
                break;
            }
        }
    }
    public void onBackPressed()
    {
        finish();
        finish();
    }

}
