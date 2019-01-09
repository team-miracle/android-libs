/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.view.accessibility;
public class AccessibilityNodeInfo
  implements android.os.Parcelable
{
public static final class AccessibilityAction
{
public  AccessibilityAction(int actionId, java.lang.CharSequence label) { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLabel() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_ACCESSIBILITY_FOCUS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_FOCUS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_SELECTION;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLICK;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COLLAPSE;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CONTEXT_CLICK;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COPY;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CUT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DISMISS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_EXPAND;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_FOCUS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_HIDE_TOOLTIP;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_LONG_CLICK;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_MOVE_WINDOW;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_HTML_ELEMENT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PASTE;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_BACKWARD;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_DOWN;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_FORWARD;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_LEFT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_RIGHT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_TO_POSITION;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_UP;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SELECT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_PROGRESS;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_SELECTION;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_TEXT;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_ON_SCREEN;
public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TOOLTIP;
static { ACTION_ACCESSIBILITY_FOCUS = null; ACTION_CLEAR_ACCESSIBILITY_FOCUS = null; ACTION_CLEAR_FOCUS = null; ACTION_CLEAR_SELECTION = null; ACTION_CLICK = null; ACTION_COLLAPSE = null; ACTION_CONTEXT_CLICK = null; ACTION_COPY = null; ACTION_CUT = null; ACTION_DISMISS = null; ACTION_EXPAND = null; ACTION_FOCUS = null; ACTION_HIDE_TOOLTIP = null; ACTION_LONG_CLICK = null; ACTION_MOVE_WINDOW = null; ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null; ACTION_NEXT_HTML_ELEMENT = null; ACTION_PASTE = null; ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null; ACTION_PREVIOUS_HTML_ELEMENT = null; ACTION_SCROLL_BACKWARD = null; ACTION_SCROLL_DOWN = null; ACTION_SCROLL_FORWARD = null; ACTION_SCROLL_LEFT = null; ACTION_SCROLL_RIGHT = null; ACTION_SCROLL_TO_POSITION = null; ACTION_SCROLL_UP = null; ACTION_SELECT = null; ACTION_SET_PROGRESS = null; ACTION_SET_SELECTION = null; ACTION_SET_TEXT = null; ACTION_SHOW_ON_SCREEN = null; ACTION_SHOW_TOOLTIP = null; }
}
public static final class RangeInfo
{
RangeInfo() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int type, float min, float max, float current) { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  float getMin() { throw new RuntimeException("Stub!"); }
public  float getMax() { throw new RuntimeException("Stub!"); }
public  float getCurrent() { throw new RuntimeException("Stub!"); }
public static final int RANGE_TYPE_FLOAT = 1;
public static final int RANGE_TYPE_INT = 0;
public static final int RANGE_TYPE_PERCENT = 2;
}
public static final class CollectionInfo
{
CollectionInfo() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int rowCount, int columnCount, boolean hierarchical) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int rowCount, int columnCount, boolean hierarchical, int selectionMode) { throw new RuntimeException("Stub!"); }
public  int getRowCount() { throw new RuntimeException("Stub!"); }
public  int getColumnCount() { throw new RuntimeException("Stub!"); }
public  boolean isHierarchical() { throw new RuntimeException("Stub!"); }
public  int getSelectionMode() { throw new RuntimeException("Stub!"); }
public static final int SELECTION_MODE_MULTIPLE = 2;
public static final int SELECTION_MODE_NONE = 0;
public static final int SELECTION_MODE_SINGLE = 1;
}
public static final class CollectionItemInfo
{
CollectionItemInfo() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int rowIndex, int rowSpan, int columnIndex, int columnSpan, boolean heading, boolean selected) { throw new RuntimeException("Stub!"); }
public  int getColumnIndex() { throw new RuntimeException("Stub!"); }
public  int getRowIndex() { throw new RuntimeException("Stub!"); }
public  int getColumnSpan() { throw new RuntimeException("Stub!"); }
public  int getRowSpan() { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean isHeading() { throw new RuntimeException("Stub!"); }
public  boolean isSelected() { throw new RuntimeException("Stub!"); }
}
AccessibilityNodeInfo() { throw new RuntimeException("Stub!"); }
public  void setSource(android.view.View source) { throw new RuntimeException("Stub!"); }
public  void setSource(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo focusSearch(int direction) { throw new RuntimeException("Stub!"); }
public  int getWindowId() { throw new RuntimeException("Stub!"); }
public  boolean refresh() { throw new RuntimeException("Stub!"); }
public  boolean refreshWithExtraData(java.lang.String extraDataKey, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
public  int getChildCount() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getChild(int index) { throw new RuntimeException("Stub!"); }
public  void addChild(android.view.View child) { throw new RuntimeException("Stub!"); }
public  boolean removeChild(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void addChild(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  boolean removeChild(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getActionList() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getActions() { throw new RuntimeException("Stub!"); }
public  void addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction action) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void addAction(int action) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void removeAction(int action) { throw new RuntimeException("Stub!"); }
public  boolean removeAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction action) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getTraversalBefore() { throw new RuntimeException("Stub!"); }
public  void setTraversalBefore(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setTraversalBefore(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getTraversalAfter() { throw new RuntimeException("Stub!"); }
public  void setTraversalAfter(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void setTraversalAfter(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getAvailableExtraData() { throw new RuntimeException("Stub!"); }
public  void setAvailableExtraData(java.util.List<java.lang.String> extraDataKeys) { throw new RuntimeException("Stub!"); }
public  void setMaxTextLength(int max) { throw new RuntimeException("Stub!"); }
public  int getMaxTextLength() { throw new RuntimeException("Stub!"); }
public  void setMovementGranularities(int granularities) { throw new RuntimeException("Stub!"); }
public  int getMovementGranularities() { throw new RuntimeException("Stub!"); }
public  boolean performAction(int action) { throw new RuntimeException("Stub!"); }
public  boolean performAction(int action, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String text) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(java.lang.String viewId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityWindowInfo getWindow() { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getParent() { throw new RuntimeException("Stub!"); }
public  void setParent(android.view.View parent) { throw new RuntimeException("Stub!"); }
public  void setParent(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  void getBoundsInParent(android.graphics.Rect outBounds) { throw new RuntimeException("Stub!"); }
public  void setBoundsInParent(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  void getBoundsInScreen(android.graphics.Rect outBounds) { throw new RuntimeException("Stub!"); }
public  void setBoundsInScreen(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  boolean isCheckable() { throw new RuntimeException("Stub!"); }
public  void setCheckable(boolean checkable) { throw new RuntimeException("Stub!"); }
public  boolean isChecked() { throw new RuntimeException("Stub!"); }
public  void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
public  boolean isFocusable() { throw new RuntimeException("Stub!"); }
public  void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
public  boolean isFocused() { throw new RuntimeException("Stub!"); }
public  void setFocused(boolean focused) { throw new RuntimeException("Stub!"); }
public  boolean isVisibleToUser() { throw new RuntimeException("Stub!"); }
public  void setVisibleToUser(boolean visibleToUser) { throw new RuntimeException("Stub!"); }
public  boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
public  void setAccessibilityFocused(boolean focused) { throw new RuntimeException("Stub!"); }
public  boolean isSelected() { throw new RuntimeException("Stub!"); }
public  void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  boolean isClickable() { throw new RuntimeException("Stub!"); }
public  void setClickable(boolean clickable) { throw new RuntimeException("Stub!"); }
public  boolean isLongClickable() { throw new RuntimeException("Stub!"); }
public  void setLongClickable(boolean longClickable) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isPassword() { throw new RuntimeException("Stub!"); }
public  void setPassword(boolean password) { throw new RuntimeException("Stub!"); }
public  boolean isScrollable() { throw new RuntimeException("Stub!"); }
public  void setScrollable(boolean scrollable) { throw new RuntimeException("Stub!"); }
public  boolean isEditable() { throw new RuntimeException("Stub!"); }
public  void setEditable(boolean editable) { throw new RuntimeException("Stub!"); }
public  void setPaneTitle(java.lang.CharSequence paneTitle) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPaneTitle() { throw new RuntimeException("Stub!"); }
public  int getDrawingOrder() { throw new RuntimeException("Stub!"); }
public  void setDrawingOrder(int drawingOrderInParent) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() { throw new RuntimeException("Stub!"); }
public  void setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo collectionInfo) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() { throw new RuntimeException("Stub!"); }
public  void setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() { throw new RuntimeException("Stub!"); }
public  void setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo rangeInfo) { throw new RuntimeException("Stub!"); }
public  boolean isContentInvalid() { throw new RuntimeException("Stub!"); }
public  void setContentInvalid(boolean contentInvalid) { throw new RuntimeException("Stub!"); }
public  boolean isContextClickable() { throw new RuntimeException("Stub!"); }
public  void setContextClickable(boolean contextClickable) { throw new RuntimeException("Stub!"); }
public  int getLiveRegion() { throw new RuntimeException("Stub!"); }
public  void setLiveRegion(int mode) { throw new RuntimeException("Stub!"); }
public  boolean isMultiLine() { throw new RuntimeException("Stub!"); }
public  void setMultiLine(boolean multiLine) { throw new RuntimeException("Stub!"); }
public  boolean canOpenPopup() { throw new RuntimeException("Stub!"); }
public  void setCanOpenPopup(boolean opensPopup) { throw new RuntimeException("Stub!"); }
public  boolean isDismissable() { throw new RuntimeException("Stub!"); }
public  void setDismissable(boolean dismissable) { throw new RuntimeException("Stub!"); }
public  boolean isImportantForAccessibility() { throw new RuntimeException("Stub!"); }
public  void setImportantForAccessibility(boolean important) { throw new RuntimeException("Stub!"); }
public  boolean isScreenReaderFocusable() { throw new RuntimeException("Stub!"); }
public  void setScreenReaderFocusable(boolean screenReaderFocusable) { throw new RuntimeException("Stub!"); }
public  boolean isShowingHintText() { throw new RuntimeException("Stub!"); }
public  void setShowingHintText(boolean showingHintText) { throw new RuntimeException("Stub!"); }
public  boolean isHeading() { throw new RuntimeException("Stub!"); }
public  void setHeading(boolean isHeading) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getPackageName() { throw new RuntimeException("Stub!"); }
public  void setPackageName(java.lang.CharSequence packageName) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getClassName() { throw new RuntimeException("Stub!"); }
public  void setClassName(java.lang.CharSequence className) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getHintText() { throw new RuntimeException("Stub!"); }
public  void setHintText(java.lang.CharSequence hintText) { throw new RuntimeException("Stub!"); }
public  void setError(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getError() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  void setContentDescription(java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTooltipText() { throw new RuntimeException("Stub!"); }
public  void setTooltipText(java.lang.CharSequence tooltipText) { throw new RuntimeException("Stub!"); }
public  void setLabelFor(android.view.View labeled) { throw new RuntimeException("Stub!"); }
public  void setLabelFor(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getLabelFor() { throw new RuntimeException("Stub!"); }
public  void setLabeledBy(android.view.View label) { throw new RuntimeException("Stub!"); }
public  void setLabeledBy(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public  android.view.accessibility.AccessibilityNodeInfo getLabeledBy() { throw new RuntimeException("Stub!"); }
public  void setViewIdResourceName(java.lang.String viewIdResName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getViewIdResourceName() { throw new RuntimeException("Stub!"); }
public  int getTextSelectionStart() { throw new RuntimeException("Stub!"); }
public  int getTextSelectionEnd() { throw new RuntimeException("Stub!"); }
public  void setTextSelection(int start, int end) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  void setInputType(int inputType) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View source) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View root, int virtualDescendantId) { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo obtain() { throw new RuntimeException("Stub!"); }
public static  android.view.accessibility.AccessibilityNodeInfo obtain(android.view.accessibility.AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public static  void setNumInstancesInUseCounter(java.util.concurrent.atomic.AtomicInteger counter) { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  void writeToParcelNoRecycle(android.os.Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object object) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
public static final int ACTION_CLEAR_FOCUS = 2;
public static final int ACTION_CLEAR_SELECTION = 8;
public static final int ACTION_CLICK = 16;
public static final int ACTION_COLLAPSE = 524288;
public static final int ACTION_COPY = 16384;
public static final int ACTION_CUT = 65536;
public static final int ACTION_DISMISS = 1048576;
public static final int ACTION_EXPAND = 262144;
public static final int ACTION_FOCUS = 1;
public static final int ACTION_LONG_CLICK = 32;
public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
public static final int ACTION_PASTE = 32768;
public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
public static final int ACTION_SCROLL_BACKWARD = 8192;
public static final int ACTION_SCROLL_FORWARD = 4096;
public static final int ACTION_SELECT = 4;
public static final int ACTION_SET_SELECTION = 131072;
public static final int ACTION_SET_TEXT = 2097152;
public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo> CREATOR;
public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
public static final int FOCUS_ACCESSIBILITY = 2;
public static final int FOCUS_INPUT = 1;
public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
public static final int MOVEMENT_GRANULARITY_LINE = 4;
public static final int MOVEMENT_GRANULARITY_PAGE = 16;
public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
public static final int MOVEMENT_GRANULARITY_WORD = 2;
static { CREATOR = null; }
}
