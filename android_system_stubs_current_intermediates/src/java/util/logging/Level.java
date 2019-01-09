/*
* Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.
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

package java.util.logging;
public class Level
  implements java.io.Serializable
{
protected  Level(java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
protected  Level(java.lang.String name, int value, java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }
public  java.lang.String getResourceBundleName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLocalizedName() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public final  int intValue() { throw new RuntimeException("Stub!"); }
public static synchronized  java.util.logging.Level parse(java.lang.String name) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object ox) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final java.util.logging.Level ALL;
public static final java.util.logging.Level CONFIG;
public static final java.util.logging.Level FINE;
public static final java.util.logging.Level FINER;
public static final java.util.logging.Level FINEST;
public static final java.util.logging.Level INFO;
public static final java.util.logging.Level OFF;
public static final java.util.logging.Level SEVERE;
public static final java.util.logging.Level WARNING;
static { ALL = null; CONFIG = null; FINE = null; FINER = null; FINEST = null; INFO = null; OFF = null; SEVERE = null; WARNING = null; }
}
