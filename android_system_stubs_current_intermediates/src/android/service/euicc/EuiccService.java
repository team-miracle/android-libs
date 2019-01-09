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
* limitations under the License.
*/
package android.service.euicc;
public abstract class EuiccService
  extends android.app.Service
{
public abstract static class OtaStatusChangedCallback
{
public  OtaStatusChangedCallback() { throw new RuntimeException("Stub!"); }
public abstract  void onOtaStatusChanged(int status);
}
public  EuiccService() { throw new RuntimeException("Stub!"); }
public  void onCreate() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String onGetEid(int slotId);
@android.telephony.euicc.EuiccManager.OtaStatus()
public abstract  int onGetOtaStatus(int slotId);
public abstract  void onStartOtaIfNecessary(int slotId, android.service.euicc.EuiccService.OtaStatusChangedCallback statusChangedCallback);
public abstract  android.service.euicc.GetDownloadableSubscriptionMetadataResult onGetDownloadableSubscriptionMetadata(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean forceDeactivateSim);
public abstract  android.service.euicc.GetDefaultDownloadableSubscriptionListResult onGetDefaultDownloadableSubscriptionList(int slotId, boolean forceDeactivateSim);
public abstract  int onDownloadSubscription(int slotId, android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, boolean forceDeactivateSim);
public abstract  android.service.euicc.GetEuiccProfileInfoListResult onGetEuiccProfileInfoList(int slotId);
public abstract  android.telephony.euicc.EuiccInfo onGetEuiccInfo(int slotId);
public abstract  int onDeleteSubscription(int slotId, java.lang.String iccid);
public abstract  int onSwitchToSubscription(int slotId, java.lang.String iccid, boolean forceDeactivateSim);
public abstract  int onUpdateSubscriptionNickname(int slotId, java.lang.String iccid, java.lang.String nickname);
public abstract  int onEraseSubscriptions(int slotId);
public abstract  int onRetainSubscriptionsForFactoryReset(int slotId);
public static final java.lang.String ACTION_MANAGE_EMBEDDED_SUBSCRIPTIONS = "android.service.euicc.action.MANAGE_EMBEDDED_SUBSCRIPTIONS";
public static final java.lang.String ACTION_PROVISION_EMBEDDED_SUBSCRIPTION = "android.service.euicc.action.PROVISION_EMBEDDED_SUBSCRIPTION";
public static final java.lang.String ACTION_RESOLVE_CONFIRMATION_CODE = "android.service.euicc.action.RESOLVE_CONFIRMATION_CODE";
public static final java.lang.String ACTION_RESOLVE_DEACTIVATE_SIM = "android.service.euicc.action.RESOLVE_DEACTIVATE_SIM";
public static final java.lang.String ACTION_RESOLVE_NO_PRIVILEGES = "android.service.euicc.action.RESOLVE_NO_PRIVILEGES";
public static final java.lang.String CATEGORY_EUICC_UI = "android.service.euicc.category.EUICC_UI";
public static final java.lang.String EUICC_SERVICE_INTERFACE = "android.service.euicc.EuiccService";
public static final java.lang.String EXTRA_RESOLUTION_CALLING_PACKAGE = "android.service.euicc.extra.RESOLUTION_CALLING_PACKAGE";
public static final java.lang.String EXTRA_RESOLUTION_CONFIRMATION_CODE = "android.service.euicc.extra.RESOLUTION_CONFIRMATION_CODE";
public static final java.lang.String EXTRA_RESOLUTION_CONFIRMATION_CODE_RETRIED = "android.service.euicc.extra.RESOLUTION_CONFIRMATION_CODE_RETRIED";
public static final java.lang.String EXTRA_RESOLUTION_CONSENT = "android.service.euicc.extra.RESOLUTION_CONSENT";
public static final int RESULT_FIRST_USER = 1;
public static final int RESULT_MUST_DEACTIVATE_SIM = -1;
public static final int RESULT_NEED_CONFIRMATION_CODE = -2;
public static final int RESULT_OK = 0;
}
