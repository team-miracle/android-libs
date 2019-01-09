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
public final class MessageQueue
{
public static interface IdleHandler
{
public abstract  boolean queueIdle();
}
public static interface OnFileDescriptorEventListener
{
public abstract  int onFileDescriptorEvents(java.io.FileDescriptor fd, int events);
public static final int EVENT_ERROR = 4;
public static final int EVENT_INPUT = 1;
public static final int EVENT_OUTPUT = 2;
}
MessageQueue() { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  boolean isIdle() { throw new RuntimeException("Stub!"); }
public  void addIdleHandler(android.os.MessageQueue.IdleHandler handler) { throw new RuntimeException("Stub!"); }
public  void removeIdleHandler(android.os.MessageQueue.IdleHandler handler) { throw new RuntimeException("Stub!"); }
public  void addOnFileDescriptorEventListener(java.io.FileDescriptor fd, int events, android.os.MessageQueue.OnFileDescriptorEventListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnFileDescriptorEventListener(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
}
