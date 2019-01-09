/*
* Copyright (C) 2016 The Android Open Source Project
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
public final class ContextHubManager
{
@java.lang.Deprecated()
public abstract static class Callback
{
protected  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onMessageReceipt(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage message);
}
ContextHubManager() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int[] getContextHubHandles() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.hardware.location.ContextHubInfo getContextHubInfo(int hubHandle) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int loadNanoApp(int hubHandle, android.hardware.location.NanoApp app) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int unloadNanoApp(int nanoAppHandle) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int nanoAppHandle) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int[] findNanoAppOnHub(int hubHandle, android.hardware.location.NanoAppFilter filter) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int sendMessage(int hubHandle, int nanoAppHandle, android.hardware.location.ContextHubMessage message) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction<java.lang.Void> loadNanoApp(android.hardware.location.ContextHubInfo hubInfo, android.hardware.location.NanoAppBinary appBinary) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction<java.lang.Void> unloadNanoApp(android.hardware.location.ContextHubInfo hubInfo, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction<java.lang.Void> enableNanoApp(android.hardware.location.ContextHubInfo hubInfo, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction<java.lang.Void> disableNanoApp(android.hardware.location.ContextHubInfo hubInfo, long nanoAppId) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubTransaction<java.util.List<android.hardware.location.NanoAppState>> queryNanoApps(android.hardware.location.ContextHubInfo hubInfo) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  int registerCallback(android.hardware.location.ContextHubManager.Callback callback) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.annotation.SuppressLint(value={"Doclava125"})
public  int registerCallback(android.hardware.location.ContextHubManager.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo hubInfo, android.hardware.location.ContextHubClientCallback callback, java.util.concurrent.Executor executor) { throw new RuntimeException("Stub!"); }
public  android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo hubInfo, android.hardware.location.ContextHubClientCallback callback) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
@java.lang.Deprecated()
public  int unregisterCallback(android.hardware.location.ContextHubManager.Callback callback) { throw new RuntimeException("Stub!"); }
}
