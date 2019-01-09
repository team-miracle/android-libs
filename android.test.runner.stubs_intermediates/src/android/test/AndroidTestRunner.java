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
public class AndroidTestRunner
  extends junit.runner.BaseTestRunner
{
public  AndroidTestRunner() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  void setTestClassName(java.lang.String testClassName, java.lang.String testMethodName) { throw new RuntimeException("Stub!"); }
public  void setTest(junit.framework.Test test) { throw new RuntimeException("Stub!"); }
public  void clearTestListeners() { throw new RuntimeException("Stub!"); }
public  void addTestListener(junit.framework.TestListener testListener) { throw new RuntimeException("Stub!"); }
protected  junit.framework.TestResult createTestResult() { throw new RuntimeException("Stub!"); }
public  java.util.List<junit.framework.TestCase> getTestCases() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTestClassName() { throw new RuntimeException("Stub!"); }
public  junit.framework.TestResult getTestResult() { throw new RuntimeException("Stub!"); }
public  void runTest() { throw new RuntimeException("Stub!"); }
public  void runTest(junit.framework.TestResult testResult) { throw new RuntimeException("Stub!"); }
public  void setContext(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  void setInstrumentation(android.app.Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setInstrumentaiton(android.app.Instrumentation instrumentation) { throw new RuntimeException("Stub!"); }
protected  java.lang.Class loadSuiteClass(java.lang.String suiteClassName) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }
public  void testStarted(java.lang.String testName) { throw new RuntimeException("Stub!"); }
public  void testEnded(java.lang.String testName) { throw new RuntimeException("Stub!"); }
public  void testFailed(int status, junit.framework.Test test, java.lang.Throwable t) { throw new RuntimeException("Stub!"); }
protected  void runFailed(java.lang.String message) { throw new RuntimeException("Stub!"); }
}
