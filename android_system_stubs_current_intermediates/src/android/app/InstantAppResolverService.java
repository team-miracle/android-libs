/*
* Copyright (C) 2017 The Android Open Source Project
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

package android.app;
public abstract class InstantAppResolverService
  extends android.app.Service
{
public static final class InstantAppResolutionCallback
{
InstantAppResolutionCallback() { throw new RuntimeException("Stub!"); }
public  void onInstantAppResolveInfo(java.util.List<android.content.pm.InstantAppResolveInfo> resolveInfo) { throw new RuntimeException("Stub!"); }
}
public  InstantAppResolverService() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onGetInstantAppResolveInfo(int[] digestPrefix, java.lang.String token, android.app.InstantAppResolverService.InstantAppResolutionCallback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void onGetInstantAppIntentFilter(int[] digestPrefix, java.lang.String token, android.app.InstantAppResolverService.InstantAppResolutionCallback callback) { throw new RuntimeException("Stub!"); }
public  void onGetInstantAppResolveInfo(android.content.Intent sanitizedIntent, int[] hostDigestPrefix, java.lang.String token, android.app.InstantAppResolverService.InstantAppResolutionCallback callback) { throw new RuntimeException("Stub!"); }
public  void onGetInstantAppIntentFilter(android.content.Intent sanitizedIntent, int[] hostDigestPrefix, java.lang.String token, android.app.InstantAppResolverService.InstantAppResolutionCallback callback) { throw new RuntimeException("Stub!"); }
public final  void attachBaseContext(android.content.Context base) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
}
