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
public abstract class FragmentHostCallback<E>
  extends android.app.FragmentContainer
{
public  FragmentHostCallback(android.content.Context context, android.os.Handler handler, int windowAnimations) { throw new RuntimeException("Stub!"); }
public  void onDump(java.lang.String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, java.lang.String[] args) { throw new RuntimeException("Stub!"); }
public  boolean onShouldSaveFragmentState(android.app.Fragment fragment) { throw new RuntimeException("Stub!"); }
public  android.view.LayoutInflater onGetLayoutInflater() { throw new RuntimeException("Stub!"); }
public  boolean onUseFragmentManagerInflaterFactory() { throw new RuntimeException("Stub!"); }
public abstract  E onGetHost();
public  void onInvalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
public  void onStartActivityFromFragment(android.app.Fragment fragment, android.content.Intent intent, int requestCode, android.os.Bundle options) { throw new RuntimeException("Stub!"); }
public  void onStartIntentSenderFromFragment(android.app.Fragment fragment, android.content.IntentSender intent, int requestCode, android.content.Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, android.os.Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
public  void onRequestPermissionsFromFragment(android.app.Fragment fragment, java.lang.String[] permissions, int requestCode) { throw new RuntimeException("Stub!"); }
public  boolean onHasWindowAnimations() { throw new RuntimeException("Stub!"); }
public  int onGetWindowAnimations() { throw new RuntimeException("Stub!"); }
public  void onAttachFragment(android.app.Fragment fragment) { throw new RuntimeException("Stub!"); }
public <T extends android.view.View> T onFindViewById(int id) { throw new RuntimeException("Stub!"); }
public  boolean onHasView() { throw new RuntimeException("Stub!"); }
}
