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

package android.view;
public abstract class ActionMode
{
public static interface Callback
{
public abstract  boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu);
public abstract  boolean onPrepareActionMode(android.view.ActionMode mode, android.view.Menu menu);
public abstract  boolean onActionItemClicked(android.view.ActionMode mode, android.view.MenuItem item);
public abstract  void onDestroyActionMode(android.view.ActionMode mode);
}
public abstract static class Callback2
  implements android.view.ActionMode.Callback
{
public  Callback2() { throw new RuntimeException("Stub!"); }
public  void onGetContentRect(android.view.ActionMode mode, android.view.View view, android.graphics.Rect outRect) { throw new RuntimeException("Stub!"); }
}
public  ActionMode() { throw new RuntimeException("Stub!"); }
public  void setTag(java.lang.Object tag) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getTag() { throw new RuntimeException("Stub!"); }
public abstract  void setTitle(java.lang.CharSequence title);
public abstract  void setTitle(int resId);
public abstract  void setSubtitle(java.lang.CharSequence subtitle);
public abstract  void setSubtitle(int resId);
public  void setTitleOptionalHint(boolean titleOptional) { throw new RuntimeException("Stub!"); }
public  boolean getTitleOptionalHint() { throw new RuntimeException("Stub!"); }
public  boolean isTitleOptional() { throw new RuntimeException("Stub!"); }
public abstract  void setCustomView(android.view.View view);
public  void setType(int type) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public abstract  void invalidate();
public  void invalidateContentRect() { throw new RuntimeException("Stub!"); }
public  void hide(long duration) { throw new RuntimeException("Stub!"); }
public abstract  void finish();
public abstract  android.view.Menu getMenu();
public abstract  java.lang.CharSequence getTitle();
public abstract  java.lang.CharSequence getSubtitle();
public abstract  android.view.View getCustomView();
public abstract  android.view.MenuInflater getMenuInflater();
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_HIDE_DURATION = -1;
public static final int TYPE_FLOATING = 1;
public static final int TYPE_PRIMARY = 0;
}
