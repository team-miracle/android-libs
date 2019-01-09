/*
* Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javax.crypto;
public class SealedObject
  implements java.io.Serializable
{
public  SealedObject(java.io.Serializable object, javax.crypto.Cipher c) throws java.io.IOException, javax.crypto.IllegalBlockSizeException { throw new RuntimeException("Stub!"); }
protected  SealedObject(javax.crypto.SealedObject so) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getAlgorithm() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.security.Key key) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(javax.crypto.Cipher c) throws java.io.IOException, java.lang.ClassNotFoundException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.security.Key key, java.lang.String provider) throws java.io.IOException, java.lang.ClassNotFoundException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException { throw new RuntimeException("Stub!"); }
protected byte[] encodedParams = null;
}
