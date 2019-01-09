/*
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

package java.nio.channels;
public abstract class FileChannel
  extends java.nio.channels.spi.AbstractInterruptibleChannel
  implements java.nio.channels.SeekableByteChannel, java.nio.channels.GatheringByteChannel, java.nio.channels.ScatteringByteChannel
{
public static class MapMode
{
MapMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.nio.channels.FileChannel.MapMode PRIVATE;
public static final java.nio.channels.FileChannel.MapMode READ_ONLY;
public static final java.nio.channels.FileChannel.MapMode READ_WRITE;
static { PRIVATE = null; READ_ONLY = null; READ_WRITE = null; }
}
protected  FileChannel() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.FileChannel open(java.nio.file.Path path, java.util.Set<? extends java.nio.file.OpenOption> options, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.FileChannel open(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  int read(java.nio.ByteBuffer dst) throws java.io.IOException;
public abstract  long read(java.nio.ByteBuffer[] dsts, int offset, int length) throws java.io.IOException;
public final  long read(java.nio.ByteBuffer[] dsts) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  int write(java.nio.ByteBuffer src) throws java.io.IOException;
public abstract  long write(java.nio.ByteBuffer[] srcs, int offset, int length) throws java.io.IOException;
public final  long write(java.nio.ByteBuffer[] srcs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  long position() throws java.io.IOException;
public abstract  java.nio.channels.FileChannel position(long newPosition) throws java.io.IOException;
public abstract  long size() throws java.io.IOException;
public abstract  java.nio.channels.FileChannel truncate(long size) throws java.io.IOException;
public abstract  void force(boolean metaData) throws java.io.IOException;
public abstract  long transferTo(long position, long count, java.nio.channels.WritableByteChannel target) throws java.io.IOException;
public abstract  long transferFrom(java.nio.channels.ReadableByteChannel src, long position, long count) throws java.io.IOException;
public abstract  int read(java.nio.ByteBuffer dst, long position) throws java.io.IOException;
public abstract  int write(java.nio.ByteBuffer src, long position) throws java.io.IOException;
public abstract  java.nio.MappedByteBuffer map(java.nio.channels.FileChannel.MapMode mode, long position, long size) throws java.io.IOException;
public abstract  java.nio.channels.FileLock lock(long position, long size, boolean shared) throws java.io.IOException;
public final  java.nio.channels.FileLock lock() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.FileLock tryLock(long position, long size, boolean shared) throws java.io.IOException;
public final  java.nio.channels.FileLock tryLock() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
