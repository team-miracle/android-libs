/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 1996-2015, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/

package android.icu.text;
public abstract class SearchIterator
{
public static enum ElementComparisonType
{
ANY_BASE_WEIGHT_IS_WILDCARD(),
PATTERN_BASE_WEIGHT_IS_WILDCARD(),
STANDARD_ELEMENT_COMPARISON();
}
protected  SearchIterator(java.text.CharacterIterator target, android.icu.text.BreakIterator breaker) { throw new RuntimeException("Stub!"); }
public  void setIndex(int position) { throw new RuntimeException("Stub!"); }
public  void setOverlapping(boolean allowOverlap) { throw new RuntimeException("Stub!"); }
public  void setBreakIterator(android.icu.text.BreakIterator breakiter) { throw new RuntimeException("Stub!"); }
public  void setTarget(java.text.CharacterIterator text) { throw new RuntimeException("Stub!"); }
public  int getMatchStart() { throw new RuntimeException("Stub!"); }
public abstract  int getIndex();
public  int getMatchLength() { throw new RuntimeException("Stub!"); }
public  android.icu.text.BreakIterator getBreakIterator() { throw new RuntimeException("Stub!"); }
public  java.text.CharacterIterator getTarget() { throw new RuntimeException("Stub!"); }
public  java.lang.String getMatchedText() { throw new RuntimeException("Stub!"); }
public  int next() { throw new RuntimeException("Stub!"); }
public  int previous() { throw new RuntimeException("Stub!"); }
public  boolean isOverlapping() { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public final  int first() { throw new RuntimeException("Stub!"); }
public final  int following(int position) { throw new RuntimeException("Stub!"); }
public final  int last() { throw new RuntimeException("Stub!"); }
public final  int preceding(int position) { throw new RuntimeException("Stub!"); }
protected  void setMatchLength(int length) { throw new RuntimeException("Stub!"); }
protected abstract  int handleNext(int start);
protected abstract  int handlePrevious(int startAt);
public  void setElementComparisonType(android.icu.text.SearchIterator.ElementComparisonType type) { throw new RuntimeException("Stub!"); }
public  android.icu.text.SearchIterator.ElementComparisonType getElementComparisonType() { throw new RuntimeException("Stub!"); }
public static final int DONE = -1;
protected android.icu.text.BreakIterator breakIterator;
protected int matchLength;
protected java.text.CharacterIterator targetText;
}
