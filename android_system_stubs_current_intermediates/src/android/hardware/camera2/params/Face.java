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


package android.hardware.camera2.params;
public final class Face
{
Face() { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getBounds() { throw new RuntimeException("Stub!"); }
public  int getScore() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  android.graphics.Point getLeftEyePosition() { throw new RuntimeException("Stub!"); }
public  android.graphics.Point getRightEyePosition() { throw new RuntimeException("Stub!"); }
public  android.graphics.Point getMouthPosition() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ID_UNSUPPORTED = -1;
public static final int SCORE_MAX = 100;
public static final int SCORE_MIN = 1;
}
