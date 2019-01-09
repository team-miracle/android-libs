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

package android.app;
public class AlarmManager
{
public static interface OnAlarmListener
{
public abstract  void onAlarm();
}
public static final class AlarmClockInfo
  implements android.os.Parcelable
{
public  AlarmClockInfo(long triggerTime, android.app.PendingIntent showIntent) { throw new RuntimeException("Stub!"); }
public  long getTriggerTime() { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getShowIntent() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.AlarmManager.AlarmClockInfo> CREATOR;
static { CREATOR = null; }
}
AlarmManager() { throw new RuntimeException("Stub!"); }
public  void set(int type, long triggerAtMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void set(int type, long triggerAtMillis, java.lang.String tag, android.app.AlarmManager.OnAlarmListener listener, android.os.Handler targetHandler) { throw new RuntimeException("Stub!"); }
public  void setRepeating(int type, long triggerAtMillis, long intervalMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setWindow(int type, long windowStartMillis, long windowLengthMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setWindow(int type, long windowStartMillis, long windowLengthMillis, java.lang.String tag, android.app.AlarmManager.OnAlarmListener listener, android.os.Handler targetHandler) { throw new RuntimeException("Stub!"); }
public  void setExact(int type, long triggerAtMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setExact(int type, long triggerAtMillis, java.lang.String tag, android.app.AlarmManager.OnAlarmListener listener, android.os.Handler targetHandler) { throw new RuntimeException("Stub!"); }
public  void setAlarmClock(android.app.AlarmManager.AlarmClockInfo info, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setInexactRepeating(int type, long triggerAtMillis, long intervalMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setAndAllowWhileIdle(int type, long triggerAtMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void setExactAndAllowWhileIdle(int type, long triggerAtMillis, android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void cancel(android.app.PendingIntent operation) { throw new RuntimeException("Stub!"); }
public  void cancel(android.app.AlarmManager.OnAlarmListener listener) { throw new RuntimeException("Stub!"); }
public  void setTime(long millis) { throw new RuntimeException("Stub!"); }
public  void setTimeZone(java.lang.String timeZone) { throw new RuntimeException("Stub!"); }
public  android.app.AlarmManager.AlarmClockInfo getNextAlarmClock() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
public static final int ELAPSED_REALTIME = 3;
public static final int ELAPSED_REALTIME_WAKEUP = 2;
public static final long INTERVAL_DAY = 86400000L;
public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
public static final long INTERVAL_HALF_DAY = 43200000L;
public static final long INTERVAL_HALF_HOUR = 1800000L;
public static final long INTERVAL_HOUR = 3600000L;
public static final int RTC = 1;
public static final int RTC_WAKEUP = 0;
}
