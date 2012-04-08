package com.nextabyte.TheBroCode;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.ShareActionProvider;


public class article3 extends Activity {
    /** Called when the activity is first created. */
  
	
	
	
	
private ShareActionProvider mShareActionProvider;

	
	
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        mShareActionProvider = (ShareActionProvider) menu.findItem(R.id.menu_item_share)
        		.getActionProvider();
        	setShareIntent();
        	return true;
        }


        private void setShareIntent() {
        	Intent intent = new Intent(Intent.ACTION_SEND);
        	intent.setType("text/plain");
        	intent.putExtra(Intent.EXTRA_TEXT, "If a Bro gets a dog, it must be at least as tall as his knee when full-grown.");
        	mShareActionProvider.setShareIntent(intent);
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    // app icon in action bar clicked; go home
                    Intent intent = new Intent(this, mainMenuActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.article3);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        MyPageAdapter adapter = new MyPageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(3);
        
       // TextView text = (TextView)findViewById(R.id.textView01);
       // text.setText("Article 3");
        
      //  TextView body = (TextView)findViewById(R.id.textView02);
       // body.setText("If a Bro gets a dog, it must be at least as tall as his knee when full-grown.");
       // return layout;
    }
}