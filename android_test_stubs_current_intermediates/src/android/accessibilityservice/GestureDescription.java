/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.accessibilityservice;
public final class GestureDescription
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.accessibilityservice.GestureDescription.Builder addStroke(android.accessibilityservice.GestureDescription.StrokeDescription strokeDescription) { throw new RuntimeException("Stub!"); }
public  android.accessibilityservice.GestureDescription build() { throw new RuntimeException("Stub!"); }
}
public static class StrokeDescription
{
public  StrokeDescription(android.graphics.Path path, long startTime, long duration) { throw new RuntimeException("Stub!"); }
public  StrokeDescription(android.graphics.Path path, long startTime, long duration, boolean willContinue) { throw new RuntimeException("Stub!"); }
public  android.graphics.Path getPath() { throw new RuntimeException("Stub!"); }
public  long getStartTime() { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  android.accessibilityservice.GestureDescription.StrokeDescription continueStroke(android.graphics.Path path, long startTime, long duration, boolean willContinue) { throw new RuntimeException("Stub!"); }
public  boolean willContinue() { throw new RuntimeException("Stub!"); }
}
GestureDescription() { throw new RuntimeException("Stub!"); }
public static  int getMaxStrokeCount() { throw new RuntimeException("Stub!"); }
public static  long getMaxGestureDuration() { throw new RuntimeException("Stub!"); }
public  int getStrokeCount() { throw new RuntimeException("Stub!"); }
public  android.accessibilityservice.GestureDescription.StrokeDescription getStroke(int index) { throw new RuntimeException("Stub!"); }
}
