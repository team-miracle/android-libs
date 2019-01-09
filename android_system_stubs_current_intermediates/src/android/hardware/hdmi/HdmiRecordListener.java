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
public abstract class HdmiRecordListener
{
public static class TimerStatusData
{
TimerStatusData() { throw new RuntimeException("Stub!"); }
public  boolean isOverlapped() { throw new RuntimeException("Stub!"); }
public  int getMediaInfo() { throw new RuntimeException("Stub!"); }
public  boolean isProgrammed() { throw new RuntimeException("Stub!"); }
public  int getProgrammedInfo() { throw new RuntimeException("Stub!"); }
public  int getNotProgammedError() { throw new RuntimeException("Stub!"); }
public  int getDurationHour() { throw new RuntimeException("Stub!"); }
public  int getDurationMinute() { throw new RuntimeException("Stub!"); }
public  int getExtraError() { throw new RuntimeException("Stub!"); }
}
public  HdmiRecordListener() { throw new RuntimeException("Stub!"); }
public abstract  android.hardware.hdmi.HdmiRecordSources.RecordSource onOneTouchRecordSourceRequested(int recorderAddress);
public  void onOneTouchRecordResult(int recorderAddress, int result) { throw new RuntimeException("Stub!"); }
public  void onTimerRecordingResult(int recorderAddress, android.hardware.hdmi.HdmiRecordListener.TimerStatusData data) { throw new RuntimeException("Stub!"); }
public  void onClearTimerRecordingResult(int recorderAddress, int result) { throw new RuntimeException("Stub!"); }
}
