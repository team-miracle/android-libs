/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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
* (C) Copyright IBM Corp. 1999-2003 - All Rights Reserved
*
* The original version of this source code and documentation is
* copyrighted and owned by IBM. These materials are provided
* under terms of a License Agreement between IBM and Sun.
* This technology is protected by multiple US and International
* patents. This notice and attribution to IBM may not be removed.
*/

package java.text;
public final class Bidi
{
public  Bidi(java.lang.String paragraph, int flags) { throw new RuntimeException("Stub!"); }
public  Bidi(java.text.AttributedCharacterIterator paragraph) { throw new RuntimeException("Stub!"); }
public  Bidi(char[] text, int textStart, byte[] embeddings, int embStart, int paragraphLength, int flags) { throw new RuntimeException("Stub!"); }
public  java.text.Bidi createLineBidi(int lineStart, int lineLimit) { throw new RuntimeException("Stub!"); }
public  boolean isMixed() { throw new RuntimeException("Stub!"); }
public  boolean isLeftToRight() { throw new RuntimeException("Stub!"); }
public  boolean isRightToLeft() { throw new RuntimeException("Stub!"); }
public  int getLength() { throw new RuntimeException("Stub!"); }
public  boolean baseIsLeftToRight() { throw new RuntimeException("Stub!"); }
public  int getBaseLevel() { throw new RuntimeException("Stub!"); }
public  int getLevelAt(int offset) { throw new RuntimeException("Stub!"); }
public  int getRunCount() { throw new RuntimeException("Stub!"); }
public  int getRunLevel(int run) { throw new RuntimeException("Stub!"); }
public  int getRunStart(int run) { throw new RuntimeException("Stub!"); }
public  int getRunLimit(int run) { throw new RuntimeException("Stub!"); }
public static  boolean requiresBidi(char[] text, int start, int limit) { throw new RuntimeException("Stub!"); }
public static  void reorderVisually(byte[] levels, int levelStart, java.lang.Object[] objects, int objectStart, int count) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;
public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;
public static final int DIRECTION_LEFT_TO_RIGHT = 0;
public static final int DIRECTION_RIGHT_TO_LEFT = 1;
}
