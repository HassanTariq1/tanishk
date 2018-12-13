package com.itpvt.tanishk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneNumberUtils;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_navigation);



    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        facebook.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent facebookIntent = openFacebook(MainActivity.this);
//                startActivity(facebookIntent);
//            }
//        });

//        whatsapp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String smsNumber = "923113668542";
//
//                Intent sendIntent = new Intent("android.intent.action.MAIN");
//                sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
//                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
//                startActivity(sendIntent);
//
//
//            }
//
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
      //  ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.Home)
        {
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
//            intent.putExtra("id","55");
//            intent.putExtra("title","Categories");
            startActivity(intent);

        } else if (id == R.id.Categories){

            Intent intent = new Intent(MainActivity.this, MainActivity.class);
//            intent.putExtra("id", "56");
//            intent.putExtra("title", "Hello");

            startActivity(intent);


        } else if (id == R.id.Cart) {

//            Intent i= new Intent(MainActivity.this, My_Cart.class);
//            startActivity(i);
//            finish();

        } else if (id == R.id.Whatsapp)
        {
            String smsNumber = "923113668542";

            Intent sendIntent = new Intent("android.intent.action.MAIN");
            sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
            startActivity(sendIntent);

        } else if (id == R.id.Innovators)
        {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://itpvt.net/"));
            startActivity(myIntent);

        }else if (id == R.id.web) {

            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://footlib.com/"));
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
//    public static Intent openFacebook(Context context) {
//
//        try {
//            context.getPackageManager()
//                    .getPackageInfo("com.facebook.katana", 0);
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("fb://page/1192767844126708?referrer=app_link"));
//        } catch (Exception e) {
//
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.facebook.com/footlib/"));
//        }
//
//    }
}
