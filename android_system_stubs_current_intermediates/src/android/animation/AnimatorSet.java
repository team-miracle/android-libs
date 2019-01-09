/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.animation;
public final class AnimatorSet
  extends android.animation.Animator
{
public class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet.Builder with(android.animation.Animator anim) { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet.Builder before(android.animation.Animator anim) { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet.Builder after(android.animation.Animator anim) { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet.Builder after(long delay) { throw new RuntimeException("Stub!"); }
}
public  AnimatorSet() { throw new RuntimeException("Stub!"); }
public  void playTogether(android.animation.Animator... items) { throw new RuntimeException("Stub!"); }
public  void playTogether(java.util.Collection<android.animation.Animator> items) { throw new RuntimeException("Stub!"); }
public  void playSequentially(android.animation.Animator... items) { throw new RuntimeException("Stub!"); }
public  void playSequentially(java.util.List<android.animation.Animator> items) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.animation.Animator> getChildAnimations() { throw new RuntimeException("Stub!"); }
public  void setTarget(java.lang.Object target) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.animation.TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.animation.TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet.Builder play(android.animation.Animator anim) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void end() { throw new RuntimeException("Stub!"); }
public  boolean isRunning() { throw new RuntimeException("Stub!"); }
public  boolean isStarted() { throw new RuntimeException("Stub!"); }
public  long getStartDelay() { throw new RuntimeException("Stub!"); }
public  void setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet setDuration(long duration) { throw new RuntimeException("Stub!"); }
public  void setupStartValues() { throw new RuntimeException("Stub!"); }
public  void setupEndValues() { throw new RuntimeException("Stub!"); }
public  void pause() { throw new RuntimeException("Stub!"); }
public  void resume() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  void start() { throw new RuntimeException("Stub!"); }
public  void setCurrentPlayTime(long playTime) { throw new RuntimeException("Stub!"); }
public  long getCurrentPlayTime() { throw new RuntimeException("Stub!"); }
public  android.animation.AnimatorSet clone() { throw new RuntimeException("Stub!"); }
public  void reverse() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  long getTotalDuration() { throw new RuntimeException("Stub!"); }
}
