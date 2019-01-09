/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.app.admin;
public class DeviceAdminReceiver
  extends android.content.BroadcastReceiver
{
public  DeviceAdminReceiver() { throw new RuntimeException("Stub!"); }
public  android.app.admin.DevicePolicyManager getManager(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getWho(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void onEnabled(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence onDisableRequested(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDisabled(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onPasswordChanged(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onPasswordChanged(android.content.Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onPasswordFailed(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onPasswordFailed(android.content.Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onPasswordSucceeded(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onPasswordSucceeded(android.content.Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onPasswordExpiring(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onPasswordExpiring(android.content.Context context, android.content.Intent intent, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onProfileProvisioningComplete(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onReadyForUserInitialization(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onLockTaskModeEntering(android.content.Context context, android.content.Intent intent, java.lang.String pkg) { throw new RuntimeException("Stub!"); }
public  void onLockTaskModeExiting(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  java.lang.String onChoosePrivateKeyAlias(android.content.Context context, android.content.Intent intent, int uid, android.net.Uri uri, java.lang.String alias) { throw new RuntimeException("Stub!"); }
public  void onSystemUpdatePending(android.content.Context context, android.content.Intent intent, long receivedTime) { throw new RuntimeException("Stub!"); }
public  void onBugreportSharingDeclined(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onBugreportShared(android.content.Context context, android.content.Intent intent, java.lang.String bugreportHash) { throw new RuntimeException("Stub!"); }
public  void onBugreportFailed(android.content.Context context, android.content.Intent intent, int failureCode) { throw new RuntimeException("Stub!"); }
public  void onSecurityLogsAvailable(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onNetworkLogsAvailable(android.content.Context context, android.content.Intent intent, long batchToken, int networkLogsCount) { throw new RuntimeException("Stub!"); }
public  void onUserAdded(android.content.Context context, android.content.Intent intent, android.os.UserHandle newUser) { throw new RuntimeException("Stub!"); }
public  void onUserRemoved(android.content.Context context, android.content.Intent intent, android.os.UserHandle removedUser) { throw new RuntimeException("Stub!"); }
public  void onUserStarted(android.content.Context context, android.content.Intent intent, android.os.UserHandle startedUser) { throw new RuntimeException("Stub!"); }
public  void onUserStopped(android.content.Context context, android.content.Intent intent, android.os.UserHandle stoppedUser) { throw new RuntimeException("Stub!"); }
public  void onUserSwitched(android.content.Context context, android.content.Intent intent, android.os.UserHandle switchedUser) { throw new RuntimeException("Stub!"); }
public  void onTransferOwnershipComplete(android.content.Context context, android.os.PersistableBundle bundle) { throw new RuntimeException("Stub!"); }
public  void onTransferAffiliatedProfileOwnershipComplete(android.content.Context context, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  void onReceive(android.content.Context context, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
public static final java.lang.String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
public static final java.lang.String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
public static final java.lang.String ACTION_LOCK_TASK_ENTERING = "android.app.action.LOCK_TASK_ENTERING";
public static final java.lang.String ACTION_LOCK_TASK_EXITING = "android.app.action.LOCK_TASK_EXITING";
public static final java.lang.String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
public static final java.lang.String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
public static final java.lang.String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
public static final java.lang.String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
public static final java.lang.String ACTION_PROFILE_PROVISIONING_COMPLETE = "android.app.action.PROFILE_PROVISIONING_COMPLETE";
public static final int BUGREPORT_FAILURE_FAILED_COMPLETING = 0;
public static final int BUGREPORT_FAILURE_FILE_NO_LONGER_AVAILABLE = 1;
public static final java.lang.String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
public static final java.lang.String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
public static final java.lang.String EXTRA_LOCK_TASK_PACKAGE = "android.app.extra.LOCK_TASK_PACKAGE";
public static final java.lang.String EXTRA_TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE = "android.app.extra.TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE";
}
