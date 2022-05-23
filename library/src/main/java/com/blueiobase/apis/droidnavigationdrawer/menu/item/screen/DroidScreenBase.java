package com.blueiobase.apis.droidnavigationdrawer.menu.item.screen;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blueiobase.apis.droidnavigationdrawer.DroidNavigationDrawer;
import com.blueiobase.apis.droidnavigationdrawer.menu.DroidMenu;
import com.blueiobase.apis.droidnavigationdrawer.menu.base.DroidMenuOnClickTouchBase;
import com.blueiobase.apis.droidnavigationdrawer.menu.item.DroidMenuItem;

/**
 *
 *
 *  @author IODevBlue
 * @version 1.0.0
 * @since v1.0.0
*/
public class DroidScreenBase <DroidMenuItemTextView extends TextView> implements DroidMenuItem, DroidMenuOnClickTouchBase {

  private DroidNavigationDrawer<DroidMenuItemTextView, Object> mDroidNavDrawer;

  /**
   * {@link android.view.View} of this {@link DroidMenuItem}.
   */
  private View mView;

  /**
   * {@link TextView} of this {@link DroidMenuItem} Title.
   */
  private DroidMenuItemTextView mText;

  /**
   * {@link TextView} of this {@link DroidMenuItem} Notifications.
   */
  private DroidMenuItemTextView mNotifications;

  /**
   * {@link ImageView} Icon of this {@link DroidMenuItem}
   */
  private ImageView mIconView;


  protected DroidMenuItemOnClickListener mMenuItemOnClickListener;

  /**
   * If this {@link DroidMenuItem} is selected.
   */
  private boolean mSelected;

  /**
   * Unique color of this {@link DroidMenuItem}
   */
  private int mMenuItemColor;

  /**
   * If this {@link DroidMenuItem} has a unique Icon color.
   */
  private boolean hasIconColor;

  /**
   * If this {@link DroidMenuItem} has a section color set.
   */
  private boolean hasSectionColor;

  /**
   * If this {@link DroidMenuItem} has a dark color set to it.
   */
  private boolean hasDarkColor;

  /**
   * Integer value of the global theme unselected color.
   */
  private int mUnselectedColor; //TODO: fix styleable link

  /**
   * Integer value of the global theme Menu item selected color.
   */
  private int mSelectedColor; //TODO: fix styleable link

  /**
   * Integer value of the global theme Menu item highlight color.
   */
  private int mHighlightedColor; //TODO: fix styleable link

  /**
   * Integer value of the global theme Menu item icon color.
   */
  private int mIconColor; //TODO: fix styleable link

  /**
   * Integer value of the dark variant of this Menu item.
   */
  private int mDarkColor; //TODO: fix styleable link

  /**
   * Integer value of the global theme Menu item text color.
   */
  private int mTextColor; //TODO: fix styleable link

  /**
   * Integer value of the global theme Menu item notification color.
   */
  private int mNotificationColor; //TODO: fix styleable link

  /**
   * Number of notifications.
   */
  private int mNotificationNumber;

  /**
   * Title of this {@link DroidMenuItem}.
   */
  protected String mTitle;

  /**
   * If this {@link DroidMenuItem} has an icon.
   */
  private boolean hasIcon = false;

  /**
   *
   */
  private boolean isSectionDivided = false; //TODO: Verify functionality and include attribute.

  @Override
  public void onClick (View view) {

  }

  @SuppressLint("ClickableViewAccessibility")
  @Override
  public boolean onTouch (View view, MotionEvent motionEvent) {
	//TODO: fix clickableviewaccessibility
	return false;
  }

  //TODO: Abstract this Interface into a separate file
  public interface DroidMenuItemOnClickListener {
	void onClick (DroidMenuItem section, View v);
  }
}
