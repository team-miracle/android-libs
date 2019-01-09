/*
* Copyright (C) 2006 The Android Open Source Project
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
public interface ViewParent
{
public abstract  void requestLayout();
public abstract  boolean isLayoutRequested();
public abstract  void requestTransparentRegion(android.view.View child);
default public  void onDescendantInvalidated(android.view.View child, android.view.View target) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public abstract  void invalidateChild(android.view.View child, android.graphics.Rect r);
@java.lang.Deprecated()
public abstract  android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect r);
public abstract  android.view.ViewParent getParent();
public abstract  void requestChildFocus(android.view.View child, android.view.View focused);
public abstract  void recomputeViewAttributes(android.view.View child);
public abstract  void clearChildFocus(android.view.View child);
public abstract  boolean getChildVisibleRect(android.view.View child, android.graphics.Rect r, android.graphics.Point offset);
public abstract  android.view.View focusSearch(android.view.View v, int direction);
public abstract  android.view.View keyboardNavigationClusterSearch(android.view.View currentCluster, int direction);
public abstract  void bringChildToFront(android.view.View child);
public abstract  void focusableViewAvailable(android.view.View v);
public abstract  boolean showContextMenuForChild(android.view.View originalView);
public abstract  boolean showContextMenuForChild(android.view.View originalView, float x, float y);
public abstract  void createContextMenu(android.view.ContextMenu menu);
public abstract  android.view.ActionMode startActionModeForChild(android.view.View originalView, android.view.ActionMode.Callback callback);
public abstract  android.view.ActionMode startActionModeForChild(android.view.View originalView, android.view.ActionMode.Callback callback, int type);
public abstract  void childDrawableStateChanged(android.view.View child);
public abstract  void requestDisallowInterceptTouchEvent(boolean disallowIntercept);
public abstract  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate);
public abstract  boolean requestSendAccessibilityEvent(android.view.View child, android.view.accessibility.AccessibilityEvent event);
public abstract  void childHasTransientStateChanged(android.view.View child, boolean hasTransientState);
public abstract  void requestFitSystemWindows();
public abstract  android.view.ViewParent getParentForAccessibility();
public abstract  void notifySubtreeAccessibilityStateChanged(android.view.View child, android.view.View source, int changeType);
public abstract  boolean canResolveLayoutDirection();
public abstract  boolean isLayoutDirectionResolved();
public abstract  int getLayoutDirection();
public abstract  boolean canResolveTextDirection();
public abstract  boolean isTextDirectionResolved();
public abstract  int getTextDirection();
public abstract  boolean canResolveTextAlignment();
public abstract  boolean isTextAlignmentResolved();
public abstract  int getTextAlignment();
public abstract  boolean onStartNestedScroll(android.view.View child, android.view.View target, int nestedScrollAxes);
public abstract  void onNestedScrollAccepted(android.view.View child, android.view.View target, int nestedScrollAxes);
public abstract  void onStopNestedScroll(android.view.View target);
public abstract  void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed);
public abstract  void onNestedPreScroll(android.view.View target, int dx, int dy, int[] consumed);
public abstract  boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed);
public abstract  boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY);
public abstract  boolean onNestedPrePerformAccessibilityAction(android.view.View target, int action, android.os.Bundle arguments);
}
