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
public class Binder
  implements android.os.IBinder
{
public  Binder() { throw new RuntimeException("Stub!"); }
public static final native  int getCallingPid();
public static final native  int getCallingUid();
public static final  android.os.UserHandle getCallingUserHandle() { throw new RuntimeException("Stub!"); }
public static final native  long clearCallingIdentity();
public static final native  void restoreCallingIdentity(long token);
public static final native  void flushPendingCommands();
public static final  void joinThreadPool() { throw new RuntimeException("Stub!"); }
public  void attachInterface(android.os.IInterface owner, java.lang.String descriptor) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInterfaceDescriptor() { throw new RuntimeException("Stub!"); }
public  boolean pingBinder() { throw new RuntimeException("Stub!"); }
public  boolean isBinderAlive() { throw new RuntimeException("Stub!"); }
public  android.os.IInterface queryLocalInterface(java.lang.String descriptor) { throw new RuntimeException("Stub!"); }
protected  boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void dump(java.io.FileDescriptor fd, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public  void dumpAsync(java.io.FileDescriptor fd, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
protected  void dump(java.io.FileDescriptor fd, java.io.PrintWriter fout, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public final  boolean transact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void linkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
public  boolean unlinkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) { throw new RuntimeException("Stub!"); }
}
