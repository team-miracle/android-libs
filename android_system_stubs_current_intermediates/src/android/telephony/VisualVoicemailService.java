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
public abstract class VisualVoicemailService
  extends android.app.Service
{
public static class VisualVoicemailTask
{
VisualVoicemailTask() { throw new RuntimeException("Stub!"); }
public final  void finish() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
public  VisualVoicemailService() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  void onCellServiceConnected(android.telephony.VisualVoicemailService.VisualVoicemailTask task, android.telecom.PhoneAccountHandle phoneAccountHandle);
public abstract  void onSmsReceived(android.telephony.VisualVoicemailService.VisualVoicemailTask task, android.telephony.VisualVoicemailSms sms);
public abstract  void onSimRemoved(android.telephony.VisualVoicemailService.VisualVoicemailTask task, android.telecom.PhoneAccountHandle phoneAccountHandle);
public abstract  void onStopped(android.telephony.VisualVoicemailService.VisualVoicemailTask task);
public static final  void setSmsFilterSettings(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, android.telephony.VisualVoicemailSmsFilterSettings settings) { throw new RuntimeException("Stub!"); }
public static final  void sendVisualVoicemailSms(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String number, short port, java.lang.String text, android.app.PendingIntent sentIntent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.telephony.VisualVoicemailService";
}
