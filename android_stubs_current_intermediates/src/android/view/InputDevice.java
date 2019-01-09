/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.view;
public final class InputDevice
  implements android.os.Parcelable
{
public static final class MotionRange
{
MotionRange() { throw new RuntimeException("Stub!"); }
public  int getAxis() { throw new RuntimeException("Stub!"); }
public  int getSource() { throw new RuntimeException("Stub!"); }
public  boolean isFromSource(int source) { throw new RuntimeException("Stub!"); }
public  float getMin() { throw new RuntimeException("Stub!"); }
public  float getMax() { throw new RuntimeException("Stub!"); }
public  float getRange() { throw new RuntimeException("Stub!"); }
public  float getFlat() { throw new RuntimeException("Stub!"); }
public  float getFuzz() { throw new RuntimeException("Stub!"); }
public  float getResolution() { throw new RuntimeException("Stub!"); }
}
InputDevice() { throw new RuntimeException("Stub!"); }
public static  android.view.InputDevice getDevice(int id) { throw new RuntimeException("Stub!"); }
public static  int[] getDeviceIds() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  int getControllerNumber() { throw new RuntimeException("Stub!"); }
public  int getVendorId() { throw new RuntimeException("Stub!"); }
public  int getProductId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDescriptor() { throw new RuntimeException("Stub!"); }
public  boolean isVirtual() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int getSources() { throw new RuntimeException("Stub!"); }
public  boolean supportsSource(int source) { throw new RuntimeException("Stub!"); }
public  int getKeyboardType() { throw new RuntimeException("Stub!"); }
public  android.view.KeyCharacterMap getKeyCharacterMap() { throw new RuntimeException("Stub!"); }
public  boolean[] hasKeys(int... keys) { throw new RuntimeException("Stub!"); }
public  android.view.InputDevice.MotionRange getMotionRange(int axis) { throw new RuntimeException("Stub!"); }
public  android.view.InputDevice.MotionRange getMotionRange(int axis, int source) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.InputDevice.MotionRange> getMotionRanges() { throw new RuntimeException("Stub!"); }
public  android.os.Vibrator getVibrator() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean hasMicrophone() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.view.InputDevice> CREATOR;
public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
public static final int KEYBOARD_TYPE_NONE = 0;
public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
@java.lang.Deprecated()
public static final int MOTION_RANGE_ORIENTATION = 8;
@java.lang.Deprecated()
public static final int MOTION_RANGE_PRESSURE = 2;
@java.lang.Deprecated()
public static final int MOTION_RANGE_SIZE = 3;
@java.lang.Deprecated()
public static final int MOTION_RANGE_TOOL_MAJOR = 6;
@java.lang.Deprecated()
public static final int MOTION_RANGE_TOOL_MINOR = 7;
@java.lang.Deprecated()
public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
@java.lang.Deprecated()
public static final int MOTION_RANGE_TOUCH_MINOR = 5;
@java.lang.Deprecated()
public static final int MOTION_RANGE_X = 0;
@java.lang.Deprecated()
public static final int MOTION_RANGE_Y = 1;
public static final int SOURCE_ANY = -256;
public static final int SOURCE_BLUETOOTH_STYLUS = 49154;
public static final int SOURCE_CLASS_BUTTON = 1;
public static final int SOURCE_CLASS_JOYSTICK = 16;
public static final int SOURCE_CLASS_MASK = 255;
public static final int SOURCE_CLASS_NONE = 0;
public static final int SOURCE_CLASS_POINTER = 2;
public static final int SOURCE_CLASS_POSITION = 8;
public static final int SOURCE_CLASS_TRACKBALL = 4;
public static final int SOURCE_DPAD = 513;
public static final int SOURCE_GAMEPAD = 1025;
public static final int SOURCE_HDMI = 33554433;
public static final int SOURCE_JOYSTICK = 16777232;
public static final int SOURCE_KEYBOARD = 257;
public static final int SOURCE_MOUSE = 8194;
public static final int SOURCE_MOUSE_RELATIVE = 131076;
public static final int SOURCE_ROTARY_ENCODER = 4194304;
public static final int SOURCE_STYLUS = 16386;
public static final int SOURCE_TOUCHPAD = 1048584;
public static final int SOURCE_TOUCHSCREEN = 4098;
public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
public static final int SOURCE_TRACKBALL = 65540;
public static final int SOURCE_UNKNOWN = 0;
static { CREATOR = null; }
}
