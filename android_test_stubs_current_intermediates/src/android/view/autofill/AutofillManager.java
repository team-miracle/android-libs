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

package android.view.autofill;
public final class AutofillManager
{
public abstract static class AutofillCallback
{
public  AutofillCallback() { throw new RuntimeException("Stub!"); }
public  void onAutofillEvent(android.view.View view, int event) { throw new RuntimeException("Stub!"); }
public  void onAutofillEvent(android.view.View view, int virtualId, int event) { throw new RuntimeException("Stub!"); }
public static final int EVENT_INPUT_HIDDEN = 2;
public static final int EVENT_INPUT_SHOWN = 1;
public static final int EVENT_INPUT_UNAVAILABLE = 3;
}
AutofillManager() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void requestAutofill(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void requestAutofill(android.view.View view, int virtualId, android.graphics.Rect absBounds) { throw new RuntimeException("Stub!"); }
public  void notifyViewEntered(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void notifyViewExited(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void notifyViewVisibilityChanged(android.view.View view, boolean isVisible) { throw new RuntimeException("Stub!"); }
public  void notifyViewVisibilityChanged(android.view.View view, int virtualId, boolean isVisible) { throw new RuntimeException("Stub!"); }
public  void notifyViewEntered(android.view.View view, int virtualId, android.graphics.Rect absBounds) { throw new RuntimeException("Stub!"); }
public  void notifyViewExited(android.view.View view, int virtualId) { throw new RuntimeException("Stub!"); }
public  void notifyValueChanged(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void notifyValueChanged(android.view.View view, int virtualId, android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  void notifyViewClicked(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void notifyViewClicked(android.view.View view, int virtualId) { throw new RuntimeException("Stub!"); }
public  void commit() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  void disableAutofillServices() { throw new RuntimeException("Stub!"); }
public  boolean hasEnabledAutofillServices() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getAutofillServiceComponentName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUserDataId() { throw new RuntimeException("Stub!"); }
public  android.service.autofill.UserData getUserData() { throw new RuntimeException("Stub!"); }
public  void setUserData(android.service.autofill.UserData userData) { throw new RuntimeException("Stub!"); }
public  boolean isFieldClassificationEnabled() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultFieldClassificationAlgorithm() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAvailableFieldClassificationAlgorithms() { throw new RuntimeException("Stub!"); }
public  boolean isAutofillSupported() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillId getNextAutofillId() { throw new RuntimeException("Stub!"); }
public  void registerCallback(android.view.autofill.AutofillManager.AutofillCallback callback) { throw new RuntimeException("Stub!"); }
public  void unregisterCallback(android.view.autofill.AutofillManager.AutofillCallback callback) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
public static final java.lang.String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
}
