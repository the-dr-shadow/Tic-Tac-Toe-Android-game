package interns.tictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class Demo extends Activity
{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int[][] str = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
    Handler myhandler = new Handler();
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        startdemo();
    }

    public void startdemo()
    {
        i=1;
        str[0][0]=str[0][2]=str[2][0]=str[1][1]=1;
        str[0][1]=str[1][0]=str[2][2]=0;
        moveshower();
    }
    public void moveshower()
    {
        if(i==1)
        {
            if (str[0][0] == 0)
                b1.setBackgroundResource(R.drawable.kata);
            else if (str[0][0] == 1)
                b1.setBackgroundResource(R.drawable.zero);
        }
        else if(i==2)
        {
            if (str[2][2]==0)
                b9.setBackgroundResource(R.drawable.kata);
            else if(str[2][2]==1)
                b9.setBackgroundResource(R.drawable.zero);
        }
        else if(i==3)
        {
            if (str[0][2]==0)
                b3.setBackgroundResource(R.drawable.kata);
            else if(str[0][2]==1)
                b3.setBackgroundResource(R.drawable.zero);
        }
        else if(i==4)
        {
            if (str[0][1]==0)
                b2.setBackgroundResource(R.drawable.kata);
            else if(str[0][1]==1)
                b2.setBackgroundResource(R.drawable.zero);
        }
        else if(i==5)
        {
            if (str[2][0]==0)
                b7.setBackgroundResource(R.drawable.kata);
            else if(str[2][0]==1)
                b7.setBackgroundResource(R.drawable.zero);
        }
        else if(i==6)
        {
            if (str[1][0]==0)
                b4.setBackgroundResource(R.drawable.kata);
            else if(str[1][0]==1)
                b4.setBackgroundResource(R.drawable.zero);
        }
        else if(i==7)
        {
            if (str[1][1]==0)
                b5.setBackgroundResource(R.drawable.kata);
            else if(str[1][1]==1)
                b5.setBackgroundResource(R.drawable.zero);
        }
        i++;
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                timepass();
            }
        },400);
    }
    public void timepass()
    {
        if(i==8)
        {
            b3.setBackgroundResource(R.drawable.zerod2);
            b5.setBackgroundResource(R.drawable.zerod2);
            b7.setBackgroundResource(R.drawable.zerod2);
            AlertDialog demoagain=new AlertDialog.Builder(this).create();
            demoagain.setTitle("Restart Demo");
            demoagain.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which)
                {
                    b1.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b2.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b3.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b4.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b5.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b6.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b7.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b8.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    b9.setBackgroundResource(R.drawable.buttonbackgrndcustom);
                    startdemo();
                }
            });
            demoagain.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                }
            });
            demoagain.show();
        }
        else
        {
            moveshower();
        }
    }
}