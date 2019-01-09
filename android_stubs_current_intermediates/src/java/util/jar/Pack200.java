/*
* Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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
package java.util.jar;
public abstract class Pack200
{
public static interface Packer
{
public abstract  java.util.SortedMap<java.lang.String, java.lang.String> properties();
public abstract  void pack(java.util.jar.JarFile in, java.io.OutputStream out) throws java.io.IOException;
public abstract  void pack(java.util.jar.JarInputStream in, java.io.OutputStream out) throws java.io.IOException;
@java.lang.Deprecated()
default public  void addPropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
default public  void removePropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
public static final java.lang.String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
public static final java.lang.String DEFLATE_HINT = "pack.deflate.hint";
public static final java.lang.String EFFORT = "pack.effort";
public static final java.lang.String ERROR = "error";
public static final java.lang.String FALSE = "false";
public static final java.lang.String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
public static final java.lang.String KEEP = "keep";
public static final java.lang.String KEEP_FILE_ORDER = "pack.keep.file.order";
public static final java.lang.String LATEST = "latest";
public static final java.lang.String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
public static final java.lang.String MODIFICATION_TIME = "pack.modification.time";
public static final java.lang.String PASS = "pass";
public static final java.lang.String PASS_FILE_PFX = "pack.pass.file.";
public static final java.lang.String PROGRESS = "pack.progress";
public static final java.lang.String SEGMENT_LIMIT = "pack.segment.limit";
public static final java.lang.String STRIP = "strip";
public static final java.lang.String TRUE = "true";
public static final java.lang.String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";
}
public static interface Unpacker
{
public abstract  java.util.SortedMap<java.lang.String, java.lang.String> properties();
public abstract  void unpack(java.io.InputStream in, java.util.jar.JarOutputStream out) throws java.io.IOException;
public abstract  void unpack(java.io.File in, java.util.jar.JarOutputStream out) throws java.io.IOException;
@java.lang.Deprecated()
default public  void addPropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
default public  void removePropertyChangeListener(java.beans.PropertyChangeListener listener) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFLATE_HINT = "unpack.deflate.hint";
public static final java.lang.String FALSE = "false";
public static final java.lang.String KEEP = "keep";
public static final java.lang.String PROGRESS = "unpack.progress";
public static final java.lang.String TRUE = "true";
}
Pack200() { throw new RuntimeException("Stub!"); }
public static synchronized  java.util.jar.Pack200.Packer newPacker() { throw new RuntimeException("Stub!"); }
public static  java.util.jar.Pack200.Unpacker newUnpacker() { throw new RuntimeException("Stub!"); }
}
