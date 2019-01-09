/*
* Copyright (C) 2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.view;
public interface MenuItem
{
public static interface OnMenuItemClickListener
{
public abstract  boolean onMenuItemClick(android.view.MenuItem item);
}
public static interface OnActionExpandListener
{
public abstract  boolean onMenuItemActionExpand(android.view.MenuItem item);
public abstract  boolean onMenuItemActionCollapse(android.view.MenuItem item);
}
public abstract  int getItemId();
public abstract  int getGroupId();
public abstract  int getOrder();
public abstract  android.view.MenuItem setTitle(java.lang.CharSequence title);
public abstract  android.view.MenuItem setTitle(int title);
public abstract  java.lang.CharSequence getTitle();
public abstract  android.view.MenuItem setTitleCondensed(java.lang.CharSequence title);
public abstract  java.lang.CharSequence getTitleCondensed();
public abstract  android.view.MenuItem setIcon(android.graphics.drawable.Drawable icon);
public abstract  android.view.MenuItem setIcon(int iconRes);
public abstract  android.graphics.drawable.Drawable getIcon();
default public  android.view.MenuItem setIconTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
default public  android.content.res.ColorStateList getIconTintList() { throw new RuntimeException("Stub!"); }
default public  android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
default public  android.graphics.PorterDuff.Mode getIconTintMode() { throw new RuntimeException("Stub!"); }
public abstract  android.view.MenuItem setIntent(android.content.Intent intent);
public abstract  android.content.Intent getIntent();
public abstract  android.view.MenuItem setShortcut(char numericChar, char alphaChar);
default public  android.view.MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) { throw new RuntimeException("Stub!"); }
public abstract  android.view.MenuItem setNumericShortcut(char numericChar);
default public  android.view.MenuItem setNumericShortcut(char numericChar, int numericModifiers) { throw new RuntimeException("Stub!"); }
public abstract  char getNumericShortcut();
default public  int getNumericModifiers() { throw new RuntimeException("Stub!"); }
public abstract  android.view.MenuItem setAlphabeticShortcut(char alphaChar);
default public  android.view.MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) { throw new RuntimeException("Stub!"); }
public abstract  char getAlphabeticShortcut();
default public  int getAlphabeticModifiers() { throw new RuntimeException("Stub!"); }
public abstract  android.view.MenuItem setCheckable(boolean checkable);
public abstract  boolean isCheckable();
public abstract  android.view.MenuItem setChecked(boolean checked);
public abstract  boolean isChecked();
public abstract  android.view.MenuItem setVisible(boolean visible);
public abstract  boolean isVisible();
public abstract  android.view.MenuItem setEnabled(boolean enabled);
public abstract  boolean isEnabled();
public abstract  boolean hasSubMenu();
public abstract  android.view.SubMenu getSubMenu();
public abstract  android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener menuItemClickListener);
public abstract  android.view.ContextMenu.ContextMenuInfo getMenuInfo();
public abstract  void setShowAsAction(int actionEnum);
public abstract  android.view.MenuItem setShowAsActionFlags(int actionEnum);
public abstract  android.view.MenuItem setActionView(android.view.View view);
public abstract  android.view.MenuItem setActionView(int resId);
public abstract  android.view.View getActionView();
public abstract  android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider);
public abstract  android.view.ActionProvider getActionProvider();
public abstract  boolean expandActionView();
public abstract  boolean collapseActionView();
public abstract  boolean isActionViewExpanded();
public abstract  android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener listener);
default public  android.view.MenuItem setContentDescription(java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
default public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
default public  android.view.MenuItem setTooltipText(java.lang.CharSequence tooltipText) { throw new RuntimeException("Stub!"); }
default public  java.lang.CharSequence getTooltipText() { throw new RuntimeException("Stub!"); }
public static final int SHOW_AS_ACTION_ALWAYS = 2;
public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
public static final int SHOW_AS_ACTION_IF_ROOM = 1;
public static final int SHOW_AS_ACTION_NEVER = 0;
public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
}
