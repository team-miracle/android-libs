/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.app.admin;
public final class SystemUpdatePolicy
  implements android.os.Parcelable
{
public static final class ValidationFailedException
  extends java.lang.IllegalArgumentException
  implements android.os.Parcelable
{
ValidationFailedException() { throw new RuntimeException("Stub!"); }
public  int getErrorCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdatePolicy.ValidationFailedException> CREATOR;
public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = 6;
public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = 5;
public static final int ERROR_DUPLICATE_OR_OVERLAP = 2;
public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = 4;
public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = 3;
public static final int ERROR_UNKNOWN = 1;
static { CREATOR = null; }
}
SystemUpdatePolicy() { throw new RuntimeException("Stub!"); }
public static  android.app.admin.SystemUpdatePolicy createAutomaticInstallPolicy() { throw new RuntimeException("Stub!"); }
public static  android.app.admin.SystemUpdatePolicy createWindowedInstallPolicy(int startTime, int endTime) { throw new RuntimeException("Stub!"); }
public static  android.app.admin.SystemUpdatePolicy createPostponeInstallPolicy() { throw new RuntimeException("Stub!"); }
public  int getPolicyType() { throw new RuntimeException("Stub!"); }
public  int getInstallWindowStart() { throw new RuntimeException("Stub!"); }
public  int getInstallWindowEnd() { throw new RuntimeException("Stub!"); }
public  android.app.admin.SystemUpdatePolicy setFreezePeriods(java.util.List<android.app.admin.FreezePeriod> freezePeriods) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.admin.FreezePeriod> getFreezePeriods() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdatePolicy> CREATOR;
public static final int TYPE_INSTALL_AUTOMATIC = 1;
public static final int TYPE_INSTALL_WINDOWED = 2;
public static final int TYPE_POSTPONE = 3;
static { CREATOR = null; }
}
