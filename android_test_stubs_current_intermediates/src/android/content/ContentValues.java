/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.content;
public final class ContentValues
  implements android.os.Parcelable
{
public  ContentValues() { throw new RuntimeException("Stub!"); }
public  ContentValues(int size) { throw new RuntimeException("Stub!"); }
public  ContentValues(android.content.ContentValues from) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void putAll(android.content.ContentValues other) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Byte value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Short value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Integer value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Long value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Float value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Double value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Boolean value) { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, byte[] value) { throw new RuntimeException("Stub!"); }
public  void putNull(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  void remove(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void clear() { throw new RuntimeException("Stub!"); }
public  boolean containsKey(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Object get(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.String getAsString(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Long getAsLong(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Integer getAsInteger(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Short getAsShort(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Byte getAsByte(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Double getAsDouble(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Float getAsFloat(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.lang.Boolean getAsBoolean(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  byte[] getAsByteArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> valueSet() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> keySet() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.ContentValues> CREATOR;
public static final java.lang.String TAG = "ContentValues";
static { CREATOR = null; }
}
