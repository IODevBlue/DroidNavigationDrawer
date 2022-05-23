package com.blueiobase.apis.droidnavigationdrawer;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.blueiobase.apis.droidnavigationdrawer.drawerlayout.DroidDrawerLayout;
import com.blueiobase.apis.droidnavigationdrawer.menu.item.DroidMenuItem;
import com.blueiobase.apis.droidnavigationdrawer.menu.item.screen.DroidScreenBase;


/**
 * Droid Navigation Drawer is a left slider user interface menu panel for displaying an application's main navigation menu. It primarily appears when a user swipes to
 * from the left edge or touches the drawer icon in the App Bar.
 *<p>
 *
 */
public abstract class DroidNavigationDrawer <TextView, Fragment> extends AppCompatActivity implements DroidScreenBase.DroidMenuItemOnClickListener {

  /**
   * Flag allowing navigation to the previously selected Menu item.
   */
  public static final int RETURN_TO_PREVIOUS_SECTION= 0;

  /**
   * Flag allowing navigation to the initial selected Menu item irrespective of the order of navigation.
   */
  public static final int RETURN_TO_STARTING_SECTION = 1;

  /**
   * Flag allowing navigation up the Menu hierarchy from currently selected Menu item irrespective of the order navigation.
   */
  public static final int RETURN_CLIMB_UP = 2;

  /**
   * Flag to close the current Screen.
   *
   * This is the default behaviour.
   */
  public static final int RETURN_CLOSE = 3;

  /**
   * Default Droid Navigation Drawer Height.
   */
  public static final int DEFAULT_DRAWER_HEIGHT = 0;

  /**
   * Default Droid Navigation Drawer Width.
   */
  public static final int DEFAULT_DRAWER_WIDTH = 0;

   /**
    * Interactive drawer and top-level container for window content.
    *
    * inherits from AndroidX: {@link DrawerLayout}
    */
   protected DroidDrawerLayout mDroidDrawerLayout;

   /**
    * The {@link ActionBarDrawerToggle} used in this Navigation Drawer.
    */
   private ActionBarDrawerToggle mDroidActionBarToggle;

   /**
    * The {@link Toolbar} used in this Navigation Drawer
    */
   private Toolbar mToolbar;

   /**
    * The root layout {@link android.view.ViewGroup} of the Navigation Menu.
    */
   protected RelativeLayout mDroidDrawerViewGroup;

   /**
    * The root {@link android.view.ViewGroup} of the {@link com.blueiobase.apis.droidnavigationdrawer.drawerlayout.BaseDrawerLayout}
    *
    */
   private ViewGroup mMainContentViewGroup;

  /**
   * This represents the background of the Android Notification Bar.
   */
  private ImageView mNotificationBar;

   /**
    * The root layout {@link android.view.ViewGroup} of all {@link DroidMenuItem} in the current {@link com.blueiobase.apis.droidnavigationdrawer.menu.DroidMenu}
    */
   protected LinearLayout mDroidItemSections;

}
