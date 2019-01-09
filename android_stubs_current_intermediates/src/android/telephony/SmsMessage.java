/*
* Copyright (C) 2008 The Android Open Source Project
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
public class SmsMessage
{
public static enum MessageClass
{
CLASS_0(),
CLASS_1(),
CLASS_2(),
CLASS_3(),
UNKNOWN();
}
public static class SubmitPdu
{
SubmitPdu() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public byte[] encodedMessage = null;
public byte[] encodedScAddress = null;
}
SmsMessage() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.telephony.SmsMessage createFromPdu(byte[] pdu) { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsMessage createFromPdu(byte[] pdu, java.lang.String format) { throw new RuntimeException("Stub!"); }
public static  int getTPLayerLengthForPDU(java.lang.String pdu) { throw new RuntimeException("Stub!"); }
public static  int[] calculateLength(java.lang.CharSequence msgBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
public static  int[] calculateLength(java.lang.String messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String scAddress, java.lang.String destinationAddress, java.lang.String message, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
public static  android.telephony.SmsMessage.SubmitPdu getSubmitPdu(java.lang.String scAddress, java.lang.String destinationAddress, short destinationPort, byte[] data, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceCenterAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOriginatingAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayOriginatingAddress() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMessageBody() { throw new RuntimeException("Stub!"); }
public  android.telephony.SmsMessage.MessageClass getMessageClass() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayMessageBody() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPseudoSubject() { throw new RuntimeException("Stub!"); }
public  long getTimestampMillis() { throw new RuntimeException("Stub!"); }
public  boolean isEmail() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEmailBody() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEmailFrom() { throw new RuntimeException("Stub!"); }
public  int getProtocolIdentifier() { throw new RuntimeException("Stub!"); }
public  boolean isReplace() { throw new RuntimeException("Stub!"); }
public  boolean isCphsMwiMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMWIClearMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMWISetMessage() { throw new RuntimeException("Stub!"); }
public  boolean isMwiDontStore() { throw new RuntimeException("Stub!"); }
public  byte[] getUserData() { throw new RuntimeException("Stub!"); }
public  byte[] getPdu() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getStatusOnSim() { throw new RuntimeException("Stub!"); }
public  int getStatusOnIcc() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getIndexOnSim() { throw new RuntimeException("Stub!"); }
public  int getIndexOnIcc() { throw new RuntimeException("Stub!"); }
public  int getStatus() { throw new RuntimeException("Stub!"); }
public  boolean isStatusReportMessage() { throw new RuntimeException("Stub!"); }
public  boolean isReplyPathPresent() { throw new RuntimeException("Stub!"); }
public static final int ENCODING_16BIT = 3;
public static final int ENCODING_7BIT = 1;
public static final int ENCODING_8BIT = 2;
public static final int ENCODING_UNKNOWN = 0;
public static final java.lang.String FORMAT_3GPP = "3gpp";
public static final java.lang.String FORMAT_3GPP2 = "3gpp2";
public static final int MAX_USER_DATA_BYTES = 140;
public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;
public static final int MAX_USER_DATA_SEPTETS = 160;
public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
}
