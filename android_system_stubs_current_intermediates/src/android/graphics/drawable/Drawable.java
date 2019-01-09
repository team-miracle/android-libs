/*
* Copyright (C) 2006 The Android Open Source Project
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
public abstract class Drawable
{
public static interface Callback
{
public abstract  void invalidateDrawable(android.graphics.drawable.Drawable who);
public abstract  void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long when);
public abstract  void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what);
}
public abstract static class ConstantState
{
public  ConstantState() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.drawable.Drawable newDrawable();
public  android.graphics.drawable.Drawable newDrawable(android.content.res.Resources res) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable newDrawable(android.content.res.Resources res, @java.lang.SuppressWarnings(value={"unused"})
android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public abstract  int getChangingConfigurations();
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
}
public  Drawable() { throw new RuntimeException("Stub!"); }
public abstract  void draw(android.graphics.Canvas canvas);
public  void setBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setBounds(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public final  void copyBounds(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public final  android.graphics.Rect copyBounds() { throw new RuntimeException("Stub!"); }
public final  android.graphics.Rect getBounds() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getDirtyBounds() { throw new RuntimeException("Stub!"); }
public  void setChangingConfigurations(int configs) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
public  boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
public final  void setCallback(android.graphics.drawable.Drawable.Callback cb) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.Callback getCallback() { throw new RuntimeException("Stub!"); }
public  void invalidateSelf() { throw new RuntimeException("Stub!"); }
public  void scheduleSelf(java.lang.Runnable what, long when) { throw new RuntimeException("Stub!"); }
public  void unscheduleSelf(java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  int getLayoutDirection() { throw new RuntimeException("Stub!"); }
public final  boolean setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public abstract  void setAlpha(int alpha);
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public abstract  void setColorFilter(android.graphics.ColorFilter colorFilter);
public  void setColorFilter(int color, android.graphics.PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
public  void setTint(int tintColor) { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  void clearColorFilter() { throw new RuntimeException("Stub!"); }
public  void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
public  void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void getHotspotBounds(android.graphics.Rect outRect) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
public  boolean setState(int[] stateSet) { throw new RuntimeException("Stub!"); }
public  int[] getState() { throw new RuntimeException("Stub!"); }
public  void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getCurrent() { throw new RuntimeException("Stub!"); }
public final  boolean setLevel(int level) { throw new RuntimeException("Stub!"); }
public final  int getLevel() { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public final  boolean isVisible() { throw new RuntimeException("Stub!"); }
public  void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
public  boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
public  void applyTheme(@java.lang.SuppressWarnings(value={"unused"})
android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public abstract  int getOpacity();
public static  int resolveOpacity(int op1, int op2) { throw new RuntimeException("Stub!"); }
public  android.graphics.Region getTransparentRegion() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
protected  boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  int getMinimumWidth() { throw new RuntimeException("Stub!"); }
public  int getMinimumHeight() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromStream(java.io.InputStream is, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromResourceStream(android.content.res.Resources res, android.util.TypedValue value, java.io.InputStream is, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
@Deprecated
public static  android.graphics.drawable.Drawable createFromResourceStream(android.content.res.Resources res, android.util.TypedValue value, java.io.InputStream is, java.lang.String srcName, android.graphics.BitmapFactory.Options opts) { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromXml(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromXml(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromXmlInner(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static  android.graphics.drawable.Drawable createFromPath(java.lang.String pathName) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
}
