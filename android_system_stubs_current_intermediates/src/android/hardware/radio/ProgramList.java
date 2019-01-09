/**
* Copyright (C) 2018 The Android Open Source Project
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

package android.hardware.radio;
public final class ProgramList
  implements java.lang.AutoCloseable
{
public abstract static class ListCallback
{
public  ListCallback() { throw new RuntimeException("Stub!"); }
public  void onItemChanged(android.hardware.radio.ProgramSelector.Identifier id) { throw new RuntimeException("Stub!"); }
public  void onItemRemoved(android.hardware.radio.ProgramSelector.Identifier id) { throw new RuntimeException("Stub!"); }
}
public static interface OnCompleteListener
{
public abstract  void onComplete();
}
public static final class Filter
  implements android.os.Parcelable
{
public  Filter(java.util.Set<java.lang.Integer> identifierTypes, java.util.Set<android.hardware.radio.ProgramSelector.Identifier> identifiers, boolean includeCategories, boolean excludeModifications) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Integer> getIdentifierTypes() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.hardware.radio.ProgramSelector.Identifier> getIdentifiers() { throw new RuntimeException("Stub!"); }
public  boolean areCategoriesIncluded() { throw new RuntimeException("Stub!"); }
public  boolean areModificationsExcluded() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.ProgramList.Filter> CREATOR;
static { CREATOR = null; }
}
ProgramList() { throw new RuntimeException("Stub!"); }
public  void registerListCallback(java.util.concurrent.Executor executor, android.hardware.radio.ProgramList.ListCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerListCallback(android.hardware.radio.ProgramList.ListCallback callback) { throw new RuntimeException("Stub!"); }
public  void unregisterListCallback(android.hardware.radio.ProgramList.ListCallback callback) { throw new RuntimeException("Stub!"); }
public  void addOnCompleteListener(java.util.concurrent.Executor executor, android.hardware.radio.ProgramList.OnCompleteListener listener) { throw new RuntimeException("Stub!"); }
public  void addOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnCompleteListener(android.hardware.radio.ProgramList.OnCompleteListener listener) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.radio.RadioManager.ProgramInfo> toList() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.ProgramInfo get(android.hardware.radio.ProgramSelector.Identifier id) { throw new RuntimeException("Stub!"); }
}
