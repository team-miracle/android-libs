/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1995, 2015, Oracle and/or its affiliates. All rights reserved.
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

package java.util.zip;
public class ZipEntry
  implements java.lang.Cloneable
{
public  ZipEntry(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  ZipEntry(java.util.zip.ZipEntry e) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  void setTime(long time) { throw new RuntimeException("Stub!"); }
public  long getTime() { throw new RuntimeException("Stub!"); }
public  java.util.zip.ZipEntry setLastModifiedTime(java.nio.file.attribute.FileTime time) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.FileTime getLastModifiedTime() { throw new RuntimeException("Stub!"); }
public  java.util.zip.ZipEntry setLastAccessTime(java.nio.file.attribute.FileTime time) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.FileTime getLastAccessTime() { throw new RuntimeException("Stub!"); }
public  java.util.zip.ZipEntry setCreationTime(java.nio.file.attribute.FileTime time) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.FileTime getCreationTime() { throw new RuntimeException("Stub!"); }
public  void setSize(long size) { throw new RuntimeException("Stub!"); }
public  long getSize() { throw new RuntimeException("Stub!"); }
public  long getCompressedSize() { throw new RuntimeException("Stub!"); }
public  void setCompressedSize(long csize) { throw new RuntimeException("Stub!"); }
public  void setCrc(long crc) { throw new RuntimeException("Stub!"); }
public  long getCrc() { throw new RuntimeException("Stub!"); }
public  void setMethod(int method) { throw new RuntimeException("Stub!"); }
public  int getMethod() { throw new RuntimeException("Stub!"); }
public  void setExtra(byte[] extra) { throw new RuntimeException("Stub!"); }
public  byte[] getExtra() { throw new RuntimeException("Stub!"); }
public  void setComment(java.lang.String comment) { throw new RuntimeException("Stub!"); }
public  java.lang.String getComment() { throw new RuntimeException("Stub!"); }
public  boolean isDirectory() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public static final int CENATT = 36;
public static final int CENATX = 38;
public static final int CENCOM = 32;
public static final int CENCRC = 16;
public static final int CENDSK = 34;
public static final int CENEXT = 30;
public static final int CENFLG = 8;
public static final int CENHDR = 46;
public static final int CENHOW = 10;
public static final int CENLEN = 24;
public static final int CENNAM = 28;
public static final int CENOFF = 42;
public static final long CENSIG = 33639248L;
public static final int CENSIZ = 20;
public static final int CENTIM = 12;
public static final int CENVEM = 4;
public static final int CENVER = 6;
public static final int DEFLATED = 8;
public static final int ENDCOM = 20;
public static final int ENDHDR = 22;
public static final int ENDOFF = 16;
public static final long ENDSIG = 101010256L;
public static final int ENDSIZ = 12;
public static final int ENDSUB = 8;
public static final int ENDTOT = 10;
public static final int EXTCRC = 4;
public static final int EXTHDR = 16;
public static final int EXTLEN = 12;
public static final long EXTSIG = 134695760L;
public static final int EXTSIZ = 8;
public static final int LOCCRC = 14;
public static final int LOCEXT = 28;
public static final int LOCFLG = 6;
public static final int LOCHDR = 30;
public static final int LOCHOW = 8;
public static final int LOCLEN = 22;
public static final int LOCNAM = 26;
public static final long LOCSIG = 67324752L;
public static final int LOCSIZ = 18;
public static final int LOCTIM = 10;
public static final int LOCVER = 4;
public static final int STORED = 0;
}
