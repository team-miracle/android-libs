/*
* Copyright (C) 2008 The Android Open Source Project
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
public class TransitionDrawable
  extends android.graphics.drawable.LayerDrawable
  implements android.graphics.drawable.Drawable.Callback
{
public  TransitionDrawable(android.graphics.drawable.Drawable[] layers) { super((android.graphics.drawable.Drawable[])null); throw new RuntimeException("Stub!"); }
public  void startTransition(int durationMillis) { throw new RuntimeException("Stub!"); }
public  void resetTransition() { throw new RuntimeException("Stub!"); }
public  void reverseTransition(int duration) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setCrossFadeEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isCrossFadeEnabled() { throw new RuntimeException("Stub!"); }
}
