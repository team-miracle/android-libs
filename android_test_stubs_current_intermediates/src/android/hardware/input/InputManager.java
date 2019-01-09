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

package android.hardware.input;
public final class InputManager
{
public static interface InputDeviceListener
{
public abstract  void onInputDeviceAdded(int deviceId);
public abstract  void onInputDeviceRemoved(int deviceId);
public abstract  void onInputDeviceChanged(int deviceId);
}
InputManager() { throw new RuntimeException("Stub!"); }
public  android.view.InputDevice getInputDevice(int id) { throw new RuntimeException("Stub!"); }
public  int[] getInputDeviceIds() { throw new RuntimeException("Stub!"); }
public  void registerInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void unregisterInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
public static final java.lang.String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
}
