package pay4free.in.allinone;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,bclear,bpercent,bsquare,bsin,bcos,btan,blog;
    EditText et;
    int val1,val2;
    boolean add,sub,div,mul,bsine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b0=(Button) findViewById(R.id.button0);
        bsin=(Button)findViewById(R.id.buttonS);
        bcos=(Button)findViewById(R.id.buttonC);

        btan=(Button)findViewById(R.id.buttonT);
        blog=(Button)findViewById(R.id.buttonl);


        bdot=(Button) findViewById(R.id.buttondot);
        badd=(Button) findViewById(R.id.buttonadd);
        bsub=(Button) findViewById(R.id.buttonsub);
        bmul=(Button) findViewById(R.id.buttonmultiply);
        bdiv=(Button) findViewById(R.id.buttonDevide);
        beq=(Button) findViewById(R.id.buttoneq);
        bsquare=(Button)findViewById(R.id.buttonsquare);
        et=(EditText) findViewById(R.id.edittext1);
        bclear=(Button)findViewById(R.id.button16);
        bpercent=(Button)findViewById(R.id.button14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=0;
                 val2=0;
                et.setText(null);
            }
        });

        bpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Float val1=Float.parseFloat(et.getText()+"");

                et.setText(val1/100+"");
            }
        });


        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              double val1=Integer.parseInt(et.getText()+"");
                et.setText(Math.sqrt(val1)+"");
            }
        });
bsin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        et.setText("sin");
        bsine=true;

    }
});
        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Integer.parseInt(et.getText()+"");
                if (add==true) {
                    et.setText(val1+val2+"");
                    add=false;
                }
                if (sub==true) {
                    et.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true) {
                    et.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true) {
                    et.setText(val1/val2+"");
                    div=false;
                }
                if(bsine==true)
                {
           String s=et.getText().toString();




                    bsine=false;
                }

            }

        });


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


public class Calculation
{








}





}

