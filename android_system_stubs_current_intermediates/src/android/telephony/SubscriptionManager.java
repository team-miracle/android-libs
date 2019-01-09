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

package android.telephony;
public class SubscriptionManager
{
public static class OnSubscriptionsChangedListener
{
public  OnSubscriptionsChangedListener() { throw new RuntimeException("Stub!"); }
public  void onSubscriptionsChanged() { throw new RuntimeException("Stub!"); }
}
SubscriptionManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.telephony.SubscriptionManager from(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void addOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeOnSubscriptionsChangedListener(android.telephony.SubscriptionManager.OnSubscriptionsChangedListener listener) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionInfo getActiveSubscriptionInfo(int subId) { throw new RuntimeException("Stub!"); }
public  android.telephony.SubscriptionInfo getActiveSubscriptionInfoForSimSlotIndex(int slotIndex) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.SubscriptionInfo> getActiveSubscriptionInfoList() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.SubscriptionInfo> getAvailableSubscriptionInfoList() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.SubscriptionInfo> getAccessibleSubscriptionInfoList() { throw new RuntimeException("Stub!"); }
public  void requestEmbeddedSubscriptionInfoListRefresh() { throw new RuntimeException("Stub!"); }
public  int getActiveSubscriptionInfoCount() { throw new RuntimeException("Stub!"); }
public  int getActiveSubscriptionInfoCountMax() { throw new RuntimeException("Stub!"); }
public static  int getDefaultSubscriptionId() { throw new RuntimeException("Stub!"); }
public static  int getDefaultVoiceSubscriptionId() { throw new RuntimeException("Stub!"); }
public static  int getDefaultSmsSubscriptionId() { throw new RuntimeException("Stub!"); }
public static  int getDefaultDataSubscriptionId() { throw new RuntimeException("Stub!"); }
public  boolean isNetworkRoaming(int subId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.telephony.SubscriptionPlan> getSubscriptionPlans(int subId) { throw new RuntimeException("Stub!"); }
public  void setSubscriptionPlans(int subId, java.util.List<android.telephony.SubscriptionPlan> plans) { throw new RuntimeException("Stub!"); }
public  void setSubscriptionOverrideUnmetered(int subId, boolean overrideUnmetered, long timeoutMillis) { throw new RuntimeException("Stub!"); }
public  void setSubscriptionOverrideCongested(int subId, boolean overrideCongested, long timeoutMillis) { throw new RuntimeException("Stub!"); }
public  boolean canManageSubscription(android.telephony.SubscriptionInfo info) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_DEFAULT_SMS_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED";
public static final java.lang.String ACTION_DEFAULT_SUBSCRIPTION_CHANGED = "android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED";
public static final java.lang.String ACTION_MANAGE_SUBSCRIPTION_PLANS = "android.telephony.action.MANAGE_SUBSCRIPTION_PLANS";
public static final java.lang.String ACTION_REFRESH_SUBSCRIPTION_PLANS = "android.telephony.action.REFRESH_SUBSCRIPTION_PLANS";
public static final int DATA_ROAMING_DISABLE = 0;
public static final int DATA_ROAMING_ENABLE = 1;
public static final java.lang.String EXTRA_SUBSCRIPTION_INDEX = "android.telephony.extra.SUBSCRIPTION_INDEX";
public static final int INVALID_SUBSCRIPTION_ID = -1;
}
