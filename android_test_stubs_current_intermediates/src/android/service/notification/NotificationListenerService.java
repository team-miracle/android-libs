/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.service.notification;
public abstract class NotificationListenerService
  extends android.app.Service
{
public static class Ranking
{
public  Ranking() { throw new RuntimeException("Stub!"); }
public  java.lang.String getKey() { throw new RuntimeException("Stub!"); }
public  int getRank() { throw new RuntimeException("Stub!"); }
public  boolean isAmbient() { throw new RuntimeException("Stub!"); }
public  int getSuppressedVisualEffects() { throw new RuntimeException("Stub!"); }
public  boolean matchesInterruptionFilter() { throw new RuntimeException("Stub!"); }
public  int getImportance() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getImportanceExplanation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOverrideGroupKey() { throw new RuntimeException("Stub!"); }
public  android.app.NotificationChannel getChannel() { throw new RuntimeException("Stub!"); }
public  int getUserSentiment() { throw new RuntimeException("Stub!"); }
public  boolean canShowBadge() { throw new RuntimeException("Stub!"); }
public  boolean isSuspended() { throw new RuntimeException("Stub!"); }
public static final int USER_SENTIMENT_NEGATIVE = -1;
public static final int USER_SENTIMENT_NEUTRAL = 0;
public static final int USER_SENTIMENT_POSITIVE = 1;
}
public static class RankingMap
  implements android.os.Parcelable
{
RankingMap() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getOrderedKeys() { throw new RuntimeException("Stub!"); }
public  boolean getRanking(java.lang.String key, android.service.notification.NotificationListenerService.Ranking outRanking) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.notification.NotificationListenerService.RankingMap> CREATOR;
static { CREATOR = null; }
}
public  NotificationListenerService() { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public  void onNotificationPosted(android.service.notification.StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
public  void onNotificationPosted(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap, int reason) { throw new RuntimeException("Stub!"); }
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap, android.service.notification.NotificationStats stats, int reason) { throw new RuntimeException("Stub!"); }
public  void onListenerConnected() { throw new RuntimeException("Stub!"); }
public  void onListenerDisconnected() { throw new RuntimeException("Stub!"); }
public  void onNotificationRankingUpdate(android.service.notification.NotificationListenerService.RankingMap rankingMap) { throw new RuntimeException("Stub!"); }
public  void onListenerHintsChanged(int hints) { throw new RuntimeException("Stub!"); }
public  void onNotificationChannelModified(java.lang.String pkg, android.os.UserHandle user, android.app.NotificationChannel channel, int modificationType) { throw new RuntimeException("Stub!"); }
public  void onNotificationChannelGroupModified(java.lang.String pkg, android.os.UserHandle user, android.app.NotificationChannelGroup group, int modificationType) { throw new RuntimeException("Stub!"); }
public  void onInterruptionFilterChanged(int interruptionFilter) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public final  void cancelNotification(java.lang.String pkg, java.lang.String tag, int id) { throw new RuntimeException("Stub!"); }
public final  void cancelNotification(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  void cancelAllNotifications() { throw new RuntimeException("Stub!"); }
public final  void cancelNotifications(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public final  void snoozeNotification(java.lang.String key, long durationMs) { throw new RuntimeException("Stub!"); }
public final  void setNotificationsShown(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public final  void updateNotificationChannel(java.lang.String pkg, android.os.UserHandle user, android.app.NotificationChannel channel) { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.app.NotificationChannel> getNotificationChannels(java.lang.String pkg, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public final  java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups(java.lang.String pkg, android.os.UserHandle user) { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification[] getActiveNotifications() { throw new RuntimeException("Stub!"); }
public final  android.service.notification.StatusBarNotification[] getSnoozedNotifications() { throw new RuntimeException("Stub!"); }
public  android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String[] keys) { throw new RuntimeException("Stub!"); }
public final  int getCurrentListenerHints() { throw new RuntimeException("Stub!"); }
public final  int getCurrentInterruptionFilter() { throw new RuntimeException("Stub!"); }
public final  void requestListenerHints(int hints) { throw new RuntimeException("Stub!"); }
public final  void requestInterruptionFilter(int interruptionFilter) { throw new RuntimeException("Stub!"); }
public  android.service.notification.NotificationListenerService.RankingMap getCurrentRanking() { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public static  void requestRebind(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public final  void requestUnbind() { throw new RuntimeException("Stub!"); }
public static final int HINT_HOST_DISABLE_CALL_EFFECTS = 4;
public static final int HINT_HOST_DISABLE_EFFECTS = 1;
public static final int HINT_HOST_DISABLE_NOTIFICATION_EFFECTS = 2;
public static final int INTERRUPTION_FILTER_ALARMS = 4;
public static final int INTERRUPTION_FILTER_ALL = 1;
public static final int INTERRUPTION_FILTER_NONE = 3;
public static final int INTERRUPTION_FILTER_PRIORITY = 2;
public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
public static final int NOTIFICATION_CHANNEL_OR_GROUP_ADDED = 1;
public static final int NOTIFICATION_CHANNEL_OR_GROUP_DELETED = 3;
public static final int NOTIFICATION_CHANNEL_OR_GROUP_UPDATED = 2;
public static final int REASON_APP_CANCEL = 8;
public static final int REASON_APP_CANCEL_ALL = 9;
public static final int REASON_CANCEL = 2;
public static final int REASON_CANCEL_ALL = 3;
public static final int REASON_CHANNEL_BANNED = 17;
public static final int REASON_CLICK = 1;
public static final int REASON_ERROR = 4;
public static final int REASON_GROUP_OPTIMIZATION = 13;
public static final int REASON_GROUP_SUMMARY_CANCELED = 12;
public static final int REASON_LISTENER_CANCEL = 10;
public static final int REASON_LISTENER_CANCEL_ALL = 11;
public static final int REASON_PACKAGE_BANNED = 7;
public static final int REASON_PACKAGE_CHANGED = 5;
public static final int REASON_PACKAGE_SUSPENDED = 14;
public static final int REASON_PROFILE_TURNED_OFF = 15;
public static final int REASON_SNOOZED = 18;
public static final int REASON_TIMEOUT = 19;
public static final int REASON_UNAUTOBUNDLED = 16;
public static final int REASON_USER_STOPPED = 6;
public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationListenerService";
@java.lang.Deprecated()
public static final int SUPPRESSED_EFFECT_SCREEN_OFF = 1;
@java.lang.Deprecated()
public static final int SUPPRESSED_EFFECT_SCREEN_ON = 2;
}
