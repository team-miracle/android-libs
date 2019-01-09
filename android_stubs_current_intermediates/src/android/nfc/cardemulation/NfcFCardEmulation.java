/*
* Copyright (C) 2015 The Android Open Source Project
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
public final class NfcFCardEmulation
{
NfcFCardEmulation() { throw new RuntimeException("Stub!"); }
public static synchronized  android.nfc.cardemulation.NfcFCardEmulation getInstance(android.nfc.NfcAdapter adapter) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSystemCodeForService(android.content.ComponentName service) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean registerSystemCodeForService(android.content.ComponentName service, java.lang.String systemCode) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean unregisterSystemCodeForService(android.content.ComponentName service) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  java.lang.String getNfcid2ForService(android.content.ComponentName service) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean setNfcid2ForService(android.content.ComponentName service, java.lang.String nfcid2) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean enableService(android.app.Activity activity, android.content.ComponentName service) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  boolean disableService(android.app.Activity activity) throws java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
}
