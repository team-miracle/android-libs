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
package java.nio.file;
public interface SecureDirectoryStream<T>
  extends java.nio.file.DirectoryStream<T>
{
public abstract  java.nio.file.SecureDirectoryStream<T> newDirectoryStream(T path, java.nio.file.LinkOption... options) throws java.io.IOException;
public abstract  java.nio.channels.SeekableByteChannel newByteChannel(T path, java.util.Set<? extends java.nio.file.OpenOption> options, java.nio.file.attribute.FileAttribute<?>... attrs) throws java.io.IOException;
public abstract  void deleteFile(T path) throws java.io.IOException;
public abstract  void deleteDirectory(T path) throws java.io.IOException;
public abstract  void move(T srcpath, java.nio.file.SecureDirectoryStream<T> targetdir, T targetpath) throws java.io.IOException;
public abstract <V extends java.nio.file.attribute.FileAttributeView> V getFileAttributeView(java.lang.Class<V> type);
public abstract <V extends java.nio.file.attribute.FileAttributeView> V getFileAttributeView(T path, java.lang.Class<V> type, java.nio.file.LinkOption... options);
}
