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

package android.graphics.drawable;
public class ShapeDrawable
  extends android.graphics.drawable.Drawable
{
public abstract static class ShaderFactory
{
public  ShaderFactory() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.Shader resize(int width, int height);
}
public  ShapeDrawable() { throw new RuntimeException("Stub!"); }
public  ShapeDrawable(android.graphics.drawable.shapes.Shape s) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.shapes.Shape getShape() { throw new RuntimeException("Stub!"); }
public  void setShape(android.graphics.drawable.shapes.Shape s) { throw new RuntimeException("Stub!"); }
public  void setShaderFactory(android.graphics.drawable.ShapeDrawable.ShaderFactory fact) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.ShapeDrawable.ShaderFactory getShaderFactory() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void setIntrinsicWidth(int width) { throw new RuntimeException("Stub!"); }
public  void setIntrinsicHeight(int height) { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.drawable.shapes.Shape shape, android.graphics.Canvas canvas, android.graphics.Paint paint) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
protected  void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
protected  boolean inflateTag(java.lang.String name, android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
}
