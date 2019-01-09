/*
* Copyright (C) 2013 The Android Open Source Project
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
public class RestrictionEntry
  implements android.os.Parcelable
{
public  RestrictionEntry(int type, java.lang.String key) { throw new RuntimeException("Stub!"); }
public  RestrictionEntry(java.lang.String key, java.lang.String selectedString) { throw new RuntimeException("Stub!"); }
public  RestrictionEntry(java.lang.String key, boolean selectedState) { throw new RuntimeException("Stub!"); }
public  RestrictionEntry(java.lang.String key, java.lang.String[] selectedStrings) { throw new RuntimeException("Stub!"); }
public  RestrictionEntry(java.lang.String key, int selectedInt) { throw new RuntimeException("Stub!"); }
public  RestrictionEntry(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static  android.content.RestrictionEntry createBundleEntry(java.lang.String key, android.content.RestrictionEntry[] restrictionEntries) { throw new RuntimeException("Stub!"); }
public static  android.content.RestrictionEntry createBundleArrayEntry(java.lang.String key, android.content.RestrictionEntry[] restrictionEntries) { throw new RuntimeException("Stub!"); }
public  void setType(int type) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSelectedString() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getAllSelectedStrings() { throw new RuntimeException("Stub!"); }
public  boolean getSelectedState() { throw new RuntimeException("Stub!"); }
public  int getIntValue() { throw new RuntimeException("Stub!"); }
public  void setIntValue(int value) { throw new RuntimeException("Stub!"); }
public  void setSelectedString(java.lang.String selectedString) { throw new RuntimeException("Stub!"); }
public  void setSelectedState(boolean state) { throw new RuntimeException("Stub!"); }
public  void setAllSelectedStrings(java.lang.String[] allSelectedStrings) { throw new RuntimeException("Stub!"); }
public  void setChoiceValues(java.lang.String[] choiceValues) { throw new RuntimeException("Stub!"); }
public  void setChoiceValues(android.content.Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); }
public  android.content.RestrictionEntry[] getRestrictions() { throw new RuntimeException("Stub!"); }
public  void setRestrictions(android.content.RestrictionEntry[] restrictions) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getChoiceValues() { throw new RuntimeException("Stub!"); }
public  void setChoiceEntries(java.lang.String[] choiceEntries) { throw new RuntimeException("Stub!"); }
public  void setChoiceEntries(android.content.Context context, int stringArrayResId) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getChoiceEntries() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescription() { throw new RuntimeException("Stub!"); }
public  void setDescription(java.lang.String description) { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTitle() { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.String title) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.RestrictionEntry> CREATOR;
public static final int TYPE_BOOLEAN = 1;
public static final int TYPE_BUNDLE = 7;
public static final int TYPE_BUNDLE_ARRAY = 8;
public static final int TYPE_CHOICE = 2;
public static final int TYPE_INTEGER = 5;
public static final int TYPE_MULTI_SELECT = 4;
public static final int TYPE_NULL = 0;
public static final int TYPE_STRING = 6;
static { CREATOR = null; }
}
