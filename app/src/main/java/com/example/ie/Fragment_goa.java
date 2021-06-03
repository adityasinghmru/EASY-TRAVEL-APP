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

public class Fragment_goa extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tabItem1,tabItem2;
    ViewPager viewPager;
    ViewPagerAdapter2 pageAdapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabItem1=(TabItem)findViewById(R.id.tab1);
        tabItem2=(TabItem)findViewById(R.id.tab2);
        viewPager=(ViewPager)findViewById(R.id.vpager);

        pageAdapter1=new ViewPagerAdapter2(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter1);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1)
                {

                    pageAdapter1.notifyDataSetChanged();
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

    public void g1(View view) {

        String Source="faridabad";
        String Destination="GOA,fort aguada";


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

    public void g2(View view) {


        String Source="faridabad";
        String Destination="GOA,dudhsagar falls";


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

    public void g3(View view) {

        String Source="faridabad";
        String Destination="GOA,titos street";


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

    public void g4(View view) {

        String Source="faridabad";
        String Destination="GOA,canacona";


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

    public void g5(View view) {

        String Source="faridabad";
        String Destination="GOA,palolem beach";


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

    public void g7(View view) {
        String Source="faridabad";
        String Destination="GOA,club cubana";


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

    public void g8(View view) {
        String Source="faridabad";
        String Destination="GOA,anjuna curlies";


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

    public void g9(View view) {
        String Source="faridabad";
        String Destination="GOA,casino cruise";


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

    public void g10(View view) {
        String Source="faridabad";
        String Destination="GOA,anjuna flea market";


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

    public void g6(View view) {
        String Source="faridabad";
        String Destination="GOA,baga beach";


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
