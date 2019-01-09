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
public class InstrumentationTestRunner
  extends android.app.Instrumentation
  implements android.test.TestSuiteProvider
{
public  InstrumentationTestRunner() { throw new RuntimeException("Stub!"); }
public  void onCreate(android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getArguments() { throw new RuntimeException("Stub!"); }
protected  android.test.AndroidTestRunner getAndroidTestRunner() { throw new RuntimeException("Stub!"); }
public  void onStart() { throw new RuntimeException("Stub!"); }
public  junit.framework.TestSuite getTestSuite() { throw new RuntimeException("Stub!"); }
public  junit.framework.TestSuite getAllTests() { throw new RuntimeException("Stub!"); }
public  java.lang.ClassLoader getLoader() { throw new RuntimeException("Stub!"); }
public static final java.lang.String REPORT_KEY_NAME_CLASS = "class";
public static final java.lang.String REPORT_KEY_NAME_TEST = "test";
public static final java.lang.String REPORT_KEY_NUM_CURRENT = "current";
public static final java.lang.String REPORT_KEY_NUM_TOTAL = "numtests";
public static final java.lang.String REPORT_KEY_STACK = "stack";
public static final java.lang.String REPORT_VALUE_ID = "InstrumentationTestRunner";
public static final int REPORT_VALUE_RESULT_ERROR = -1;
public static final int REPORT_VALUE_RESULT_FAILURE = -2;
public static final int REPORT_VALUE_RESULT_OK = 0;
public static final int REPORT_VALUE_RESULT_START = 1;
}
