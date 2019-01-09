package android.app.assist;
public class AssistStructure
  implements android.os.Parcelable
{
public static class WindowNode
{
WindowNode() { throw new RuntimeException("Stub!"); }
public  int getLeft() { throw new RuntimeException("Stub!"); }
public  int getTop() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  int getDisplayId() { throw new RuntimeException("Stub!"); }
public  android.app.assist.AssistStructure.ViewNode getRootViewNode() { throw new RuntimeException("Stub!"); }
}
public static class ViewNode
{
ViewNode() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIdPackage() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIdType() { throw new RuntimeException("Stub!"); }
public  java.lang.String getIdEntry() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillId getAutofillId() { throw new RuntimeException("Stub!"); }
public  int getAutofillType() { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getAutofillHints() { throw new RuntimeException("Stub!"); }
public  android.view.autofill.AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence[] getAutofillOptions() { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  int getLeft() { throw new RuntimeException("Stub!"); }
public  int getTop() { throw new RuntimeException("Stub!"); }
public  int getScrollX() { throw new RuntimeException("Stub!"); }
public  int getScrollY() { throw new RuntimeException("Stub!"); }
public  int getWidth() { throw new RuntimeException("Stub!"); }
public  int getHeight() { throw new RuntimeException("Stub!"); }
public  android.graphics.Matrix getTransformation() { throw new RuntimeException("Stub!"); }
public  float getElevation() { throw new RuntimeException("Stub!"); }
public  float getAlpha() { throw new RuntimeException("Stub!"); }
public  int getVisibility() { throw new RuntimeException("Stub!"); }
public  boolean isAssistBlocked() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  boolean isClickable() { throw new RuntimeException("Stub!"); }
public  boolean isFocusable() { throw new RuntimeException("Stub!"); }
public  boolean isFocused() { throw new RuntimeException("Stub!"); }
public  boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
public  boolean isCheckable() { throw new RuntimeException("Stub!"); }
public  boolean isChecked() { throw new RuntimeException("Stub!"); }
public  boolean isSelected() { throw new RuntimeException("Stub!"); }
public  boolean isActivated() { throw new RuntimeException("Stub!"); }
public  boolean isOpaque() { throw new RuntimeException("Stub!"); }
public  boolean isLongClickable() { throw new RuntimeException("Stub!"); }
public  boolean isContextClickable() { throw new RuntimeException("Stub!"); }
public  java.lang.String getClassName() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWebDomain() { throw new RuntimeException("Stub!"); }
public  java.lang.String getWebScheme() { throw new RuntimeException("Stub!"); }
public  android.view.ViewStructure.HtmlInfo getHtmlInfo() { throw new RuntimeException("Stub!"); }
public  android.os.LocaleList getLocaleList() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
public  int getTextSelectionStart() { throw new RuntimeException("Stub!"); }
public  int getTextSelectionEnd() { throw new RuntimeException("Stub!"); }
public  int getTextColor() { throw new RuntimeException("Stub!"); }
public  int getTextBackgroundColor() { throw new RuntimeException("Stub!"); }
public  float getTextSize() { throw new RuntimeException("Stub!"); }
public  int getTextStyle() { throw new RuntimeException("Stub!"); }
public  int[] getTextLineCharOffsets() { throw new RuntimeException("Stub!"); }
public  int[] getTextLineBaselines() { throw new RuntimeException("Stub!"); }
public  java.lang.String getTextIdEntry() { throw new RuntimeException("Stub!"); }
public  java.lang.String getHint() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getChildCount() { throw new RuntimeException("Stub!"); }
public  android.app.assist.AssistStructure.ViewNode getChildAt(int index) { throw new RuntimeException("Stub!"); }
public  int getMinTextEms() { throw new RuntimeException("Stub!"); }
public  int getMaxTextEms() { throw new RuntimeException("Stub!"); }
public  int getMaxTextLength() { throw new RuntimeException("Stub!"); }
public  int getImportantForAutofill() { throw new RuntimeException("Stub!"); }
public static final int TEXT_COLOR_UNDEFINED = 1;
public static final int TEXT_STYLE_BOLD = 1;
public static final int TEXT_STYLE_ITALIC = 2;
public static final int TEXT_STYLE_STRIKE_THRU = 8;
public static final int TEXT_STYLE_UNDERLINE = 4;
}
public  AssistStructure() { throw new RuntimeException("Stub!"); }
public  long getAcquisitionStartTime() { throw new RuntimeException("Stub!"); }
public  long getAcquisitionEndTime() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getActivityComponent() { throw new RuntimeException("Stub!"); }
public  boolean isHomeActivity() { throw new RuntimeException("Stub!"); }
public  int getWindowNodeCount() { throw new RuntimeException("Stub!"); }
public  android.app.assist.AssistStructure.WindowNode getWindowNodeAt(int index) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.assist.AssistStructure> CREATOR;
static { CREATOR = null; }
}
