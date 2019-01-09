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

package android.app;
@java.lang.Deprecated()
public class Fragment
  implements android.content.ComponentCallbacks2, android.view.View.OnCreateContextMenuListener
{
@java.lang.Deprecated()
public static class SavedState
  implements android.os.Parcelable
{
SavedState() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.ClassLoaderCreator<android.app.Fragment.SavedState> CREATOR;
static { CREATOR = null; }
}
@java.lang.Deprecated()
public static class InstantiationException
  extends android.util.AndroidRuntimeException
{
public  InstantiationException(java.lang.String msg, java.lang.Exception cause) { throw new RuntimeException("Stub!"); }
}
public  Fragment() { throw new RuntimeException("Stub!"); }
public static  android.app.Fragment instantiate(android.content.Context context, java.lang.String fname) { throw new RuntimeException("Stub!"); }
public static  android.app.Fragment instantiate(android.content.Context context, java.lang.String fname, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  int getId() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getTag() { throw new RuntimeException("Stub!"); }
public  void setArguments(android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public final  android.os.Bundle getArguments() { throw new RuntimeException("Stub!"); }
public final  boolean isStateSaved() { throw new RuntimeException("Stub!"); }
public  void setInitialSavedState(android.app.Fragment.SavedState state) { throw new RuntimeException("Stub!"); }
public  void setTargetFragment(android.app.Fragment fragment, int requestCode) { throw new RuntimeException("Stub!"); }
public final  android.app.Fragment getTargetFragment() { throw new RuntimeException("Stub!"); }
public final  int getTargetRequestCode() { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public final  android.app.Activity getActivity() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getHost() { throw new RuntimeException("Stub!"); }
public final  android.content.res.Resources getResources() { throw new RuntimeException("Stub!"); }
public final  java.lang.CharSequence getText(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId, java.lang.Object... formatArgs) { throw new RuntimeException("Stub!"); }
public final  android.app.FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); }
public final  android.app.FragmentManager getChildFragmentManager() { throw new RuntimeException("Stub!"); }
public final  android.app.Fragment getParentFragment() { throw new RuntimeException("Stub!"); }
public final  boolean isAdded() { throw new RuntimeException("Stub!"); }
public final  boolean isDetached() { throw new RuntimeException("Stub!"); }
public final  boolean isRemoving() { throw new RuntimeException("Stub!"); }
public final  boolean isInLayout() { throw new RuntimeException("Stub!"); }
public final  boolean isResumed() { throw new RuntimeException("Stub!"); }
public final  boolean isVisible() { throw new RuntimeException("Stub!"); }
public final  boolean isHidden() { throw new RuntimeException("Stub!"); }
public  void onHiddenChanged(boolean hidden) { throw new RuntimeException("Stub!"); }
public  void setRetainInstance(boolean retain) { throw new RuntimeException("Stub!"); }
public final  boolean getRetainInstance() { throw new RuntimeException("Stub!"); }
public  void setHasOptionsMenu(boolean hasMenu) { throw new RuntimeException("Stub!"); }
public  void setMenuVisibility(boolean menuVisible) { throw new RuntimeException("Stub!"); }
public  void setUserVisibleHint(boolean isVisibleToUser) { throw new RuntimeException("Stub!"); }
public  boolean getUserVisibleHint() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.app.LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); }
public  void startActivity(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void startActivity(android.content.Intent intent, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void startActivityForResult(android.content.Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
public  void startActivityForResult(android.content.Intent intent, int requestCode, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void startIntentSenderForResult(android.content.IntentSender intent, int requestCode, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, android.os.Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void onActivityResult(int requestCode, int resultCode, android.content.Intent data) { throw new RuntimeException("Stub!"); }
public final  void requestPermissions(java.lang.String[] permissions, int requestCode) { throw new RuntimeException("Stub!"); }
public  void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) { throw new RuntimeException("Stub!"); }
public  boolean shouldShowRequestPermissionRationale(java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public final  android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onInflate(android.util.AttributeSet attrs, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onInflate(android.content.Context context, android.util.AttributeSet attrs, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onInflate(android.app.Activity activity, android.util.AttributeSet attrs, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onAttachFragment(android.app.Fragment childFragment) { throw new RuntimeException("Stub!"); }
public  void onAttach(android.content.Context context) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onAttach(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  android.animation.Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { throw new RuntimeException("Stub!"); }
public  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  android.view.View getView() { throw new RuntimeException("Stub!"); }
public  void onActivityCreated(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onViewStateRestored(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  void onResume() { throw new RuntimeException("Stub!"); }
public  void onSaveInstanceState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  void onMultiWindowModeChanged(boolean isInMultiWindowMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onMultiWindowModeChanged(boolean isInMultiWindowMode) { throw new RuntimeException("Stub!"); }
public  void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onPause() { throw new RuntimeException("Stub!"); }
public  void onStop() { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public  void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
public  void onDestroyView() { throw new RuntimeException("Stub!"); }
public  void onDestroy() { throw new RuntimeException("Stub!"); }
public  void onDetach() { throw new RuntimeException("Stub!"); }
public  void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) { throw new RuntimeException("Stub!"); }
public  void onPrepareOptionsMenu(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  void onDestroyOptionsMenu() { throw new RuntimeException("Stub!"); }
public  boolean onOptionsItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void onOptionsMenuClosed(android.view.Menu menu) { throw new RuntimeException("Stub!"); }
public  void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
public  void registerForContextMenu(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void unregisterForContextMenu(android.view.View view) { throw new RuntimeException("Stub!"); }
public  boolean onContextItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
public  void setEnterSharedElementCallback(android.app.SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
public  void setExitSharedElementCallback(android.app.SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
public  void setEnterTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getEnterTransition() { throw new RuntimeException("Stub!"); }
public  void setReturnTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getReturnTransition() { throw new RuntimeException("Stub!"); }
public  void setExitTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getExitTransition() { throw new RuntimeException("Stub!"); }
public  void setReenterTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getReenterTransition() { throw new RuntimeException("Stub!"); }
public  void setSharedElementEnterTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getSharedElementEnterTransition() { throw new RuntimeException("Stub!"); }
public  void setSharedElementReturnTransition(android.transition.Transition transition) { throw new RuntimeException("Stub!"); }
public  android.transition.Transition getSharedElementReturnTransition() { throw new RuntimeException("Stub!"); }
public  void setAllowEnterTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
public  boolean getAllowEnterTransitionOverlap() { throw new RuntimeException("Stub!"); }
public  void setAllowReturnTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
public  boolean getAllowReturnTransitionOverlap() { throw new RuntimeException("Stub!"); }
public  void postponeEnterTransition() { throw new RuntimeException("Stub!"); }
public  void startPostponedEnterTransition() { throw new RuntimeException("Stub!"); }
public  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
}
