package com.blueiobase.apis.droidnavigationdrawer.drawerlayout;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


/**
 * This is the default interactive drawer.
 *
 * @author IODevBlue
 * @version 1.0.0
 * @since v1.0.0
 */
public class DroidDrawerLayout extends BaseDrawerLayout {

  public DroidDrawerLayout (@NonNull Context context) {
	super(context);
  }

  public DroidDrawerLayout (@NonNull Context context, @Nullable AttributeSet attrs) {
	super(context, attrs);
  }

  public DroidDrawerLayout (@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
	super(context, attrs, defStyleAttr);
  }

}
