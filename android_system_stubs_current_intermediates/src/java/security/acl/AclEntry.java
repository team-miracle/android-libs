/*
* Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.security.acl;
public interface AclEntry
  extends java.lang.Cloneable
{
public abstract  boolean setPrincipal(java.security.Principal user);
public abstract  java.security.Principal getPrincipal();
public abstract  void setNegativePermissions();
public abstract  boolean isNegative();
public abstract  boolean addPermission(java.security.acl.Permission permission);
public abstract  boolean removePermission(java.security.acl.Permission permission);
public abstract  boolean checkPermission(java.security.acl.Permission permission);
public abstract  java.util.Enumeration<java.security.acl.Permission> permissions();
public abstract  java.lang.String toString();
public abstract  java.lang.Object clone();
}
