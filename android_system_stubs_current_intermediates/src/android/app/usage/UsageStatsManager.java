/**
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy
* of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/

package android.app.usage;
public final class UsageStatsManager
{
UsageStatsManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.usage.UsageStats> queryUsageStats(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.usage.ConfigurationStats> queryConfigurations(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.usage.EventStats> queryEventStats(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  android.app.usage.UsageEvents queryEvents(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  android.app.usage.UsageEvents queryEventsForSelf(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, android.app.usage.UsageStats> queryAndAggregateUsageStats(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  boolean isAppInactive(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  int getAppStandbyBucket() { throw new RuntimeException("Stub!"); }
public  int getAppStandbyBucket(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public  void setAppStandbyBucket(java.lang.String packageName, int bucket) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Integer> getAppStandbyBuckets() { throw new RuntimeException("Stub!"); }
public  void setAppStandbyBuckets(java.util.Map<java.lang.String, java.lang.Integer> appBuckets) { throw new RuntimeException("Stub!"); }
public  void registerAppUsageObserver(int observerId, java.lang.String[] packages, long timeLimit, java.util.concurrent.TimeUnit timeUnit, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void unregisterAppUsageObserver(int observerId) { throw new RuntimeException("Stub!"); }
public  void whitelistAppTemporarily(java.lang.String packageName, long duration, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_OBSERVER_ID = "android.app.usage.extra.OBSERVER_ID";
public static final java.lang.String EXTRA_TIME_LIMIT = "android.app.usage.extra.TIME_LIMIT";
public static final java.lang.String EXTRA_TIME_USED = "android.app.usage.extra.TIME_USED";
public static final int INTERVAL_BEST = 4;
public static final int INTERVAL_DAILY = 0;
public static final int INTERVAL_MONTHLY = 2;
public static final int INTERVAL_WEEKLY = 1;
public static final int INTERVAL_YEARLY = 3;
public static final int STANDBY_BUCKET_ACTIVE = 10;
public static final int STANDBY_BUCKET_EXEMPTED = 5;
public static final int STANDBY_BUCKET_FREQUENT = 30;
public static final int STANDBY_BUCKET_NEVER = 50;
public static final int STANDBY_BUCKET_RARE = 40;
public static final int STANDBY_BUCKET_WORKING_SET = 20;
}
