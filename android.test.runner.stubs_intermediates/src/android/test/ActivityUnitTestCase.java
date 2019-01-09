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
public abstract class ActivityUnitTestCase<T extends android.app.Activity>
  extends android.test.ActivityTestCase
{
public  ActivityUnitTestCase(java.lang.Class<T> activityClass) { throw new RuntimeException("Stub!"); }
public  T getActivity() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  T startActivity(android.content.Intent intent, android.os.Bundle savedInstanceState, java.lang.Object lastNonConfigurationInstance) { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  void setApplication(android.app.Application application) { throw new RuntimeException("Stub!"); }
public  void setActivityContext(android.content.Context activityContext) { throw new RuntimeException("Stub!"); }
public  int getRequestedOrientation() { throw new RuntimeException("Stub!"); }
public  android.content.Intent getStartedActivityIntent() { throw new RuntimeException("Stub!"); }
public  int getStartedActivityRequest() { throw new RuntimeException("Stub!"); }
public  boolean isFinishCalled() { throw new RuntimeException("Stub!"); }
public  int getFinishedActivityRequest() { throw new RuntimeException("Stub!"); }
}
