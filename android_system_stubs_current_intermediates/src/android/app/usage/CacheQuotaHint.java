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

package android.app.usage;
public final class CacheQuotaHint
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  Builder(android.app.usage.CacheQuotaHint hint) { throw new RuntimeException("Stub!"); }
public  android.app.usage.CacheQuotaHint.Builder setVolumeUuid(java.lang.String uuid) { throw new RuntimeException("Stub!"); }
public  android.app.usage.CacheQuotaHint.Builder setUid(int uid) { throw new RuntimeException("Stub!"); }
public  android.app.usage.CacheQuotaHint.Builder setUsageStats(android.app.usage.UsageStats stats) { throw new RuntimeException("Stub!"); }
public  android.app.usage.CacheQuotaHint.Builder setQuota(long quota) { throw new RuntimeException("Stub!"); }
public  android.app.usage.CacheQuotaHint build() { throw new RuntimeException("Stub!"); }
}
public  CacheQuotaHint(android.app.usage.CacheQuotaHint.Builder builder) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVolumeUuid() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  long getQuota() { throw new RuntimeException("Stub!"); }
public  android.app.usage.UsageStats getUsageStats() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.usage.CacheQuotaHint> CREATOR;
public static final long QUOTA_NOT_SET = -1L;
static { CREATOR = null; }
}
