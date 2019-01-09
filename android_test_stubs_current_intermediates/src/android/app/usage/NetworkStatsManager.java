/**
* Copyright (C) 2015 The Android Open Source Project
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
public class NetworkStatsManager
{
public abstract static class UsageCallback
{
public  UsageCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onThresholdReached(int networkType, java.lang.String subscriberId);
}
NetworkStatsManager() { throw new RuntimeException("Stub!"); }
public  void setPollForce(boolean pollForce) { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats.Bucket querySummaryForDevice(int networkType, java.lang.String subscriberId, long startTime, long endTime) throws java.lang.SecurityException, android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats.Bucket querySummaryForUser(int networkType, java.lang.String subscriberId, long startTime, long endTime) throws java.lang.SecurityException, android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats querySummary(int networkType, java.lang.String subscriberId, long startTime, long endTime) throws java.lang.SecurityException, android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats queryDetailsForUid(int networkType, java.lang.String subscriberId, long startTime, long endTime, int uid) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats queryDetailsForUidTag(int networkType, java.lang.String subscriberId, long startTime, long endTime, int uid, int tag) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats queryDetailsForUidTagState(int networkType, java.lang.String subscriberId, long startTime, long endTime, int uid, int tag, int state) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }
public  android.app.usage.NetworkStats queryDetails(int networkType, java.lang.String subscriberId, long startTime, long endTime) throws java.lang.SecurityException, android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void registerUsageCallback(int networkType, java.lang.String subscriberId, long thresholdBytes, android.app.usage.NetworkStatsManager.UsageCallback callback) { throw new RuntimeException("Stub!"); }
public  void registerUsageCallback(int networkType, java.lang.String subscriberId, long thresholdBytes, android.app.usage.NetworkStatsManager.UsageCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterUsageCallback(android.app.usage.NetworkStatsManager.UsageCallback callback) { throw new RuntimeException("Stub!"); }
}
