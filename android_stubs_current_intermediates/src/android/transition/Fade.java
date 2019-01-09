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
public class Fade
  extends android.transition.Visibility
{
public  Fade() { throw new RuntimeException("Stub!"); }
public  Fade(int fadingMode) { throw new RuntimeException("Stub!"); }
public  Fade(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void captureStartValues(android.transition.TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onAppear(android.view.ViewGroup sceneRoot, android.view.View view, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onDisappear(android.view.ViewGroup sceneRoot, android.view.View view, android.transition.TransitionValues startValues, android.transition.TransitionValues endValues) { throw new RuntimeException("Stub!"); }
public static final int IN = 1;
public static final int OUT = 2;
}
