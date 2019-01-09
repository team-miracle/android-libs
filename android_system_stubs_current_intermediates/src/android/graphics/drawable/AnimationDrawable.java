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
public class AnimationDrawable
  extends android.graphics.drawable.DrawableContainer
  implements java.lang.Runnable, android.graphics.drawable.Animatable
{
public  AnimationDrawable() { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
public  boolean isRunning() { throw new RuntimeException("Stub!"); }
public  void run() { throw new RuntimeException("Stub!"); }
public  void unscheduleSelf(java.lang.Runnable what) { throw new RuntimeException("Stub!"); }
public  int getNumberOfFrames() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getFrame(int index) { throw new RuntimeException("Stub!"); }
public  int getDuration(int i) { throw new RuntimeException("Stub!"); }
public  boolean isOneShot() { throw new RuntimeException("Stub!"); }
public  void setOneShot(boolean oneShot) { throw new RuntimeException("Stub!"); }
public  void addFrame(android.graphics.drawable.Drawable frame, int duration) { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
protected  void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
}
