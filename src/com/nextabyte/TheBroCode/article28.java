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

public class article28 extends Activity {
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
        	intent.putExtra(Intent.EXTRA_TEXT, "A Bro will, in a timely manner, alert his Bro to the existance of a girl fight. – A Bro must, in a timely manner, communicate the possibility of fisticoffs between two humans of the female variety (Henceforth “girl fight”), in an effort to make possible and probable that another Bro or Bros can partake in observation. A “timely manner” is open to interpretation based on the initial Bro’s viewing and processing of the potential feminine conflagration. Said Bro must use any and all methods of media distribution at his disposal, including but not limited to: telecommunications, elbow nudging, carrier pidgins, fiber optics, shouting, postcards, and telepathy. If an informed Bro is unable to witness the girl fight firsthand, the spotter Bro is responsible for documenting and relating details of the girl fight via pictures, video, or, barring any other reasonable method, interpretive dance and/or pantomime");
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
        setContentView(R.layout.article28);
        
        
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        MyPageAdapter adapter = new MyPageAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(28);
        
    }
}