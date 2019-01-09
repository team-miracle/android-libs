/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.graphics.drawable;
public class RippleDrawable
  extends android.graphics.drawable.LayerDrawable
{
public  RippleDrawable(android.content.res.ColorStateList color, android.graphics.drawable.Drawable content, android.graphics.drawable.Drawable mask) { super((android.graphics.drawable.Drawable[])null); throw new RuntimeException("Stub!"); }
public  void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  void setColor(android.content.res.ColorStateList color) { throw new RuntimeException("Stub!"); }
public  void setRadius(int radius) { throw new RuntimeException("Stub!"); }
public  int getRadius() { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean setDrawableByLayerId(int id, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  void setPaddingMode(int mode) { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
public  void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void getHotspotBounds(android.graphics.Rect outRect) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void invalidateSelf() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getDirtyBounds() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
public static final int RADIUS_AUTO = -1;
}
