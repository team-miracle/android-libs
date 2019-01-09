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
public final class ObjectAnimator
  extends android.animation.ValueAnimator
{
public  ObjectAnimator() { throw new RuntimeException("Stub!"); }
public  void setPropertyName(java.lang.String propertyName) { throw new RuntimeException("Stub!"); }
public  void setProperty(android.util.Property property) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPropertyName() { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofInt(java.lang.Object target, java.lang.String propertyName, int... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofInt(java.lang.Object target, java.lang.String xPropertyName, java.lang.String yPropertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.ObjectAnimator ofInt(T target, android.util.Property<T, java.lang.Integer> property, int... values) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.ObjectAnimator ofInt(T target, android.util.Property<T, java.lang.Integer> xProperty, android.util.Property<T, java.lang.Integer> yProperty, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofMultiInt(java.lang.Object target, java.lang.String propertyName, int[][] values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofMultiInt(java.lang.Object target, java.lang.String propertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <T> android.animation.ObjectAnimator ofMultiInt(java.lang.Object target, java.lang.String propertyName, android.animation.TypeConverter<T, int[]> converter, android.animation.TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofArgb(java.lang.Object target, java.lang.String propertyName, int... values) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.ObjectAnimator ofArgb(T target, android.util.Property<T, java.lang.Integer> property, int... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofFloat(java.lang.Object target, java.lang.String propertyName, float... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofFloat(java.lang.Object target, java.lang.String xPropertyName, java.lang.String yPropertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.ObjectAnimator ofFloat(T target, android.util.Property<T, java.lang.Float> property, float... values) { throw new RuntimeException("Stub!"); }
public static <T> android.animation.ObjectAnimator ofFloat(T target, android.util.Property<T, java.lang.Float> xProperty, android.util.Property<T, java.lang.Float> yProperty, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofMultiFloat(java.lang.Object target, java.lang.String propertyName, float[][] values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofMultiFloat(java.lang.Object target, java.lang.String propertyName, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <T> android.animation.ObjectAnimator ofMultiFloat(java.lang.Object target, java.lang.String propertyName, android.animation.TypeConverter<T, float[]> converter, android.animation.TypeEvaluator<T> evaluator, T... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofObject(java.lang.Object target, java.lang.String propertyName, android.animation.TypeEvaluator evaluator, java.lang.Object... values) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofObject(java.lang.Object target, java.lang.String propertyName, android.animation.TypeConverter<android.graphics.PointF, ?> converter, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <T, V> android.animation.ObjectAnimator ofObject(T target, android.util.Property<T, V> property, android.animation.TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static <T, V, P> android.animation.ObjectAnimator ofObject(T target, android.util.Property<T, P> property, android.animation.TypeConverter<V, P> converter, android.animation.TypeEvaluator<V> evaluator, V... values) { throw new RuntimeException("Stub!"); }
public static <T, V> android.animation.ObjectAnimator ofObject(T target, android.util.Property<T, V> property, android.animation.TypeConverter<android.graphics.PointF, V> converter, android.graphics.Path path) { throw new RuntimeException("Stub!"); }
public static  android.animation.ObjectAnimator ofPropertyValuesHolder(java.lang.Object target, android.animation.PropertyValuesHolder... values) { throw new RuntimeException("Stub!"); }
public  void setIntValues(int... values) { throw new RuntimeException("Stub!"); }
public  void setFloatValues(float... values) { throw new RuntimeException("Stub!"); }
public  void setObjectValues(java.lang.Object... values) { throw new RuntimeException("Stub!"); }
public  void setAutoCancel(boolean cancel) { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  android.animation.ObjectAnimator setDuration(long duration) { throw new RuntimeException("Stub!"); }
public  java.lang.Object getTarget() { throw new RuntimeException("Stub!"); }
public  void setTarget(java.lang.Object target) { throw new RuntimeException("Stub!"); }
public  void setupStartValues() { throw new RuntimeException("Stub!"); }
public  void setupEndValues() { throw new RuntimeException("Stub!"); }
public  android.animation.ObjectAnimator clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
