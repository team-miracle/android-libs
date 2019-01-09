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

package android.view;
public class DragEvent
  implements android.os.Parcelable
{
DragEvent() { throw new RuntimeException("Stub!"); }
public  int getAction() { throw new RuntimeException("Stub!"); }
public  float getX() { throw new RuntimeException("Stub!"); }
public  float getY() { throw new RuntimeException("Stub!"); }
public  android.content.ClipData getClipData() { throw new RuntimeException("Stub!"); }
public  android.content.ClipDescription getClipDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.Object getLocalState() { throw new RuntimeException("Stub!"); }
public  boolean getResult() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final int ACTION_DRAG_ENDED = 4;
public static final int ACTION_DRAG_ENTERED = 5;
public static final int ACTION_DRAG_EXITED = 6;
public static final int ACTION_DRAG_LOCATION = 2;
public static final int ACTION_DRAG_STARTED = 1;
public static final int ACTION_DROP = 3;
public static final android.os.Parcelable.Creator<android.view.DragEvent> CREATOR;
static { CREATOR = null; }
}
