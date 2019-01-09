/*
* Copyright (C) 2016 The Android Open Source Project
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
public abstract class HwBinder
  implements android.os.IHwBinder
{
public  HwBinder() { throw new RuntimeException("Stub!"); }
public abstract  void onTransact(int code, android.os.HwParcel request, android.os.HwParcel reply, int flags) throws android.os.RemoteException;
public final native  void registerService(java.lang.String serviceName) throws android.os.RemoteException;
public static final  android.os.IHwBinder getService(java.lang.String iface, java.lang.String serviceName) throws android.os.RemoteException, java.util.NoSuchElementException { throw new RuntimeException("Stub!"); }
public static final native  android.os.IHwBinder getService(java.lang.String iface, java.lang.String serviceName, boolean retry) throws android.os.RemoteException, java.util.NoSuchElementException;
public static final native  void configureRpcThreadpool(long maxThreads, boolean callerWillJoin);
public static final native  void joinRpcThreadpool();
public static  void enableInstrumentation() { throw new RuntimeException("Stub!"); }
public final native  void transact(int code, android.os.HwParcel request, android.os.HwParcel reply, int flags) throws android.os.RemoteException;
}
