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

package android.widget;
@android.widget.RemoteViews.RemoteView()
public class Chronometer
  extends android.widget.TextView
{
public static interface OnChronometerTickListener
{
public abstract  void onChronometerTick(android.widget.Chronometer chronometer);
}
public  Chronometer(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Chronometer(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Chronometer(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Chronometer(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setCountDown(boolean countDown) { throw new RuntimeException("Stub!"); }
public  boolean isCountDown() { throw new RuntimeException("Stub!"); }
public  boolean isTheFinalCountDown() { throw new RuntimeException("Stub!"); }
public  void setBase(long base) { throw new RuntimeException("Stub!"); }
public  long getBase() { throw new RuntimeException("Stub!"); }
public  void setFormat(java.lang.String format) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFormat() { throw new RuntimeException("Stub!"); }
public  void setOnChronometerTickListener(android.widget.Chronometer.OnChronometerTickListener listener) { throw new RuntimeException("Stub!"); }
public  android.widget.Chronometer.OnChronometerTickListener getOnChronometerTickListener() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void stop() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
protected  void onVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
}
