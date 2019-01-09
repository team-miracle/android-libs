/*
* Copyright (C) 2017 The Android Open Source Project
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
public final class Magnifier
{
public static interface Callback
{
public abstract  void onOperationComplete();
}
public  Magnifier(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void show(float xPosInView, float yPosInView) { throw new RuntimeException("Stub!"); }
public  void dismiss() { throw new RuntimeException("Stub!"); }
public  void update() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  float getZoom() { throw new RuntimeException("Stub!"); }
public  void setOnOperationCompleteCallback(android.widget.Magnifier.Callback callback) { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getContent() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getWindowPositionOnScreen() { throw new RuntimeException("Stub!"); }
public static  android.graphics.PointF getMagnifierDefaultSize() { throw new RuntimeException("Stub!"); }
}
