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

package java.nio.file.attribute;
public final class AclEntry
{
public static final class Builder
{
Builder() { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry build() { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setType(java.nio.file.attribute.AclEntryType type) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setPrincipal(java.nio.file.attribute.UserPrincipal who) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setPermissions(java.util.Set<java.nio.file.attribute.AclEntryPermission> perms) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setPermissions(java.nio.file.attribute.AclEntryPermission... perms) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setFlags(java.util.Set<java.nio.file.attribute.AclEntryFlag> flags) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntry.Builder setFlags(java.nio.file.attribute.AclEntryFlag... flags) { throw new RuntimeException("Stub!"); }
}
AclEntry() { throw new RuntimeException("Stub!"); }
public static  java.nio.file.attribute.AclEntry.Builder newBuilder() { throw new RuntimeException("Stub!"); }
public static  java.nio.file.attribute.AclEntry.Builder newBuilder(java.nio.file.attribute.AclEntry entry) { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.AclEntryType type() { throw new RuntimeException("Stub!"); }
public  java.nio.file.attribute.UserPrincipal principal() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.nio.file.attribute.AclEntryPermission> permissions() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.nio.file.attribute.AclEntryFlag> flags() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ob) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
