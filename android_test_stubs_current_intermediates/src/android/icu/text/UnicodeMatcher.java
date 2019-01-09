/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2001-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/
package android.icu.text;
public interface UnicodeMatcher
{
public abstract  int matches(android.icu.text.Replaceable text, int[] offset, int limit, boolean incremental);
public abstract  java.lang.String toPattern(boolean escapeUnprintable);
public abstract  boolean matchesIndexValue(int v);
public abstract  void addMatchSetTo(android.icu.text.UnicodeSet toUnionTo);
public static final char ETHER = 65535;
public static final int U_MATCH = 2;
public static final int U_MISMATCH = 0;
public static final int U_PARTIAL_MATCH = 1;
}
