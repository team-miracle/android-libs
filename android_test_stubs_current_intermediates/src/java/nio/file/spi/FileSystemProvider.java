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

package java.nio.file.spi;
public abstract class FileSystemProvider
{
protected  FileSystemProvider() { throw new RuntimeException("Stub!"); }
public static  java.util.List<java.nio.file.spi.FileSystemProvider> installedProviders() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getScheme();
public abstract  java.nio.file.FileSystem newFileSystem(java.net.URI uri, java.util.Map<java.lang.String, ?> env) throws java.io.IOException;
public abstract  java.nio.file.FileSystem getFileSystem(java.net.URI uri);
public abstract  java.nio.file.Path getPath(java.net.URI uri);
public  java.nio.file.FileSystem newFileSystem(java.nio.file.Path path, java.util.Map<java.lang.String, ?> env) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.InputStream newInputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream newOutputStream(java.nio.file.Path path, java.nio.file.OpenOption... options) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.FileChannel newFileChannel(java.nio.file.Path path, java.util.Set<? extends java.nio.file.OpenOption> options, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.channels.AsynchronousFileChannel newAsynchronousFileChannel(java.nio.file.Path path, java.util.Set<? extends java.nio.file.OpenOption> options, java.util.concurrent.ExecutorService executor, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.SeekableByteChannel newByteChannel(java.nio.file.Path path, java.util.Set<? extends java.nio.file.OpenOption> options, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException;
public abstract  java.nio.file.DirectoryStream<java.nio.file.Path> newDirectoryStream(java.nio.file.Path dir, java.nio.file.DirectoryStream.Filter<? super java.nio.file.Path> filter) throws java.io.IOException;
public abstract  void createDirectory(java.nio.file.Path dir, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException;
public  void createSymbolicLink(java.nio.file.Path link, java.nio.file.Path target, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  void createLink(java.nio.file.Path link, java.nio.file.Path existing) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void delete(java.nio.file.Path path) throws java.io.IOException;
public  boolean deleteIfExists(java.nio.file.Path path) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.nio.file.Path readSymbolicLink(java.nio.file.Path link) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  void copy(java.nio.file.Path source, java.nio.file.Path target, java.nio.file.CopyOption... options) throws java.io.IOException;
public abstract  void move(java.nio.file.Path source, java.nio.file.Path target, java.nio.file.CopyOption... options) throws java.io.IOException;
public abstract  boolean isSameFile(java.nio.file.Path path, java.nio.file.Path path2) throws java.io.IOException;
public abstract  boolean isHidden(java.nio.file.Path path) throws java.io.IOException;
public abstract  java.nio.file.FileStore getFileStore(java.nio.file.Path path) throws java.io.IOException;
public abstract  void checkAccess(java.nio.file.Path path, java.nio.file.AccessMode... modes) throws java.io.IOException;
public abstract <V extends java.nio.file.attribute.FileAttributeView> V getFileAttributeView(java.nio.file.Path path, java.lang.Class<V> type, java.nio.file.LinkOption... options);
public abstract <A extends java.nio.file.attribute.BasicFileAttributes> A readAttributes(java.nio.file.Path path, java.lang.Class<A> type, java.nio.file.LinkOption... options) throws java.io.IOException;
public abstract  java.util.Map<java.lang.String, java.lang.Object> readAttributes(java.nio.file.Path path, java.lang.String attributes, java.nio.file.LinkOption... options) throws java.io.IOException;
public abstract  void setAttribute(java.nio.file.Path path, java.lang.String attribute, java.lang.Object value, java.nio.file.LinkOption... options) throws java.io.IOException;
}
