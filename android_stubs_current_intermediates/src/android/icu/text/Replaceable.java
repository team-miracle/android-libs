/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 1996-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/
package android.icu.text;
public interface Replaceable
{
public abstract  int length();
public abstract  char charAt(int offset);
public abstract  int char32At(int offset);
public abstract  void getChars(int srcStart, int srcLimit, char[] dst, int dstStart);
public abstract  void replace(int start, int limit, java.lang.String text);
public abstract  void replace(int start, int limit, char[] chars, int charsStart, int charsLen);
public abstract  void copy(int start, int limit, int dest);
public abstract  boolean hasMetaData();
}
