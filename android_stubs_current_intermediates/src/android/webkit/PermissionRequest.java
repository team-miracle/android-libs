/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.webkit;
public abstract class PermissionRequest
{
public  PermissionRequest() { throw new RuntimeException("Stub!"); }
public abstract  android.net.Uri getOrigin();
public abstract  java.lang.String[] getResources();
public abstract  void grant(java.lang.String[] resources);
public abstract  void deny();
public static final java.lang.String RESOURCE_AUDIO_CAPTURE = "android.webkit.resource.AUDIO_CAPTURE";
public static final java.lang.String RESOURCE_MIDI_SYSEX = "android.webkit.resource.MIDI_SYSEX";
public static final java.lang.String RESOURCE_PROTECTED_MEDIA_ID = "android.webkit.resource.PROTECTED_MEDIA_ID";
public static final java.lang.String RESOURCE_VIDEO_CAPTURE = "android.webkit.resource.VIDEO_CAPTURE";
}
