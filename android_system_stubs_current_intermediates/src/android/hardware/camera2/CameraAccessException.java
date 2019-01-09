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
public class CameraAccessException
  extends android.util.AndroidException
{
public  CameraAccessException(int problem) { throw new RuntimeException("Stub!"); }
public  CameraAccessException(int problem, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  CameraAccessException(int problem, java.lang.String message, java.lang.Throwable cause) { throw new RuntimeException("Stub!"); }
public  CameraAccessException(int problem, java.lang.Throwable cause) { throw new RuntimeException("Stub!"); }
public final  int getReason() { throw new RuntimeException("Stub!"); }
public static final int CAMERA_DISABLED = 1;
public static final int CAMERA_DISCONNECTED = 2;
public static final int CAMERA_ERROR = 3;
public static final int CAMERA_IN_USE = 4;
public static final int MAX_CAMERAS_IN_USE = 5;
}
