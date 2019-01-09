/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2008-2016, Google Inc, International Business Machines Corporation
* and others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.text;
public final class AlphabeticIndex<V>
  implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Bucket<V>>
{
public static final class ImmutableIndex<V>
  implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Bucket<V>>
{
ImmutableIndex() { throw new RuntimeException("Stub!"); }
public  int getBucketCount() { throw new RuntimeException("Stub!"); }
public  int getBucketIndex(java.lang.CharSequence name) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex.Bucket<V> getBucket(int index) { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<android.icu.text.AlphabeticIndex.Bucket<V>> iterator() { throw new RuntimeException("Stub!"); }
}
public static class Record<V>
{
Record() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getName() { throw new RuntimeException("Stub!"); }
public  V getData() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class Bucket<V>
  implements java.lang.Iterable<android.icu.text.AlphabeticIndex.Record<V>>
{
public static enum LabelType
{
INFLOW(),
NORMAL(),
OVERFLOW(),
UNDERFLOW();
}
Bucket() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLabel() { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex.Bucket.LabelType getLabelType() { throw new RuntimeException("Stub!"); }
public  int size() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<android.icu.text.AlphabeticIndex.Record<V>> iterator() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public  AlphabeticIndex(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public  AlphabeticIndex(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  AlphabeticIndex(android.icu.text.RuleBasedCollator collator) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> addLabels(android.icu.text.UnicodeSet additions) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> addLabels(android.icu.util.ULocale... additions) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> addLabels(java.util.Locale... additions) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> setOverflowLabel(java.lang.String overflowLabel) { throw new RuntimeException("Stub!"); }
public  java.lang.String getUnderflowLabel() { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> setUnderflowLabel(java.lang.String underflowLabel) { throw new RuntimeException("Stub!"); }
public  java.lang.String getOverflowLabel() { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> setInflowLabel(java.lang.String inflowLabel) { throw new RuntimeException("Stub!"); }
public  java.lang.String getInflowLabel() { throw new RuntimeException("Stub!"); }
public  int getMaxLabelCount() { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> setMaxLabelCount(int maxLabelCount) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex.ImmutableIndex<V> buildImmutableIndex() { throw new RuntimeException("Stub!"); }
public  java.util.List<java.lang.String> getBucketLabels() { throw new RuntimeException("Stub!"); }
public  android.icu.text.RuleBasedCollator getCollator() { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> addRecord(java.lang.CharSequence name, V data) { throw new RuntimeException("Stub!"); }
public  int getBucketIndex(java.lang.CharSequence name) { throw new RuntimeException("Stub!"); }
public  android.icu.text.AlphabeticIndex<V> clearRecords() { throw new RuntimeException("Stub!"); }
public  int getBucketCount() { throw new RuntimeException("Stub!"); }
public  int getRecordCount() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<android.icu.text.AlphabeticIndex.Bucket<V>> iterator() { throw new RuntimeException("Stub!"); }
}
