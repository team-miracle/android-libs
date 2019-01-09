/*
* Copyright (C) 2007 The Android Open Source Project
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
public class InstrumentationTestCase
  extends junit.framework.TestCase
{
public  InstrumentationTestCase() { throw new RuntimeException("Stub!"); }
public  void injectInstrumentation(android.app.Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void injectInsrumentation(android.app.Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
public  android.app.Instrumentation getInstrumentation() { throw new RuntimeException("Stub!"); }
public final <T extends android.app.Activity> T launchActivity(java.lang.String pkg, java.lang.Class<T> activityCls, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public final <T extends android.app.Activity> T launchActivityWithIntent(java.lang.String pkg, java.lang.Class<T> activityCls, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void runTestOnUiThread(java.lang.Runnable r) throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
protected  void runTest() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  void sendKeys(java.lang.String keysSequence) { throw new RuntimeException("Stub!"); }
public  void sendKeys(int... keys) { throw new RuntimeException("Stub!"); }
public  void sendRepeatedKeys(int... keys) { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
}
