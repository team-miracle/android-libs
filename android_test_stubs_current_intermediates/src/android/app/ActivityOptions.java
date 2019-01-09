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

package android.app;
public class ActivityOptions
{
ActivityOptions() { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeCustomAnimation(android.content.Context context, int enterResId, int exitResId) { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeScaleUpAnimation(android.view.View source, int startX, int startY, int width, int height) { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeClipRevealAnimation(android.view.View source, int startX, int startY, int width, int height) { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeThumbnailScaleUpAnimation(android.view.View source, android.graphics.Bitmap thumbnail, int startX, int startY) { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity activity, android.view.View sharedElement, java.lang.String sharedElementName) { throw new RuntimeException("Stub!"); }
@java.lang.SafeVarargs()
public static  android.app.ActivityOptions makeSceneTransitionAnimation(android.app.Activity activity, android.util.Pair<android.view.View, java.lang.String>... sharedElements) { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeTaskLaunchBehind() { throw new RuntimeException("Stub!"); }
public static  android.app.ActivityOptions makeBasic() { throw new RuntimeException("Stub!"); }
public  android.app.ActivityOptions setLaunchBounds(android.graphics.Rect screenSpacePixelRect) { throw new RuntimeException("Stub!"); }
public  android.graphics.Rect getLaunchBounds() { throw new RuntimeException("Stub!"); }
public  boolean getLockTaskMode() { throw new RuntimeException("Stub!"); }
public  android.app.ActivityOptions setLockTaskEnabled(boolean lockTaskMode) { throw new RuntimeException("Stub!"); }
public  int getLaunchDisplayId() { throw new RuntimeException("Stub!"); }
public  android.app.ActivityOptions setLaunchDisplayId(int launchDisplayId) { throw new RuntimeException("Stub!"); }
public  void setLaunchWindowingMode(int windowingMode) { throw new RuntimeException("Stub!"); }
public  void setLaunchActivityType(int activityType) { throw new RuntimeException("Stub!"); }
public  void setLaunchTaskId(int taskId) { throw new RuntimeException("Stub!"); }
public  void setTaskOverlay(boolean taskOverlay, boolean canResume) { throw new RuntimeException("Stub!"); }
public  void update(android.app.ActivityOptions otherOptions) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle toBundle() { throw new RuntimeException("Stub!"); }
public  void requestUsageTimeReport(android.app.PendingIntent receiver) { throw new RuntimeException("Stub!"); }
public  android.app.ActivityOptions setAppVerificationBundle(android.os.Bundle bundle) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
}
