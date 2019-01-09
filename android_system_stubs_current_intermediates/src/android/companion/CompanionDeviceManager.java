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

package android.companion;
public final class CompanionDeviceManager
{
public abstract static class Callback
{
public  Callback() { throw new RuntimeException("Stub!"); }
public abstract  void onDeviceFound(android.content.IntentSender chooserLauncher);
public abstract  void onFailure(java.lang.CharSequence error);
}
CompanionDeviceManager() { throw new RuntimeException("Stub!"); }
public  void associate(android.companion.AssociationRequest request, android.companion.CompanionDeviceManager.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAssociations() { throw new RuntimeException("Stub!"); }
public  void disassociate(java.lang.String deviceMacAddress) { throw new RuntimeException("Stub!"); }
public  void requestNotificationAccess(android.content.ComponentName component) { throw new RuntimeException("Stub!"); }
public  boolean hasNotificationAccess(android.content.ComponentName component) { throw new RuntimeException("Stub!"); }
public static final java.lang.String EXTRA_DEVICE = "android.companion.extra.DEVICE";
}
