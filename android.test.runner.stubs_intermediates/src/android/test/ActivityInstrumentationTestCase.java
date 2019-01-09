/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.test;
@java.lang.Deprecated()
public abstract class ActivityInstrumentationTestCase<T extends android.app.Activity>
  extends android.test.ActivityTestCase
{
public  ActivityInstrumentationTestCase(java.lang.String pkg, java.lang.Class<T> activityClass) { throw new RuntimeException("Stub!"); }
public  ActivityInstrumentationTestCase(java.lang.String pkg, java.lang.Class<T> activityClass, boolean initialTouchMode) { throw new RuntimeException("Stub!"); }
public  T getActivity() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  void testActivityTestCaseSetUpProperly() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
