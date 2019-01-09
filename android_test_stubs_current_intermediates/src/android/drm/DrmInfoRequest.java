/*
* Copyright (C) 2010 The Android Open Source Project
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

package android.drm;
public class DrmInfoRequest
{
public  DrmInfoRequest(int infoType, java.lang.String mimeType) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMimeType() { throw new RuntimeException("Stub!"); }
public  int getInfoType() { throw new RuntimeException("Stub!"); }
public  void put(java.lang.String key, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public  java.lang.Object get(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> keyIterator() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.Object> iterator() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACCOUNT_ID = "account_id";
public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
public static final int TYPE_REGISTRATION_INFO = 1;
public static final int TYPE_RIGHTS_ACQUISITION_INFO = 3;
public static final int TYPE_RIGHTS_ACQUISITION_PROGRESS_INFO = 4;
public static final int TYPE_UNREGISTRATION_INFO = 2;
}
