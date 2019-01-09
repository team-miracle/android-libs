/*
* Copyright (C) 2016 The Android Open Source Project
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
public abstract class TransitionListenerAdapter
  implements android.transition.Transition.TransitionListener
{
public  TransitionListenerAdapter() { throw new RuntimeException("Stub!"); }
public  void onTransitionStart(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  void onTransitionEnd(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  void onTransitionCancel(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  void onTransitionPause(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  void onTransitionResume(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
}
