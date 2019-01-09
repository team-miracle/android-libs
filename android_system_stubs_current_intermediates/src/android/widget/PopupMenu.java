/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.widget;
public class PopupMenu
{
public static interface OnMenuItemClickListener
{
public abstract  boolean onMenuItemClick(android.view.MenuItem item);
}
public static interface OnDismissListener
{
public abstract  void onDismiss(android.widget.PopupMenu menu);
}
public  PopupMenu(android.content.Context context, android.view.View anchor) { throw new RuntimeException("Stub!"); }
public  PopupMenu(android.content.Context context, android.view.View anchor, int gravity) { throw new RuntimeException("Stub!"); }
public  PopupMenu(android.content.Context context, android.view.View anchor, int gravity, int popupStyleAttr, int popupStyleRes) { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  android.view.View.OnTouchListener getDragToOpenListener() { throw new RuntimeException("Stub!"); }
public  android.view.Menu getMenu() { throw new RuntimeException("Stub!"); }
public  android.view.MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); }
public  void inflate(int menuRes) { throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void dismiss() { throw new RuntimeException("Stub!"); }
public  void setOnMenuItemClickListener(android.widget.PopupMenu.OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.widget.PopupMenu.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
}
