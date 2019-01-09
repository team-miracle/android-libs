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
* limitations under the License
*/

package android.preference;
public interface PreferenceDataStore
{
default public  void putString(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
default public  void putStringSet(java.lang.String key, java.util.Set<java.lang.String> values) { throw new RuntimeException("Stub!"); }
default public  void putInt(java.lang.String key, int value) { throw new RuntimeException("Stub!"); }
default public  void putLong(java.lang.String key, long value) { throw new RuntimeException("Stub!"); }
default public  void putFloat(java.lang.String key, float value) { throw new RuntimeException("Stub!"); }
default public  void putBoolean(java.lang.String key, boolean value) { throw new RuntimeException("Stub!"); }
default public  java.lang.String getString(java.lang.String key, java.lang.String defValue) { throw new RuntimeException("Stub!"); }
default public  java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defValues) { throw new RuntimeException("Stub!"); }
default public  int getInt(java.lang.String key, int defValue) { throw new RuntimeException("Stub!"); }
default public  long getLong(java.lang.String key, long defValue) { throw new RuntimeException("Stub!"); }
default public  float getFloat(java.lang.String key, float defValue) { throw new RuntimeException("Stub!"); }
default public  boolean getBoolean(java.lang.String key, boolean defValue) { throw new RuntimeException("Stub!"); }
}
