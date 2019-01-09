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

package java.security;
public abstract class KeyFactorySpi
{
public  KeyFactorySpi() { throw new RuntimeException("Stub!"); }
protected abstract  java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract <T extends java.security.spec.KeySpec> T engineGetKeySpec(java.security.Key key, java.lang.Class<T> keySpec) throws java.security.spec.InvalidKeySpecException;
protected abstract  java.security.Key engineTranslateKey(java.security.Key key) throws java.security.InvalidKeyException;
}
