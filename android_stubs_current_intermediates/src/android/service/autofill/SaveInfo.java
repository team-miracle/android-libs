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

package android.service.autofill;
public final class SaveInfo
  implements android.os.Parcelable
{
public static final class Builder
{
public  Builder(int type, android.view.autofill.AutofillId[] requiredIds) { throw new RuntimeException("Stub!"); }
public  Builder(int type) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setOptionalIds(android.view.autofill.AutofillId[] ids) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setDescription(java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setCustomDescription(android.service.autofill.CustomDescription customDescription) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setNegativeAction(int style, android.content.IntentSender listener) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setValidator(android.service.autofill.Validator validator) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder addSanitizer(android.service.autofill.Sanitizer sanitizer, android.view.autofill.AutofillId... ids) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo.Builder setTriggerId(android.view.autofill.AutofillId id) { throw new RuntimeException("Stub!"); }
public  android.service.autofill.SaveInfo build() { throw new RuntimeException("Stub!"); }
}
SaveInfo() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.service.autofill.SaveInfo> CREATOR;
public static final int FLAG_DONT_SAVE_ON_FINISH = 2;
public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = 1;
public static final int NEGATIVE_BUTTON_STYLE_CANCEL = 0;
public static final int NEGATIVE_BUTTON_STYLE_REJECT = 1;
public static final int SAVE_DATA_TYPE_ADDRESS = 2;
public static final int SAVE_DATA_TYPE_CREDIT_CARD = 4;
public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = 16;
public static final int SAVE_DATA_TYPE_GENERIC = 0;
public static final int SAVE_DATA_TYPE_PASSWORD = 1;
public static final int SAVE_DATA_TYPE_USERNAME = 8;
static { CREATOR = null; }
}
