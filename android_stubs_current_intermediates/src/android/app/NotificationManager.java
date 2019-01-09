/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.app;
public class NotificationManager
{
public static class Policy
  implements android.os.Parcelable
{
public  Policy(int priorityCategories, int priorityCallSenders, int priorityMessageSenders) { throw new RuntimeException("Stub!"); }
public  Policy(int priorityCategories, int priorityCallSenders, int priorityMessageSenders, int suppressedVisualEffects) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String suppressedEffectsToString(int effects) { throw new RuntimeException("Stub!"); }
public static  java.lang.String priorityCategoriesToString(int priorityCategories) { throw new RuntimeException("Stub!"); }
public static  java.lang.String prioritySendersToString(int prioritySenders) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.NotificationManager.Policy> CREATOR;
public static final int PRIORITY_CATEGORY_ALARMS = 32;
public static final int PRIORITY_CATEGORY_CALLS = 8;
public static final int PRIORITY_CATEGORY_EVENTS = 2;
public static final int PRIORITY_CATEGORY_MEDIA = 64;
public static final int PRIORITY_CATEGORY_MESSAGES = 4;
public static final int PRIORITY_CATEGORY_REMINDERS = 1;
public static final int PRIORITY_CATEGORY_REPEAT_CALLERS = 16;
public static final int PRIORITY_CATEGORY_SYSTEM = 128;
public static final int PRIORITY_SENDERS_ANY = 0;
public static final int PRIORITY_SENDERS_CONTACTS = 1;
public static final int PRIORITY_SENDERS_STARRED = 2;
public static final int SUPPRESSED_EFFECT_AMBIENT = 128;
public static final int SUPPRESSED_EFFECT_BADGE = 64;
public static final int SUPPRESSED_EFFECT_FULL_SCREEN_INTENT = 4;
public static final int SUPPRESSED_EFFECT_LIGHTS = 8;
public static final int SUPPRESSED_EFFECT_NOTIFICATION_LIST = 256;
public static final int SUPPRESSED_EFFECT_PEEK = 16;
@java.lang.Deprecated()
public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
@java.lang.Deprecated()
public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
public static final int SUPPRESSED_EFFECT_STATUS_BAR = 32;
public final int priorityCallSenders;
public final int priorityCategories;
public final int priorityMessageSenders;
public final int suppressedVisualEffects;
static { CREATOR = null; }
}
NotificationManager() { throw new RuntimeException("Stub!"); }
public  void notify(int id, android.app.Notification notification) { throw new RuntimeException("Stub!"); }
public  void notify(java.lang.String tag, int id, android.app.Notification notification) { throw new RuntimeException("Stub!"); }
public  void cancel(int id) { throw new RuntimeException("Stub!"); }
public  void cancel(java.lang.String tag, int id) { throw new RuntimeException("Stub!"); }
public  void cancelAll() { throw new RuntimeException("Stub!"); }
public  void createNotificationChannelGroup(android.app.NotificationChannelGroup group) { throw new RuntimeException("Stub!"); }
public  void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> groups) { throw new RuntimeException("Stub!"); }
public  void createNotificationChannel(android.app.NotificationChannel channel) { throw new RuntimeException("Stub!"); }
public  void createNotificationChannels(java.util.List<android.app.NotificationChannel> channels) { throw new RuntimeException("Stub!"); }
public  android.app.NotificationChannel getNotificationChannel(java.lang.String channelId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.NotificationChannel> getNotificationChannels() { throw new RuntimeException("Stub!"); }
public  void deleteNotificationChannel(java.lang.String channelId) { throw new RuntimeException("Stub!"); }
public  android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String channelGroupId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() { throw new RuntimeException("Stub!"); }
public  void deleteNotificationChannelGroup(java.lang.String groupId) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, android.app.AutomaticZenRule> getAutomaticZenRules() { throw new RuntimeException("Stub!"); }
public  android.app.AutomaticZenRule getAutomaticZenRule(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  java.lang.String addAutomaticZenRule(android.app.AutomaticZenRule automaticZenRule) { throw new RuntimeException("Stub!"); }
public  boolean updateAutomaticZenRule(java.lang.String id, android.app.AutomaticZenRule automaticZenRule) { throw new RuntimeException("Stub!"); }
public  boolean removeAutomaticZenRule(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  int getImportance() { throw new RuntimeException("Stub!"); }
public  boolean areNotificationsEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isNotificationPolicyAccessGranted() { throw new RuntimeException("Stub!"); }
public  boolean isNotificationListenerAccessGranted(android.content.ComponentName listener) { throw new RuntimeException("Stub!"); }
public  android.app.NotificationManager.Policy getNotificationPolicy() { throw new RuntimeException("Stub!"); }
public  void setNotificationPolicy(android.app.NotificationManager.Policy policy) { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); }
public final  int getCurrentInterruptionFilter() { throw new RuntimeException("Stub!"); }
public final  void setInterruptionFilter(int interruptionFilter) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_APP_BLOCK_STATE_CHANGED = "android.app.action.APP_BLOCK_STATE_CHANGED";
public static final java.lang.String ACTION_INTERRUPTION_FILTER_CHANGED = "android.app.action.INTERRUPTION_FILTER_CHANGED";
public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED";
public static final java.lang.String ACTION_NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED = "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED";
public static final java.lang.String ACTION_NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED = "android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED";
public static final java.lang.String ACTION_NOTIFICATION_POLICY_CHANGED = "android.app.action.NOTIFICATION_POLICY_CHANGED";
public static final java.lang.String EXTRA_BLOCKED_STATE = "android.app.extra.BLOCKED_STATE";
public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_GROUP_ID = "android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID";
public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL_ID = "android.app.extra.NOTIFICATION_CHANNEL_ID";
public static final int IMPORTANCE_DEFAULT = 3;
public static final int IMPORTANCE_HIGH = 4;
public static final int IMPORTANCE_LOW = 2;
public static final int IMPORTANCE_MAX = 5;
public static final int IMPORTANCE_MIN = 1;
public static final int IMPORTANCE_NONE = 0;
public static final int IMPORTANCE_UNSPECIFIED = -1000;
public static final int INTERRUPTION_FILTER_ALARMS = 4;
public static final int INTERRUPTION_FILTER_ALL = 1;
public static final int INTERRUPTION_FILTER_NONE = 3;
public static final int INTERRUPTION_FILTER_PRIORITY = 2;
public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
}
