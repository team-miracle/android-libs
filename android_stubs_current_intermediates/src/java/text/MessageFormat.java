/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

/*
* (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
* (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
*
*   The original version of this source code and documentation is copyrighted
* and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
* materials are provided under terms of a License Agreement between Taligent
* and Sun. This technology is protected by multiple US and International
* patents. This notice and attribution to Taligent may not be removed.
*   Taligent is a registered trademark of Taligent, Inc.
*
*/

package java.text;
public class MessageFormat
  extends java.text.Format
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String name) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.MessageFormat.Field ARGUMENT;
static { ARGUMENT = null; }
}
public  MessageFormat(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  MessageFormat(java.lang.String pattern, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"fallthrough"})
public  void applyPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public  void setFormatsByArgumentIndex(java.text.Format[] newFormats) { throw new RuntimeException("Stub!"); }
public  void setFormats(java.text.Format[] newFormats) { throw new RuntimeException("Stub!"); }
public  void setFormatByArgumentIndex(int argumentIndex, java.text.Format newFormat) { throw new RuntimeException("Stub!"); }
public  void setFormat(int formatElementIndex, java.text.Format newFormat) { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormats() { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object[] arguments, java.lang.StringBuffer result, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.lang.String pattern, java.lang.Object... arguments) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object arguments, java.lang.StringBuffer result, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arguments) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
