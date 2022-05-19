package com.blueiobase.apis.droidnavigationdrawer.menu.item;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blueiobase.apis.droidnavigationdrawer.DroidNavigationDrawer;
import com.blueiobase.apis.droidnavigationdrawer.menu.DroidMenu;
import com.blueiobase.apis.droidnavigationdrawer.menu.base.DroidMenuOnClickTouchBase;

public class DroidMenuItem <DroidMenuItemTextView extends TextView> extends DroidMenu implements DroidMenuOnClickTouchBase {

  private DroidNavigationDrawer<DroidMenuItemTextView, Object> drawer;
  private View view;
  private DroidMenuItemTextView mText;
  private DroidMenuItemTextView mNotifications;
  private ImageView iconView;
  protected DroidMenuItemOnClickListener mMenuItemOnClickListener;

  private boolean mSelected;
  private int mMenuItemColor;
  private boolean hasIconColor;

  private boolean hasSectionColor;
  private boolean hasDarkColor;
  private int mUnselectedColor;
  private int mSelectedColor;
  private int mHighlightedColor;
  private int mIconColor;
  private int mDarkColor;
  private int mTextColor;
  private int mNotificationColor;

  private int mNotificationNumber;

  protected String mTitle;

  private boolean hasIcon = false;
  private boolean isSectionDivided = false;

  @Override
  public void onClick (View view) {

  }

  @SuppressLint("ClickableViewAccessibility")
  @Override
  public boolean onTouch (View view, MotionEvent motionEvent) {
    //TODO: fix clickableviewaccessibility
    return false;
  }

  public interface DroidMenuItemOnClickListener {
    void onClick (DroidMenuItem<? extends TextView> section, View v);
  }
}
