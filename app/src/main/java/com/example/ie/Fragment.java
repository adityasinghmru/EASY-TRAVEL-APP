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

public class Fragment extends AppCompatActivity {
TabLayout tabLayout;
TabItem tabItem1,tabItem2;
ViewPager viewPager;
ViewPagerAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabItem1=(TabItem)findViewById(R.id.tab1);
        tabItem2=(TabItem)findViewById(R.id.tab2);
        viewPager=(ViewPager)findViewById(R.id.vpager);

        pageAdapter=new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1)
                {

                    pageAdapter.notifyDataSetChanged();
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





    public void g11(View view) {
        String Source="faridabad";
        String Destination="kerala,cochin";


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

    public void g12(View view) {
        String Source="faridabad";
        String Destination="kerala,Blossom park dark forest";


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

    public void g13(View view) {
        String Source="faridabad";
        String Destination="kerala,kasargod";


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

    public void g14(View view) {
        String Source="faridabad";
        String Destination="kerala,kuttand";


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

    public void g15(View view) {
        String Source="faridabad";
        String Destination="kerala,kozhikode";


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


    public void g16(View view) {
        String Source="faridabad";
        String Destination="kerala,varkala kappil beach";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }}

    public void g17(View view) {
        String Source="faridabad";
        String Destination="kerala,kovalam";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }}

    public void g18(View view) {
        String Source="faridabad";
        String Destination="kerala,vagamon";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }}

    public void g19(View view) {
        String Source="faridabad";
        String Destination="kerala,thekkady";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }}

    public void g20(View view) {
        String Source="faridabad";
        String Destination="kerala,valara waterfalls";


        //condition
        if(Source.equals("") && Destination.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter both location", Toast.LENGTH_SHORT).show();
        }
        else
        {
            DisplayTrack(Source,Destination);
        }}
}