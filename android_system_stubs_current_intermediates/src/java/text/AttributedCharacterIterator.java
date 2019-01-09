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

package java.text;
public interface AttributedCharacterIterator
  extends java.text.CharacterIterator
{
public static class Attribute
  implements java.io.Serializable
{
protected  Attribute(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
protected  java.lang.String getName() { throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final java.text.AttributedCharacterIterator.Attribute INPUT_METHOD_SEGMENT;
public static final java.text.AttributedCharacterIterator.Attribute LANGUAGE;
public static final java.text.AttributedCharacterIterator.Attribute READING;
static { INPUT_METHOD_SEGMENT = null; LANGUAGE = null; READING = null; }
}
public abstract  int getRunStart();
public abstract  int getRunStart(java.text.AttributedCharacterIterator.Attribute attribute);
public abstract  int getRunStart(java.util.Set<? extends java.text.AttributedCharacterIterator.Attribute> attributes);
public abstract  int getRunLimit();
public abstract  int getRunLimit(java.text.AttributedCharacterIterator.Attribute attribute);
public abstract  int getRunLimit(java.util.Set<? extends java.text.AttributedCharacterIterator.Attribute> attributes);
public abstract  java.util.Map<java.text.AttributedCharacterIterator.Attribute, java.lang.Object> getAttributes();
public abstract  java.lang.Object getAttribute(java.text.AttributedCharacterIterator.Attribute attribute);
public abstract  java.util.Set<java.text.AttributedCharacterIterator.Attribute> getAllAttributeKeys();
}
