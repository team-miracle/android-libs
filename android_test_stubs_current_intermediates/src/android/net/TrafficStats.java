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

package android.net;
public class TrafficStats
{
public  TrafficStats() { throw new RuntimeException("Stub!"); }
public static  void setThreadStatsTag(int tag) { throw new RuntimeException("Stub!"); }
public static  int getAndSetThreadStatsTag(int tag) { throw new RuntimeException("Stub!"); }
public static  int getThreadStatsTag() { throw new RuntimeException("Stub!"); }
public static  void clearThreadStatsTag() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public static  void setThreadStatsUid(int uid) { throw new RuntimeException("Stub!"); }
public static  int getThreadStatsUid() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public static  void clearThreadStatsUid() { throw new RuntimeException("Stub!"); }
public static  void tagSocket(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void untagSocket(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void tagDatagramSocket(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void untagDatagramSocket(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void tagFileDescriptor(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void untagFileDescriptor(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  void incrementOperationCount(int operationCount) { throw new RuntimeException("Stub!"); }
public static  void incrementOperationCount(int tag, int operationCount) { throw new RuntimeException("Stub!"); }
public static  long getMobileTxPackets() { throw new RuntimeException("Stub!"); }
public static  long getMobileRxPackets() { throw new RuntimeException("Stub!"); }
public static  long getMobileTxBytes() { throw new RuntimeException("Stub!"); }
public static  long getMobileRxBytes() { throw new RuntimeException("Stub!"); }
public static  long getLoopbackTxPackets() { throw new RuntimeException("Stub!"); }
public static  long getLoopbackRxPackets() { throw new RuntimeException("Stub!"); }
public static  long getLoopbackTxBytes() { throw new RuntimeException("Stub!"); }
public static  long getLoopbackRxBytes() { throw new RuntimeException("Stub!"); }
public static  long getTotalTxPackets() { throw new RuntimeException("Stub!"); }
public static  long getTotalRxPackets() { throw new RuntimeException("Stub!"); }
public static  long getTotalTxBytes() { throw new RuntimeException("Stub!"); }
public static  long getTotalRxBytes() { throw new RuntimeException("Stub!"); }
public static  long getUidTxBytes(int uid) { throw new RuntimeException("Stub!"); }
public static  long getUidRxBytes(int uid) { throw new RuntimeException("Stub!"); }
public static  long getUidTxPackets(int uid) { throw new RuntimeException("Stub!"); }
public static  long getUidRxPackets(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidTcpTxBytes(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidTcpRxBytes(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidUdpTxBytes(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidUdpRxBytes(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidTcpTxSegments(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidTcpRxSegments(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidUdpTxPackets(int uid) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  long getUidUdpRxPackets(int uid) { throw new RuntimeException("Stub!"); }
public static final int UNSUPPORTED = -1;
}
