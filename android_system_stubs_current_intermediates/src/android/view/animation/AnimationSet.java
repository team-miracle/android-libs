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

package android.view.animation;
public class AnimationSet
  extends android.view.animation.Animation
{
public  AnimationSet(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  AnimationSet(boolean shareInterpolator) { throw new RuntimeException("Stub!"); }
protected  android.view.animation.AnimationSet clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public  void setFillAfter(boolean fillAfter) { throw new RuntimeException("Stub!"); }
public  void setFillBefore(boolean fillBefore) { throw new RuntimeException("Stub!"); }
public  void setRepeatMode(int repeatMode) { throw new RuntimeException("Stub!"); }
public  void setStartOffset(long startOffset) { throw new RuntimeException("Stub!"); }
public  void setDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
public  void addAnimation(android.view.animation.Animation a) { throw new RuntimeException("Stub!"); }
public  void setStartTime(long startTimeMillis) { throw new RuntimeException("Stub!"); }
public  long getStartTime() { throw new RuntimeException("Stub!"); }
public  void restrictDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  long computeDurationHint() { throw new RuntimeException("Stub!"); }
public  boolean getTransformation(long currentTime, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
public  void scaleCurrentDuration(float scale) { throw new RuntimeException("Stub!"); }
public  void initialize(int width, int height, int parentWidth, int parentHeight) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.animation.Animation> getAnimations() { throw new RuntimeException("Stub!"); }
public  boolean willChangeTransformationMatrix() { throw new RuntimeException("Stub!"); }
public  boolean willChangeBounds() { throw new RuntimeException("Stub!"); }
}
