/*
* Copyright (C) 2007 The Android Open Source Project
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
public class PopupWindow
{
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public  PopupWindow(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
public  PopupWindow() { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView) { throw new RuntimeException("Stub!"); }
public  PopupWindow(int width, int height) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView, int width, int height) { throw new RuntimeException("Stub!"); }
public  PopupWindow(android.view.View contentView, int width, int height, boolean focusable) { throw new RuntimeException("Stub!"); }
public  void setEnterTransition(android.transition.Transition enterTransition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getEnterTransition() { throw new RuntimeException("Stub!"); }
public  void setExitTransition(android.transition.Transition exitTransition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getExitTransition() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getBackground() { throw new RuntimeException("Stub!"); }
public  void setBackgroundDrawable(android.graphics.drawable.Drawable background) { throw new RuntimeException("Stub!"); }
public  float getElevation() { throw new RuntimeException("Stub!"); }
public  void setElevation(float elevation) { throw new RuntimeException("Stub!"); }
public  int getAnimationStyle() { throw new RuntimeException("Stub!"); }
public  void setIgnoreCheekPress() { throw new RuntimeException("Stub!"); }
public  void setAnimationStyle(int animationStyle) { throw new RuntimeException("Stub!"); }
public  android.view.View getContentView() { throw new RuntimeException("Stub!"); }
public  void setContentView(android.view.View contentView) { throw new RuntimeException("Stub!"); }
public  void setTouchInterceptor(android.view.View.OnTouchListener l) { throw new RuntimeException("Stub!"); }
public  boolean isFocusable() { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  int getInputMethodMode() { throw new RuntimeException("Stub!"); }
public  void setInputMethodMode(int mode) { throw new RuntimeException("Stub!"); }
public  void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getSoftInputMode() { throw new RuntimeException("Stub!"); }
public  boolean isTouchable() { throw new RuntimeException("Stub!"); }
public  void setTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
public  boolean isOutsideTouchable() { throw new RuntimeException("Stub!"); }
public  void setOutsideTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
public  boolean isClippingEnabled() { throw new RuntimeException("Stub!"); }
public  void setClippingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isSplitTouchEnabled() { throw new RuntimeException("Stub!"); }
public  void setSplitTouchEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isAttachedInDecor() { throw new RuntimeException("Stub!"); }
public  void setAttachedInDecor(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setWindowLayoutType(int layoutType) { throw new RuntimeException("Stub!"); }
public  int getWindowLayoutType() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setWindowLayoutMode(int widthSpec, int heightSpec) { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  void setHeight(int height) { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  void setWidth(int width) { throw new RuntimeException("Stub!"); }
public  void setOverlapAnchor(boolean overlapAnchor) { throw new RuntimeException("Stub!"); }
public  boolean getOverlapAnchor() { throw new RuntimeException("Stub!"); }
public  boolean isShowing() { throw new RuntimeException("Stub!"); }
public  void showAtLocation(android.view.View parent, int gravity, int x, int y) { throw new RuntimeException("Stub!"); }
public  void showAsDropDown(android.view.View anchor) { throw new RuntimeException("Stub!"); }
public  void showAsDropDown(android.view.View anchor, int xoff, int yoff) { throw new RuntimeException("Stub!"); }
public  void showAsDropDown(android.view.View anchor, int xoff, int yoff, int gravity) { throw new RuntimeException("Stub!"); }
public  boolean isAboveAnchor() { throw new RuntimeException("Stub!"); }
public  int getMaxAvailableHeight(android.view.View anchor) { throw new RuntimeException("Stub!"); }
public  int getMaxAvailableHeight(android.view.View anchor, int yOffset) { throw new RuntimeException("Stub!"); }
public  int getMaxAvailableHeight(android.view.View anchor, int yOffset, boolean ignoreBottomDecorations) { throw new RuntimeException("Stub!"); }
public  void dismiss() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) { throw new RuntimeException("Stub!"); }
public  void update() { throw new RuntimeException("Stub!"); }
public  void update(int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(int x, int y, int width, int height, boolean force) { throw new RuntimeException("Stub!"); }
public  void update(android.view.View anchor, int width, int height) { throw new RuntimeException("Stub!"); }
public  void update(android.view.View anchor, int xoff, int yoff, int width, int height) { throw new RuntimeException("Stub!"); }
public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
public static final int INPUT_METHOD_NEEDED = 1;
public static final int INPUT_METHOD_NOT_NEEDED = 2;
}
