/*
* Copyright 2017 The Android Open Source Project
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
public final class StatsManager
{
public static class StatsUnavailableException
  extends android.util.AndroidException
{
public  StatsUnavailableException(java.lang.String reason) { throw new RuntimeException("Stub!"); }
public  StatsUnavailableException(java.lang.String reason, java.lang.Throwable e) { throw new RuntimeException("Stub!"); }
}
StatsManager() { throw new RuntimeException("Stub!"); }
public  void addConfig(long configKey, byte[] config) throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean addConfiguration(long configKey, byte[] config) { throw new RuntimeException("Stub!"); }
public  void removeConfig(long configKey) throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean removeConfiguration(long configKey) { throw new RuntimeException("Stub!"); }
public  void setBroadcastSubscriber(android.app.PendingIntent pendingIntent, long configKey, long subscriberId) throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean setBroadcastSubscriber(long configKey, long subscriberId, android.app.PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
public  void setFetchReportsOperation(android.app.PendingIntent pendingIntent, long configKey) throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean setDataFetchOperation(long configKey, android.app.PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
public  byte[] getReports(long configKey) throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  byte[] getData(long configKey) { throw new RuntimeException("Stub!"); }
public  byte[] getStatsMetadata() throws android.app.StatsManager.StatsUnavailableException { throw new RuntimeException("Stub!"); }
@Deprecated
public  byte[] getMetadata() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_STATSD_STARTED = "android.app.action.STATSD_STARTED";
public static final java.lang.String EXTRA_STATS_BROADCAST_SUBSCRIBER_COOKIES = "android.app.extra.STATS_BROADCAST_SUBSCRIBER_COOKIES";
public static final java.lang.String EXTRA_STATS_CONFIG_KEY = "android.app.extra.STATS_CONFIG_KEY";
public static final java.lang.String EXTRA_STATS_CONFIG_UID = "android.app.extra.STATS_CONFIG_UID";
public static final java.lang.String EXTRA_STATS_DIMENSIONS_VALUE = "android.app.extra.STATS_DIMENSIONS_VALUE";
public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_ID = "android.app.extra.STATS_SUBSCRIPTION_ID";
public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_RULE_ID = "android.app.extra.STATS_SUBSCRIPTION_RULE_ID";
}
