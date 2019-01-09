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

package android.content;
public class IntentSender
  implements android.os.Parcelable
{
public static class SendIntentException
  extends android.util.AndroidException
{
public  SendIntentException() { throw new RuntimeException("Stub!"); }
public  SendIntentException(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  SendIntentException(java.lang.Exception cause) { throw new RuntimeException("Stub!"); }
}
public static interface OnFinished
{
public abstract  void onSendFinished(android.content.IntentSender IntentSender, android.content.Intent intent, int resultCode, java.lang.String resultData, android.os.Bundle resultExtras);
}
IntentSender() { throw new RuntimeException("Stub!"); }
public  void sendIntent(android.content.Context context, int code, android.content.Intent intent, android.content.IntentSender.OnFinished onFinished, android.os.Handler handler) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void sendIntent(android.content.Context context, int code, android.content.Intent intent, android.content.IntentSender.OnFinished onFinished, android.os.Handler handler, java.lang.String requiredPermission) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
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
public static  void writeIntentSenderOrNullToParcel(android.content.IntentSender sender, android.os.Parcel out) { throw new RuntimeException("Stub!"); }
public static  android.content.IntentSender readIntentSenderOrNullFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.content.IntentSender> CREATOR;
static { CREATOR = null; }
}
