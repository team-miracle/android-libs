/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 1996-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.text;
public class UnicodeSet
  extends android.icu.text.UnicodeFilter
  implements java.lang.Iterable<java.lang.String>, java.lang.Comparable<android.icu.text.UnicodeSet>, android.icu.util.Freezable<android.icu.text.UnicodeSet>
{
public static class EntryRange
{
EntryRange() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public int codepoint;
public int codepointEnd;
}
public static enum ComparisonStyle
{
LEXICOGRAPHIC(),
LONGER_FIRST(),
SHORTER_FIRST();
}
public static enum SpanCondition
{
CONDITION_COUNT(),
CONTAINED(),
NOT_CONTAINED(),
SIMPLE();
}
public  UnicodeSet() { throw new RuntimeException("Stub!"); }
public  UnicodeSet(android.icu.text.UnicodeSet other) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(int start, int end) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(int... pairs) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(java.lang.String pattern, boolean ignoreWhitespace) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(java.lang.String pattern, int options) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(java.lang.String pattern, java.text.ParsePosition pos, android.icu.text.SymbolTable symbols) { throw new RuntimeException("Stub!"); }
public  UnicodeSet(java.lang.String pattern, java.text.ParsePosition pos, android.icu.text.SymbolTable symbols, int options) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet set(int start, int end) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet set(android.icu.text.UnicodeSet other) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet applyPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet applyPattern(java.lang.String pattern, boolean ignoreWhitespace) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet applyPattern(java.lang.String pattern, int options) { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern(boolean escapeUnprintable) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer _generatePattern(java.lang.StringBuffer result, boolean escapeUnprintable) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer _generatePattern(java.lang.StringBuffer result, boolean escapeUnprintable, boolean includeStrings) { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  boolean matchesIndexValue(int v) { throw new RuntimeException("Stub!"); }
public  int matches(android.icu.text.Replaceable text, int[] offset, int limit, boolean incremental) { throw new RuntimeException("Stub!"); }
public  void addMatchSetTo(android.icu.text.UnicodeSet toUnionTo) { throw new RuntimeException("Stub!"); }
public  int indexOf(int c) { throw new RuntimeException("Stub!"); }
public  int charAt(int index) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet add(int start, int end) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet addAll(int start, int end) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet add(int c) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet add(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet addAll(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet retainAll(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet complementAll(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet removeAll(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet removeAllStrings() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.UnicodeSet from(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.UnicodeSet fromAll(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet retain(int start, int end) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet retain(int c) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet retain(java.lang.CharSequence cs) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet remove(int start, int end) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet remove(int c) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet remove(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet complement(int start, int end) { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet complement(int c) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet complement() { throw new RuntimeException("Stub!"); }
public final  android.icu.text.UnicodeSet complement(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  boolean contains(int c) { throw new RuntimeException("Stub!"); }
public  boolean contains(int start, int end) { throw new RuntimeException("Stub!"); }
public final  boolean contains(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(android.icu.text.UnicodeSet b) { throw new RuntimeException("Stub!"); }
public  boolean containsAll(java.lang.String s) { throw new RuntimeException("Stub!"); }
public  boolean containsNone(int start, int end) { throw new RuntimeException("Stub!"); }
public  boolean containsNone(android.icu.text.UnicodeSet b) { throw new RuntimeException("Stub!"); }
public  boolean containsNone(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public final  boolean containsSome(int start, int end) { throw new RuntimeException("Stub!"); }
public final  boolean containsSome(android.icu.text.UnicodeSet s) { throw new RuntimeException("Stub!"); }
public final  boolean containsSome(java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet addAll(android.icu.text.UnicodeSet c) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet retainAll(android.icu.text.UnicodeSet c) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet removeAll(android.icu.text.UnicodeSet c) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet complementAll(android.icu.text.UnicodeSet c) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet clear() { throw new RuntimeException("Stub!"); }
public  int getRangeCount() { throw new RuntimeException("Stub!"); }
public  int getRangeStart(int index) { throw new RuntimeException("Stub!"); }
public  int getRangeEnd(int index) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet compact() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public <T extends java.util.Collection<java.lang.String>> T addAllTo(T target) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet add(java.lang.Iterable<?> source) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet addAll(java.lang.Iterable<?> source) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet applyIntPropertyValue(int prop, int value) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String propertyAlias, java.lang.String valueAlias) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String propertyAlias, java.lang.String valueAlias, android.icu.text.SymbolTable symbols) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet closeOver(int attribute) { throw new RuntimeException("Stub!"); }
public  boolean isFrozen() { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet freeze() { throw new RuntimeException("Stub!"); }
public  int span(java.lang.CharSequence s, android.icu.text.UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
public  int span(java.lang.CharSequence s, int start, android.icu.text.UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
public  int spanBack(java.lang.CharSequence s, android.icu.text.UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
public  int spanBack(java.lang.CharSequence s, int fromIndex, android.icu.text.UnicodeSet.SpanCondition spanCondition) { throw new RuntimeException("Stub!"); }
public  android.icu.text.UnicodeSet cloneAsThawed() { throw new RuntimeException("Stub!"); }
public  java.lang.Iterable<android.icu.text.UnicodeSet.EntryRange> ranges() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> iterator() { throw new RuntimeException("Stub!"); }
public <T extends java.lang.CharSequence> boolean containsAll(java.lang.Iterable<T> collection) { throw new RuntimeException("Stub!"); }
public <T extends java.lang.CharSequence> boolean containsNone(java.lang.Iterable<T> collection) { throw new RuntimeException("Stub!"); }
public final <T extends java.lang.CharSequence> boolean containsSome(java.lang.Iterable<T> collection) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet addAll(T... collection) { throw new RuntimeException("Stub!"); }
public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet removeAll(java.lang.Iterable<T> collection) { throw new RuntimeException("Stub!"); }
public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet retainAll(java.lang.Iterable<T> collection) { throw new RuntimeException("Stub!"); }
public  int compareTo(android.icu.text.UnicodeSet o) { throw new RuntimeException("Stub!"); }
public  int compareTo(android.icu.text.UnicodeSet o, android.icu.text.UnicodeSet.ComparisonStyle style) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.lang.Iterable<java.lang.String> other) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.String> strings() { throw new RuntimeException("Stub!"); }
public static final int ADD_CASE_MAPPINGS = 4;
public static final android.icu.text.UnicodeSet ALL_CODE_POINTS;
public static final int CASE = 2;
public static final int CASE_INSENSITIVE = 2;
public static final android.icu.text.UnicodeSet EMPTY;
public static final int IGNORE_SPACE = 1;
public static final int MAX_VALUE = 1114111;
public static final int MIN_VALUE = 0;
static { ALL_CODE_POINTS = null; EMPTY = null; }
}
