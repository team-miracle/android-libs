/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.transition;
public class TransitionSet
  extends android.transition.Transition
{
public  TransitionSet() { throw new RuntimeException("Stub!"); }
public  TransitionSet(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet setOrdering(int ordering) { throw new RuntimeException("Stub!"); }
public  int getOrdering() { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  int getTransitionCount() { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getTransitionAt(int index) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet setDuration(long duration) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet setInterpolator(android.animation.TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addTarget(android.view.View target) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addTarget(int targetId) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addTarget(java.lang.String targetName) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addTarget(java.lang.Class targetType) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet addListener(android.transition.Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeTarget(int targetId) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeTarget(android.view.View target) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeTarget(java.lang.Class target) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeTarget(java.lang.String target) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(android.view.View target, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(java.lang.String targetName, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(java.lang.Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeListener(android.transition.Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  void setPathMotion(android.transition.PathMotion pathMotion) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet removeTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  void captureStartValues(android.transition.TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
public  void captureEndValues(android.transition.TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
public  void setPropagation(android.transition.TransitionPropagation propagation) { throw new RuntimeException("Stub!"); }
public  void setEpicenterCallback(android.transition.Transition.EpicenterCallback epicenterCallback) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionSet clone() { throw new RuntimeException("Stub!"); }
public static final int ORDERING_SEQUENTIAL = 1;
public static final int ORDERING_TOGETHER = 0;
}
