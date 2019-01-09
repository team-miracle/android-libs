/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.text;
public class Html
{
public static interface ImageGetter
{
public abstract  android.graphics.drawable.Drawable getDrawable(java.lang.String source);
}
public static interface TagHandler
{
public abstract  void handleTag(boolean opening, java.lang.String tag, android.text.Editable output, org.xml.sax.XMLReader xmlReader);
}
Html() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.text.Spanned fromHtml(java.lang.String source) { throw new RuntimeException("Stub!"); }
public static  android.text.Spanned fromHtml(java.lang.String source, int flags) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  android.text.Spanned fromHtml(java.lang.String source, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) { throw new RuntimeException("Stub!"); }
public static  android.text.Spanned fromHtml(java.lang.String source, int flags, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  java.lang.String toHtml(android.text.Spanned text) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toHtml(android.text.Spanned text, int option) { throw new RuntimeException("Stub!"); }
public static  java.lang.String escapeHtml(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static final int FROM_HTML_MODE_COMPACT = 63;
public static final int FROM_HTML_MODE_LEGACY = 0;
public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
}
