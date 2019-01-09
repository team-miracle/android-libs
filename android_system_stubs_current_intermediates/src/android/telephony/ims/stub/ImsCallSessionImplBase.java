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

package android.telephony.ims.stub;
public class ImsCallSessionImplBase
  implements java.lang.AutoCloseable
{
public static class State
{
State() { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(int state) { throw new RuntimeException("Stub!"); }
public static final int ESTABLISHED = 4;
public static final int ESTABLISHING = 3;
public static final int IDLE = 0;
public static final int INITIATED = 1;
public static final int INVALID = -1;
public static final int NEGOTIATING = 2;
public static final int REESTABLISHING = 6;
public static final int RENEGOTIATING = 5;
public static final int TERMINATED = 8;
public static final int TERMINATING = 7;
}
public  ImsCallSessionImplBase() { throw new RuntimeException("Stub!"); }
public  void setListener(android.telephony.ims.ImsCallSessionListener listener) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCallId() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsCallProfile getCallProfile() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsCallProfile getLocalCallProfile() { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsCallProfile getRemoteCallProfile() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProperty(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int getState() { throw new RuntimeException("Stub!"); }
public  boolean isInCall() { throw new RuntimeException("Stub!"); }
public  void setMute(boolean muted) { throw new RuntimeException("Stub!"); }
public  void start(java.lang.String callee, android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void startConference(java.lang.String[] participants, android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void accept(int callType, android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  void deflect(java.lang.String deflectNumber) { throw new RuntimeException("Stub!"); }
public  void reject(int reason) { throw new RuntimeException("Stub!"); }
public  void terminate(int reason) { throw new RuntimeException("Stub!"); }
public  void hold(android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  void resume(android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  void merge() { throw new RuntimeException("Stub!"); }
public  void update(int callType, android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  void extendToConference(java.lang.String[] participants) { throw new RuntimeException("Stub!"); }
public  void inviteParticipants(java.lang.String[] participants) { throw new RuntimeException("Stub!"); }
public  void removeParticipants(java.lang.String[] participants) { throw new RuntimeException("Stub!"); }
public  void sendDtmf(char c, android.os.Message result) { throw new RuntimeException("Stub!"); }
public  void startDtmf(char c) { throw new RuntimeException("Stub!"); }
public  void stopDtmf() { throw new RuntimeException("Stub!"); }
public  void sendUssd(java.lang.String ussdMessage) { throw new RuntimeException("Stub!"); }
public  android.telephony.ims.ImsVideoCallProvider getImsVideoCallProvider() { throw new RuntimeException("Stub!"); }
public  boolean isMultiparty() { throw new RuntimeException("Stub!"); }
public  void sendRttModifyRequest(android.telephony.ims.ImsCallProfile toProfile) { throw new RuntimeException("Stub!"); }
public  void sendRttModifyResponse(boolean status) { throw new RuntimeException("Stub!"); }
public  void sendRttMessage(java.lang.String rttMessage) { throw new RuntimeException("Stub!"); }
public static final int USSD_MODE_NOTIFY = 0;
public static final int USSD_MODE_REQUEST = 1;
}
