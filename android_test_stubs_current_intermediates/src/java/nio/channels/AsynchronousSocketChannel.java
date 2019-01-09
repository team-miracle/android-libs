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
public abstract class AsynchronousSocketChannel
  implements java.nio.channels.AsynchronousByteChannel, java.nio.channels.NetworkChannel
{
protected  AsynchronousSocketChannel(java.nio.channels.spi.AsynchronousChannelProvider provider) { throw new RuntimeException("Stub!"); }
public final  java.nio.channels.spi.AsynchronousChannelProvider provider() { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.AsynchronousSocketChannel open(java.nio.channels.AsynchronousChannelGroup group) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public static  java.nio.channels.AsynchronousSocketChannel open() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  java.nio.channels.AsynchronousSocketChannel bind(java.net.SocketAddress local) throws java.io.IOException;
public abstract <T> java.nio.channels.AsynchronousSocketChannel setOption(java.net.SocketOption<T> name, T value) throws java.io.IOException;
public abstract  java.nio.channels.AsynchronousSocketChannel shutdownInput() throws java.io.IOException;
public abstract  java.nio.channels.AsynchronousSocketChannel shutdownOutput() throws java.io.IOException;
public abstract  java.net.SocketAddress getRemoteAddress() throws java.io.IOException;
public abstract <A> void connect(java.net.SocketAddress remote, A attachment, java.nio.channels.CompletionHandler<java.lang.Void, ? super A> handler);
public abstract  java.util.concurrent.Future<java.lang.Void> connect(java.net.SocketAddress remote);
public abstract <A> void read(java.nio.ByteBuffer dst, long timeout, java.util.concurrent.TimeUnit unit, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler);
public final <A> void read(java.nio.ByteBuffer dst, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler) { throw new RuntimeException("Stub!"); }
public abstract  java.util.concurrent.Future<java.lang.Integer> read(java.nio.ByteBuffer dst);
public abstract <A> void read(java.nio.ByteBuffer[] dsts, int offset, int length, long timeout, java.util.concurrent.TimeUnit unit, A attachment, java.nio.channels.CompletionHandler<java.lang.Long, ? super A> handler);
public abstract <A> void write(java.nio.ByteBuffer src, long timeout, java.util.concurrent.TimeUnit unit, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler);
public final <A> void write(java.nio.ByteBuffer src, A attachment, java.nio.channels.CompletionHandler<java.lang.Integer, ? super A> handler) { throw new RuntimeException("Stub!"); }
public abstract  java.util.concurrent.Future<java.lang.Integer> write(java.nio.ByteBuffer src);
public abstract <A> void write(java.nio.ByteBuffer[] srcs, int offset, int length, long timeout, java.util.concurrent.TimeUnit unit, A attachment, java.nio.channels.CompletionHandler<java.lang.Long, ? super A> handler);
public abstract  java.net.SocketAddress getLocalAddress() throws java.io.IOException;
}
