/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.service.carrier;
public abstract class CarrierMessagingService
  extends android.app.Service
{
public static final class SendMmsResult
{
public  SendMmsResult(int sendStatus, byte[] sendConfPdu) { throw new RuntimeException("Stub!"); }
public  int getSendStatus() { throw new RuntimeException("Stub!"); }
public  byte[] getSendConfPdu() { throw new RuntimeException("Stub!"); }
}
public static final class SendSmsResult
{
public  SendSmsResult(int sendStatus, int messageRef) { throw new RuntimeException("Stub!"); }
public  int getMessageRef() { throw new RuntimeException("Stub!"); }
public  int getSendStatus() { throw new RuntimeException("Stub!"); }
}
public static final class SendMultipartSmsResult
{
public  SendMultipartSmsResult(int sendStatus, int[] messageRefs) { throw new RuntimeException("Stub!"); }
public  int[] getMessageRefs() { throw new RuntimeException("Stub!"); }
public  int getSendStatus() { throw new RuntimeException("Stub!"); }
}
public static interface ResultCallback<T>
{
public abstract  void onReceiveResult(T result) throws android.os.RemoteException;
}
public  CarrierMessagingService() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onFilterSms(android.service.carrier.MessagePdu pdu, java.lang.String format, int destPort, int subId, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Boolean> callback) { throw new RuntimeException("Stub!"); }
public  void onReceiveTextSms(android.service.carrier.MessagePdu pdu, java.lang.String format, int destPort, int subId, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onSendTextSms(java.lang.String text, int subId, java.lang.String destAddress, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
public  void onSendTextSms(java.lang.String text, int subId, java.lang.String destAddress, int sendSmsFlag, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onSendDataSms(byte[] data, int subId, java.lang.String destAddress, int destPort, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
public  void onSendDataSms(byte[] data, int subId, java.lang.String destAddress, int destPort, int sendSmsFlag, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onSendMultipartTextSms(java.util.List<java.lang.String> parts, int subId, java.lang.String destAddress, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> callback) { throw new RuntimeException("Stub!"); }
public  void onSendMultipartTextSms(java.util.List<java.lang.String> parts, int subId, java.lang.String destAddress, int sendSmsFlag, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMultipartSmsResult> callback) { throw new RuntimeException("Stub!"); }
public  void onSendMms(android.net.Uri pduUri, int subId, android.net.Uri location, android.service.carrier.CarrierMessagingService.ResultCallback<android.service.carrier.CarrierMessagingService.SendMmsResult> callback) { throw new RuntimeException("Stub!"); }
public  void onDownloadMms(android.net.Uri contentUri, int subId, android.net.Uri location, android.service.carrier.CarrierMessagingService.ResultCallback<java.lang.Integer> callback) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final int DOWNLOAD_STATUS_ERROR = 2;
public static final int DOWNLOAD_STATUS_OK = 0;
public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
public static final int RECEIVE_OPTIONS_DEFAULT = 0;
public static final int RECEIVE_OPTIONS_DROP = 1;
public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
public static final int SEND_STATUS_ERROR = 2;
public static final int SEND_STATUS_OK = 0;
public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
public static final java.lang.String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
}
