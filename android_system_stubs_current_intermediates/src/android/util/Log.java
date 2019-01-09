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

package android.util;
public final class Log
{
Log() { throw new RuntimeException("Stub!"); }
public static  int v(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int v(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int d(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int d(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int i(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int i(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int w(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int w(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static native  boolean isLoggable(java.lang.String tag, int level);
public static  int w(java.lang.String tag, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int e(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int e(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int wtf(java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static  int wtf(java.lang.String tag, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int wtf(java.lang.String tag, java.lang.String msg, java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getStackTraceString(java.lang.Throwable tr) { throw new RuntimeException("Stub!"); }
public static  int println(int priority, java.lang.String tag, java.lang.String msg) { throw new RuntimeException("Stub!"); }
public static final int ASSERT = 7;
public static final int DEBUG = 3;
public static final int ERROR = 6;
public static final int INFO = 4;
public static final int VERBOSE = 2;
public static final int WARN = 5;
}
