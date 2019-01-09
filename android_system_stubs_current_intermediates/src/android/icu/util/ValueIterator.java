/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
******************************************************************************
* Copyright (C) 1996-2016, International Business Machines Corporation and   *
* others. All Rights Reserved.                                               *
******************************************************************************
*/

package android.icu.util;
public interface ValueIterator
{
public static final class Element
{
public  Element() { throw new RuntimeException("Stub!"); }
public int integer;
public java.lang.Object value;
}
public abstract  boolean next(android.icu.util.ValueIterator.Element element);
public abstract  void reset();
public abstract  void setRange(int start, int limit);
}
