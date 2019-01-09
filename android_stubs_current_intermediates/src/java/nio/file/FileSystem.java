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
public abstract class FileSystem
  implements java.io.Closeable
{
protected  FileSystem() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.file.spi.FileSystemProvider provider();
public abstract  void close() throws java.io.IOException;
public abstract  boolean isOpen();
public abstract  boolean isReadOnly();
public abstract  java.lang.String getSeparator();
public abstract  java.lang.Iterable<java.nio.file.Path> getRootDirectories();
public abstract  java.lang.Iterable<java.nio.file.FileStore> getFileStores();
public abstract  java.util.Set<java.lang.String> supportedFileAttributeViews();
public abstract  java.nio.file.Path getPath(java.lang.String first, java.lang.String... more);
public abstract  java.nio.file.PathMatcher getPathMatcher(java.lang.String syntaxAndPattern);
public abstract  java.nio.file.attribute.UserPrincipalLookupService getUserPrincipalLookupService();
public abstract  java.nio.file.WatchService newWatchService() throws java.io.IOException;
}
