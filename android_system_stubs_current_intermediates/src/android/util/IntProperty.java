/*
* Copyright (C) 2011 The Android Open Source Project
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
package android.util;
public abstract class IntProperty<T>
  extends android.util.Property<T, java.lang.Integer>
{
public  IntProperty(java.lang.String name) { super((java.lang.Class)null,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public abstract  void setValue(T object, int value);
public final  void set(T object, java.lang.Integer value) { throw new RuntimeException("Stub!"); }
}
