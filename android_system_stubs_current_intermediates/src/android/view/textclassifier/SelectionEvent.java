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

package android.view.textclassifier;
public final class SelectionEvent
  implements android.os.Parcelable
{
SelectionEvent() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionStartedEvent(int invocationMethod, int start) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int start, int end) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int start, int end, android.view.textclassifier.TextClassification classification) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionModifiedEvent(int start, int end, android.view.textclassifier.TextSelection selection) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionActionEvent(int start, int end, int actionType) { throw new RuntimeException("Stub!"); }
public static  android.view.textclassifier.SelectionEvent createSelectionActionEvent(int start, int end, int actionType, android.view.textclassifier.TextClassification classification) { throw new RuntimeException("Stub!"); }
public  int getEventType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getEntityType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWidgetType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWidgetVersion() { throw new RuntimeException("Stub!"); }
public  int getInvocationMethod() { throw new RuntimeException("Stub!"); }
public  java.lang.String getResultId() { throw new RuntimeException("Stub!"); }
public  long getEventTime() { throw new RuntimeException("Stub!"); }
public  long getDurationSinceSessionStart() { throw new RuntimeException("Stub!"); }
public  long getDurationSincePreviousEvent() { throw new RuntimeException("Stub!"); }
public  int getEventIndex() { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextClassificationSessionId getSessionId() { throw new RuntimeException("Stub!"); }
public  int getStart() { throw new RuntimeException("Stub!"); }
public  int getEnd() { throw new RuntimeException("Stub!"); }
public  int getSmartStart() { throw new RuntimeException("Stub!"); }
public  int getSmartEnd() { throw new RuntimeException("Stub!"); }
public static  boolean isTerminal(int eventType) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ACTION_ABANDON = 107;
public static final int ACTION_COPY = 101;
public static final int ACTION_CUT = 103;
public static final int ACTION_DRAG = 106;
public static final int ACTION_OTHER = 108;
public static final int ACTION_OVERTYPE = 100;
public static final int ACTION_PASTE = 102;
public static final int ACTION_RESET = 201;
public static final int ACTION_SELECT_ALL = 200;
public static final int ACTION_SHARE = 104;
public static final int ACTION_SMART_SHARE = 105;
public static final android.os.Parcelable.Creator<android.view.textclassifier.SelectionEvent> CREATOR;
public static final int EVENT_AUTO_SELECTION = 5;
public static final int EVENT_SELECTION_MODIFIED = 2;
public static final int EVENT_SELECTION_STARTED = 1;
public static final int EVENT_SMART_SELECTION_MULTI = 4;
public static final int EVENT_SMART_SELECTION_SINGLE = 3;
public static final int INVOCATION_LINK = 2;
public static final int INVOCATION_MANUAL = 1;
public static final int INVOCATION_UNKNOWN = 0;
static { CREATOR = null; }
}
