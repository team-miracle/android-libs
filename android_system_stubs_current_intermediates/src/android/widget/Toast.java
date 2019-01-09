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
public class Toast
{
public  Toast(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void setView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  android.view.View getView() { throw new RuntimeException("Stub!"); }
public  void setDuration(int duration) { throw new RuntimeException("Stub!"); }
public  int getDuration() { throw new RuntimeException("Stub!"); }
public  void setMargin(float horizontalMargin, float verticalMargin) { throw new RuntimeException("Stub!"); }
public  float getHorizontalMargin() { throw new RuntimeException("Stub!"); }
public  float getVerticalMargin() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity, int xOffset, int yOffset) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  int getXOffset() { throw new RuntimeException("Stub!"); }
public  int getYOffset() { throw new RuntimeException("Stub!"); }
public static  android.widget.Toast makeText(android.content.Context context, java.lang.CharSequence text, int duration) { throw new RuntimeException("Stub!"); }
public static  android.widget.Toast makeText(android.content.Context context, int resId, int duration) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public  void setText(int resId) { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public static final int LENGTH_LONG = 1;
public static final int LENGTH_SHORT = 0;
}
