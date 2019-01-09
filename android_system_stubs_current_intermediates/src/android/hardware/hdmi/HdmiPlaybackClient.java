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

package android.hardware.hdmi;
public final class HdmiPlaybackClient
  extends android.hardware.hdmi.HdmiClient
{
public static interface OneTouchPlayCallback
{
public abstract  void onComplete(int result);
}
public static interface DisplayStatusCallback
{
public abstract  void onComplete(int status);
}
HdmiPlaybackClient() { throw new RuntimeException("Stub!"); }
public  void oneTouchPlay(android.hardware.hdmi.HdmiPlaybackClient.OneTouchPlayCallback callback) { throw new RuntimeException("Stub!"); }
public  int getDeviceType() { throw new RuntimeException("Stub!"); }
public  void queryDisplayStatus(android.hardware.hdmi.HdmiPlaybackClient.DisplayStatusCallback callback) { throw new RuntimeException("Stub!"); }
public  void sendStandby() { throw new RuntimeException("Stub!"); }
}
