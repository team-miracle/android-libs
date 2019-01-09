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

package android.app;
@java.lang.Deprecated()
public class FragmentController
{
FragmentController() { throw new RuntimeException("Stub!"); }
public static final  android.app.FragmentController createController(android.app.FragmentHostCallback<?> callbacks) { throw new RuntimeException("Stub!"); }
public  android.app.FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); }
public  android.app.LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); }
public  android.app.Fragment findFragmentByWho(java.lang.String who) { throw new RuntimeException("Stub!"); }
public  void attachHost(android.app.Fragment parent) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateView(android.view.View parent, java.lang.String name, android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  void noteStateNotSaved() { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable saveAllState() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void restoreAllState(android.os.Parcelable state, java.util.List<android.app.Fragment> nonConfigList) { throw new RuntimeException("Stub!"); }
public  void restoreAllState(android.os.Parcelable state, android.app.FragmentManagerNonConfig nonConfig) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  java.util.List<android.app.Fragment> retainNonConfig() { throw new RuntimeException("Stub!"); }
public  android.app.FragmentManagerNonConfig retainNestedNonConfig() { throw new RuntimeException("Stub!"); }
public  void dispatchCreate() { throw new RuntimeException("Stub!"); }
public  void dispatchActivityCreated() { throw new RuntimeException("Stub!"); }
public  void dispatchStart() { throw new RuntimeException("Stub!"); }
public  void dispatchResume() { throw new RuntimeException("Stub!"); }
public  void dispatchPause() { throw new RuntimeException("Stub!"); }
public  void dispatchStop() { throw new RuntimeException("Stub!"); }
public  void dispatchDestroyView() { throw new RuntimeException("Stub!"); }
public  void dispatchDestroy() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void dispatchMultiWindowModeChanged(boolean isInMultiWindowMode) { throw new RuntimeException("Stub!"); }
public  void dispatchMultiWindowModeChanged(boolean isInMultiWindowMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void dispatchPictureInPictureModeChanged(boolean isInPictureInPictureMode) { throw new RuntimeException("Stub!"); }
public  void dispatchPictureInPictureModeChanged(boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void dispatchConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void dispatchLowMemory() { throw new RuntimeException("Stub!"); }
public  void dispatchTrimMemory(int level) { throw new RuntimeException("Stub!"); }
public  boolean dispatchCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) { throw new RuntimeException("Stub!"); }
public  boolean dispatchPrepareOptionsMenu(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean dispatchOptionsItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  boolean dispatchContextItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void dispatchOptionsMenuClosed(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  boolean execPendingActions() { throw new RuntimeException("Stub!"); }
public  void doLoaderStart() { throw new RuntimeException("Stub!"); }
public  void doLoaderStop(boolean retain) { throw new RuntimeException("Stub!"); }
public  void doLoaderDestroy() { throw new RuntimeException("Stub!"); }
public  void reportLoaderStart() { throw new RuntimeException("Stub!"); }
public  android.util.ArrayMap<java.lang.String, android.app.LoaderManager> retainLoaderNonConfig() { throw new RuntimeException("Stub!"); }
public  void restoreLoaderNonConfig(android.util.ArrayMap<java.lang.String, android.app.LoaderManager> loaderManagers) { throw new RuntimeException("Stub!"); }
public  void dumpLoaders(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
