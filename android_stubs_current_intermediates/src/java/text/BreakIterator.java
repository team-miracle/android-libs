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
* The original version of this source code and documentation
* is copyrighted and owned by Taligent, Inc., a wholly-owned
* subsidiary of IBM. These materials are provided under terms
* of a License Agreement between Taligent and Sun. This technology
* is protected by multiple US and International patents.
*
* This notice and attribution to Taligent may not be removed.
* Taligent is a registered trademark of Taligent, Inc.
*
*/

package java.text;
public abstract class BreakIterator
  implements java.lang.Cloneable
{
protected  BreakIterator() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public abstract  int first();
public abstract  int last();
public abstract  int next(int n);
public abstract  int next();
public abstract  int previous();
public abstract  int following(int offset);
public  int preceding(int offset) { throw new RuntimeException("Stub!"); }
public  boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); }
public abstract  int current();
public abstract  java.text.CharacterIterator getText();
public  void setText(java.lang.String newText) { throw new RuntimeException("Stub!"); }
public abstract  void setText(java.text.CharacterIterator newText);
public static  java.text.BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getWordInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getLineInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getCharacterInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); }
public static  java.text.BreakIterator getSentenceInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static synchronized  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public static final int DONE = -1;
}
