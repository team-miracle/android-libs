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
* limitations under the License.
*/
package android.telephony.euicc;
public class EuiccCardManager
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface CancelReason
{
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface ResetOption
{
}
public static interface ResultCallback<T>
{
public abstract  void onComplete(int resultCode, T result);
}
EuiccCardManager() { throw new RuntimeException("Stub!"); }
public  void requestAllProfiles(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo[]> callback) { throw new RuntimeException("Stub!"); }
public  void requestProfile(java.lang.String cardId, java.lang.String iccid, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo> callback) { throw new RuntimeException("Stub!"); }
public  void disableProfile(java.lang.String cardId, java.lang.String iccid, boolean refresh, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public  void switchToProfile(java.lang.String cardId, java.lang.String iccid, boolean refresh, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.service.euicc.EuiccProfileInfo> callback) { throw new RuntimeException("Stub!"); }
public  void setNickname(java.lang.String cardId, java.lang.String iccid, java.lang.String nickname, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public  void deleteProfile(java.lang.String cardId, java.lang.String iccid, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public  void resetMemory(java.lang.String cardId, @android.telephony.euicc.EuiccCardManager.ResetOption()
int options, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public  void requestDefaultSmdpAddress(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.String> callback) { throw new RuntimeException("Stub!"); }
public  void requestSmdsAddress(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.String> callback) { throw new RuntimeException("Stub!"); }
public  void setDefaultSmdpAddress(java.lang.String cardId, java.lang.String defaultSmdpAddress, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public  void requestRulesAuthTable(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccRulesAuthTable> callback) { throw new RuntimeException("Stub!"); }
public  void requestEuiccChallenge(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void requestEuiccInfo1(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void requestEuiccInfo2(java.lang.String cardId, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void authenticateServer(java.lang.String cardId, java.lang.String matchingId, byte[] serverSigned1, byte[] serverSignature1, byte[] euiccCiPkIdToBeUsed, byte[] serverCertificate, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void prepareDownload(java.lang.String cardId, byte[] hashCc, byte[] smdpSigned2, byte[] smdpSignature2, byte[] smdpCertificate, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void loadBoundProfilePackage(java.lang.String cardId, byte[] boundProfilePackage, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void cancelSession(java.lang.String cardId, byte[] transactionId, @android.telephony.euicc.EuiccCardManager.CancelReason()
int reason, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<byte[]> callback) { throw new RuntimeException("Stub!"); }
public  void listNotifications(java.lang.String cardId, @android.telephony.euicc.EuiccNotification.Event()
int events, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification[]> callback) { throw new RuntimeException("Stub!"); }
public  void retrieveNotificationList(java.lang.String cardId, @android.telephony.euicc.EuiccNotification.Event()
int events, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification[]> callback) { throw new RuntimeException("Stub!"); }
public  void retrieveNotification(java.lang.String cardId, int seqNumber, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<android.telephony.euicc.EuiccNotification> callback) { throw new RuntimeException("Stub!"); }
public  void removeNotificationFromList(java.lang.String cardId, int seqNumber, java.util.concurrent.Executor executor, android.telephony.euicc.EuiccCardManager.ResultCallback<java.lang.Void> callback) { throw new RuntimeException("Stub!"); }
public static final int CANCEL_REASON_END_USER_REJECTED = 0;
public static final int CANCEL_REASON_POSTPONED = 1;
public static final int CANCEL_REASON_PPR_NOT_ALLOWED = 3;
public static final int CANCEL_REASON_TIMEOUT = 2;
public static final int RESET_OPTION_DELETE_FIELD_LOADED_TEST_PROFILES = 2;
public static final int RESET_OPTION_DELETE_OPERATIONAL_PROFILES = 1;
public static final int RESET_OPTION_RESET_DEFAULT_SMDP_ADDRESS = 4;
public static final int RESULT_EUICC_NOT_FOUND = -2;
public static final int RESULT_OK = 0;
public static final int RESULT_UNKNOWN_ERROR = -1;
}
