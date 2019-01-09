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
public class GeolocationPermissions
{
public static interface Callback
{
public abstract  void invoke(java.lang.String origin, boolean allow, boolean retain);
}
GeolocationPermissions() { throw new RuntimeException("Stub!"); }
public static  android.webkit.GeolocationPermissions getInstance() { throw new RuntimeException("Stub!"); }
public  void getOrigins(android.webkit.ValueCallback<java.util.Set<java.lang.String>> callback) { throw new RuntimeException("Stub!"); }
public  void getAllowed(java.lang.String origin, android.webkit.ValueCallback<java.lang.Boolean> callback) { throw new RuntimeException("Stub!"); }
public  void clear(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void allow(java.lang.String origin) { throw new RuntimeException("Stub!"); }
public  void clearAll() { throw new RuntimeException("Stub!"); }
}
