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
public class AnimatedStateListDrawable
  extends android.graphics.drawable.StateListDrawable
{
public  AnimatedStateListDrawable() { throw new RuntimeException("Stub!"); }
public  boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
public  void addState(int[] stateSet, android.graphics.drawable.Drawable drawable, int id) { throw new RuntimeException("Stub!"); }
public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int fromId, int toId, T transition, boolean reversible) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
public  void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme theme) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
protected  void setConstantState(android.graphics.drawable.DrawableContainer.DrawableContainerState state) { throw new RuntimeException("Stub!"); }
}
