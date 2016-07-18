package interns.tictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class twoplayer extends Activity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,newgame;
    Toast toast;
    TextView remarks;
    Intent intent;
    String name1,name2;
    ImageButton player1pic,player2pic;
    ImageButton pic1,pic2;
    boolean flag=true;
    Bitmap bitMap;
    Handler myhandler=new Handler();
    int i=0,count=0;
    int str1=10,str2=20,str3=30,str4=40,str5=50,str6=60,str7=70,str8=80,str9=90;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);
        b1=(Button)findViewById(R.id.button);
        newgame=(Button)findViewById(R.id.newgame);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        pic1=(ImageButton)findViewById(R.id.player1pics);
        pic2=(ImageButton)findViewById(R.id.player2pics);
        AlertDialog playersname=new AlertDialog.Builder(this).create();
        playersname.setTitle("Enter the name of Players");
        LayoutInflater In=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View v=In.inflate(R.layout.alertboxlayout,null);
        playersname.setView(v);
        player1pic=(ImageButton)v.findViewById(R.id.player1pic);
        player2pic=(ImageButton)v.findViewById(R.id.player2pic);
        playersname.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                name1 = (((EditText) v.findViewById(R.id.player1nameenter)).getText().toString());
                name2 = (((EditText) v.findViewById(R.id.player2nameenter)).getText().toString());
                if (name1.equals(""))
                    name1 = "player1";
                if (name2.equals(""))
                    name2 = "player2";
                remarks.setText(name1 + "'s Turn");

            }
        });
        playersname.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel",new DialogInterface.OnClickListener()
        {
           public void onClick(DialogInterface dialog,int whichButton)
           {
               name1="Player 1";
               name2="Player 2";
               remarks.setText(name1+"'s Turn");
           }
        });
        playersname.show();
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        newgame.setOnClickListener(this);
        player1pic.setOnClickListener(this);
        player2pic.setOnClickListener(this);
        remarks=(TextView)findViewById(R.id.tvplayerturn);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
            {
                if(str1>2)
                {
                    if(i%2==0)
                    {
                        b1.setBackgroundResource(R.drawable.kata);
                        str1=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b1.setBackgroundResource(R.drawable.zero);
                        str1=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button2:
            {
                if(str2>2)
                {
                    if(i%2==0)
                    {
                        b2.setBackgroundResource(R.drawable.kata);
                        str2=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b2.setBackgroundResource(R.drawable.zero);
                        str2=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button3:
            {
                if(str3>0)
                {
                    if(i%2==0)
                    {
                        b3.setBackgroundResource(R.drawable.kata);
                        str3=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b3.setBackgroundResource(R.drawable.zero);
                        str3=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button4:
            {
                if(str4>0)
                {
                    if(i%2==0)
                    {
                        b4.setBackgroundResource(R.drawable.kata);
                        str4=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b4.setBackgroundResource(R.drawable.zero);
                        str4=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button5:
            {
                if(str5>0)
                {
                    if(i%2==0)
                    {
                        b5.setBackgroundResource(R.drawable.kata);
                        str5=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b5.setBackgroundResource(R.drawable.zero);;
                        str5=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button6:
            {
                if(str6>2)
                {
                    if(i%2==0)
                    {
                        b6.setBackgroundResource(R.drawable.kata);
                        str6=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b6.setBackgroundResource(R.drawable.zero);
                        str6=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button7:
            {
                if(str7>2)
                {
                    if(i%2==0)
                    {
                        b7.setBackgroundResource(R.drawable.kata);
                        str7=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b7.setBackgroundResource(R.drawable.zero);
                        str7=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button8:
            {
                if(str8>2)
                {
                    if(i%2==0)
                    {
                        b8.setBackgroundResource(R.drawable.kata);
                        str8=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b8.setBackgroundResource(R.drawable.zero);
                        str8=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;
                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.button9:
            {
                if(str9>0)
                {
                    if(i%2==0)
                    {
                        b9.setBackgroundResource(R.drawable.kata);
                        str9=1;
                        remarks.setText(name2+"'s Turn");
                    }
                    else
                    {
                        b9.setBackgroundResource(R.drawable.zero);
                        str9=2;
                        remarks.setText(name1+"'s Turn");
                    }
                    i++;

                    result();
                }
                else
                    remarks.setText("Already Occupied Block");
                break;
            }
            case R.id.newgame:
            {
                AlertDialog areyousure=new AlertDialog.Builder(this).create();
                areyousure.setTitle("Are you sure");
                areyousure.setButton(DialogInterface.BUTTON_POSITIVE,"OK",new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog,int which)
                    {
                        reset();
                    }
                });
                areyousure.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel",new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog,int which)
                    {

                    }
                });
                areyousure.show();
                break;
            }
            case R.id.player1pic:
            {
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 1);
                break;
            }
            case R.id.player2pic:
            {
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 2);
                break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent)
    {

        if (requestCode == 1 && resultCode== RESULT_OK && intent != null)
        {
            Bundle extras = intent.getExtras();
            bitMap = (Bitmap) extras.get("data");
            player1pic.setImageBitmap(bitMap);
            pic1.setImageBitmap(bitMap);
        }
        else if (requestCode == 2 && resultCode== RESULT_OK && intent != null)
        {
            Bundle extras = intent.getExtras();
            bitMap = (Bitmap) extras.get("data");
            player2pic.setImageBitmap(bitMap);
            pic2.setImageBitmap(bitMap);
        }
    }
    public void result()
    {
        if(str1==str2 && str2==str3)
        {
            flag=false;
            if(i%2==0)
            {
                b1.setBackgroundResource(R.drawable.zerox);
                b2.setBackgroundResource(R.drawable.zerox);
                b3.setBackgroundResource(R.drawable.zerox);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b1.setBackgroundResource(R.drawable.katax);
                b2.setBackgroundResource(R.drawable.katax);
                b3.setBackgroundResource(R.drawable.katax);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if(str4==str5 && str5==str6)
        {
            flag=false;
            if(i%2==0)
            {
                b4.setBackgroundResource(R.drawable.zerox);
                b5.setBackgroundResource(R.drawable.zerox);
                b6.setBackgroundResource(R.drawable.zerox);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b4.setBackgroundResource(R.drawable.katax);
                b5.setBackgroundResource(R.drawable.katax);
                b6.setBackgroundResource(R.drawable.katax);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if(str7==str8 && str8==str9)
        {
            flag=false;
            if(i%2==0)
            {
                b7.setBackgroundResource(R.drawable.zerox);
                b8.setBackgroundResource(R.drawable.zerox);
                b9.setBackgroundResource(R.drawable.zerox);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b7.setBackgroundResource(R.drawable.katax);
                b8.setBackgroundResource(R.drawable.katax);
                b9.setBackgroundResource(R.drawable.katax);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if (str1==str4 && str4==str7)
        {
            flag=false;
            if(i%2==0)
            {
                b1.setBackgroundResource(R.drawable.zeroy);
                b4.setBackgroundResource(R.drawable.zeroy);
                b7.setBackgroundResource(R.drawable.zeroy);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b1.setBackgroundResource(R.drawable.katay);
                b4.setBackgroundResource(R.drawable.katay);
                b7.setBackgroundResource(R.drawable.katay);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if (str2==str5 && str5==str8)
        {
            flag=false;
            if(i%2==0)
            {
                b2.setBackgroundResource(R.drawable.zeroy);
                b5.setBackgroundResource(R.drawable.zeroy);
                b8.setBackgroundResource(R.drawable.zeroy);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b2.setBackgroundResource(R.drawable.katay);
                b5.setBackgroundResource(R.drawable.katay);
                b8.setBackgroundResource(R.drawable.katay);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if(str3==str6 && str6==str9)
        {
            flag=false;
            if(i%2==0)
            {
                b3.setBackgroundResource(R.drawable.zeroy);
                b6.setBackgroundResource(R.drawable.zeroy);
                b9.setBackgroundResource(R.drawable.zeroy);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b3.setBackgroundResource(R.drawable.katay);
                b6.setBackgroundResource(R.drawable.katay);
                b9.setBackgroundResource(R.drawable.katay);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if (str1==str5 && str5==str9)
        {
            flag=false;
            if(i%2==0)
            {
                b1.setBackgroundResource(R.drawable.zerod1);
                b5.setBackgroundResource(R.drawable.zerod1);
                b9.setBackgroundResource(R.drawable.zerod1);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b1.setBackgroundResource(R.drawable.katad1);
                b5.setBackgroundResource(R.drawable.katad1);
                b9.setBackgroundResource(R.drawable.katad1);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if (str3==str5 && str5==str7)
        {
            flag=false;
            if(i%2==0)
            {
                b3.setBackgroundResource(R.drawable.zerod2);
                b5.setBackgroundResource(R.drawable.zerod2);
                b7.setBackgroundResource(R.drawable.zerod2);
                toast=Toast.makeText(this,name2+"Wins",Toast.LENGTH_SHORT);
                toast.show();

            }
            else
            {
                b3.setBackgroundResource(R.drawable.katad2);
                b5.setBackgroundResource(R.drawable.katad2);
                b7.setBackgroundResource(R.drawable.katad2);
                toast=Toast.makeText(this,name1+"Wins",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else if(i==9)
        {
            toast=Toast.makeText(this,"Match Draw",Toast.LENGTH_SHORT);
            toast.show();
            flag=false;

        }
        if(flag==false)
        {
            myhandler.postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    reset();
                }
            }, 2000);
        }
    }
    public void reset()
    {
        i=0;
        flag=true;
        str1=10;str2=20;str3=30;str4=40; str5=50;str6=60;str7=70;str8=80;str9=90;
        b1.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b2.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b3.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b4.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b5.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b6.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b7.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b8.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b9.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        remarks.setText(name1+"'s Turn");
    }
}
