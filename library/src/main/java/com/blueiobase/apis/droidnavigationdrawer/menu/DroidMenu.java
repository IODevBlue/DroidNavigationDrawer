package com.blueiobase.apis.droidnavigationdrawer.menu;

import android.widget.TextView;

import androidx.drawerlayout.widget.DrawerLayout;

import com.blueiobase.apis.droidnavigationdrawer.menu.item.DroidMenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IODevBlue
 * @version 1.0.0
 * @since v1.0.0
 */
public class DroidMenu {

  public static int MENU_ITEM = 0;
  public static int BOTTOM_MENU_ITEM = 1;

  /**
   * A list of all {@link DroidMenuItem} that this {@link DroidMenu} contains.
   */
  private List<DroidMenuItem> mMenuItemList;

  /**
   * Index of the first {@link DroidMenuItem}
   */
  private int mStartIndex;

  //Default constructor
  public DroidMenu() {
    mStartIndex = -1;
    mMenuItemList = new ArrayList<>();
  }



}
