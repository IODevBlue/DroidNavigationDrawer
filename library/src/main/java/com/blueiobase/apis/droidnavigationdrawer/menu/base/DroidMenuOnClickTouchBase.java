package com.blueiobase.apis.droidnavigationdrawer.menu.base;

import android.view.MotionEvent;
import android.view.View;

/**
 * DroidMenuOnClickTouchBase is a base interface which implements {@link android.view.View.OnClickListener} and {@link View.OnTouchListener}
 *
 * @author IODevBlue
 * @since v1.0.0
 */

public interface DroidMenuOnClickTouchBase extends View.OnClickListener, View.OnTouchListener  {

  @Override
  void onClick (View view);

  @Override
  boolean onTouch (View view, MotionEvent motionEvent);
}
