/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.telephony.ims.stub;
public class ImsSmsImplBase
{
public  ImsSmsImplBase() { throw new RuntimeException("Stub!"); }
public  void sendSms(int token, int messageRef, java.lang.String format, java.lang.String smsc, boolean isRetry, byte[] pdu) { throw new RuntimeException("Stub!"); }
public  void acknowledgeSms(int token, int messageRef, int result) { throw new RuntimeException("Stub!"); }
public  void acknowledgeSmsReport(int token, int messageRef, int result) { throw new RuntimeException("Stub!"); }
public final  void onSmsReceived(int token, java.lang.String format, byte[] pdu) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public final  void onSendSmsResult(int token, int messageRef, int status, int reason) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public final  void onSmsStatusReportReceived(int token, int messageRef, java.lang.String format, byte[] pdu) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  java.lang.String getSmsFormat() { throw new RuntimeException("Stub!"); }
public  void onReady() { throw new RuntimeException("Stub!"); }
public static final int DELIVER_STATUS_ERROR_GENERIC = 2;
public static final int DELIVER_STATUS_ERROR_NO_MEMORY = 3;
public static final int DELIVER_STATUS_ERROR_REQUEST_NOT_SUPPORTED = 4;
public static final int DELIVER_STATUS_OK = 1;
public static final int SEND_STATUS_ERROR = 2;
public static final int SEND_STATUS_ERROR_FALLBACK = 4;
public static final int SEND_STATUS_ERROR_RETRY = 3;
public static final int SEND_STATUS_OK = 1;
public static final int STATUS_REPORT_STATUS_ERROR = 2;
public static final int STATUS_REPORT_STATUS_OK = 1;
}
