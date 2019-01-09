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

package android.widget;
public class Scroller
{
public  Scroller(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  Scroller(android.content.Context context, android.view.animation.Interpolator interpolator) { throw new RuntimeException("Stub!"); }
public  Scroller(android.content.Context context, android.view.animation.Interpolator interpolator, boolean flywheel) { throw new RuntimeException("Stub!"); }
public final  void setFriction(float friction) { throw new RuntimeException("Stub!"); }
public final  boolean isFinished() { throw new RuntimeException("Stub!"); }
public final  void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); }
public final  int getDuration() { throw new RuntimeException("Stub!"); }
public final  int getCurrX() { throw new RuntimeException("Stub!"); }
public final  int getCurrY() { throw new RuntimeException("Stub!"); }
public  float getCurrVelocity() { throw new RuntimeException("Stub!"); }
public final  int getStartX() { throw new RuntimeException("Stub!"); }
public final  int getStartY() { throw new RuntimeException("Stub!"); }
public final  int getFinalX() { throw new RuntimeException("Stub!"); }
public final  int getFinalY() { throw new RuntimeException("Stub!"); }
public  boolean computeScrollOffset() { throw new RuntimeException("Stub!"); }
public  void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); }
public  void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); }
public  void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); }
public  void abortAnimation() { throw new RuntimeException("Stub!"); }
public  void extendDuration(int extend) { throw new RuntimeException("Stub!"); }
public  int timePassed() { throw new RuntimeException("Stub!"); }
public  void setFinalX(int newX) { throw new RuntimeException("Stub!"); }
public  void setFinalY(int newY) { throw new RuntimeException("Stub!"); }
}
