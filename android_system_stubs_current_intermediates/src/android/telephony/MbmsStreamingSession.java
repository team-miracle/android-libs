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

package android.telephony;
public class MbmsStreamingSession
  implements java.lang.AutoCloseable
{
MbmsStreamingSession() { throw new RuntimeException("Stub!"); }
public static  android.telephony.MbmsStreamingSession create(android.content.Context context, java.util.concurrent.Executor executor, int subscriptionId, android.telephony.mbms.MbmsStreamingSessionCallback callback) { throw new RuntimeException("Stub!"); }
public static  android.telephony.MbmsStreamingSession create(android.content.Context context, java.util.concurrent.Executor executor, android.telephony.mbms.MbmsStreamingSessionCallback callback) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void requestUpdateStreamingServices(java.util.List<java.lang.String> serviceClassList) { throw new RuntimeException("Stub!"); }
public  android.telephony.mbms.StreamingService startStreaming(android.telephony.mbms.StreamingServiceInfo serviceInfo, java.util.concurrent.Executor executor, android.telephony.mbms.StreamingServiceCallback callback) { throw new RuntimeException("Stub!"); }
public static final java.lang.String MBMS_STREAMING_SERVICE_ACTION = "android.telephony.action.EmbmsStreaming";
}
