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
public abstract class Animator
  implements java.lang.Cloneable
{
public static interface AnimatorListener
{
default public  void onAnimationStart(android.animation.Animator animation, boolean isReverse) { throw new RuntimeException("Stub!"); }
default public  void onAnimationEnd(android.animation.Animator animation, boolean isReverse) { throw new RuntimeException("Stub!"); }
public abstract  void onAnimationStart(android.animation.Animator animation);
public abstract  void onAnimationEnd(android.animation.Animator animation);
public abstract  void onAnimationCancel(android.animation.Animator animation);
public abstract  void onAnimationRepeat(android.animation.Animator animation);
}
public static interface AnimatorPauseListener
{
public abstract  void onAnimationPause(android.animation.Animator animation);
public abstract  void onAnimationResume(android.animation.Animator animation);
}
public  Animator() { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void end() { throw new RuntimeException("Stub!"); }
public  void pause() { throw new RuntimeException("Stub!"); }
public  void resume() { throw new RuntimeException("Stub!"); }
public  boolean isPaused() { throw new RuntimeException("Stub!"); }
public abstract  long getStartDelay();
public abstract  void setStartDelay(long startDelay);
public abstract  android.animation.Animator setDuration(long duration);
public abstract  long getDuration();
public  long getTotalDuration() { throw new RuntimeException("Stub!"); }
public abstract  void setInterpolator(android.animation.TimeInterpolator value);
public  android.animation.TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public abstract  boolean isRunning();
public  boolean isStarted() { throw new RuntimeException("Stub!"); }
public  void addListener(android.animation.Animator.AnimatorListener listener) { throw new RuntimeException("Stub!"); }
public  void removeListener(android.animation.Animator.AnimatorListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<android.animation.Animator.AnimatorListener> getListeners() { throw new RuntimeException("Stub!"); }
public  void addPauseListener(android.animation.Animator.AnimatorPauseListener listener) { throw new RuntimeException("Stub!"); }
public  void removePauseListener(android.animation.Animator.AnimatorPauseListener listener) { throw new RuntimeException("Stub!"); }
public  void removeAllListeners() { throw new RuntimeException("Stub!"); }
public  android.animation.Animator clone() { throw new RuntimeException("Stub!"); }
public  void setupStartValues() { throw new RuntimeException("Stub!"); }
public  void setupEndValues() { throw new RuntimeException("Stub!"); }
public  void setTarget(java.lang.Object target) { throw new RuntimeException("Stub!"); }
public static final long DURATION_INFINITE = -1L;
}
