package com.blueiobase.apis.droidnavigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import com.blueiobase.apis.droidnavigationdrawer.menu.item.DroidMenuItem;


 /**
 * Droid Navigation Drawer is a left slider user interface menu panel for displaying an application's main navigation menu. It primarily appears when a user swipes to
 * from the left edge or touches the drawer icon in the App Bar.
 *<p>
 *
 */
public abstract class DroidNavigationDrawer <TextView, Fragment> extends AppCompatActivity implements DroidMenuItem.DroidMenuItemOnClickListener {

  /**
   * This flag allows navigation to the previously selected Menu item.
   */
  public static final int RETURN_TO_PREVIOUS_SECTION= 0;

  /**
   * This flag allows navigation to the initial selected Menu item irrespective of the order of navigation.
   */
  public static final int RETURN_TO_STARTING_SECTION = 1;

  /**
   * This flag allows navigation up the Menu hierarchy from currently selected Menu item irrespective of the order navigation.
   */
  public static final int RETURN_CLIMB_UP = 2;

  /**
   * This flag closes the current Screen.
   *
   * This is the default behaviour.
   */
  public static final int RETURN_CLOSE = 3;

  /**
   * This is the default Droid Navigation Drawer Height.
   */
  public static final int DEFAULT_DRAWER_HEIGHT = 0;

  /**
   * This is the default Droid Navigation Drawer Width.
   */
  public static final int DEFAULT_DRAWER_WIDTH = 0;



}
