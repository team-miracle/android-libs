/**
* Copyright (c) 2014, The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.service.notification;
public final class Condition
  implements android.os.Parcelable
{
public  Condition(android.net.Uri id, java.lang.String summary, int state) { throw new RuntimeException("Stub!"); }
public  Condition(android.net.Uri id, java.lang.String summary, java.lang.String line1, java.lang.String line2, int icon, int state, int flags) { throw new RuntimeException("Stub!"); }
public  Condition(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String stateToString(int state) { throw new RuntimeException("Stub!"); }
public static  java.lang.String relevanceToString(int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  android.service.notification.Condition copy() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri.Builder newId(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static  boolean isValidId(android.net.Uri id, java.lang.String pkg) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.Condition> CREATOR;
public static final int FLAG_RELEVANT_ALWAYS = 2;
public static final int FLAG_RELEVANT_NOW = 1;
public static final java.lang.String SCHEME = "condition";
public static final int STATE_ERROR = 3;
public static final int STATE_FALSE = 0;
public static final int STATE_TRUE = 1;
public static final int STATE_UNKNOWN = 2;
public final int flags;
public final int icon;
public final android.net.Uri id;
public final java.lang.String line1;
public final java.lang.String line2;
public final int state;
public final java.lang.String summary;
static { CREATOR = null; }
}
