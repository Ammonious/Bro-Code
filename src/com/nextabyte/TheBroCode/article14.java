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


public class article14 extends Activity {
    /** Called when the activity is first created. */
  
private ShareActionProvider mShareActionProvider;
	
	
	
	@Override
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
        	intent.putExtra(Intent.EXTRA_TEXT, "If a chick inquires about another Bros sexual history, a Bro shall honour the Brode of Silence and play dumb. Better to have women think all men are stupid than to tell the truth.");
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
        setContentView(R.layout.article14);
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        MyPageAdapter adapter = new MyPageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(14);
        
    }
}