/*
* Copyright (C) 2006 The Android Open Source Project
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
public class Process
{
public  Process() { throw new RuntimeException("Stub!"); }
public static final native  long getElapsedCpuTime();
public static final  long getStartElapsedRealtime() { throw new RuntimeException("Stub!"); }
public static final  long getStartUptimeMillis() { throw new RuntimeException("Stub!"); }
public static final  boolean is64Bit() { throw new RuntimeException("Stub!"); }
public static final  int myPid() { throw new RuntimeException("Stub!"); }
public static final  int myTid() { throw new RuntimeException("Stub!"); }
public static final  int myUid() { throw new RuntimeException("Stub!"); }
public static  android.os.UserHandle myUserHandle() { throw new RuntimeException("Stub!"); }
public static  boolean isApplicationUid(int uid) { throw new RuntimeException("Stub!"); }
public static final  boolean isIsolated() { throw new RuntimeException("Stub!"); }
public static final native  int getUidForName(java.lang.String name);
public static final native  int getGidForName(java.lang.String name);
public static final native  void setThreadPriority(int tid, int priority) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
public static final native  int[] getExclusiveCores();
public static final native  void setThreadPriority(int priority) throws java.lang.IllegalArgumentException, java.lang.SecurityException;
public static final native  int getThreadPriority(int tid) throws java.lang.IllegalArgumentException;
public static final native  int getThreadScheduler(int tid) throws java.lang.IllegalArgumentException;
@java.lang.Deprecated()
public static final  boolean supportsProcesses() { throw new RuntimeException("Stub!"); }
public static final  void killProcess(int pid) { throw new RuntimeException("Stub!"); }
public static final native  void sendSignal(int pid, int signal);
public static final int FIRST_APPLICATION_UID = 10000;
public static final int LAST_APPLICATION_UID = 19999;
public static final int PHONE_UID = 1001;
public static final int SIGNAL_KILL = 9;
public static final int SIGNAL_QUIT = 3;
public static final int SIGNAL_USR1 = 10;
public static final int SYSTEM_UID = 1000;
public static final int THREAD_PRIORITY_AUDIO = -16;
public static final int THREAD_PRIORITY_BACKGROUND = 10;
public static final int THREAD_PRIORITY_DEFAULT = 0;
public static final int THREAD_PRIORITY_DISPLAY = -4;
public static final int THREAD_PRIORITY_FOREGROUND = -2;
public static final int THREAD_PRIORITY_LESS_FAVORABLE = 1;
public static final int THREAD_PRIORITY_LOWEST = 19;
public static final int THREAD_PRIORITY_MORE_FAVORABLE = -1;
public static final int THREAD_PRIORITY_URGENT_AUDIO = -19;
public static final int THREAD_PRIORITY_URGENT_DISPLAY = -8;
public static final int THREAD_PRIORITY_VIDEO = -10;
}
