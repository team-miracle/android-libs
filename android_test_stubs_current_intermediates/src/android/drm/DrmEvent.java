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
public class DrmEvent
{
protected  DrmEvent(int uniqueId, int type, java.lang.String message, java.util.HashMap<java.lang.String, java.lang.Object> attributes) { throw new RuntimeException("Stub!"); }
protected  DrmEvent(int uniqueId, int type, java.lang.String message) { throw new RuntimeException("Stub!"); }
public  int getUniqueId() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMessage() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getAttribute(java.lang.String key) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DRM_INFO_OBJECT = "drm_info_object";
public static final java.lang.String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
public static final int TYPE_DRM_INFO_PROCESSED = 1002;
}
