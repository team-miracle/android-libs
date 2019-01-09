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
* limitations under the License.
*/
package android.service.notification;
public final class Adjustment
  implements android.os.Parcelable
{
public  Adjustment(java.lang.String pkg, java.lang.String key, android.os.Bundle signals, java.lang.CharSequence explanation, int user) { throw new RuntimeException("Stub!"); }
protected  Adjustment(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getExplanation() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getSignals() { throw new RuntimeException("Stub!"); }
public  int getUser() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.Adjustment> CREATOR;
public static final java.lang.String KEY_PEOPLE = "key_people";
public static final java.lang.String KEY_SNOOZE_CRITERIA = "key_snooze_criteria";
public static final java.lang.String KEY_USER_SENTIMENT = "key_user_sentiment";
static { CREATOR = null; }
}
