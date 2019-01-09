/*
* Copyright 2017 The Android Open Source Project
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
package android.service.autofill;
public final class UserData
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(java.lang.String id, java.lang.String value, java.lang.String categoryId) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.UserData.Builder setFieldClassificationAlgorithm(java.lang.String name, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.UserData.Builder add(java.lang.String value, java.lang.String categoryId) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.UserData build() { throw new RuntimeException("Stub!"); }
}
UserData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFieldClassificationAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.lang.String getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static  int getMaxUserDataSize() { throw new RuntimeException("Stub!"); }
public static  int getMaxFieldClassificationIdsSize() { throw new RuntimeException("Stub!"); }
public static  int getMaxCategoryCount() { throw new RuntimeException("Stub!"); }
public static  int getMinValueLength() { throw new RuntimeException("Stub!"); }
public static  int getMaxValueLength() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.UserData> CREATOR;
static { CREATOR = null; }
}
