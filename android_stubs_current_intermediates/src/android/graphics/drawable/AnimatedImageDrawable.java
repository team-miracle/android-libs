/*
* Copyright (C) 2018 The Android Open Source Project
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
public class AnimatedImageDrawable
  extends android.graphics.drawable.Drawable
  implements android.graphics.drawable.Animatable2
{
public  AnimatedImageDrawable() { throw new RuntimeException("Stub!"); }
public  void setRepeatCount(int repeatCount) { throw new RuntimeException("Stub!"); }
public  int getRepeatCount() { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  android.graphics.ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
public  boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public final  boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
public  boolean isRunning() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
public  void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback callback) { throw new RuntimeException("Stub!"); }
public  boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback callback) { throw new RuntimeException("Stub!"); }
public  void clearAnimationCallbacks() { throw new RuntimeException("Stub!"); }
public static final int REPEAT_INFINITE = -1;
}
