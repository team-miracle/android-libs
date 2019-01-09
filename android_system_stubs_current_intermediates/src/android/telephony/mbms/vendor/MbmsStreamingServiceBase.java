/*
* Copyright (C) 2017 The Android Open Source Project
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
* limitations under the License
*/

package android.telephony.mbms.vendor;
public class MbmsStreamingServiceBase
  extends android.os.Binder
{
public  MbmsStreamingServiceBase() { throw new RuntimeException("Stub!"); }
public  int initialize(android.telephony.mbms.MbmsStreamingSessionCallback callback, int subscriptionId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int requestUpdateStreamingServices(int subscriptionId, java.util.List<java.lang.String> serviceClasses) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  int startStreaming(int subscriptionId, java.lang.String serviceId, android.telephony.mbms.StreamingServiceCallback callback) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  android.net.Uri getPlaybackUri(int subscriptionId, java.lang.String serviceId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void stopStreaming(int subscriptionId, java.lang.String serviceId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void dispose(int subscriptionId) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
public  void onAppCallbackDied(int uid, int subscriptionId) { throw new RuntimeException("Stub!"); }
}
