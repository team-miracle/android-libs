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

package android.view.animation;
public class LayoutAnimationController
{
public static class AnimationParameters
{
public  AnimationParameters() { throw new RuntimeException("Stub!"); }
public int count;
public int index;
}
public  LayoutAnimationController(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  LayoutAnimationController(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
public  LayoutAnimationController(android.view.animation.Animation animation, float delay) { throw new RuntimeException("Stub!"); }
public  int getOrder() { throw new RuntimeException("Stub!"); }
public  void setOrder(int order) { throw new RuntimeException("Stub!"); }
public  void setAnimation(android.content.Context context, int resourceID) { throw new RuntimeException("Stub!"); }
public  void setAnimation(android.view.animation.Animation animation) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Animation getAnimation() { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.content.Context context, int resourceID) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.view.animation.Interpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  float getDelay() { throw new RuntimeException("Stub!"); }
public  void setDelay(float delay) { throw new RuntimeException("Stub!"); }
public  boolean willOverlap() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public final  android.view.animation.Animation getAnimationForView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  boolean isDone() { throw new RuntimeException("Stub!"); }
protected  long getDelayForView(android.view.View view) { throw new RuntimeException("Stub!"); }
protected  int getTransformedIndex(android.view.animation.LayoutAnimationController.AnimationParameters params) { throw new RuntimeException("Stub!"); }
public static final int ORDER_NORMAL = 0;
public static final int ORDER_RANDOM = 2;
public static final int ORDER_REVERSE = 1;
protected android.view.animation.Animation mAnimation;
protected android.view.animation.Interpolator mInterpolator;
protected java.util.Random mRandomizer;
}
