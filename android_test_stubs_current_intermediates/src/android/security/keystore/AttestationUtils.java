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

package android.security.keystore;
public abstract class AttestationUtils
{
AttestationUtils() { throw new RuntimeException("Stub!"); }
public static  java.security.cert.X509Certificate[] attestDeviceIds(android.content.Context context, int[] idTypes, byte[] attestationChallenge) throws android.security.keystore.DeviceIdAttestationException { throw new RuntimeException("Stub!"); }
public static final int ID_TYPE_IMEI = 2;
public static final int ID_TYPE_MEID = 3;
public static final int ID_TYPE_SERIAL = 1;
}
