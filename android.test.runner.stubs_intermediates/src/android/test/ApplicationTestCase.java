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
public abstract class ApplicationTestCase<T extends android.app.Application>
  extends android.test.AndroidTestCase
{
public  ApplicationTestCase(java.lang.Class<T> applicationClass) { throw new RuntimeException("Stub!"); }
public  T getApplication() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected final  void createApplication() { throw new RuntimeException("Stub!"); }
protected final  void terminateApplication() { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  android.content.Context getSystemContext() { throw new RuntimeException("Stub!"); }
public final  void testApplicationTestCaseSetUpProperly() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
