/**
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

package android.service.trust;
public class TrustAgentService
  extends android.app.Service
{
public  TrustAgentService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onUnlockAttempt(boolean successful) { throw new RuntimeException("Stub!"); }
public  void onTrustTimeout() { throw new RuntimeException("Stub!"); }
public  void onDeviceLocked() { throw new RuntimeException("Stub!"); }
public  void onDeviceUnlocked() { throw new RuntimeException("Stub!"); }
public  void onDeviceUnlockLockout(long timeoutMs) { throw new RuntimeException("Stub!"); }
public  void onEscrowTokenAdded(byte[] token, long handle, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onEscrowTokenStateReceived(long handle, int tokenState) { throw new RuntimeException("Stub!"); }
public  void onEscrowTokenRemoved(long handle, boolean successful) { throw new RuntimeException("Stub!"); }
public  boolean onConfigure(java.util.List<android.os.PersistableBundle> options) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public final  void grantTrust(java.lang.CharSequence message, long durationMs, boolean initiatedByUser) { throw new RuntimeException("Stub!"); }
public final  void grantTrust(java.lang.CharSequence message, long durationMs, int flags) { throw new RuntimeException("Stub!"); }
public final  void revokeTrust() { throw new RuntimeException("Stub!"); }
public final  void setManagingTrust(boolean managingTrust) { throw new RuntimeException("Stub!"); }
public final  void addEscrowToken(byte[] token, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public final  void isEscrowTokenActive(long handle, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public final  void removeEscrowToken(long handle, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public final  void unlockUserWithToken(long handle, byte[] token, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public final  void showKeyguardErrorMessage(java.lang.CharSequence message) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final int FLAG_GRANT_TRUST_DISMISS_KEYGUARD = 2;
public static final int FLAG_GRANT_TRUST_INITIATED_BY_USER = 1;
public static final java.lang.String SERVICE_INTERFACE = "android.service.trust.TrustAgentService";
public static final int TOKEN_STATE_ACTIVE = 1;
public static final int TOKEN_STATE_INACTIVE = 0;
public static final java.lang.String TRUST_AGENT_META_DATA = "android.service.trust.trustagent";
}
