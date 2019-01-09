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
package android.telephony.euicc;
public class EuiccManager
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface OtaStatus
{
}
EuiccManager() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEid() { throw new RuntimeException("Stub!"); }
public  int getOtaStatus() { throw new RuntimeException("Stub!"); }
public  void downloadSubscription(android.telephony.euicc.DownloadableSubscription subscription, boolean switchAfterDownload, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void startResolutionActivity(android.app.Activity activity, int requestCode, android.content.Intent resultIntent, android.app.PendingIntent callbackIntent) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void continueOperation(android.content.Intent resolutionIntent, android.os.Bundle resolutionExtras) { throw new RuntimeException("Stub!"); }
public  void getDownloadableSubscriptionMetadata(android.telephony.euicc.DownloadableSubscription subscription, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void getDefaultDownloadableSubscriptionList(android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  android.telephony.euicc.EuiccInfo getEuiccInfo() { throw new RuntimeException("Stub!"); }
public  void deleteSubscription(int subscriptionId, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void switchToSubscription(int subscriptionId, android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public  void eraseSubscriptions(android.app.PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_MANAGE_EMBEDDED_SUBSCRIPTIONS = "android.telephony.euicc.action.MANAGE_EMBEDDED_SUBSCRIPTIONS";
public static final java.lang.String ACTION_NOTIFY_CARRIER_SETUP_INCOMPLETE = "android.telephony.euicc.action.NOTIFY_CARRIER_SETUP_INCOMPLETE";
public static final java.lang.String ACTION_OTA_STATUS_CHANGED = "android.telephony.euicc.action.OTA_STATUS_CHANGED";
public static final java.lang.String ACTION_PROVISION_EMBEDDED_SUBSCRIPTION = "android.telephony.euicc.action.PROVISION_EMBEDDED_SUBSCRIPTION";
public static final int EMBEDDED_SUBSCRIPTION_RESULT_ERROR = 2;
public static final int EMBEDDED_SUBSCRIPTION_RESULT_OK = 0;
public static final int EMBEDDED_SUBSCRIPTION_RESULT_RESOLVABLE_ERROR = 1;
public static final int EUICC_OTA_FAILED = 2;
public static final int EUICC_OTA_IN_PROGRESS = 1;
public static final int EUICC_OTA_NOT_NEEDED = 4;
public static final int EUICC_OTA_STATUS_UNAVAILABLE = 5;
public static final int EUICC_OTA_SUCCEEDED = 3;
public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DETAILED_CODE = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DETAILED_CODE";
public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTION = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTION";
public static final java.lang.String EXTRA_EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTIONS = "android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DOWNLOADABLE_SUBSCRIPTIONS";
public static final java.lang.String META_DATA_CARRIER_ICON = "android.telephony.euicc.carriericon";
}
