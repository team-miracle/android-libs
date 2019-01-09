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

package android.text.util;
public class Linkify
{
public static interface MatchFilter
{
public abstract  boolean acceptMatch(java.lang.CharSequence s, int start, int end);
}
public static interface TransformFilter
{
public abstract  java.lang.String transformUrl(java.util.regex.Matcher match, java.lang.String url);
}
public  Linkify() { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable text, int mask) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.widget.TextView text, int mask) { throw new RuntimeException("Stub!"); }
public static final  void addLinks(android.widget.TextView text, java.util.regex.Pattern pattern, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public static final  void addLinks(android.widget.TextView text, java.util.regex.Pattern pattern, java.lang.String scheme, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final  void addLinks(android.widget.TextView text, java.util.regex.Pattern pattern, java.lang.String defaultScheme, java.lang.String[] schemes, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable text, java.util.regex.Pattern pattern, java.lang.String scheme) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String scheme, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final  boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String defaultScheme, java.lang.String[] schemes, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) { throw new RuntimeException("Stub!"); }
public static final int ALL = 15;
public static final int EMAIL_ADDRESSES = 2;
@java.lang.Deprecated()
public static final int MAP_ADDRESSES = 8;
public static final int PHONE_NUMBERS = 4;
public static final int WEB_URLS = 1;
public static final android.text.util.Linkify.MatchFilter sPhoneNumberMatchFilter;
public static final android.text.util.Linkify.TransformFilter sPhoneNumberTransformFilter;
public static final android.text.util.Linkify.MatchFilter sUrlMatchFilter;
static { sPhoneNumberMatchFilter = null; sPhoneNumberTransformFilter = null; sUrlMatchFilter = null; }
}
