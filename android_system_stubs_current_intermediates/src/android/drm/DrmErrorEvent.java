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
public class DrmErrorEvent
  extends android.drm.DrmEvent
{
public  DrmErrorEvent(int uniqueId, int type, java.lang.String message) { super(0,0,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public  DrmErrorEvent(int uniqueId, int type, java.lang.String message, java.util.HashMap<java.lang.String, java.lang.Object> attributes) { super(0,0,(java.lang.String)null); throw new RuntimeException("Stub!"); }
public static final int TYPE_ACQUIRE_DRM_INFO_FAILED = 2008;
public static final int TYPE_NOT_SUPPORTED = 2003;
public static final int TYPE_NO_INTERNET_CONNECTION = 2005;
public static final int TYPE_OUT_OF_MEMORY = 2004;
public static final int TYPE_PROCESS_DRM_INFO_FAILED = 2006;
public static final int TYPE_REMOVE_ALL_RIGHTS_FAILED = 2007;
public static final int TYPE_RIGHTS_NOT_INSTALLED = 2001;
public static final int TYPE_RIGHTS_RENEWAL_NOT_ALLOWED = 2002;
}
