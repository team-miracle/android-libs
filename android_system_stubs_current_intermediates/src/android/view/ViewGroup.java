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
public abstract class ViewGroup
  extends android.view.View
  implements android.view.ViewParent, android.view.ViewManager
{
public static interface OnHierarchyChangeListener
{
public abstract  void onChildViewAdded(android.view.View parent, android.view.View child);
public abstract  void onChildViewRemoved(android.view.View parent, android.view.View child);
}
public static class LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { throw new RuntimeException("Stub!"); }
protected  void setBaseAttributes(android.content.res.TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
public  void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
@java.lang.Deprecated()
public static final int FILL_PARENT = -1;
public static final int MATCH_PARENT = -1;
public static final int WRAP_CONTENT = -2;
@android.view.ViewDebug.ExportedProperty(category="layout",mapping={@android.view.ViewDebug.IntToString(from=-1,to="MATCH_PARENT"),@android.view.ViewDebug.IntToString(from=-2,to="WRAP_CONTENT")})
public int height;
public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;
@android.view.ViewDebug.ExportedProperty(category="layout",mapping={@android.view.ViewDebug.IntToString(from=-1,to="MATCH_PARENT"),@android.view.ViewDebug.IntToString(from=-2,to="WRAP_CONTENT")})
public int width;
}
public static class MarginLayoutParams
  extends android.view.ViewGroup.LayoutParams
{
public  MarginLayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(int width, int height) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  MarginLayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  void setMargins(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setMarginStart(int start) { throw new RuntimeException("Stub!"); }
public  int getMarginStart() { throw new RuntimeException("Stub!"); }
public  void setMarginEnd(int end) { throw new RuntimeException("Stub!"); }
public  int getMarginEnd() { throw new RuntimeException("Stub!"); }
public  boolean isMarginRelative() { throw new RuntimeException("Stub!"); }
public  void setLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  int getLayoutDirection() { throw new RuntimeException("Stub!"); }
public  void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="layout")
public int bottomMargin;
@android.view.ViewDebug.ExportedProperty(category="layout")
public int leftMargin;
@android.view.ViewDebug.ExportedProperty(category="layout")
public int rightMargin;
@android.view.ViewDebug.ExportedProperty(category="layout")
public int topMargin;
}
public  ViewGroup(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ViewGroup(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ViewGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  ViewGroup(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="focus",mapping={@android.view.ViewDebug.IntToString(from=131072,to="FOCUS_BEFORE_DESCENDANTS"),@android.view.ViewDebug.IntToString(from=262144,to="FOCUS_AFTER_DESCENDANTS"),@android.view.ViewDebug.IntToString(from=393216,to="FOCUS_BLOCK_DESCENDANTS")})
public  int getDescendantFocusability() { throw new RuntimeException("Stub!"); }
public  void setDescendantFocusability(int focusability) { throw new RuntimeException("Stub!"); }
public  void requestChildFocus(android.view.View child, android.view.View focused) { throw new RuntimeException("Stub!"); }
public  void focusableViewAvailable(android.view.View v) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
public  android.view.ActionMode startActionModeForChild(android.view.View originalView, android.view.ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
public  android.view.ActionMode startActionModeForChild(android.view.View originalView, android.view.ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
public  android.view.View focusSearch(android.view.View focused, int direction) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
public  boolean requestSendAccessibilityEvent(android.view.View child, android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onRequestSendAccessibilityEvent(android.view.View child, android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  void childHasTransientStateChanged(android.view.View child, boolean childHasTransientState) { throw new RuntimeException("Stub!"); }
public  boolean hasTransientState() { throw new RuntimeException("Stub!"); }
public  boolean dispatchUnhandledMove(android.view.View focused, int direction) { throw new RuntimeException("Stub!"); }
public  void clearChildFocus(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void clearFocus() { throw new RuntimeException("Stub!"); }
public  android.view.View getFocusedChild() { throw new RuntimeException("Stub!"); }
public  boolean hasFocus() { throw new RuntimeException("Stub!"); }
public  android.view.View findFocus() { throw new RuntimeException("Stub!"); }
public  void addFocusables(java.util.ArrayList<android.view.View> views, int direction, int focusableMode) { throw new RuntimeException("Stub!"); }
public  void addKeyboardNavigationClusters(java.util.Collection<android.view.View> views, int direction) { throw new RuntimeException("Stub!"); }
public  void setTouchscreenBlocksFocus(boolean touchscreenBlocksFocus) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="focus")
public  boolean getTouchscreenBlocksFocus() { throw new RuntimeException("Stub!"); }
public  void findViewsWithText(java.util.ArrayList<android.view.View> outViews, java.lang.CharSequence text, int flags) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
public  void addTouchables(java.util.ArrayList<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void dispatchDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
protected  void dispatchVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
public  void dispatchConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void recomputeViewAttributes(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void bringChildToFront(android.view.View child) { throw new RuntimeException("Stub!"); }
public  boolean dispatchDragEvent(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
public  void dispatchWindowSystemUiVisiblityChanged(int visible) { throw new RuntimeException("Stub!"); }
public  void dispatchSystemUiVisibilityChanged(int visible) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEventPreIme(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyShortcutEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchCapturedPointerEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void dispatchPointerCaptureChanged(boolean hasCapture) { throw new RuntimeException("Stub!"); }
public  android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"ConstantConditions"})
protected  boolean dispatchHoverEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void addChildrenForAccessibility(java.util.ArrayList<android.view.View> outChildren) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptHoverEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
protected  boolean dispatchGenericPointerEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
protected  boolean dispatchGenericFocusedEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean dispatchTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void setMotionEventSplittingEnabled(boolean split) { throw new RuntimeException("Stub!"); }
public  boolean isMotionEventSplittingEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isTransitionGroup() { throw new RuntimeException("Stub!"); }
public  void setTransitionGroup(boolean isTransitionGroup) { throw new RuntimeException("Stub!"); }
public  void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean requestFocus(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"ConstantConditions"})
protected  boolean onRequestFocusInDescendants(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  boolean restoreDefaultFocus() { throw new RuntimeException("Stub!"); }
public  void dispatchProvideStructure(android.view.ViewStructure structure) { throw new RuntimeException("Stub!"); }
public  void dispatchProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void notifySubtreeAccessibilityStateChanged(android.view.View child, android.view.View source, int changeType) { throw new RuntimeException("Stub!"); }
public  boolean onNestedPrePerformAccessibilityAction(android.view.View target, int action, android.os.Bundle args) { throw new RuntimeException("Stub!"); }
protected  void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
protected  void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> container) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  void setChildrenDrawingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroupOverlay getOverlay() { throw new RuntimeException("Stub!"); }
protected  int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
protected  boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long drawingTime) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="drawing")
public  boolean getClipChildren() { throw new RuntimeException("Stub!"); }
public  void setClipChildren(boolean clipChildren) { throw new RuntimeException("Stub!"); }
public  void setClipToPadding(boolean clipToPadding) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="drawing")
public  boolean getClipToPadding() { throw new RuntimeException("Stub!"); }
public  void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  void dispatchSetActivated(boolean activated) { throw new RuntimeException("Stub!"); }
protected  void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
public  void dispatchDrawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
protected  void setStaticTransformationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
protected  boolean getChildStaticTransformation(android.view.View child, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int width, int height) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void onViewAdded(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void onViewRemoved(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
protected  boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  boolean addViewInLayout(android.view.View child, int index, android.view.ViewGroup.LayoutParams params, boolean preventRequestLayout) { throw new RuntimeException("Stub!"); }
protected  void cleanupLayoutState(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void attachLayoutAnimationParameters(android.view.View child, android.view.ViewGroup.LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); }
public  void removeView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void removeViewInLayout(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void removeViewsInLayout(int start, int count) { throw new RuntimeException("Stub!"); }
public  void removeViewAt(int index) { throw new RuntimeException("Stub!"); }
public  void removeViews(int start, int count) { throw new RuntimeException("Stub!"); }
public  void setLayoutTransition(android.animation.LayoutTransition transition) { throw new RuntimeException("Stub!"); }
public  android.animation.LayoutTransition getLayoutTransition() { throw new RuntimeException("Stub!"); }
public  void removeAllViews() { throw new RuntimeException("Stub!"); }
public  void removeAllViewsInLayout() { throw new RuntimeException("Stub!"); }
protected  void removeDetachedView(android.view.View child, boolean animate) { throw new RuntimeException("Stub!"); }
protected  void attachViewToParent(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
protected  void detachViewFromParent(android.view.View child) { throw new RuntimeException("Stub!"); }
protected  void detachViewFromParent(int index) { throw new RuntimeException("Stub!"); }
protected  void detachViewsFromParent(int start, int count) { throw new RuntimeException("Stub!"); }
protected  void detachAllViewsFromParent() { throw new RuntimeException("Stub!"); }
public  void onDescendantInvalidated(android.view.View child, android.view.View target) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public final  void invalidateChild(android.view.View child, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.view.ViewParent invalidateChildInParent(int[] location, android.graphics.Rect dirty) { throw new RuntimeException("Stub!"); }
public final  void offsetDescendantRectToMyCoords(android.view.View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public final  void offsetRectIntoDescendantCoords(android.view.View descendant, android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  boolean getChildVisibleRect(android.view.View child, android.graphics.Rect r, android.graphics.Point offset) { throw new RuntimeException("Stub!"); }
public final  void layout(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected abstract  void onLayout(boolean changed, int l, int t, int r, int b);
protected  boolean canAnimate() { throw new RuntimeException("Stub!"); }
public  void startLayoutAnimation() { throw new RuntimeException("Stub!"); }
public  void scheduleLayoutAnimation() { throw new RuntimeException("Stub!"); }
public  void setLayoutAnimation(android.view.animation.LayoutAnimationController controller) { throw new RuntimeException("Stub!"); }
public  android.view.animation.LayoutAnimationController getLayoutAnimation() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isAnimationCacheEnabled() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setAnimationCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isAlwaysDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setAlwaysDrawnWithCacheEnabled(boolean always) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  boolean isChildrenDrawnWithCacheEnabled() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
protected  void setChildrenDrawnWithCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="drawing")
protected  boolean isChildrenDrawingOrderEnabled() { throw new RuntimeException("Stub!"); }
protected  void setChildrenDrawingOrderEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
@android.view.ViewDebug.ExportedProperty(category="drawing",mapping={@android.view.ViewDebug.IntToString(from=0,to="NONE"),@android.view.ViewDebug.IntToString(from=1,to="ANIMATION"),@android.view.ViewDebug.IntToString(from=2,to="SCROLLING"),@android.view.ViewDebug.IntToString(from=3,to="ALL")})
public  int getPersistentDrawingCache() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setPersistentDrawingCache(int drawingCacheToKeep) { throw new RuntimeException("Stub!"); }
public  int getLayoutMode() { throw new RuntimeException("Stub!"); }
public  void setLayoutMode(int layoutMode) { throw new RuntimeException("Stub!"); }
public  android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  void debug(int depth) { throw new RuntimeException("Stub!"); }
public  int indexOfChild(android.view.View child) { throw new RuntimeException("Stub!"); }
public  int getChildCount() { throw new RuntimeException("Stub!"); }
public  android.view.View getChildAt(int index) { throw new RuntimeException("Stub!"); }
protected  void measureChildren(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void measureChild(android.view.View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void measureChildWithMargins(android.view.View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); }
public static  int getChildMeasureSpec(int spec, int padding, int childDimension) { throw new RuntimeException("Stub!"); }
public  void clearDisappearingChildren() { throw new RuntimeException("Stub!"); }
public  void startViewTransition(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void endViewTransition(android.view.View view) { throw new RuntimeException("Stub!"); }
public  boolean gatherTransparentRegion(android.graphics.Region region) { throw new RuntimeException("Stub!"); }
public  void requestTransparentRegion(android.view.View child) { throw new RuntimeException("Stub!"); }
public  android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets insets) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Animation.AnimationListener getLayoutAnimationListener() { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
protected  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
public  void setAddStatesFromChildren(boolean addsStates) { throw new RuntimeException("Stub!"); }
public  boolean addStatesFromChildren() { throw new RuntimeException("Stub!"); }
public  void childDrawableStateChanged(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener animationListener) { throw new RuntimeException("Stub!"); }
public  boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
public  boolean onStartNestedScroll(android.view.View child, android.view.View target, int nestedScrollAxes) { throw new RuntimeException("Stub!"); }
public  void onNestedScrollAccepted(android.view.View child, android.view.View target, int axes) { throw new RuntimeException("Stub!"); }
public  void onStopNestedScroll(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) { throw new RuntimeException("Stub!"); }
public  void onNestedPreScroll(android.view.View target, int dx, int dy, int[] consumed) { throw new RuntimeException("Stub!"); }
public  boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) { throw new RuntimeException("Stub!"); }
public  boolean onNestedPreFling(android.view.View target, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
public  int getNestedScrollAxes() { throw new RuntimeException("Stub!"); }
protected static final int CLIP_TO_PADDING_MASK = 34;
public static final int FOCUS_AFTER_DESCENDANTS = 262144;
public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
@java.lang.Deprecated()
public static final int PERSISTENT_ALL_CACHES = 3;
@java.lang.Deprecated()
public static final int PERSISTENT_ANIMATION_CACHE = 1;
@java.lang.Deprecated()
public static final int PERSISTENT_NO_CACHE = 0;
@java.lang.Deprecated()
public static final int PERSISTENT_SCROLLING_CACHE = 2;
}
