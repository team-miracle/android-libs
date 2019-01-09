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
public abstract class ProviderTestCase<T extends android.content.ContentProvider>
  extends android.test.InstrumentationTestCase
{
public  ProviderTestCase(java.lang.Class<T> providerClass, java.lang.String providerAuthority) { throw new RuntimeException("Stub!"); }
public  T getProvider() { throw new RuntimeException("Stub!"); }
protected  void setUp() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
protected  void tearDown() throws java.lang.Exception { throw new RuntimeException("Stub!"); }
public  android.test.mock.MockContentResolver getMockContentResolver() { throw new RuntimeException("Stub!"); }
public  android.test.IsolatedContext getMockContext() { throw new RuntimeException("Stub!"); }
public static <T extends android.content.ContentProvider> android.content.ContentResolver newResolverWithContentProviderFromSql(android.content.Context targetContext, java.lang.Class<T> providerClass, java.lang.String authority, java.lang.String databaseName, int databaseVersion, java.lang.String sql) throws java.lang.IllegalAccessException, java.lang.InstantiationException { throw new RuntimeException("Stub!"); }
}
