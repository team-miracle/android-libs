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

package android.telephony.ims;
public class ImsCallSessionListener
{
ImsCallSessionListener() { throw new RuntimeException("Stub!"); }
public  void callSessionProgressing(android.telephony.ims.ImsStreamMediaProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionInitiated(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionInitiatedFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionTerminated(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionHeld(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionHoldFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionHoldReceived(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionResumed(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionResumeFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionResumeReceived(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionMergeStarted(android.telephony.ims.stub.ImsCallSessionImplBase newSession, android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionMergeComplete(android.telephony.ims.stub.ImsCallSessionImplBase newSession) { throw new RuntimeException("Stub!"); }
public  void callSessionMergeFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionUpdated(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionUpdateFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionUpdateReceived(android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionConferenceExtended(android.telephony.ims.stub.ImsCallSessionImplBase newSession, android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionConferenceExtendFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionConferenceExtendReceived(android.telephony.ims.stub.ImsCallSessionImplBase newSession, android.telephony.ims.ImsCallProfile profile) { throw new RuntimeException("Stub!"); }
public  void callSessionInviteParticipantsRequestDelivered() { throw new RuntimeException("Stub!"); }
public  void callSessionInviteParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionRemoveParticipantsRequestDelivered() { throw new RuntimeException("Stub!"); }
public  void callSessionRemoveParticipantsRequestFailed(android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionConferenceStateUpdated(android.telephony.ims.ImsConferenceState state) { throw new RuntimeException("Stub!"); }
public  void callSessionUssdMessageReceived(int mode, java.lang.String ussdMessage) { throw new RuntimeException("Stub!"); }
public  void callSessionMayHandover(int srcAccessTech, int targetAccessTech) { throw new RuntimeException("Stub!"); }
public  void callSessionHandover(int srcAccessTech, int targetAccessTech, android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionHandoverFailed(int srcAccessTech, int targetAccessTech, android.telephony.ims.ImsReasonInfo reasonInfo) { throw new RuntimeException("Stub!"); }
public  void callSessionTtyModeReceived(int mode) { throw new RuntimeException("Stub!"); }
public  void callSessionMultipartyStateChanged(boolean isMultiParty) { throw new RuntimeException("Stub!"); }
public  void callSessionSuppServiceReceived(android.telephony.ims.ImsSuppServiceNotification suppSrvNotification) { throw new RuntimeException("Stub!"); }
public  void callSessionRttModifyRequestReceived(android.telephony.ims.ImsCallProfile callProfile) { throw new RuntimeException("Stub!"); }
public  void callSessionRttModifyResponseReceived(int status) { throw new RuntimeException("Stub!"); }
public  void callSessionRttMessageReceived(java.lang.String rttMessage) { throw new RuntimeException("Stub!"); }
}
