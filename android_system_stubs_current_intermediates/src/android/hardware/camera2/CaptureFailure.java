/*
* Copyright (C) 2013 The Android Open Source Project
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
package android.hardware.camera2;
public class CaptureFailure
{
CaptureFailure() { throw new RuntimeException("Stub!"); }
public  android.hardware.camera2.CaptureRequest getRequest() { throw new RuntimeException("Stub!"); }
public  long getFrameNumber() { throw new RuntimeException("Stub!"); }
public  int getReason() { throw new RuntimeException("Stub!"); }
public  boolean wasImageCaptured() { throw new RuntimeException("Stub!"); }
public  int getSequenceId() { throw new RuntimeException("Stub!"); }
public static final int REASON_ERROR = 0;
public static final int REASON_FLUSHED = 1;
}
