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
public class DrmInfoStatus
{
public  DrmInfoStatus(int statusCode, int infoType, android.drm.ProcessedData data, java.lang.String mimeType) { throw new RuntimeException("Stub!"); }
public static final int STATUS_ERROR = 2;
public static final int STATUS_OK = 1;
public final android.drm.ProcessedData data;
public final int infoType;
public final java.lang.String mimeType;
public final int statusCode;
}
