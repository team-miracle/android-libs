/*
* Copyright (C) 2014 The Android Open Source Project
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
* limitations under the License
*/

package android.app.job;
public class JobInfo
  implements android.os.Parcelable
{
public static final class TriggerContentUri
  implements android.os.Parcelable
{
public  TriggerContentUri(android.net.Uri uri, int flags) { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.job.JobInfo.TriggerContentUri> CREATOR;
public static final int FLAG_NOTIFY_FOR_DESCENDANTS = 1;
static { CREATOR = null; }
}
public static final class Builder
{
public  Builder(int jobId, android.content.ComponentName jobService) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setExtras(android.os.PersistableBundle extras) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setTransientExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setClipData(android.content.ClipData clip, int grantFlags) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiredNetworkType(int networkType) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiredNetwork(android.net.NetworkRequest networkRequest) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setEstimatedNetworkBytes(long downloadBytes, long uploadBytes) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiresCharging(boolean requiresCharging) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiresBatteryNotLow(boolean batteryNotLow) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiresDeviceIdle(boolean requiresDeviceIdle) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setRequiresStorageNotLow(boolean storageNotLow) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder addTriggerContentUri(android.app.job.JobInfo.TriggerContentUri uri) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setTriggerContentUpdateDelay(long durationMs) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setTriggerContentMaxDelay(long durationMs) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setPeriodic(long intervalMillis) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setPeriodic(long intervalMillis, long flexMillis) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setMinimumLatency(long minLatencyMillis) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setOverrideDeadline(long maxExecutionDelayMillis) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setBackoffCriteria(long initialBackoffMillis, int backoffPolicy) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setImportantWhileForeground(boolean importantWhileForeground) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setPrefetch(boolean prefetch) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.Builder setPersisted(boolean isPersisted) { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo build() { throw new RuntimeException("Stub!"); }
}
JobInfo() { throw new RuntimeException("Stub!"); }
public static final  long getMinPeriodMillis() { throw new RuntimeException("Stub!"); }
public static final  long getMinFlexMillis() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getExtras() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getTransientExtras() { throw new RuntimeException("Stub!"); }
public  android.content.ClipData getClipData() { throw new RuntimeException("Stub!"); }
public  int getClipGrantFlags() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getService() { throw new RuntimeException("Stub!"); }
public  boolean isRequireCharging() { throw new RuntimeException("Stub!"); }
public  boolean isRequireBatteryNotLow() { throw new RuntimeException("Stub!"); }
public  boolean isRequireDeviceIdle() { throw new RuntimeException("Stub!"); }
public  boolean isRequireStorageNotLow() { throw new RuntimeException("Stub!"); }
public  android.app.job.JobInfo.TriggerContentUri[] getTriggerContentUris() { throw new RuntimeException("Stub!"); }
public  long getTriggerContentUpdateDelay() { throw new RuntimeException("Stub!"); }
public  long getTriggerContentMaxDelay() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getNetworkType() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkRequest getRequiredNetwork() { throw new RuntimeException("Stub!"); }
public  long getEstimatedNetworkDownloadBytes() { throw new RuntimeException("Stub!"); }
public  long getEstimatedNetworkUploadBytes() { throw new RuntimeException("Stub!"); }
public  long getMinLatencyMillis() { throw new RuntimeException("Stub!"); }
public  long getMaxExecutionDelayMillis() { throw new RuntimeException("Stub!"); }
public  boolean isPeriodic() { throw new RuntimeException("Stub!"); }
public  boolean isPersisted() { throw new RuntimeException("Stub!"); }
public  long getIntervalMillis() { throw new RuntimeException("Stub!"); }
public  long getFlexMillis() { throw new RuntimeException("Stub!"); }
public  long getInitialBackoffMillis() { throw new RuntimeException("Stub!"); }
public  int getBackoffPolicy() { throw new RuntimeException("Stub!"); }
public  boolean isImportantWhileForeground() { throw new RuntimeException("Stub!"); }
public  boolean isPrefetch() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int BACKOFF_POLICY_EXPONENTIAL = 1;
public static final int BACKOFF_POLICY_LINEAR = 0;
public static final android.os.Parcelable.Creator<android.app.job.JobInfo> CREATOR;
public static final long DEFAULT_INITIAL_BACKOFF_MILLIS = 30000L;
public static final long MAX_BACKOFF_DELAY_MILLIS = 18000000L;
public static final int NETWORK_BYTES_UNKNOWN = -1;
public static final int NETWORK_TYPE_ANY = 1;
public static final int NETWORK_TYPE_CELLULAR = 4;
@java.lang.Deprecated()
public static final int NETWORK_TYPE_METERED = 4;
public static final int NETWORK_TYPE_NONE = 0;
public static final int NETWORK_TYPE_NOT_ROAMING = 3;
public static final int NETWORK_TYPE_UNMETERED = 2;
static { CREATOR = null; }
}
