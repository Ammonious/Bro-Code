   package com.nextabyte.TheBroCode;



import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;



public class mainMenuActivity extends FragmentActivity implements  ViewPager.OnPageChangeListener {
    /** Called when the activity is first created. */
		
	public PagerAdapter mPagerAdapter;
	
	private ViewPager mViewPager;
	
		
	
	     

	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
		return true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.main_menu);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
                
        MyPageAdapter adapter = new MyPageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
       
    
    
       
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        TextView textView10 = (TextView) findViewById(R.id.textView10);
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        TextView textView15 = (TextView) findViewById(R.id.textView15);
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        TextView textView18 = (TextView) findViewById(R.id.textView18);
        TextView textView19 = (TextView) findViewById(R.id.textView19);
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        TextView textView26 = (TextView) findViewById(R.id.textView26);
        TextView textView27 = (TextView) findViewById(R.id.textView27);
        TextView textView28 = (TextView) findViewById(R.id.textView28);
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        TextView textView30 = (TextView) findViewById(R.id.textView30);
        
        
        
      
        
        
       textView1.setOnClickListener(new View.OnClickListener() {
        	 
         public void onClick(View arg0) {
               // Starting a new Intent
               Intent nextScreen = new Intent(getApplicationContext(), article1.class);
                startActivity(nextScreen);
        
        
         }
        
       });
       
       textView2.setOnClickListener(new View.OnClickListener() {
      	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article2.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       
       textView3.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article3.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView4.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article4.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView5.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article5.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView6.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article6.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView7.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article7.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView8.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article8.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView9.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article9.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView10.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article10.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView11.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article11.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView12.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article12.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView13.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article13.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView14.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article14.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView15.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article15.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView16.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article16.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView17.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article17.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView18.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article18.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView19.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article19.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView20.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article20.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView21.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article21.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView22.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article22.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView23.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article23.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView24.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article24.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView25.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article25.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView26.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article26.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView27.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article27.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView28.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article28.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView29.setOnClickListener(new View.OnClickListener() {
        	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article29.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
       textView30.setOnClickListener(new View.OnClickListener() {
      	 
           public void onClick(View arg0) {
                 // Starting a new Intent
                 Intent nextScreen = new Intent(getApplicationContext(), article30.class);
                  startActivity(nextScreen);
          
          
           }
          
         });
   
   
       
       }
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		
	}
       
      
      
    	  
       
      
   

    	   
    	           

       
       

    
}   
    
    
    
    



