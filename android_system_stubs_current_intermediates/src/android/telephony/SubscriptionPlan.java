/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.telephony;
public final class SubscriptionPlan
  implements android.os.Parcelable
{
public static class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
public static  android.telephony.SubscriptionPlan.Builder createNonrecurring(java.time.ZonedDateTime start, java.time.ZonedDateTime end) { throw new RuntimeException("Stub!"); }
public static  android.telephony.SubscriptionPlan.Builder createRecurring(java.time.ZonedDateTime start, java.time.Period period) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.telephony.SubscriptionPlan.Builder createRecurringMonthly(java.time.ZonedDateTime start) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.telephony.SubscriptionPlan.Builder createRecurringWeekly(java.time.ZonedDateTime start) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.telephony.SubscriptionPlan.Builder createRecurringDaily(java.time.ZonedDateTime start) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionPlan build() { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionPlan.Builder setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionPlan.Builder setSummary(java.lang.CharSequence summary) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionPlan.Builder setDataLimit(long dataLimitBytes, int dataLimitBehavior) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionPlan.Builder setDataUsage(long dataUsageBytes, long dataUsageTime) { throw new RuntimeException("Stub!"); }
}
SubscriptionPlan() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSummary() { throw new RuntimeException("Stub!"); }
public  long getDataLimitBytes() { throw new RuntimeException("Stub!"); }
public  int getDataLimitBehavior() { throw new RuntimeException("Stub!"); }
public  long getDataUsageBytes() { throw new RuntimeException("Stub!"); }
public  long getDataUsageTime() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<android.util.Range<java.time.ZonedDateTime>> cycleIterator() { throw new RuntimeException("Stub!"); }
public static final long BYTES_UNKNOWN = -1L;
public static final long BYTES_UNLIMITED = 9223372036854775807L;
public static final android.os.Parcelable.Creator<android.telephony.SubscriptionPlan> CREATOR;
public static final int LIMIT_BEHAVIOR_BILLED = 1;
public static final int LIMIT_BEHAVIOR_DISABLED = 0;
public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
public static final long TIME_UNKNOWN = -1L;
static { CREATOR = null; }
}
