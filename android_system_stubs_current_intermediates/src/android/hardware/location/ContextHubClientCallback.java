/*
* Copyright 2017 The Android Open Source Project
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
package android.hardware.location;
public class ContextHubClientCallback
{
public  ContextHubClientCallback() { throw new RuntimeException("Stub!"); }
public  void onMessageFromNanoApp(android.hardware.location.ContextHubClient client, android.hardware.location.NanoAppMessage message) { throw new RuntimeException("Stub!"); }
public  void onHubReset(android.hardware.location.ContextHubClient client) { throw new RuntimeException("Stub!"); }
public  void onNanoAppAborted(android.hardware.location.ContextHubClient client, long nanoAppId, int abortCode) { throw new RuntimeException("Stub!"); }
public  void onNanoAppLoaded(android.hardware.location.ContextHubClient client, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  void onNanoAppUnloaded(android.hardware.location.ContextHubClient client, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  void onNanoAppEnabled(android.hardware.location.ContextHubClient client, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  void onNanoAppDisabled(android.hardware.location.ContextHubClient client, long nanoAppId) { throw new RuntimeException("Stub!"); }
}
