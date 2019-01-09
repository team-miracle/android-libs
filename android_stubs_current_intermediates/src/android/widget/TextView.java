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

package android.widget;
@android.widget.RemoteViews.RemoteView()
public class TextView
  extends android.view.View
  implements android.view.ViewTreeObserver.OnPreDrawListener
{
public static interface OnEditorActionListener
{
public abstract  boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event);
}
public static enum BufferType
{
EDITABLE(),
NORMAL(),
SPANNABLE();
}
public static class SavedState
  extends android.view.View.BaseSavedState
{
SavedState() { super((android.os.Parcelable)null); throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"hiding"})
public static final android.os.Parcelable.Creator<android.widget.TextView.SavedState> CREATOR;
static { CREATOR = null; }
}
public  TextView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TextView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  TextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  TextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) { throw new RuntimeException("Stub!"); }
public  void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) { throw new RuntimeException("Stub!"); }
public  void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) { throw new RuntimeException("Stub!"); }
public  int getAutoSizeTextType() { throw new RuntimeException("Stub!"); }
public  int getAutoSizeStepGranularity() { throw new RuntimeException("Stub!"); }
public  int getAutoSizeMinTextSize() { throw new RuntimeException("Stub!"); }
public  int getAutoSizeMaxTextSize() { throw new RuntimeException("Stub!"); }
public  int[] getAutoSizeTextAvailableSizes() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setTypeface(android.graphics.Typeface tf, int style) { throw new RuntimeException("Stub!"); }
protected  boolean getDefaultEditable() { throw new RuntimeException("Stub!"); }
protected  android.text.method.MovementMethod getDefaultMovementMethod() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.CapturedViewProperty()
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public  android.text.Editable getEditableText() { throw new RuntimeException("Stub!"); }
public  int getLineHeight() { throw new RuntimeException("Stub!"); }
public final  android.text.Layout getLayout() { throw new RuntimeException("Stub!"); }
public final  android.text.method.KeyListener getKeyListener() { throw new RuntimeException("Stub!"); }
public  void setKeyListener(android.text.method.KeyListener input) { throw new RuntimeException("Stub!"); }
public final  android.text.method.MovementMethod getMovementMethod() { throw new RuntimeException("Stub!"); }
public final  void setMovementMethod(android.text.method.MovementMethod movement) { throw new RuntimeException("Stub!"); }
public final  android.text.method.TransformationMethod getTransformationMethod() { throw new RuntimeException("Stub!"); }
public final  void setTransformationMethod(android.text.method.TransformationMethod method) { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingStart() { throw new RuntimeException("Stub!"); }
public  int getCompoundPaddingEnd() { throw new RuntimeException("Stub!"); }
public  int getExtendedPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getExtendedPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingRight() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingStart() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingEnd() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getTotalPaddingBottom() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawables(android.graphics.drawable.Drawable left, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable right, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable left, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable right, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesRelative(android.graphics.drawable.Drawable start, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable end, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesRelativeWithIntrinsicBounds(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable start, android.graphics.drawable.Drawable top, android.graphics.drawable.Drawable end, android.graphics.drawable.Drawable bottom) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable[] getCompoundDrawables() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawablePadding(int pad) { throw new RuntimeException("Stub!"); }
public  int getCompoundDrawablePadding() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawableTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  android.content.res.ColorStateList getCompoundDrawableTintList() { throw new RuntimeException("Stub!"); }
public  void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() { throw new RuntimeException("Stub!"); }
public  void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
public  void setFirstBaselineToTopHeight(int firstBaselineToTopHeight) { throw new RuntimeException("Stub!"); }
public  void setLastBaselineToBottomHeight(int lastBaselineToBottomHeight) { throw new RuntimeException("Stub!"); }
public  int getFirstBaselineToTopHeight() { throw new RuntimeException("Stub!"); }
public  int getLastBaselineToBottomHeight() { throw new RuntimeException("Stub!"); }
public final  int getAutoLinkMask() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  void setTextAppearance(int resId) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setTextAppearance(android.content.Context context, int resId) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getTextLocale() { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getTextLocales() { throw new RuntimeException("Stub!"); }
public  void setTextLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void setTextLocales(android.os.LocaleList locales) { throw new RuntimeException("Stub!"); }
protected  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="text")
public  float getTextSize() { throw new RuntimeException("Stub!"); }
public  void setTextSize(float size) { throw new RuntimeException("Stub!"); }
public  void setTextSize(int unit, float size) { throw new RuntimeException("Stub!"); }
public  float getTextScaleX() { throw new RuntimeException("Stub!"); }
public  void setTextScaleX(float size) { throw new RuntimeException("Stub!"); }
public  void setTypeface(android.graphics.Typeface tf) { throw new RuntimeException("Stub!"); }
public  android.graphics.Typeface getTypeface() { throw new RuntimeException("Stub!"); }
public  void setElegantTextHeight(boolean elegant) { throw new RuntimeException("Stub!"); }
public  void setFallbackLineSpacing(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isFallbackLineSpacing() { throw new RuntimeException("Stub!"); }
public  boolean isElegantTextHeight() { throw new RuntimeException("Stub!"); }
public  float getLetterSpacing() { throw new RuntimeException("Stub!"); }
public  void setLetterSpacing(float letterSpacing) { throw new RuntimeException("Stub!"); }
public  java.lang.String getFontFeatureSettings() { throw new RuntimeException("Stub!"); }
public  java.lang.String getFontVariationSettings() { throw new RuntimeException("Stub!"); }
public  void setBreakStrategy(int breakStrategy) { throw new RuntimeException("Stub!"); }
public  int getBreakStrategy() { throw new RuntimeException("Stub!"); }
public  void setHyphenationFrequency(int hyphenationFrequency) { throw new RuntimeException("Stub!"); }
public  int getHyphenationFrequency() { throw new RuntimeException("Stub!"); }
public  android.text.PrecomputedText.Params getTextMetricsParams() { throw new RuntimeException("Stub!"); }
public  void setTextMetricsParams(android.text.PrecomputedText.Params params) { throw new RuntimeException("Stub!"); }
public  void setJustificationMode(int justificationMode) { throw new RuntimeException("Stub!"); }
public  int getJustificationMode() { throw new RuntimeException("Stub!"); }
public  void setFontFeatureSettings(java.lang.String fontFeatureSettings) { throw new RuntimeException("Stub!"); }
public  boolean setFontVariationSettings(java.lang.String fontVariationSettings) { throw new RuntimeException("Stub!"); }
public  void setTextColor(int color) { throw new RuntimeException("Stub!"); }
public  void setTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getTextColors() { throw new RuntimeException("Stub!"); }
public final  int getCurrentTextColor() { throw new RuntimeException("Stub!"); }
public  void setHighlightColor(int color) { throw new RuntimeException("Stub!"); }
public  int getHighlightColor() { throw new RuntimeException("Stub!"); }
public final  void setShowSoftInputOnFocus(boolean show) { throw new RuntimeException("Stub!"); }
public final  boolean getShowSoftInputOnFocus() { throw new RuntimeException("Stub!"); }
public  void setShadowLayer(float radius, float dx, float dy, int color) { throw new RuntimeException("Stub!"); }
public  float getShadowRadius() { throw new RuntimeException("Stub!"); }
public  float getShadowDx() { throw new RuntimeException("Stub!"); }
public  float getShadowDy() { throw new RuntimeException("Stub!"); }
public  int getShadowColor() { throw new RuntimeException("Stub!"); }
public  android.text.TextPaint getPaint() { throw new RuntimeException("Stub!"); }
public final  void setAutoLinkMask(int mask) { throw new RuntimeException("Stub!"); }
public final  void setLinksClickable(boolean whether) { throw new RuntimeException("Stub!"); }
public final  boolean getLinksClickable() { throw new RuntimeException("Stub!"); }
public  android.text.style.URLSpan[] getUrls() { throw new RuntimeException("Stub!"); }
public final  void setHintTextColor(int color) { throw new RuntimeException("Stub!"); }
public final  void setHintTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getHintTextColors() { throw new RuntimeException("Stub!"); }
public final  int getCurrentHintTextColor() { throw new RuntimeException("Stub!"); }
public final  void setLinkTextColor(int color) { throw new RuntimeException("Stub!"); }
public final  void setLinkTextColor(android.content.res.ColorStateList colors) { throw new RuntimeException("Stub!"); }
public final  android.content.res.ColorStateList getLinkTextColors() { throw new RuntimeException("Stub!"); }
public  void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
public  int getGravity() { throw new RuntimeException("Stub!"); }
public  int getPaintFlags() { throw new RuntimeException("Stub!"); }
public  void setPaintFlags(int flags) { throw new RuntimeException("Stub!"); }
public  void setHorizontallyScrolling(boolean whether) { throw new RuntimeException("Stub!"); }
public  void setMinLines(int minLines) { throw new RuntimeException("Stub!"); }
public  int getMinLines() { throw new RuntimeException("Stub!"); }
public  void setMinHeight(int minPixels) { throw new RuntimeException("Stub!"); }
public  int getMinHeight() { throw new RuntimeException("Stub!"); }
public  void setMaxLines(int maxLines) { throw new RuntimeException("Stub!"); }
public  int getMaxLines() { throw new RuntimeException("Stub!"); }
public  void setMaxHeight(int maxPixels) { throw new RuntimeException("Stub!"); }
public  int getMaxHeight() { throw new RuntimeException("Stub!"); }
public  void setLines(int lines) { throw new RuntimeException("Stub!"); }
public  void setHeight(int pixels) { throw new RuntimeException("Stub!"); }
public  void setMinEms(int minEms) { throw new RuntimeException("Stub!"); }
public  int getMinEms() { throw new RuntimeException("Stub!"); }
public  void setMinWidth(int minPixels) { throw new RuntimeException("Stub!"); }
public  int getMinWidth() { throw new RuntimeException("Stub!"); }
public  void setMaxEms(int maxEms) { throw new RuntimeException("Stub!"); }
public  int getMaxEms() { throw new RuntimeException("Stub!"); }
public  void setMaxWidth(int maxPixels) { throw new RuntimeException("Stub!"); }
public  int getMaxWidth() { throw new RuntimeException("Stub!"); }
public  void setEms(int ems) { throw new RuntimeException("Stub!"); }
public  void setWidth(int pixels) { throw new RuntimeException("Stub!"); }
public  void setLineSpacing(float add, float mult) { throw new RuntimeException("Stub!"); }
public  float getLineSpacingMultiplier() { throw new RuntimeException("Stub!"); }
public  float getLineSpacingExtra() { throw new RuntimeException("Stub!"); }
public  void setLineHeight(int lineHeight) { throw new RuntimeException("Stub!"); }
public final  void append(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void append(java.lang.CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void setFreezesText(boolean freezesText) { throw new RuntimeException("Stub!"); }
public  boolean getFreezesText() { throw new RuntimeException("Stub!"); }
public final  void setEditableFactory(android.text.Editable.Factory factory) { throw new RuntimeException("Stub!"); }
public final  void setSpannableFactory(android.text.Spannable.Factory factory) { throw new RuntimeException("Stub!"); }
public final  void setText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public final  void setTextKeepState(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.CharSequence text, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setText(char[] text, int start, int len) { throw new RuntimeException("Stub!"); }
public final  void setTextKeepState(java.lang.CharSequence text, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setText(int resid) { throw new RuntimeException("Stub!"); }
public final  void setText(int resid, android.widget.TextView.BufferType type) { throw new RuntimeException("Stub!"); }
public final  void setHint(java.lang.CharSequence hint) { throw new RuntimeException("Stub!"); }
public final  void setHint(int resid) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.CapturedViewProperty()
public  java.lang.CharSequence getHint() { throw new RuntimeException("Stub!"); }
public  void setInputType(int type) { throw new RuntimeException("Stub!"); }
public  void setRawInputType(int type) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); }
public  int getImeOptions() { throw new RuntimeException("Stub!"); }
public  void setImeActionLabel(java.lang.CharSequence label, int actionId) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getImeActionLabel() { throw new RuntimeException("Stub!"); }
public  int getImeActionId() { throw new RuntimeException("Stub!"); }
public  void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener l) { throw new RuntimeException("Stub!"); }
public  void onEditorAction(int actionCode) { throw new RuntimeException("Stub!"); }
public  void setPrivateImeOptions(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPrivateImeOptions() { throw new RuntimeException("Stub!"); }
public  void setInputExtras(int xmlResId) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getInputExtras(boolean create) { throw new RuntimeException("Stub!"); }
public  void setImeHintLocales(android.os.LocaleList hintLocales) { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getImeHintLocales() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getError() { throw new RuntimeException("Stub!"); }
public  void setError(java.lang.CharSequence error) { throw new RuntimeException("Stub!"); }
public  void setError(java.lang.CharSequence error, android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
protected  boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void setFilters(android.text.InputFilter[] filters) { throw new RuntimeException("Stub!"); }
public  android.text.InputFilter[] getFilters() { throw new RuntimeException("Stub!"); }
public  boolean onPreDraw() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
public  void onScreenStateChanged(int screenState) { throw new RuntimeException("Stub!"); }
protected  boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
protected  int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  boolean verifyDrawable(android.graphics.drawable.Drawable who) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
public  void invalidateDrawable(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); }
public  boolean isTextSelectable() { throw new RuntimeException("Stub!"); }
public  void setTextIsSelectable(boolean selectable) { throw new RuntimeException("Stub!"); }
protected  int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
protected  void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void getFocusedRect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
public  int getLineCount() { throw new RuntimeException("Stub!"); }
public  int getLineBounds(int line, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
public  int getBaseline() { throw new RuntimeException("Stub!"); }
public  android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
public  boolean onKeyPreIme(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyMultiple(int keyCode, int repeatCount, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onCheckIsTextEditor() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
public  boolean extractText(android.view.inputmethod.ExtractedTextRequest request, android.view.inputmethod.ExtractedText outText) { throw new RuntimeException("Stub!"); }
public  void setExtractedText(android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
public  void onCommitCompletion(android.view.inputmethod.CompletionInfo text) { throw new RuntimeException("Stub!"); }
public  void onCommitCorrection(android.view.inputmethod.CorrectionInfo info) { throw new RuntimeException("Stub!"); }
public  void beginBatchEdit() { throw new RuntimeException("Stub!"); }
public  void endBatchEdit() { throw new RuntimeException("Stub!"); }
public  void onBeginBatchEdit() { throw new RuntimeException("Stub!"); }
public  void onEndBatchEdit() { throw new RuntimeException("Stub!"); }
public  boolean onPrivateIMECommand(java.lang.String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void setIncludeFontPadding(boolean includepad) { throw new RuntimeException("Stub!"); }
public  boolean getIncludeFontPadding() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  boolean bringPointIntoView(int offset) { throw new RuntimeException("Stub!"); }
public  boolean moveCursorToVisibleOffset() { throw new RuntimeException("Stub!"); }
public  void computeScroll() { throw new RuntimeException("Stub!"); }
public  void debug(int depth) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="text")
public  int getSelectionStart() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="text")
public  int getSelectionEnd() { throw new RuntimeException("Stub!"); }
public  boolean hasSelection() { throw new RuntimeException("Stub!"); }
public  void setSingleLine() { throw new RuntimeException("Stub!"); }
public  void setAllCaps(boolean allCaps) { throw new RuntimeException("Stub!"); }
public  boolean isAllCaps() { throw new RuntimeException("Stub!"); }
public  void setSingleLine(boolean singleLine) { throw new RuntimeException("Stub!"); }
public  void setEllipsize(android.text.TextUtils.TruncateAt where) { throw new RuntimeException("Stub!"); }
public  void setMarqueeRepeatLimit(int marqueeLimit) { throw new RuntimeException("Stub!"); }
public  int getMarqueeRepeatLimit() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  android.text.TextUtils.TruncateAt getEllipsize() { throw new RuntimeException("Stub!"); }
public  void setSelectAllOnFocus(boolean selectAllOnFocus) { throw new RuntimeException("Stub!"); }
public  void setCursorVisible(boolean visible) { throw new RuntimeException("Stub!"); }
public  boolean isCursorVisible() { throw new RuntimeException("Stub!"); }
protected  void onTextChanged(java.lang.CharSequence text, int start, int lengthBefore, int lengthAfter) { throw new RuntimeException("Stub!"); }
protected  void onSelectionChanged(int selStart, int selEnd) { throw new RuntimeException("Stub!"); }
public  void addTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
public  void removeTextChangedListener(android.text.TextWatcher watcher) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
protected  void onVisibilityChanged(android.view.View changedView, int visibility) { throw new RuntimeException("Stub!"); }
public  void clearComposingText() { throw new RuntimeException("Stub!"); }
public  void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
protected  void onCreateContextMenu(android.view.ContextMenu menu) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean didTouchFocusSelect() { throw new RuntimeException("Stub!"); }
public  void cancelLongPress() { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void setScroller(android.widget.Scroller s) { throw new RuntimeException("Stub!"); }
protected  float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
public  void findViewsWithText(java.util.ArrayList<android.view.View> outViews, java.lang.CharSequence searched, int flags) { throw new RuntimeException("Stub!"); }
public  boolean onKeyShortcut(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void onProvideStructure(android.view.ViewStructure structure) { throw new RuntimeException("Stub!"); }
public  void onProvideAutofillStructure(android.view.ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
public  void autofill(android.view.autofill.AutofillValue value) { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
public  void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo info, java.lang.String extraDataKey, android.os.Bundle arguments) { throw new RuntimeException("Stub!"); }
public  void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
public  boolean isInputMethodTarget() { throw new RuntimeException("Stub!"); }
public  boolean onTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); }
public  boolean performLongClick() { throw new RuntimeException("Stub!"); }
protected  void onScrollChanged(int horiz, int vert, int oldHoriz, int oldVert) { throw new RuntimeException("Stub!"); }
public  boolean isSuggestionsEnabled() { throw new RuntimeException("Stub!"); }
public  void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); }
public  android.view.ActionMode.Callback getCustomSelectionActionModeCallback() { throw new RuntimeException("Stub!"); }
public  void setCustomInsertionActionModeCallback(android.view.ActionMode.Callback actionModeCallback) { throw new RuntimeException("Stub!"); }
public  android.view.ActionMode.Callback getCustomInsertionActionModeCallback() { throw new RuntimeException("Stub!"); }
public  void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) { throw new RuntimeException("Stub!"); }
public  android.view.textclassifier.TextClassifier getTextClassifier() { throw new RuntimeException("Stub!"); }
public  int getOffsetForPosition(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean onDragEvent(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
}
