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
public abstract class ServiceTestCase<T extends android.app.Service>
  extends android.test.AndroidTestCase
{
public  ServiceTestCase(java.lang.Class<T> serviceClass) { throw new RuntimeException("Stub!"); }
public  T getService() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  void setupService() { throw new RuntimeException("Stub!"); }
protected  void startService(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected  android.os.IBinder bindService(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
protected  void shutdownService() { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  void setApplication(android.app.Application application) { throw new RuntimeException("Stub!"); }
public  android.app.Application getApplication() { throw new RuntimeException("Stub!"); }
public  android.content.Context getSystemContext() { throw new RuntimeException("Stub!"); }
public  void testServiceTestCaseSetUpProperly() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
