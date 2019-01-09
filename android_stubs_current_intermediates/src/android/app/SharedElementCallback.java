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
package android.app;
public abstract class SharedElementCallback
{
public static interface OnSharedElementsReadyListener
{
public abstract  void onSharedElementsReady();
}
public  SharedElementCallback() { throw new RuntimeException("Stub!"); }
public  void onSharedElementStart(java.util.List<java.lang.String> sharedElementNames, java.util.List<android.view.View> sharedElements, java.util.List<android.view.View> sharedElementSnapshots) { throw new RuntimeException("Stub!"); }
public  void onSharedElementEnd(java.util.List<java.lang.String> sharedElementNames, java.util.List<android.view.View> sharedElements, java.util.List<android.view.View> sharedElementSnapshots) { throw new RuntimeException("Stub!"); }
public  void onRejectSharedElements(java.util.List<android.view.View> rejectedSharedElements) { throw new RuntimeException("Stub!"); }
public  void onMapSharedElements(java.util.List<java.lang.String> names, java.util.Map<java.lang.String, android.view.View> sharedElements) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View sharedElement, android.graphics.Matrix viewToGlobalMatrix, android.graphics.RectF screenBounds) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateSnapshotView(android.content.Context context, android.os.Parcelable snapshot) { throw new RuntimeException("Stub!"); }
public  void onSharedElementsArrived(java.util.List<java.lang.String> sharedElementNames, java.util.List<android.view.View> sharedElements, android.app.SharedElementCallback.OnSharedElementsReadyListener listener) { throw new RuntimeException("Stub!"); }
}
