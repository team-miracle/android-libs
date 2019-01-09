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
public abstract class SelectionKey
{
protected  SelectionKey() { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.SelectableChannel channel();
public abstract  java.nio.channels.Selector selector();
public abstract  boolean isValid();
public abstract  void cancel();
public abstract  int interestOps();
public abstract  java.nio.channels.SelectionKey interestOps(int ops);
public abstract  int readyOps();
public final  boolean isReadable() { throw new RuntimeException("Stub!"); }
public final  boolean isWritable() { throw new RuntimeException("Stub!"); }
public final  boolean isConnectable() { throw new RuntimeException("Stub!"); }
public final  boolean isAcceptable() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object attach(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public final  java.lang.Object attachment() { throw new RuntimeException("Stub!"); }
public static final int OP_ACCEPT = 16;
public static final int OP_CONNECT = 8;
public static final int OP_READ = 1;
public static final int OP_WRITE = 4;
}
