/*
* Copyright (C) 2012 The Android Open Source Project
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
public class TaskStackBuilder
{
TaskStackBuilder() { throw new RuntimeException("Stub!"); }
public static  android.app.TaskStackBuilder create(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.app.TaskStackBuilder addNextIntent(android.content.Intent nextIntent) { throw new RuntimeException("Stub!"); }
public  android.app.TaskStackBuilder addNextIntentWithParentStack(android.content.Intent nextIntent) { throw new RuntimeException("Stub!"); }
public  android.app.TaskStackBuilder addParentStack(android.app.Activity sourceActivity) { throw new RuntimeException("Stub!"); }
public  android.app.TaskStackBuilder addParentStack(java.lang.Class<?> sourceActivityClass) { throw new RuntimeException("Stub!"); }
public  android.app.TaskStackBuilder addParentStack(android.content.ComponentName sourceActivityName) { throw new RuntimeException("Stub!"); }
public  int getIntentCount() { throw new RuntimeException("Stub!"); }
public  android.content.Intent editIntentAt(int index) { throw new RuntimeException("Stub!"); }
public  void startActivities() { throw new RuntimeException("Stub!"); }
public  void startActivities(android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getPendingIntent(int requestCode, int flags) { throw new RuntimeException("Stub!"); }
public  android.app.PendingIntent getPendingIntent(int requestCode, int flags, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  android.content.Intent[] getIntents() { throw new RuntimeException("Stub!"); }
}
