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

package android.os;
public final class Debug
{
public static class MemoryInfo
  implements android.os.Parcelable
{
public  MemoryInfo() { throw new RuntimeException("Stub!"); }
public  int getTotalPss() { throw new RuntimeException("Stub!"); }
public  int getTotalSwappablePss() { throw new RuntimeException("Stub!"); }
public  int getTotalPrivateDirty() { throw new RuntimeException("Stub!"); }
public  int getTotalSharedDirty() { throw new RuntimeException("Stub!"); }
public  int getTotalPrivateClean() { throw new RuntimeException("Stub!"); }
public  int getTotalSharedClean() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMemoryStat(java.lang.String statName) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getMemoryStats() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel source) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.Debug.MemoryInfo> CREATOR;
public int dalvikPrivateDirty;
public int dalvikPss;
public int dalvikSharedDirty;
public int nativePrivateDirty;
public int nativePss;
public int nativeSharedDirty;
public int otherPrivateDirty;
public int otherPss;
public int otherSharedDirty;
static { CREATOR = null; }
}
@java.lang.Deprecated()
public static class InstructionCount
{
public  InstructionCount() { throw new RuntimeException("Stub!"); }
public  boolean resetAndStart() { throw new RuntimeException("Stub!"); }
public  boolean collect() { throw new RuntimeException("Stub!"); }
public  int globalTotal() { throw new RuntimeException("Stub!"); }
public  int globalMethodInvocations() { throw new RuntimeException("Stub!"); }
}
Debug() { throw new RuntimeException("Stub!"); }
public static  void waitForDebugger() { throw new RuntimeException("Stub!"); }
public static  boolean waitingForDebugger() { throw new RuntimeException("Stub!"); }
public static  boolean isDebuggerConnected() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void changeDebugPort(int port) { throw new RuntimeException("Stub!"); }
public static  void startNativeTracing() { throw new RuntimeException("Stub!"); }
public static  void stopNativeTracing() { throw new RuntimeException("Stub!"); }
public static  void enableEmulatorTraceOutput() { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing() { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String tracePath) { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String tracePath, int bufferSize) { throw new RuntimeException("Stub!"); }
public static  void startMethodTracing(java.lang.String tracePath, int bufferSize, int flags) { throw new RuntimeException("Stub!"); }
public static  void startMethodTracingSampling(java.lang.String tracePath, int bufferSize, int intervalUs) { throw new RuntimeException("Stub!"); }
public static  void stopMethodTracing() { throw new RuntimeException("Stub!"); }
public static  long threadCpuTimeNanos() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void startAllocCounting() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void stopAllocCounting() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalFreedCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalFreedCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalFreedSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalFreedSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalGcInvocationCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalClassInitCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalClassInitTime() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalExternalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalExternalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalExternalFreedCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetGlobalExternalFreedSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getThreadAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetThreadAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getThreadAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetThreadAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetThreadExternalAllocCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetThreadExternalAllocSize() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int getThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetThreadGcInvocationCount() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  void resetAllCounts() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getRuntimeStat(java.lang.String statName) { throw new RuntimeException("Stub!"); }
public static  java.util.Map<java.lang.String, java.lang.String> getRuntimeStats() { throw new RuntimeException("Stub!"); }
public static native  long getNativeHeapSize();
public static native  long getNativeHeapAllocatedSize();
public static native  long getNativeHeapFreeSize();
public static native  void getMemoryInfo(android.os.Debug.MemoryInfo memoryInfo);
public static native  long getPss();
@java.lang.Deprecated()
public static  int setAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  int setGlobalAllocationLimit(int limit) { throw new RuntimeException("Stub!"); }
public static  void printLoadedClasses(int flags) { throw new RuntimeException("Stub!"); }
public static  int getLoadedClassCount() { throw new RuntimeException("Stub!"); }
public static  void dumpHprofData(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static native  int getBinderSentTransactions();
public static native  int getBinderReceivedTransactions();
public static native  int getBinderLocalObjectCount();
public static native  int getBinderProxyObjectCount();
public static native  int getBinderDeathObjectCount();
public static  boolean dumpService(java.lang.String name, java.io.FileDescriptor fd, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public static  void attachJvmtiAgent(java.lang.String library, java.lang.String options, java.lang.ClassLoader classLoader) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static final int SHOW_CLASSLOADER = 2;
public static final int SHOW_FULL_DETAIL = 1;
public static final int SHOW_INITIALIZED = 4;
@java.lang.Deprecated()
public static final int TRACE_COUNT_ALLOCS = 1;
}
