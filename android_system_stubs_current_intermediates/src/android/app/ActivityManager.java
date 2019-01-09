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
public class ActivityManager
{
public static class TaskDescription
  implements android.os.Parcelable
{
@java.lang.Deprecated()
public  TaskDescription(java.lang.String label, android.graphics.Bitmap icon, int colorPrimary) { throw new RuntimeException("Stub!"); }
public  TaskDescription(java.lang.String label, int iconRes, int colorPrimary) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  TaskDescription(java.lang.String label, android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
public  TaskDescription(java.lang.String label, int iconRes) { throw new RuntimeException("Stub!"); }
public  TaskDescription(java.lang.String label) { throw new RuntimeException("Stub!"); }
public  TaskDescription() { throw new RuntimeException("Stub!"); }
public  TaskDescription(android.app.ActivityManager.TaskDescription td) { throw new RuntimeException("Stub!"); }
public  java.lang.String getLabel() { throw new RuntimeException("Stub!"); }
public  android.graphics.Bitmap getIcon() { throw new RuntimeException("Stub!"); }
public  int getPrimaryColor() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.TaskDescription> CREATOR;
static { CREATOR = null; }
}
public static class RecentTaskInfo
  implements android.os.Parcelable
{
public  RecentTaskInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RecentTaskInfo> CREATOR;
public int affiliatedTaskId;
public android.content.ComponentName baseActivity;
public android.content.Intent baseIntent;
public java.lang.CharSequence description;
public int id;
public int numActivities;
public android.content.ComponentName origActivity;
public int persistentId;
public android.app.ActivityManager.TaskDescription taskDescription;
public android.content.ComponentName topActivity;
static { CREATOR = null; }
}
public static class RunningTaskInfo
  implements android.os.Parcelable
{
public  RunningTaskInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningTaskInfo> CREATOR;
public android.content.ComponentName baseActivity;
public java.lang.CharSequence description;
public int id;
public int numActivities;
public int numRunning;
public android.graphics.Bitmap thumbnail;
public android.content.ComponentName topActivity;
static { CREATOR = null; }
}
public static class RunningServiceInfo
  implements android.os.Parcelable
{
public  RunningServiceInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningServiceInfo> CREATOR;
public static final int FLAG_FOREGROUND = 2;
public static final int FLAG_PERSISTENT_PROCESS = 8;
public static final int FLAG_STARTED = 1;
public static final int FLAG_SYSTEM_PROCESS = 4;
public long activeSince;
public int clientCount;
public int clientLabel;
public java.lang.String clientPackage;
public int crashCount;
public int flags;
public boolean foreground;
public long lastActivityTime;
public int pid;
public java.lang.String process;
public long restarting;
public android.content.ComponentName service;
public boolean started;
public int uid;
static { CREATOR = null; }
}
public static class MemoryInfo
  implements android.os.Parcelable
{
public  MemoryInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.MemoryInfo> CREATOR;
public long availMem;
public boolean lowMemory;
public long threshold;
public long totalMem;
static { CREATOR = null; }
}
public static class ProcessErrorStateInfo
  implements android.os.Parcelable
{
public  ProcessErrorStateInfo() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final int CRASHED = 1;
public static final android.os.Parcelable.Creator<android.app.ActivityManager.ProcessErrorStateInfo> CREATOR;
public static final int NOT_RESPONDING = 2;
public static final int NO_ERROR = 0;
public int condition;
public byte[] crashData = null;
public java.lang.String longMsg;
public int pid;
public java.lang.String processName;
public java.lang.String shortMsg;
public java.lang.String stackTrace;
public java.lang.String tag;
public int uid;
static { CREATOR = null; }
}
public static class RunningAppProcessInfo
  implements android.os.Parcelable
{
public  RunningAppProcessInfo() { throw new RuntimeException("Stub!"); }
public  RunningAppProcessInfo(java.lang.String pProcessName, int pPid, java.lang.String[] pArr) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.ActivityManager.RunningAppProcessInfo> CREATOR;
@Deprecated
public static final int IMPORTANCE_BACKGROUND = 400;
public static final int IMPORTANCE_CACHED = 400;
public static final int IMPORTANCE_CANT_SAVE_STATE = 350;
@java.lang.Deprecated()
public static final int IMPORTANCE_EMPTY = 500;
public static final int IMPORTANCE_FOREGROUND = 100;
public static final int IMPORTANCE_FOREGROUND_SERVICE = 125;
public static final int IMPORTANCE_GONE = 1000;
public static final int IMPORTANCE_PERCEPTIBLE = 230;
public static final int IMPORTANCE_PERCEPTIBLE_PRE_26 = 130;
public static final int IMPORTANCE_SERVICE = 300;
public static final int IMPORTANCE_TOP_SLEEPING = 325;
@java.lang.Deprecated()
public static final int IMPORTANCE_TOP_SLEEPING_PRE_28 = 150;
public static final int IMPORTANCE_VISIBLE = 200;
public static final int REASON_PROVIDER_IN_USE = 1;
public static final int REASON_SERVICE_IN_USE = 2;
public static final int REASON_UNKNOWN = 0;
public int importance;
public int importanceReasonCode;
public android.content.ComponentName importanceReasonComponent;
public int importanceReasonPid;
public int lastTrimLevel;
public int lru;
public int pid;
public java.lang.String[] pkgList = null;
public java.lang.String processName;
public int uid;
static { CREATOR = null; }
}
public static interface OnUidImportanceListener
{
public abstract  void onUidImportance(int uid, int importance);
}
public static class AppTask
{
AppTask() { throw new RuntimeException("Stub!"); }
public  void finishAndRemoveTask() { throw new RuntimeException("Stub!"); }
public  android.app.ActivityManager.RecentTaskInfo getTaskInfo() { throw new RuntimeException("Stub!"); }
public  void moveToFront() { throw new RuntimeException("Stub!"); }
public  void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void setExcludeFromRecents(boolean exclude) { throw new RuntimeException("Stub!"); }
}
ActivityManager() { throw new RuntimeException("Stub!"); }
public  int getMemoryClass() { throw new RuntimeException("Stub!"); }
public  int getLargeMemoryClass() { throw new RuntimeException("Stub!"); }
public  boolean isLowRamDevice() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int maxNum, int flags) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.AppTask> getAppTasks() { throw new RuntimeException("Stub!"); }
public  android.util.Size getAppTaskThumbnailSize() { throw new RuntimeException("Stub!"); }
public  int addAppTask(android.app.Activity activity, android.content.Intent intent, android.app.ActivityManager.TaskDescription description, android.graphics.Bitmap thumbnail) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.app.ActivityManager.RunningTaskInfo> getRunningTasks(int maxNum) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void moveTaskToFront(int taskId, int flags) { throw new RuntimeException("Stub!"); }
public  void moveTaskToFront(int taskId, int flags, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.app.ActivityManager.RunningServiceInfo> getRunningServices(int maxNum) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getRunningServiceControlPanel(android.content.ComponentName service) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  void getMemoryInfo(android.app.ActivityManager.MemoryInfo outInfo) { throw new RuntimeException("Stub!"); }
public  boolean clearApplicationUserData() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> getProcessesInErrorState() { throw new RuntimeException("Stub!"); }
public  boolean isBackgroundRestricted() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() { throw new RuntimeException("Stub!"); }
public  int getPackageImportance(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int getUidImportance(int uid) { throw new RuntimeException("Stub!"); }
public  void addOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener listener, int importanceCutpoint) { throw new RuntimeException("Stub!"); }
public  void removeOnUidImportanceListener(android.app.ActivityManager.OnUidImportanceListener listener) { throw new RuntimeException("Stub!"); }
public static  void getMyMemoryState(android.app.ActivityManager.RunningAppProcessInfo outState) { throw new RuntimeException("Stub!"); }
public  android.os.Debug.MemoryInfo[] getProcessMemoryInfo(int[] pids) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void restartPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void killBackgroundProcesses(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void killUid(int uid, java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  void forceStopPackage(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ConfigurationInfo getDeviceConfigurationInfo() { throw new RuntimeException("Stub!"); }
public  int getLauncherLargeIconDensity() { throw new RuntimeException("Stub!"); }
public  int getLauncherLargeIconSize() { throw new RuntimeException("Stub!"); }
public static  boolean isUserAMonkey() { throw new RuntimeException("Stub!"); }
public static  boolean isRunningInTestHarness() { throw new RuntimeException("Stub!"); }
public static  int getCurrentUser() { throw new RuntimeException("Stub!"); }
public  void dumpPackageState(java.io.FileDescriptor fd, java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void setWatchHeapLimit(long pssSize) { throw new RuntimeException("Stub!"); }
public  void clearWatchHeapLimit() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isInLockTaskMode() { throw new RuntimeException("Stub!"); }
public  int getLockTaskModeState() { throw new RuntimeException("Stub!"); }
public static  void setVrThread(int tid) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_REPORT_HEAP_LIMIT = "android.app.action.REPORT_HEAP_LIMIT";
public static final int LOCK_TASK_MODE_LOCKED = 1;
public static final int LOCK_TASK_MODE_NONE = 0;
public static final int LOCK_TASK_MODE_PINNED = 2;
public static final java.lang.String META_HOME_ALTERNATE = "android.app.home.alternate";
public static final int MOVE_TASK_NO_USER_ACTION = 2;
public static final int MOVE_TASK_WITH_HOME = 1;
public static final int RECENT_IGNORE_UNAVAILABLE = 2;
public static final int RECENT_WITH_EXCLUDED = 1;
}
