/*
* Copyright (C) 2015 The Android Open Source Project
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
public abstract class NotificationAssistantService
  extends android.service.notification.NotificationListenerService
{
public  NotificationAssistantService() { throw new RuntimeException("Stub!"); }
protected  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public abstract  void onNotificationSnoozedUntilContext(android.service.notification.StatusBarNotification sbn, java.lang.String snoozeCriterionId);
public abstract  android.service.notification.Adjustment onNotificationEnqueued(android.service.notification.StatusBarNotification sbn);
public  void onNotificationRemoved(android.service.notification.StatusBarNotification sbn, android.service.notification.NotificationListenerService.RankingMap rankingMap, android.service.notification.NotificationStats stats, int reason) { throw new RuntimeException("Stub!"); }
public final  void adjustNotification(android.service.notification.Adjustment adjustment) { throw new RuntimeException("Stub!"); }
public final  void adjustNotifications(java.util.List<android.service.notification.Adjustment> adjustments) { throw new RuntimeException("Stub!"); }
public final  void unsnoozeNotification(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.NotificationAssistantService";
}
