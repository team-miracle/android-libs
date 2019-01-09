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

package android.test;
@java.lang.Deprecated()
public class AndroidTestCase
  extends junit.framework.TestCase
{
public  AndroidTestCase() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
@android.test.suitebuilder.annotation.Suppress()
public  void testAndroidTestCaseSetupProperly() { throw new RuntimeException("Stub!"); }
public  void setContext(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  android.content.Context getContext() { throw new RuntimeException("Stub!"); }
public  void assertActivityRequiresPermission(java.lang.String packageName, java.lang.String className, java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  void assertReadingContentUriRequiresPermission(android.net.Uri uri, java.lang.String permission) { throw new RuntimeException("Stub!"); }
public  void assertWritingContentUriRequiresPermission(android.net.Uri uri, java.lang.String permission) { throw new RuntimeException("Stub!"); }
protected  void scrubClass(java.lang.Class<?> testCaseClass) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
protected android.content.Context mContext;
}
