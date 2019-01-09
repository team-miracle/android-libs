/*
* Copyright (C) 2006 The Android Open Source Project
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
public final class PendingIntent
  implements android.os.Parcelable
{
public static class CanceledException
  extends android.util.AndroidException
{
public  CanceledException() { throw new RuntimeException("Stub!"); }
public  CanceledException(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  CanceledException(java.lang.Exception cause) { throw new RuntimeException("Stub!"); }
}
public static interface OnFinished
{
public abstract  void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int resultCode, java.lang.String resultData, android.os.Bundle resultExtras);
}
PendingIntent() { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getActivity(android.content.Context context, int requestCode, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getActivity(android.content.Context context, int requestCode, android.content.Intent intent, int flags, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getActivities(android.content.Context context, int requestCode, android.content.Intent[] intents, int flags) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getActivities(android.content.Context context, int requestCode, android.content.Intent[] intents, int flags, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getBroadcast(android.content.Context context, int requestCode, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getService(android.content.Context context, int requestCode, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent getForegroundService(android.content.Context context, int requestCode, android.content.Intent intent, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.IntentSender getIntentSender() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void send() throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(int code) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(android.content.Context context, int code, android.content.Intent intent) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(int code, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(android.content.Context context, int code, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(android.content.Context context, int code, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler, java.lang.String requiredPermission) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
public  void send(android.content.Context context, int code, android.content.Intent intent, android.app.PendingIntent.OnFinished onFinished, android.os.Handler handler, java.lang.String requiredPermission, android.os.Bundle options) throws android.app.PendingIntent.CanceledException { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.lang.String getTargetPackage() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCreatorPackage() { throw new RuntimeException("Stub!"); }
public  int getCreatorUid() { throw new RuntimeException("Stub!"); }
public  android.os.UserHandle getCreatorUserHandle() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherObj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static  void writePendingIntentOrNullToParcel(android.app.PendingIntent sender, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.app.PendingIntent readPendingIntentOrNullFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.PendingIntent> CREATOR;
public static final int FLAG_CANCEL_CURRENT = 268435456;
public static final int FLAG_IMMUTABLE = 67108864;
public static final int FLAG_NO_CREATE = 536870912;
public static final int FLAG_ONE_SHOT = 1073741824;
public static final int FLAG_UPDATE_CURRENT = 134217728;
static { CREATOR = null; }
}
