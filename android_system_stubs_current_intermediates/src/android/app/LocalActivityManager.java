/*
* Copyright (C) 2006 The Android Open Source Project
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
public class LocalActivityManager
{
public  LocalActivityManager(android.app.Activity parent, boolean singleMode) { throw new RuntimeException("Stub!"); }
public  android.view.Window startActivity(java.lang.String id, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.view.Window destroyActivity(java.lang.String id, boolean finish) { throw new RuntimeException("Stub!"); }
public  android.app.Activity getCurrentActivity() { throw new RuntimeException("Stub!"); }
public  java.lang.String getCurrentId() { throw new RuntimeException("Stub!"); }
public  android.app.Activity getActivity(java.lang.String id) { throw new RuntimeException("Stub!"); }
public  void dispatchCreate(android.os.Bundle state) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle saveInstanceState() { throw new RuntimeException("Stub!"); }
public  void dispatchResume() { throw new RuntimeException("Stub!"); }
public  void dispatchPause(boolean finishing) { throw new RuntimeException("Stub!"); }
public  void dispatchStop() { throw new RuntimeException("Stub!"); }
public  void removeAllActivities() { throw new RuntimeException("Stub!"); }
public  void dispatchDestroy(boolean finishing) { throw new RuntimeException("Stub!"); }
}
