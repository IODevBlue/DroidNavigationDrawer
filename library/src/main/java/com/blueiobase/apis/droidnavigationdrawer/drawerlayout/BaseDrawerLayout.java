package com.blueiobase.apis.droidnavigationdrawer.drawerlayout;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;

/**
 * Base abstract class for API implementations of {@link DrawerLayout}
 *
 * @author IODevBlue
 * @version 1.0.0
 * @since v1.0.0
 * @see androidx.drawerlayout.widget.DrawerLayout
 */
public abstract class BaseDrawerLayout extends DrawerLayout {

  public BaseDrawerLayout (@NonNull Context context) {
	super(context);
  }

  public BaseDrawerLayout (@NonNull Context context, @Nullable AttributeSet attrs) {
	super(context, attrs);
  }

  public BaseDrawerLayout (@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
	super(context, attrs, defStyleAttr);
  }

}
