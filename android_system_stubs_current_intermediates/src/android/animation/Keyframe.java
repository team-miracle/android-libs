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
public abstract class Keyframe
  implements java.lang.Cloneable
{
public  Keyframe() { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofInt(float fraction, int value) { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofInt(float fraction) { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofFloat(float fraction, float value) { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofFloat(float fraction) { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofObject(float fraction, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public static  android.animation.Keyframe ofObject(float fraction) { throw new RuntimeException("Stub!"); }
public  boolean hasValue() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object getValue();
public abstract  void setValue(java.lang.Object value);
public  float getFraction() { throw new RuntimeException("Stub!"); }
public  void setFraction(float fraction) { throw new RuntimeException("Stub!"); }
public  android.animation.TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.animation.TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
public  java.lang.Class getType() { throw new RuntimeException("Stub!"); }
public abstract  android.animation.Keyframe clone();
}
