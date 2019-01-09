/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.graphics.drawable;
public interface Animatable2
  extends android.graphics.drawable.Animatable
{
public abstract static class AnimationCallback
{
public  AnimationCallback() { throw new RuntimeException("Stub!"); }
public  void onAnimationStart(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  void onAnimationEnd(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
}
public abstract  void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback callback);
public abstract  boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback callback);
public abstract  void clearAnimationCallbacks();
}
