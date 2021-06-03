package com.example.ie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class fragment_HP extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tabItem1, tabItem2;
    ViewPager viewPager;
    ViewPagerAdapter3 pageAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabItem1 = (TabItem) findViewById(R.id.tab1);
        tabItem2 = (TabItem) findViewById(R.id.tab2);
        viewPager = (ViewPager) findViewById(R.id.vpager);

        pageAdapter2 = new ViewPagerAdapter3(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter2);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1) {

                    pageAdapter2.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        //used for scrolling the page
    }

    private void DisplayTrack(String source, String destination) {
        try{
            Uri uri=Uri.parse("https://www.google.co.in/maps/dir/"+ source + "/" + destination );
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(intent);



        }catch(ActivityNotFoundException e)
        {
            //when google maps is not installed
            Uri uri=Uri.parse("https://play.google.com.store/apps/details?id=com.google.android.apps.maps");
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }


    public void hp21(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,jibhi tirthan valley";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }


    }

    public void hp22(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,kasol";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void ghp23(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,kalpa";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp24(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,kaza";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp25(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,nahan";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp26(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,dharamshala";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp27(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,shimla";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp28(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,dalhousie";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp29(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,narkanda";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }

    public void hp30(View view) {

        String Source="faridabad";
        String Destination="HIMACHAL PARDESH,manali";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }

    }
}