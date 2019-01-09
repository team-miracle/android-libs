/*
* Copyright (c) 2007, 2013, Oracle and/or its affiliates. All rights reserved.
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
public abstract class AsynchronousFileChannel
  implements java.nio.channels.AsynchronousChannel
{
protected  AsynchronousFileChannel() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.AsynchronousFileChannel open(java.nio.file.Path file, java.util.Set<? extends java.nio.file.OpenOption> options, java.util.concurrent.ExecutorService executor, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.AsynchronousFileChannel open(java.nio.file.Path file, java.nio.file.OpenOption... options) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  long size() throws java.io.IOException;
public abstract  java.nio.channels.AsynchronousFileChannel truncate(long size) throws java.io.IOException;
public abstract  void force(boolean metaData) throws java.io.IOException;
public abstract <A> void lock(long position, long size, boolean shared, A attachment, java.nio.channels.CompletionHandler<java.nio.channels.FileLock, ? super A> handler);
public final <A> void lock(A attachment, java.nio.channels.CompletionHandler<java.nio.channels.FileLock, ? super A> handler) { throw new RuntimeException("Stub!"); }
public abstract  java.util.concurrent.Future<java.nio.channels.FileLock> lock(long position, long size, boolean shared);
public final  java.util.concurrent.Future<java.nio.channels.FileLock> lock() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.FileLock tryLock(long position, long size, boolean shared) throws java.io.IOException;
public final  java.nio.channels.FileLock tryLock() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract <A> void read(java.nio.ByteBuffer dst, long position, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler);
public abstract  java.util.concurrent.Future<java.lang.Integer> read(java.nio.ByteBuffer dst, long position);
public abstract <A> void write(java.nio.ByteBuffer src, long position, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler);
public abstract  java.util.concurrent.Future<java.lang.Integer> write(java.nio.ByteBuffer src, long position);
}
