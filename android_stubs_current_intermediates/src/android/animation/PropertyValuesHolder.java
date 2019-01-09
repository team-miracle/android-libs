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
public class PropertyValuesHolder
  implements java.lang.Cloneable
{
PropertyValuesHolder() { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofInt(java.lang.String propertyName, int... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofInt(android.util.Property<?, java.lang.Integer> property, int... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofMultiInt(java.lang.String propertyName, int[][] values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofMultiInt(java.lang.String propertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <V> android.animation.PropertyValuesHolder ofMultiInt(java.lang.String propertyName, android.animation.TypeConverter<V, int[]> converter, android.animation.TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.PropertyValuesHolder ofMultiInt(java.lang.String propertyName, android.animation.TypeConverter<T, int[]> converter, android.animation.TypeEvaluator<T> evaluator, android.animation.Keyframe... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofFloat(java.lang.String propertyName, float... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofFloat(android.util.Property<?, java.lang.Float> property, float... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String propertyName, float[][] values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String propertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <V> android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String propertyName, android.animation.TypeConverter<V, float[]> converter, android.animation.TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String propertyName, android.animation.TypeConverter<T, float[]> converter, android.animation.TypeEvaluator<T> evaluator, android.animation.Keyframe... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofObject(java.lang.String propertyName, android.animation.TypeEvaluator evaluator, java.lang.Object... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofObject(java.lang.String propertyName, android.animation.TypeConverter<android.graphics.PointF, ?> converter, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <V> android.animation.PropertyValuesHolder ofObject(android.util.Property property, android.animation.TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <T, V> android.animation.PropertyValuesHolder ofObject(android.util.Property<?, V> property, android.animation.TypeConverter<T, V> converter, android.animation.TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
public static <V> android.animation.PropertyValuesHolder ofObject(android.util.Property<?, V> property, android.animation.TypeConverter<android.graphics.PointF, V> converter, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofKeyframe(java.lang.String propertyName, android.animation.Keyframe... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.PropertyValuesHolder ofKeyframe(android.util.Property property, android.animation.Keyframe... values) { throw new RuntimeException("Stub!"); }
public  void setIntValues(int... values) { throw new RuntimeException("Stub!"); }
public  void setFloatValues(float... values) { throw new RuntimeException("Stub!"); }
public  void setKeyframes(android.animation.Keyframe... values) { throw new RuntimeException("Stub!"); }
public  void setObjectValues(java.lang.Object... values) { throw new RuntimeException("Stub!"); }
public  void setConverter(android.animation.TypeConverter converter) { throw new RuntimeException("Stub!"); }
public  android.animation.PropertyValuesHolder clone() { throw new RuntimeException("Stub!"); }
public  void setEvaluator(android.animation.TypeEvaluator evaluator) { throw new RuntimeException("Stub!"); }
public  void setPropertyName(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public  void setProperty(android.util.Property property) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPropertyName() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
