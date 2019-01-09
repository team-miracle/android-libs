/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.nfc.cardemulation;
public final class CardEmulation
{
CardEmulation() { throw new RuntimeException("Stub!"); }
public static synchronized  android.nfc.cardemulation.CardEmulation getInstance(android.nfc.NfcAdapter adapter) { throw new RuntimeException("Stub!"); }
public  boolean isDefaultServiceForCategory(android.content.ComponentName service, java.lang.String category) { throw new RuntimeException("Stub!"); }
public  boolean isDefaultServiceForAid(android.content.ComponentName service, java.lang.String aid) { throw new RuntimeException("Stub!"); }
public  boolean categoryAllowsForegroundPreference(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  int getSelectionModeForCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  boolean registerAidsForService(android.content.ComponentName service, java.lang.String category, java.util.List<java.lang.String> aids) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAidsForService(android.content.ComponentName service, java.lang.String category) { throw new RuntimeException("Stub!"); }
public  boolean removeAidsForService(android.content.ComponentName service, java.lang.String category) { throw new RuntimeException("Stub!"); }
public  boolean setPreferredService(android.app.Activity activity, android.content.ComponentName service) { throw new RuntimeException("Stub!"); }
public  boolean unsetPreferredService(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
public  boolean supportsAidPrefixRegistration() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_CHANGE_DEFAULT = "android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT";
public static final java.lang.String CATEGORY_OTHER = "other";
public static final java.lang.String CATEGORY_PAYMENT = "payment";
public static final java.lang.String EXTRA_CATEGORY = "category";
public static final java.lang.String EXTRA_SERVICE_COMPONENT = "component";
public static final int SELECTION_MODE_ALWAYS_ASK = 1;
public static final int SELECTION_MODE_ASK_IF_CONFLICT = 2;
public static final int SELECTION_MODE_PREFER_DEFAULT = 0;
}
