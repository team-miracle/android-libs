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
public abstract class Transition
  implements java.lang.Cloneable
{
public static interface TransitionListener
{
public abstract  void onTransitionStart(android.transition.Transition transition);
public abstract  void onTransitionEnd(android.transition.Transition transition);
public abstract  void onTransitionCancel(android.transition.Transition transition);
public abstract  void onTransitionPause(android.transition.Transition transition);
public abstract  void onTransitionResume(android.transition.Transition transition);
}
public abstract static class EpicenterCallback
{
public  EpicenterCallback() { throw new RuntimeException("Stub!"); }
public abstract  android.graphics.Rect onGetEpicenter(android.transition.Transition transition);
}
public  Transition() { throw new RuntimeException("Stub!"); }
public  Transition(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition setDuration(long duration) { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  android.transition.Transition setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
public  long getStartDelay() { throw new RuntimeException("Stub!"); }
public  android.transition.Transition setInterpolator(android.animation.TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
public  android.animation.TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getTransitionProperties() { throw new RuntimeException("Stub!"); }
public  android.animation.Animator createAnimator(android.view.ViewGroup sceneRoot, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public  void setMatchOrder(int... matches) { throw new RuntimeException("Stub!"); }
public abstract  void captureStartValues(android.transition.TransitionValues transitionValues);
public abstract  void captureEndValues(android.transition.TransitionValues transitionValues);
public  android.transition.Transition addTarget(int targetId) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition addTarget(java.lang.String targetName) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition addTarget(java.lang.Class targetType) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition removeTarget(int targetId) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition removeTarget(java.lang.String targetName) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(java.lang.String targetName, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeChildren(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(android.view.View target, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeChildren(android.view.View target, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeTarget(java.lang.Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition excludeChildren(java.lang.Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition addTarget(android.view.View target) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition removeTarget(android.view.View target) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition removeTarget(java.lang.Class target) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Integer> getTargetIds() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.View> getTargets() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getTargetNames() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.Class> getTargetTypes() { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionValues getTransitionValues(android.view.View view, boolean start) { throw new RuntimeException("Stub!"); }
public  boolean isTransitionRequired(android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition addListener(android.transition.Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition removeListener(android.transition.Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
public  void setEpicenterCallback(android.transition.Transition.EpicenterCallback epicenterCallback) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition.EpicenterCallback getEpicenterCallback() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getEpicenter() { throw new RuntimeException("Stub!"); }
public  void setPathMotion(android.transition.PathMotion pathMotion) { throw new RuntimeException("Stub!"); }
public  android.transition.PathMotion getPathMotion() { throw new RuntimeException("Stub!"); }
public  void setPropagation(android.transition.TransitionPropagation transitionPropagation) { throw new RuntimeException("Stub!"); }
public  android.transition.TransitionPropagation getPropagation() { throw new RuntimeException("Stub!"); }
public  boolean canRemoveViews() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  android.transition.Transition clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public static final int MATCH_ID = 3;
public static final int MATCH_INSTANCE = 1;
public static final int MATCH_ITEM_ID = 4;
public static final int MATCH_NAME = 2;
}
