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
public final class NetworkStats
  implements java.lang.AutoCloseable
{
public static class Bucket
{
public  Bucket() { throw new RuntimeException("Stub!"); }
public  int getUid() { throw new RuntimeException("Stub!"); }
public  int getTag() { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  int getMetered() { throw new RuntimeException("Stub!"); }
public  int getRoaming() { throw new RuntimeException("Stub!"); }
public  int getDefaultNetworkStatus() { throw new RuntimeException("Stub!"); }
public  long getStartTimeStamp() { throw new RuntimeException("Stub!"); }
public  long getEndTimeStamp() { throw new RuntimeException("Stub!"); }
public  long getRxBytes() { throw new RuntimeException("Stub!"); }
public  long getTxBytes() { throw new RuntimeException("Stub!"); }
public  long getRxPackets() { throw new RuntimeException("Stub!"); }
public  long getTxPackets() { throw new RuntimeException("Stub!"); }
public static final int DEFAULT_NETWORK_ALL = -1;
public static final int DEFAULT_NETWORK_NO = 1;
public static final int DEFAULT_NETWORK_YES = 2;
public static final int METERED_ALL = -1;
public static final int METERED_NO = 1;
public static final int METERED_YES = 2;
public static final int ROAMING_ALL = -1;
public static final int ROAMING_NO = 1;
public static final int ROAMING_YES = 2;
public static final int STATE_ALL = -1;
public static final int STATE_DEFAULT = 1;
public static final int STATE_FOREGROUND = 2;
public static final int TAG_NONE = 0;
public static final int UID_ALL = -1;
public static final int UID_REMOVED = -4;
public static final int UID_TETHERING = -5;
}
NetworkStats() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  boolean getNextBucket(android.app.usage.NetworkStats.Bucket bucketOut) { throw new RuntimeException("Stub!"); }
public  boolean hasNextBucket() { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
}
