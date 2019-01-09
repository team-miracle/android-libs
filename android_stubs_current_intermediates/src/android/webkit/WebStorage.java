/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.webkit;
public class WebStorage
{
@java.lang.Deprecated()
public static interface QuotaUpdater
{
public abstract  void updateQuota(long newQuota);
}
public static class Origin
{
Origin() { throw new RuntimeException("Stub!"); }
public  java.lang.String getOrigin() { throw new RuntimeException("Stub!"); }
public  long getQuota() { throw new RuntimeException("Stub!"); }
public  long getUsage() { throw new RuntimeException("Stub!"); }
}
WebStorage() { throw new RuntimeException("Stub!"); }
public  void getOrigins(android.webkit.ValueCallback<java.util.Map> callback) { throw new RuntimeException("Stub!"); }
public  void getUsageForOrigin(java.lang.String origin, android.webkit.ValueCallback<java.lang.Long> callback) { throw new RuntimeException("Stub!"); }
public  void getQuotaForOrigin(java.lang.String origin, android.webkit.ValueCallback<java.lang.Long> callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setQuotaForOrigin(java.lang.String origin, long quota) { throw new RuntimeException("Stub!"); }
public  void deleteOrigin(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void deleteAllData() { throw new RuntimeException("Stub!"); }
public static  android.webkit.WebStorage getInstance() { throw new RuntimeException("Stub!"); }
}
