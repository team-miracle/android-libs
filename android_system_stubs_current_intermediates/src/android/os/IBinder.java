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
public interface IBinder
{
public static interface DeathRecipient
{
public abstract  void binderDied();
}
public abstract  java.lang.String getInterfaceDescriptor() throws android.os.RemoteException;
public abstract  boolean pingBinder();
public abstract  boolean isBinderAlive();
public abstract  android.os.IInterface queryLocalInterface(java.lang.String descriptor);
public abstract  void dump(java.io.FileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException;
public abstract  void dumpAsync(java.io.FileDescriptor fd, java.lang.String[] args) throws android.os.RemoteException;
public abstract  boolean transact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException;
public abstract  void linkToDeath(android.os.IBinder.DeathRecipient recipient, int flags) throws android.os.RemoteException;
public abstract  boolean unlinkToDeath(android.os.IBinder.DeathRecipient recipient, int flags);
public static final int DUMP_TRANSACTION = 1598311760;
public static final int FIRST_CALL_TRANSACTION = 1;
public static final int FLAG_ONEWAY = 1;
public static final int INTERFACE_TRANSACTION = 1598968902;
public static final int LAST_CALL_TRANSACTION = 16777215;
public static final int LIKE_TRANSACTION = 1598835019;
public static final int PING_TRANSACTION = 1599098439;
public static final int TWEET_TRANSACTION = 1599362900;
}
