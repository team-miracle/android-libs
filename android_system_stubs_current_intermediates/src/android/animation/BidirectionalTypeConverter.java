/*
* Copyright (C) 2014 The Android Open Source Project
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
public abstract class BidirectionalTypeConverter<T, V>
  extends android.animation.TypeConverter<T, V>
{
public  BidirectionalTypeConverter(java.lang.Class<T> fromClass, java.lang.Class<V> toClass) { super((java.lang.Class)null,(java.lang.Class)null); throw new RuntimeException("Stub!"); }
public abstract  T convertBack(V value);
public  android.animation.BidirectionalTypeConverter<V, T> invert() { throw new RuntimeException("Stub!"); }
}
