package interns.tictactoe;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class singleplayer extends Activity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9,b10;
    boolean flag = true;
    boolean winconditionx, winconditiony, winconditiond;
    int moves = 0, locx, locy;
    Handler myhandler = new Handler();
    boolean player=true;
    int position[][] = {{50, 60, 55}, {62, 65, 70}, {72, 66, 77}};
    TextView tvplayer,title;
    String nameplayer;
    ProgressDialog pd;
    Handler progress=new Handler();
    boolean nextmove=true;
    ImageButton setyourpic;
    static int TAKE_PICTURE = 1;
    Bitmap bitMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);
        b1 = (Button) findViewById(R.id.button);
        title=(TextView)findViewById(R.id.title);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.newgame);
        setyourpic=(ImageButton)findViewById(R.id.setyourpic);
        b10.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        setyourpic.setOnClickListener(this);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"CHILLER.TTF");
        title.setTypeface(typeface);
        nameplayer="Human";
        tvplayer = (TextView) findViewById(R.id.tvplayerturn);
        AlertDialog playername=new AlertDialog.Builder(this).create();
        playername.setTitle("Enter the name of player");
        final EditText name = new EditText(this);
        name.setHint("Player");
        playername.setView(name);
        playername.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which)
            {
                nameplayer=name.getText().toString();
                if(nameplayer.equals(""))
                    nameplayer="Human";
                tvplayer.setText(nameplayer+"'s Turn");
            }
        });
        playername.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which)
            {
                tvplayer.setText(nameplayer+"'s Turn");
            }
        });
        playername.show();
    }

    @Override
    public void onClick(View v) {
        if (nextmove) {
            switch (v.getId()) {
                case R.id.button: {
                    if (position[0][0] > 1) {
                        b1.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[0][0] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }

                    break;
                }
                case R.id.button2: {
                    if (position[0][1] > 1) {
                        b2.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[0][1] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button3: {
                    if (position[0][2] > 1) {
                        b3.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[0][2] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button4: {
                    if (position[1][0] > 1) {
                        b4.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[1][0] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button5: {
                    if (position[1][1] > 1) {
                        b5.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[1][1] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button6: {
                    if (position[1][2] > 1) {
                        b6.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[1][2] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button7: {
                    if (position[2][0] > 1) {
                        b7.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[2][0] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button8: {
                    if (position[2][1] > 1) {
                        b8.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[2][1] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
                    break;
                }
                case R.id.button9: {
                    if (position[2][2] > 1) {
                        b9.setBackgroundResource(R.drawable.zero);
                        tvplayer.setText("Computer's Turn");
                        position[2][2] = 1;
                        moves++;
                        ifplayerwon();
                        pd = ProgressDialog.show(this, "", "", true, false);
                        progress.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                progressbarremove();
                            }
                        }, 100);
                    } else {
                        tvplayer.setText("Already Occupied Block...");
                    }
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
                case R.id.setyourpic:
                {
                    if(getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
                    {
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(intent, TAKE_PICTURE);
                        break;
                    }
                    else
                    {
                        Toast toast=Toast.makeText(this,"It seems your phone dont have an camera",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;
                }
            }
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent)
    {

        if (requestCode == TAKE_PICTURE && resultCode== RESULT_OK && intent != null)
        {
            Bundle extras = intent.getExtras();
            bitMap = (Bitmap) extras.get("data");
            setyourpic.setImageBitmap(bitMap);
        }
    }
    public void computermove()
    {
        if(player)
        {
            if (moves == 9) {
                tvplayer.setText("No Moves Possible.....match draw");
                myhandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        reset();
                    }
                }, 1500);
            } else {
                int c = win();
                if (c == 1) {
                    playforwin();
                } else {
                    int d = stophuman();
                    if (d == 1) {
                        playtostop();
                    } else {
                        playnextrandmove();
                    }
                }
            }
            moves++;
        }

    }

    public int win() {
        Log.i("Tic","In Can I Win");
        if ((position[0][0] == 0 && position[0][1] == 0 && position[0][2] != 1)
                || (position[0][0] == 0 && position[0][2] == 0 && position[0][1] != 1)
                || (position[0][0] != 1 && position[0][1] == 0 && position[0][2] == 0)
                || (position[1][0] == 0 && position[1][1] == 0 && position[1][2] != 1)
                || (position[1][0] == 0 && position[1][2] == 0 && position[1][1] != 1)
                || (position[1][0] != 1 && position[1][2] == 0 && position[1][1] == 0)
                || (position[2][0] == 0 && position[2][1] == 0 && position[2][2] != 1)
                || (position[2][0] == 0 && position[2][2] == 0 && position[2][1] != 1)
                || (position[2][0] != 1 && position[2][2] == 0 && position[2][1] == 0)
                || (position[0][0] == 0 && position[1][1] == 0 && position[2][2] != 1)
                || (position[0][0] == 0 && position[2][2] == 0 && position[1][1] != 1)
                || (position[0][0] != 1 && position[1][1] == 0 && position[2][2] == 0)
                || (position[0][2] == 0 && position[1][1] == 0 && position[2][0] != 1)
                || (position[0][2] == 0 && position[2][0] == 0 && position[1][1] != 1)
                || (position[0][2] != 1 && position[1][1] == 0 && position[2][0] == 0)
                || (position[0][0] == 0 && position[1][0] == 0 && position[2][0] != 1)
                || (position[0][0] == 0 && position[2][0] == 0 && position[1][0] != 1)
                || (position[0][0] != 1 && position[1][0] == 0 && position[2][0] == 0)
                || (position[0][1] == 0 && position[1][1] == 0 && position[2][1] != 1)
                || (position[0][1] == 0 && position[2][1] == 0 && position[1][1] != 1)
                || (position[0][1] != 1 && position[2][1] == 0 && position[1][1] == 0)
                || (position[0][2] == 0 && position[1][2] == 0 && position[2][2] != 1)
                || (position[0][2] == 0 && position[2][2] == 0 && position[1][2] != 1)
                || (position[0][2] != 1 && position[2][2] == 0 && position[1][2] == 0)) {
            return 1;
        } else
            return 0;
    }

    public void playforwin() {
        Log.i("Tic","In Play For Win");
        if (position[0][0] == 0 && position[0][1] == 0 && position[0][2] != 1)
            position[0][2] = 0;
        else if (position[0][0] == 0 && position[0][2] == 0 && position[0][1] != 1)
            position[0][1] = 0;
        else if (position[0][0] != 1 && position[0][1] == 0 && position[0][2] == 0)
            position[0][0] = 0;
        else if (position[1][0] == 0 && position[1][1] == 0 && position[1][2] != 1)
            position[1][2] = 0;
        else if (position[1][0] == 0 && position[1][2] == 0 && position[1][1] != 1)
            position[1][1] = 0;
        else if (position[1][0] != 1 && position[1][2] == 0 && position[1][1] == 0)
            position[1][0] = 0;
        else if (position[2][0] == 0 && position[2][1] == 0 && position[2][2] != 1)
            position[2][2] = 0;
        else if (position[2][0] == 0 && position[2][2] == 0 && position[2][1] != 1)
            position[2][1] = 0;
        else if (position[2][0] != 1 && position[2][2] == 0 && position[2][1] == 0)
            position[2][0] = 0;
        else if (position[0][0] == 0 && position[1][1] == 0 && position[2][2] != 1)
            position[2][2] = 0;
        else if (position[0][0] == 0 && position[2][2] == 0 && position[1][1] != 1)
            position[1][1] = 0;
        else if (position[0][0] != 1 && position[1][1] == 0 && position[2][2] == 0)
            position[0][0] = 0;
        else if (position[0][2] == 0 && position[1][1] == 0 && position[2][0] != 1)
            position[2][0] = 0;
        else if (position[0][2] == 0 && position[2][0] == 0 && position[1][1] != 1)
            position[1][1] = 0;
        else if (position[0][2] != 1 && position[1][1] == 0 && position[2][0] == 0)
            position[0][2] = 0;
        else if (position[0][0] == 0 && position[1][0] == 0 && position[2][0] != 1)
            position[2][0] = 0;
        else if (position[0][0] == 0 && position[2][0] == 0 && position[1][0] != 1)
            position[1][0] = 0;
        else if (position[0][0] != 1 && position[1][0] == 0 && position[2][0] == 0)
            position[0][0] = 0;
        else if (position[0][1] == 0 && position[1][1] == 0 && position[2][1] != 1)
            position[2][1] = 0;
        else if (position[0][1] == 0 && position[2][1] == 0 && position[1][1] != 1)
            position[1][1] = 0;
        else if (position[0][1] != 1 && position[2][1] == 0 && position[1][1] == 0)
            position[0][1] = 0;
        else if (position[0][2] == 0 && position[1][2] == 0 && position[2][2] != 1)
            position[2][2] = 0;
        else if (position[0][2] == 0 && position[2][2] == 0 && position[1][2] != 1)
            position[1][2] = 0;
        else
            position[0][2] = 0;

        compmoveshower();
        computerwintoaster();
        myhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                reset();
            }
        }, 1500);
    }

    public int stophuman() {
        Log.i("Tic","In Should Stop Other Player");
        if ((position[0][0] == 1 && position[0][1] == 1 && position[0][2] != 0)
                || (position[0][0] == 1 && position[0][2] == 1 && position[0][1] != 0)
                || (position[0][0] != 0 && position[0][1] == 1 && position[0][2] == 1)
                || (position[1][0] == 1 && position[1][1] == 1 && position[1][2] != 0)
                || (position[1][0] == 1 && position[1][2] == 1 && position[1][1] != 0)
                || (position[1][0] != 0 && position[1][2] == 1 && position[1][1] == 1)
                || (position[2][0] == 1 && position[2][1] == 1 && position[2][2] != 0)
                || (position[2][0] == 1 && position[2][2] == 1 && position[2][1] != 0)
                || (position[2][0] != 0 && position[2][2] == 1 && position[2][1] == 1)
                || (position[0][0] == 1 && position[1][1] == 1 && position[2][2] != 0)
                || (position[0][0] == 1 && position[2][2] == 1 && position[1][1] != 0)
                || (position[0][0] != 0 && position[1][1] == 1 && position[2][2] == 1)
                || (position[0][2] == 1 && position[1][1] == 1 && position[2][0] != 0)
                || (position[0][2] == 1 && position[2][0] == 1 && position[1][1] != 0)
                || (position[0][2] != 0 && position[1][1] == 1 && position[2][0] == 1)
                || (position[0][0] == 1 && position[1][0] == 1 && position[2][0] != 0)
                || (position[0][0] == 1 && position[2][0] == 1 && position[1][0] != 0)
                || (position[0][0] != 0 && position[1][0] == 1 && position[2][0] == 1)
                || (position[0][1] == 1 && position[1][1] == 1 && position[2][1] != 0)
                || (position[0][1] == 1 && position[2][1] == 1 && position[1][1] != 0)
                || (position[0][1] != 0 && position[2][1] == 1 && position[1][1] == 1)
                || (position[0][2] == 1 && position[1][2] == 1 && position[2][2] != 0)
                || (position[0][2] == 1 && position[2][2] == 1 && position[1][2] != 0)
                || (position[0][2] != 0 && position[2][2] == 1 && position[1][2] == 1)) {
            return 1;
        } else
            return 0;
    }

    public void playtostop() {
        Log.i("Tic","Stop Human");
        if (position[0][0] == 1 && position[0][1] == 1 && position[0][2] != 0)
            position[0][2] = 0;
        else if (position[0][0] == 1 && position[0][2] == 1 && position[0][1] != 0)
            position[0][1] = 0;
        else if (position[0][0] != 0 && position[0][1] == 1 && position[0][2] == 1)
            position[0][0] = 0;
        else if (position[1][0] == 1 && position[1][1] == 1 && position[1][2] != 0)
            position[1][2] = 0;
        else if (position[1][0] == 1 && position[1][2] == 1 && position[1][1] != 0)
            position[1][1] = 0;
        else if (position[1][0] != 0 && position[1][2] == 1 && position[1][1] == 1)
            position[1][0] = 0;
        else if (position[2][0] == 1 && position[2][1] == 1 && position[2][2] != 0)
            position[2][2] = 0;
        else if (position[2][0] == 1 && position[2][2] == 1 && position[2][1] != 0)
            position[2][1] = 0;
        else if (position[2][0] != 0 && position[2][2] == 1 && position[2][1] == 1)
            position[2][0] = 0;
        else if (position[0][0] == 1 && position[1][1] == 1 && position[2][2] != 0)
            position[2][2] = 0;
        else if (position[0][0] == 1 && position[2][2] == 1 && position[1][1] != 0)
            position[1][1] = 0;
        else if (position[0][0] != 0 && position[1][1] == 1 && position[2][2] == 1)
            position[0][0] = 0;
        else if (position[0][2] == 1 && position[1][1] == 1 && position[2][0] != 0)
            position[2][0] = 0;
        else if (position[0][2] == 1 && position[2][0] == 1 && position[1][1] != 0)
            position[1][1] = 0;
        else if (position[0][2] != 0 && position[1][1] == 1 && position[2][0] == 1)
            position[0][2] = 0;
        else if (position[0][0] == 1 && position[1][0] == 1 && position[2][0] != 0)
            position[2][0] = 0;
        else if (position[0][0] == 1 && position[2][0] == 1 && position[1][0] != 0)
            position[1][0] = 0;
        else if (position[0][0] != 0 && position[1][0] == 1 && position[2][0] == 1)
            position[0][0] = 0;
        else if (position[0][1] == 1 && position[1][1] == 1 && position[2][1] != 0)
            position[2][1] = 0;
        else if (position[0][1] == 1 && position[2][1] == 1 && position[1][1] != 0)
            position[1][1] = 0;
        else if (position[0][1] != 0 && position[2][1] == 1 && position[1][1] == 1)
            position[0][1] = 0;
        else if (position[0][2] == 1 && position[1][2] == 1 && position[2][2] != 0)
            position[2][2] = 0;
        else if (position[0][2] == 1 && position[2][2] == 1 && position[1][2] != 0)
            position[1][2] = 0;
        else if (position[0][2] != 0 && position[2][2] == 1 && position[1][2] == 1)
            position[0][2] = 0;
        compmoveshower();
    }

    public void playnextrandmove() {
        Log.i("Tic","In Play Random Move");
        if (position[0][0] == 1 && moves == 1)
            position[1][1] = 0;
        else if (moves == 1 && position[2][2] == 1)
            position[1][1] = 0;
        else if (moves == 1 && position[0][2] == 1)
            position[1][1] = 0;
        else if (moves == 1 && position[2][0] == 1)
            position[1][1] = 0;
        else if(moves==3 &&((position[0][0]==1 && position[2][2]==1)||(position[0][2]==1 && position[2][0]==1)))
            position[0][1]=0;
        else if (position[1][1] != 0 && position[1][1] != 1)
            position[1][1] = 0;
        else if (position[0][0] != 0 && position[0][0] != 1)
            position[0][0] = 0;
        else if (position[2][2] != 0 && position[2][2] != 1)
            position[2][2] = 0;
        else if (position[0][2] != 0 && position[0][2] != 1)
            position[0][2] = 0;
        else if (position[2][0] != 0 && position[2][0] != 1)
            position[2][0] = 0;
        else if (position[0][1] != 0 && position[0][1] != 1)
            position[0][1] = 0;
        else if (position[1][0] != 0 && position[1][0] != 1)
            position[1][0] = 0;
        else if (position[1][2] != 0 && position[1][2] != 1)
            position[1][2] = 0;
        else if (position[2][1] != 0 && position[2][1] != 1)
            position[2][1] = 0;
        else {
            tvplayer.setText("No moves possible....match draw");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 500);
        }
        compmoveshower();

    }

    public void ifplayerwon() {
        Log.i("Tic","Checking Player Win");
        if ((position[0][0] == 1) && (position[0][0] == position[0][1]) && (position[0][0] == position[0][2]))
        {
            player=false;
            b1.setBackgroundResource(R.drawable.zerox);
            b2.setBackgroundResource(R.drawable.zerox);
            b3.setBackgroundResource(R.drawable.zerox);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[1][0] == 1) && (position[1][0] == position[1][1]) && (position[1][0] == position[1][2]))
        {
            player=false;
            b4.setBackgroundResource(R.drawable.zerox);
            b5.setBackgroundResource(R.drawable.zerox);
            b6.setBackgroundResource(R.drawable.zerox);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[2][0] == 1) && (position[2][0] == position[2][1]) && (position[2][0] == position[2][2]))
        {
            player=false;
            b7.setBackgroundResource(R.drawable.zerox);
            b8.setBackgroundResource(R.drawable.zerox);
            b9.setBackgroundResource(R.drawable.zerox);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][0] == 1) && (position[0][0] == position[1][0]) && (position[0][0] == position[2][0]))
        {
            player=false;
            b1.setBackgroundResource(R.drawable.zeroy);
            b4.setBackgroundResource(R.drawable.zeroy);
            b7.setBackgroundResource(R.drawable.zeroy);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][1] == 1) && (position[0][1] == position[1][1]) && (position[0][1] == position[2][1]))
        {
            player=false;
            b2.setBackgroundResource(R.drawable.zeroy);
            b5.setBackgroundResource(R.drawable.zeroy);
            b8.setBackgroundResource(R.drawable.zeroy);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][2] == 1) && (position[0][2] == position[1][2]) && (position[0][2] == position[2][2]))
        {
            player=false;
            b3.setBackgroundResource(R.drawable.zeroy);
            b6.setBackgroundResource(R.drawable.zeroy);
            b9.setBackgroundResource(R.drawable.zeroy);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][0] == 1) && (position[0][0] == position[1][1]) && (position[0][0] == position[2][2]))
        {
            player=false;
            b1.setBackgroundResource(R.drawable.zerod1);
            b5.setBackgroundResource(R.drawable.zerod1);
            b9.setBackgroundResource(R.drawable.zerod1);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][2] == 1) && (position[0][2] == position[1][1]) && (position[0][2] == position[2][0]))
        {
            player=false;
            b3.setBackgroundResource(R.drawable.zerod2);
            b5.setBackgroundResource(R.drawable.zerod2);
            b7.setBackgroundResource(R.drawable.zerod2);
            tvplayer.setText(nameplayer+" wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
    }

    public void computerwintoaster() {

        if ((position[0][0] == 0) && (position[0][0] == position[0][1]) && (position[0][0] == position[0][2]))
        {
            b1.setBackgroundResource(R.drawable.katax);
            b2.setBackgroundResource(R.drawable.katax);
            b3.setBackgroundResource(R.drawable.katax);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[1][0] == 0) && (position[1][0] == position[1][1]) && (position[1][0] == position[1][2]))
        {
            b4.setBackgroundResource(R.drawable.katax);
            b5.setBackgroundResource(R.drawable.katax);
            b6.setBackgroundResource(R.drawable.katax);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[2][0] == 0) && (position[2][0] == position[2][1]) && (position[2][0] == position[2][2]))
        {
            b7.setBackgroundResource(R.drawable.katax);
            b8.setBackgroundResource(R.drawable.katax);
            b9.setBackgroundResource(R.drawable.katax);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][0] == 0) && (position[0][0] == position[1][0]) && (position[0][0] == position[2][0]))
        {
            b1.setBackgroundResource(R.drawable.katay);
            b4.setBackgroundResource(R.drawable.katay);
            b7.setBackgroundResource(R.drawable.katay);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][1] == 0) && (position[0][1] == position[1][1]) && (position[0][1] == position[2][1]))
        {
            b2.setBackgroundResource(R.drawable.katay);
            b5.setBackgroundResource(R.drawable.katay);
            b8.setBackgroundResource(R.drawable.katay);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][2] == 0) && (position[0][2] == position[1][2]) && (position[0][2] == position[2][2]))
        {
            b3.setBackgroundResource(R.drawable.katay);
            b6.setBackgroundResource(R.drawable.katay);
            b9.setBackgroundResource(R.drawable.katay);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][0] == 0) && (position[0][0] == position[1][1]) && (position[0][0] == position[2][2]))
        {
            b1.setBackgroundResource(R.drawable.katad1);
            b5.setBackgroundResource(R.drawable.katad1);
            b9.setBackgroundResource(R.drawable.katad1);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
        else if((position[0][2] == 0) && (position[0][2] == position[1][1]) && (position[0][2] == position[2][0]))
        {
            b3.setBackgroundResource(R.drawable.katad2);
            b5.setBackgroundResource(R.drawable.katad2);
            b7.setBackgroundResource(R.drawable.katad2);
            tvplayer.setText("Computer wins");
            myhandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    reset();
                }
            }, 1000);
        }
    }

    public void compmoveshower() {
        Log.i("Tic","position:-"+ position[2][0]);
        if (position[0][0] == 0) {
            b1.setBackgroundResource(R.drawable.kata);
        }
        if (position[0][1] == 0) {
            b2.setBackgroundResource(R.drawable.kata);
        }
        if (position[0][2] == 0) {
            b3.setBackgroundResource(R.drawable.kata);
        }
        if (position[1][0] == 0) {
            b4.setBackgroundResource(R.drawable.kata);
        }
        if (position[1][1] == 0) {
            b5.setBackgroundResource(R.drawable.kata);
        }
        if (position[1][2] == 0) {
            b6.setBackgroundResource(R.drawable.kata);
        }
        if (position[2][0] == 0) {
            b7.setBackgroundResource(R.drawable.kata);
        }
        if (position[2][1] == 0) {
            b8.setBackgroundResource(R.drawable.kata);
        }
        if (position[2][2] == 0) {
            b9.setBackgroundResource(R.drawable.kata);
        }
    }

    public void reset() {
        flag = true;
        nextmove=true;
        player=true;
        moves = 0;
        int rand = 100;
        for (int num1 = 0; num1 < 3; num1++) {
            for (int num2 = 0; num2 < 3; num2++) {
                position[num1][num2] = rand;
                rand++;
            }
        }
        b1.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b2.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b3.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b4.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b5.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b6.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b7.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b8.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        b9.setBackgroundResource(R.drawable.buttonbackgrndcustom);
        tvplayer.setText("New Match..."+nameplayer+" turn");
    }
    public void progressbarremove()
    {
        pd.dismiss();
        computermove();
        tvplayer.setText(nameplayer + "'s Turn");
    }
}
