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
* limitations under the License
*/

package android.telecom;
public abstract class CallScreeningService
  extends android.app.Service
{
public static class CallResponse
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.telecom.CallScreeningService.CallResponse.Builder setDisallowCall(boolean shouldDisallowCall) { throw new RuntimeException("Stub!"); }
public  android.telecom.CallScreeningService.CallResponse.Builder setRejectCall(boolean shouldRejectCall) { throw new RuntimeException("Stub!"); }
public  android.telecom.CallScreeningService.CallResponse.Builder setSkipCallLog(boolean shouldSkipCallLog) { throw new RuntimeException("Stub!"); }
public  android.telecom.CallScreeningService.CallResponse.Builder setSkipNotification(boolean shouldSkipNotification) { throw new RuntimeException("Stub!"); }
public  android.telecom.CallScreeningService.CallResponse build() { throw new RuntimeException("Stub!"); }
}
CallResponse() { throw new RuntimeException("Stub!"); }
public  boolean getDisallowCall() { throw new RuntimeException("Stub!"); }
public  boolean getRejectCall() { throw new RuntimeException("Stub!"); }
public  boolean getSkipCallLog() { throw new RuntimeException("Stub!"); }
public  boolean getSkipNotification() { throw new RuntimeException("Stub!"); }
}
public  CallScreeningService() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  boolean onUnbind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  void onScreenCall(android.telecom.Call.Details callDetails);
public final  void respondToCall(android.telecom.Call.Details callDetails, android.telecom.CallScreeningService.CallResponse response) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
}
