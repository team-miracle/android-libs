/*
* Copyright (C) 2007-2008 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy of
* the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations under
* the License.
*/

package android.view.inputmethod;
public interface InputMethod
{
public static interface SessionCallback
{
public abstract  void sessionCreated(android.view.inputmethod.InputMethodSession session);
}
public abstract  void attachToken(android.os.IBinder token);
public abstract  void bindInput(android.view.inputmethod.InputBinding binding);
public abstract  void unbindInput();
public abstract  void startInput(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo info);
public abstract  void restartInput(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo attribute);
public abstract  void createSession(android.view.inputmethod.InputMethod.SessionCallback callback);
public abstract  void setSessionEnabled(android.view.inputmethod.InputMethodSession session, boolean enabled);
public abstract  void revokeSession(android.view.inputmethod.InputMethodSession session);
public abstract  void showSoftInput(int flags, android.os.ResultReceiver resultReceiver);
public abstract  void hideSoftInput(int flags, android.os.ResultReceiver resultReceiver);
public abstract  void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype subtype);
public static final java.lang.String SERVICE_INTERFACE = "android.view.InputMethod";
public static final java.lang.String SERVICE_META_DATA = "android.view.im";
public static final int SHOW_EXPLICIT = 1;
public static final int SHOW_FORCED = 2;
}
