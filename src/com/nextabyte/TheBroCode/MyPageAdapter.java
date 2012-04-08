package com.nextabyte.TheBroCode;

import java.util.List;

import com.nextabyte.TheBroCode.R.layout;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyPageAdapter extends PagerAdapter {

	public int getCount() {
        return 31;
    }

    public Object instantiateItem(View collection, int position) {

        LayoutInflater inflater = (LayoutInflater) collection.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
       
        
       

        int resId = 0;
        
        
       
		switch (position) {
            case 0:
                resId = R.layout.main_menu;
               // View view = inflater.inflate(resId, null);
               // LinearLayout layout = (LinearLayout)view.findViewById(R.id.linearLayout1);
               // TextView text0 =(TextView)layout.findViewById(R.id.textView01);
               // TextView text01 =(TextView)layout.findViewById(R.id.textView02);
                break;
            case 1:
                resId = R.layout.article1;
                //View view1 = inflater.inflate(resId, null);
                //LinearLayout layout1 = (LinearLayout)view1.findViewById(R.id.linearLayout1);
                //TextView text1 =(TextView)layout1.findViewById(R.id.textView01);
                //TextView text12 =(TextView)layout1.findViewById(R.id.textView02);
                break;
            case 2:
                resId = R.layout.article2;
                //View view2 = inflater.inflate(resId, null);
                //LinearLayout layout2 = (LinearLayout)view2.findViewById(R.id.linearLayout1);
                //TextView text2 =(TextView)layout2.findViewById(R.id.textView01);
                //TextView text23 =(TextView)layout2.findViewById(R.id.textView02);
                break;
            case 3:
                resId = R.layout.article3;
                //View view3 = inflater.inflate(resId, null);
                //LinearLayout layout3 = (LinearLayout)view3.findViewById(R.id.linearLayout1);
                //TextView text3 =(TextView)layout3.findViewById(R.id.textView01);
                //TextView text34 =(TextView)layout3.findViewById(R.id.textView02);
                break;
            case 4:
                resId = R.layout.article4;
                //View view4 = inflater.inflate(resId, null);
                //LinearLayout layout4 = (LinearLayout)view4.findViewById(R.id.linearLayout1);
                //TextView text4 =(TextView)layout4.findViewById(R.id.textView01);
                //TextView text45 =(TextView)layout4.findViewById(R.id.textView02);
                break;
            case 5:
                resId = R.layout.article5;
                //View view5 = inflater.inflate(resId, null);
                //LinearLayout layout5 = (LinearLayout)view5.findViewById(R.id.linearLayout1);
                //TextView text5 =(TextView)layout5.findViewById(R.id.textView01);
                //TextView text56 =(TextView)layout5.findViewById(R.id.textView02);
                break;
            case 6:
                resId = R.layout.article6;
                //View view6 = inflater.inflate(resId, null);
                //LinearLayout layout6 = (LinearLayout)view6.findViewById(R.id.linearLayout1);
                //TextView text6 =(TextView)layout6.findViewById(R.id.textView01);
                //TextView text67 =(TextView)layout6.findViewById(R.id.textView02);
                break;
            case 7:
                resId = R.layout.article7;
                //View view7= inflater.inflate(resId, null);
                //LinearLayout layout7 = (LinearLayout)view7.findViewById(R.id.linearLayout1);
                //TextView text7 =(TextView)layout7.findViewById(R.id.textView01);
                //TextView text78 =(TextView)layout7.findViewById(R.id.textView02);
                break;
            case 8:
                resId = R.layout.article8;
                //View view8 = inflater.inflate(resId, null);
                //LinearLayout layout8 = (LinearLayout)view8.findViewById(R.id.linearLayout1);
                //TextView text8 =(TextView)layout8.findViewById(R.id.textView01);
                //TextView text89 =(TextView)layout8.findViewById(R.id.textView02);
                break;
            case 9:
                resId = R.layout.article9;
                //View view9 = inflater.inflate(resId, null);
                //LinearLayout layout9 = (LinearLayout)view9.findViewById(R.id.linearLayout1);
                //TextView text9 =(TextView)layout9.findViewById(R.id.textView01);
                //TextView text91 =(TextView)layout9.findViewById(R.id.textView02);
                break;
            case 10:
                    resId = R.layout.article10;
                    //View view10 = inflater.inflate(resId, null);
                    //LinearLayout layout10 = (LinearLayout)view10.findViewById(R.id.linearLayout1);
                    //TextView text10 =(TextView)layout10.findViewById(R.id.textView01);
                    //TextView text11 =(TextView)layout10.findViewById(R.id.textView02);
                    break;
            case 11:
                    resId = R.layout.article11;
                    //View view11 = inflater.inflate(resId, null);
                    //LinearLayout layout11 = (LinearLayout)view11.findViewById(R.id.linearLayout1);
                    //TextView text120 =(TextView)layout11.findViewById(R.id.textView01);
                    //TextView text13 =(TextView)layout11.findViewById(R.id.textView02);
                    break;
            case 12:
                    resId = R.layout.article12;
                    
                   
                    break;
            case 13:
                    resId = R.layout.article13;
                    
                    break;
                    
		case 14:
                    resId = R.layout.article14;
                   
                   // LinearLayout layout14 = (LinearLayout)view.findViewById(R.id.linearLayout1);
                    //TextView text18 =(TextView)layout14.findViewById(R.id.textView01);
                   // TextView text19 =(TextView)layout14.findViewById(R.id.textView02);
                    break;
            case 15:
                        resId = R.layout.article15;
                      
                      //  LinearLayout layout15 = (LinearLayout)view15.findViewById(R.id.linearLayout1);
                      //  TextView text20 =(TextView)layout15.findViewById(R.id.textView01);
                      //  TextView text21 =(TextView)layout15.findViewById(R.id.textView02);
                        break;
            case 16:
                        resId = R.layout.article16;
                      
                       // LinearLayout layout16 = (LinearLayout)view16.findViewById(R.id.linearLayout1);
                      //  TextView text22 =(TextView)layout16.findViewById(R.id.textView01);
                      //  TextView text230 =(TextView)layout16.findViewById(R.id.textView02);
                        break;
            case 17:
                        resId = R.layout.article17;
                      
                       /// LinearLayout layout17 = (LinearLayout)view17.findViewById(R.id.linearLayout1);
                       // TextView text24 =(TextView)layout17.findViewById(R.id.textView01);
                       // TextView text25 =(TextView)layout17.findViewById(R.id.textView02);
                        break;
            case 18:
                        resId = R.layout.article18;
                      
                        //LinearLayout layout18 = (LinearLayout)view18.findViewById(R.id.linearLayout1);
                        //TextView text26 =(TextView)layout18.findViewById(R.id.textView01);
                       // TextView text27 =(TextView)layout18.findViewById(R.id.textView02);
                        break;
            case 19:
                        resId = R.layout.article19;
                     
                     //   LinearLayout layout19 = (LinearLayout)view19.findViewById(R.id.linearLayout1);
                      //  TextView text28 =(TextView)layout19.findViewById(R.id.textView01);
                     //   TextView text29 =(TextView)layout19.findViewById(R.id.textView02);
                        break;
            case 20:
                        resId = R.layout.article20;
                      
                      //  LinearLayout layout20 = (LinearLayout)view20.findViewById(R.id.linearLayout1);
                      //  TextView text30 =(TextView)layout20.findViewById(R.id.textView01);
                      //  TextView text31 =(TextView)layout20.findViewById(R.id.textView02);
                        break;
            case 21:
                        resId = R.layout.article21;
                      
                       // LinearLayout layout21 = (LinearLayout)view21.findViewById(R.id.linearLayout1);
                       // TextView text32 =(TextView)layout21.findViewById(R.id.textView01);
                      //  TextView text33 =(TextView)layout21.findViewById(R.id.textView02);
                        break;
            case 22:
                        resId = R.layout.article22;
                     
                      //  LinearLayout layout22 = (LinearLayout)view22.findViewById(R.id.linearLayout1);
                      //  TextView text341 =(TextView)layout22.findViewById(R.id.textView01);
                      //  TextView text35 =(TextView)layout22.findViewById(R.id.textView02);
                        break;
            case 23:
                        resId = R.layout.article23;
                       
                      //  LinearLayout layout23 = (LinearLayout)view23.findViewById(R.id.linearLayout1);
                      //  TextView text36 =(TextView)layout23.findViewById(R.id.textView01);
                       // TextView text37 =(TextView)layout23.findViewById(R.id.textView02);
                        break;
            case 24:
                        resId = R.layout.article24;
                       
                       // LinearLayout layout24 = (LinearLayout)view24.findViewById(R.id.linearLayout1);
                      //  TextView text38 =(TextView)layout24.findViewById(R.id.textView01);
                       // TextView text39 =(TextView)layout24.findViewById(R.id.textView02);
                        break;
            case 25:
                        resId = R.layout.article25;
                       
                       // LinearLayout layout25 = (LinearLayout)view25.findViewById(R.id.linearLayout1);
                      //  TextView text40 =(TextView)layout25.findViewById(R.id.textView01);
                       // TextView text41 =(TextView)layout25.findViewById(R.id.textView02);
                        break;
            case 26:
                        resId = R.layout.article26;
                      
                       // LinearLayout layout26 = (LinearLayout)view26.findViewById(R.id.linearLayout1);
                       // TextView text42 =(TextView)layout26.findViewById(R.id.textView01);
                       // TextView text43 =(TextView)layout26.findViewById(R.id.textView02);
                        break;
            case 27:
                        resId = R.layout.article27;
                        
                        break; 
            case 28:
                        resId = R.layout.article28;
                      
                      //  LinearLayout layout28 = (LinearLayout)view28.findViewById(R.id.linearLayout1);
                      //  TextView text46 =(TextView)layout28.findViewById(R.id.textView01);
                      //  TextView text47 =(TextView)layout28.findViewById(R.id.textView02);
                        break;
            case 29:
                        resId = R.layout.article29;
                      
                      //  LinearLayout layout29 = (LinearLayout)view29.findViewById(R.id.linearLayout1);
                      //  TextView text48 =(TextView)layout29.findViewById(R.id.textView01);
                      //  TextView text49 =(TextView)layout29.findViewById(R.id.textView02);
                        break;
            case 30:
                        resId = R.layout.article30;
                      //  View view30 = inflater.inflate(resId, null);P
                      //  LinearLayout layout30 = (LinearLayout)view30.findViewById(R.id.linearLayout1);
                      //  TextView text50 =(TextView)layout30.findViewById(R.id.textView01);
                      //  TextView text51 =(TextView)layout30.findViewById(R.id.textView02);
                        break;            
            
        } 
		View view = inflater.inflate(resId, null);
		
		 
        ((ViewPager) collection).addView(view, 0);
        

        return view;

        
    }

   

	@Override
    public void destroyItem(View arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView((View) arg2);

    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == ((View) arg1);

    }

    @Override
    public Parcelable saveState() {
        return null;
    }
}
