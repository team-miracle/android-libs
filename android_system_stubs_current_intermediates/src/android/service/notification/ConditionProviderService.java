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

package android.service.notification;
public abstract class ConditionProviderService
  extends android.app.Service
{
public  ConditionProviderService() { throw new RuntimeException("Stub!"); }
public abstract  void onConnected();
public  void onRequestConditions(int relevance) { throw new RuntimeException("Stub!"); }
public abstract  void onSubscribe(android.net.Uri conditionId);
public abstract  void onUnsubscribe(android.net.Uri conditionId);
public static final  void requestRebind(android.content.ComponentName componentName) { throw new RuntimeException("Stub!"); }
public final  void requestUnbind() { throw new RuntimeException("Stub!"); }
public final  void notifyCondition(android.service.notification.Condition condition) { throw new RuntimeException("Stub!"); }
public final  void notifyConditions(android.service.notification.Condition... conditions) { throw new RuntimeException("Stub!"); }
public  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_RULE_ID = "android.service.notification.extra.RULE_ID";
public static final java.lang.String META_DATA_CONFIGURATION_ACTIVITY = "android.service.zen.automatic.configurationActivity";
public static final java.lang.String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
public static final java.lang.String META_DATA_RULE_TYPE = "android.service.zen.automatic.ruleType";
public static final java.lang.String SERVICE_INTERFACE = "android.service.notification.ConditionProviderService";
}
