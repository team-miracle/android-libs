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
public abstract class FragmentManager
{
@java.lang.Deprecated()
public static interface BackStackEntry
{
public abstract  int getId();
public abstract  java.lang.String getName();
public abstract  int getBreadCrumbTitleRes();
public abstract  int getBreadCrumbShortTitleRes();
public abstract  java.lang.CharSequence getBreadCrumbTitle();
public abstract  java.lang.CharSequence getBreadCrumbShortTitle();
}
@java.lang.Deprecated()
public static interface OnBackStackChangedListener
{
public abstract  void onBackStackChanged();
}
@java.lang.Deprecated()
public abstract static class FragmentLifecycleCallbacks
{
public  FragmentLifecycleCallbacks() { throw new RuntimeException("Stub!"); }
public  void onFragmentPreAttached(android.app.FragmentManager fm, android.app.Fragment f, android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void onFragmentAttached(android.app.FragmentManager fm, android.app.Fragment f, android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void onFragmentPreCreated(android.app.FragmentManager fm, android.app.Fragment f, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onFragmentCreated(android.app.FragmentManager fm, android.app.Fragment f, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onFragmentActivityCreated(android.app.FragmentManager fm, android.app.Fragment f, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onFragmentViewCreated(android.app.FragmentManager fm, android.app.Fragment f, android.view.View v, android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
public  void onFragmentStarted(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentResumed(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentPaused(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentStopped(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentSaveInstanceState(android.app.FragmentManager fm, android.app.Fragment f, android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
public  void onFragmentViewDestroyed(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentDestroyed(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
public  void onFragmentDetached(android.app.FragmentManager fm, android.app.Fragment f) { throw new RuntimeException("Stub!"); }
}
public  FragmentManager() { throw new RuntimeException("Stub!"); }
public abstract  android.app.FragmentTransaction beginTransaction();
public abstract  boolean executePendingTransactions();
public abstract  android.app.Fragment findFragmentById(int id);
public abstract  android.app.Fragment findFragmentByTag(java.lang.String tag);
public abstract  void popBackStack();
public abstract  boolean popBackStackImmediate();
public abstract  void popBackStack(java.lang.String name, int flags);
public abstract  boolean popBackStackImmediate(java.lang.String name, int flags);
public abstract  void popBackStack(int id, int flags);
public abstract  boolean popBackStackImmediate(int id, int flags);
public abstract  int getBackStackEntryCount();
public abstract  android.app.FragmentManager.BackStackEntry getBackStackEntryAt(int index);
public abstract  void addOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener listener);
public abstract  void removeOnBackStackChangedListener(android.app.FragmentManager.OnBackStackChangedListener listener);
public abstract  void putFragment(android.os.Bundle bundle, java.lang.String key, android.app.Fragment fragment);
public abstract  android.app.Fragment getFragment(android.os.Bundle bundle, java.lang.String key);
public abstract  java.util.List<android.app.Fragment> getFragments();
public abstract  android.app.Fragment.SavedState saveFragmentInstanceState(android.app.Fragment f);
public abstract  boolean isDestroyed();
public abstract  void registerFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks cb, boolean recursive);
public abstract  void unregisterFragmentLifecycleCallbacks(android.app.FragmentManager.FragmentLifecycleCallbacks cb);
public abstract  android.app.Fragment getPrimaryNavigationFragment();
public abstract  void dump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args);
public static  void enableDebugLogging(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
public abstract  boolean isStateSaved();
public static final int POP_BACK_STACK_INCLUSIVE = 1;
}
