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
public interface RangeValueIterator
{
public static class Element
{
public  Element() { throw new RuntimeException("Stub!"); }
public int limit;
public int start;
public int value;
}
public abstract  boolean next(android.icu.util.RangeValueIterator.Element element);
public abstract  void reset();
}
