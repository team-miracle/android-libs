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

package android.util;
public class EventLog
{
public static final class Event
{
Event() { throw new RuntimeException("Stub!"); }
public  int getProcessId() { throw new RuntimeException("Stub!"); }
public  int getThreadId() { throw new RuntimeException("Stub!"); }
public  long getTimeNanos() { throw new RuntimeException("Stub!"); }
public  int getTag() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.Object getData() { throw new RuntimeException("Stub!"); }
}
EventLog() { throw new RuntimeException("Stub!"); }
public static native  int writeEvent(int tag, int value);
public static native  int writeEvent(int tag, long value);
public static native  int writeEvent(int tag, float value);
public static native  int writeEvent(int tag, java.lang.String str);
public static native  int writeEvent(int tag, java.lang.Object... list);
public static native  void readEvents(int[] tags, java.util.Collection<android.util.EventLog.Event> output) throws java.io.IOException;
public static  java.lang.String getTagName(int tag) { throw new RuntimeException("Stub!"); }
public static  int getTagCode(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
