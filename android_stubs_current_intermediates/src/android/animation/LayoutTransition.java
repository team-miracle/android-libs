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
public class LayoutTransition
{
public static interface TransitionListener
{
public abstract  void startTransition(android.animation.LayoutTransition transition, android.view.ViewGroup container, android.view.View view, int transitionType);
public abstract  void endTransition(android.animation.LayoutTransition transition, android.view.ViewGroup container, android.view.View view, int transitionType);
}
public  LayoutTransition() { throw new RuntimeException("Stub!"); }
public  void setDuration(long duration) { throw new RuntimeException("Stub!"); }
public  void enableTransitionType(int transitionType) { throw new RuntimeException("Stub!"); }
public  void disableTransitionType(int transitionType) { throw new RuntimeException("Stub!"); }
public  boolean isTransitionTypeEnabled(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setStartDelay(int transitionType, long delay) { throw new RuntimeException("Stub!"); }
public  long getStartDelay(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setDuration(int transitionType, long duration) { throw new RuntimeException("Stub!"); }
public  long getDuration(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setStagger(int transitionType, long duration) { throw new RuntimeException("Stub!"); }
public  long getStagger(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(int transitionType, android.animation.TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.animation.TimeInterpolator getInterpolator(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setAnimator(int transitionType, android.animation.Animator animator) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator getAnimator(int transitionType) { throw new RuntimeException("Stub!"); }
public  void setAnimateParentHierarchy(boolean animateParentHierarchy) { throw new RuntimeException("Stub!"); }
public  boolean isChangingLayout() { throw new RuntimeException("Stub!"); }
public  boolean isRunning() { throw new RuntimeException("Stub!"); }
public  void addChild(android.view.ViewGroup parent, android.view.View child) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void showChild(android.view.ViewGroup parent, android.view.View child) { throw new RuntimeException("Stub!"); }
public  void showChild(android.view.ViewGroup parent, android.view.View child, int oldVisibility) { throw new RuntimeException("Stub!"); }
public  void removeChild(android.view.ViewGroup parent, android.view.View child) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void hideChild(android.view.ViewGroup parent, android.view.View child) { throw new RuntimeException("Stub!"); }
public  void hideChild(android.view.ViewGroup parent, android.view.View child, int newVisibility) { throw new RuntimeException("Stub!"); }
public  void addTransitionListener(android.animation.LayoutTransition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  void removeTransitionListener(android.animation.LayoutTransition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.animation.LayoutTransition.TransitionListener> getTransitionListeners() { throw new RuntimeException("Stub!"); }
public static final int APPEARING = 2;
public static final int CHANGE_APPEARING = 0;
public static final int CHANGE_DISAPPEARING = 1;
public static final int CHANGING = 4;
public static final int DISAPPEARING = 3;
}
