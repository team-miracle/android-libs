/*
* Copyright 2001-2004 The Apache Software Foundation.
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

package org.apache.commons.codec.language;
@java.lang.Deprecated()
public class Soundex
  implements org.apache.commons.codec.StringEncoder
{
public  Soundex() { throw new RuntimeException("Stub!"); }
public  Soundex(char[] mapping) { throw new RuntimeException("Stub!"); }
public  int difference(java.lang.String s1, java.lang.String s2) throws org.apache.commons.codec.EncoderException { throw new RuntimeException("Stub!"); }
public  java.lang.Object encode(java.lang.Object pObject) throws org.apache.commons.codec.EncoderException { throw new RuntimeException("Stub!"); }
public  java.lang.String encode(java.lang.String pString) { throw new RuntimeException("Stub!"); }
@Deprecated
public  int getMaxLength() { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setMaxLength(int maxLength) { throw new RuntimeException("Stub!"); }
public  java.lang.String soundex(java.lang.String str) { throw new RuntimeException("Stub!"); }
public static final org.apache.commons.codec.language.Soundex US_ENGLISH;
public static final char[] US_ENGLISH_MAPPING = null;
public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
static { US_ENGLISH = null; }
}
