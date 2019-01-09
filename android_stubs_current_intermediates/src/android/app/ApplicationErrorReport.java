/*
* Copyright (C) 2008 The Android Open Source Project
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
public class ApplicationErrorReport
  implements android.os.Parcelable
{
public static class CrashInfo
{
public  CrashInfo() { throw new RuntimeException("Stub!"); }
public  CrashInfo(java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public  CrashInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public java.lang.String exceptionClassName;
public java.lang.String exceptionMessage;
public java.lang.String stackTrace;
public java.lang.String throwClassName;
public java.lang.String throwFileName;
public int throwLineNumber;
public java.lang.String throwMethodName;
}
public static class AnrInfo
{
public  AnrInfo() { throw new RuntimeException("Stub!"); }
public  AnrInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public java.lang.String activity;
public java.lang.String cause;
public java.lang.String info;
}
public static class BatteryInfo
{
public  BatteryInfo() { throw new RuntimeException("Stub!"); }
public  BatteryInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public java.lang.String checkinDetails;
public long durationMicros;
public java.lang.String usageDetails;
public int usagePercent;
}
public static class RunningServiceInfo
{
public  RunningServiceInfo() { throw new RuntimeException("Stub!"); }
public  RunningServiceInfo(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public long durationMillis;
public java.lang.String serviceDetails;
}
public  ApplicationErrorReport() { throw new RuntimeException("Stub!"); }
public static  android.content.ComponentName getErrorReportReceiver(android.content.Context context, java.lang.String packageName, int appFlags) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ApplicationErrorReport> CREATOR;
public static final int TYPE_ANR = 2;
public static final int TYPE_BATTERY = 3;
public static final int TYPE_CRASH = 1;
public static final int TYPE_NONE = 0;
public static final int TYPE_RUNNING_SERVICE = 5;
public android.app.ApplicationErrorReport.AnrInfo anrInfo;
public android.app.ApplicationErrorReport.BatteryInfo batteryInfo;
public android.app.ApplicationErrorReport.CrashInfo crashInfo;
public java.lang.String installerPackageName;
public java.lang.String packageName;
public java.lang.String processName;
public android.app.ApplicationErrorReport.RunningServiceInfo runningServiceInfo;
public boolean systemApp;
public long time;
public int type;
static { CREATOR = null; }
}
