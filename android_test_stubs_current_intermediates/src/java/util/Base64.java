/*
* Copyright (c) 2012, 2016, Oracle and/or its affiliates. All rights reserved.
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

package java.util;
public class Base64
{
public static class Encoder
{
Encoder() { throw new RuntimeException("Stub!"); }
public  byte[] encode(byte[] src) { throw new RuntimeException("Stub!"); }
public  int encode(byte[] src, byte[] dst) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"deprecation"})
public  java.lang.String encodeToString(byte[] src) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer encode(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
public  java.io.OutputStream wrap(java.io.OutputStream os) { throw new RuntimeException("Stub!"); }
public  java.util.Base64.Encoder withoutPadding() { throw new RuntimeException("Stub!"); }
}
public static class Decoder
{
Decoder() { throw new RuntimeException("Stub!"); }
public  byte[] decode(byte[] src) { throw new RuntimeException("Stub!"); }
public  byte[] decode(java.lang.String src) { throw new RuntimeException("Stub!"); }
public  int decode(byte[] src, byte[] dst) { throw new RuntimeException("Stub!"); }
public  java.nio.ByteBuffer decode(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
public  java.io.InputStream wrap(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
}
Base64() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Encoder getEncoder() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Encoder getUrlEncoder() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Encoder getMimeEncoder() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Encoder getMimeEncoder(int lineLength, byte[] lineSeparator) { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Decoder getDecoder() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Decoder getUrlDecoder() { throw new RuntimeException("Stub!"); }
public static  java.util.Base64.Decoder getMimeDecoder() { throw new RuntimeException("Stub!"); }
}
