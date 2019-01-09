/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 1996-2005, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/
package android.icu.text;
public interface SymbolTable
{
public abstract  char[] lookup(java.lang.String s);
public abstract  android.icu.text.UnicodeMatcher lookupMatcher(int ch);
public abstract  java.lang.String parseReference(java.lang.String text, java.text.ParsePosition pos, int limit);
public static final char SYMBOL_REF = 36;
}
