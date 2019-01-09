/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2007-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/

package android.icu.text;
public class PluralRules
  implements java.io.Serializable
{
public static enum PluralType
{
CARDINAL(),
ORDINAL();
}
PluralRules() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules parseDescription(java.lang.String description) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules createRules(java.lang.String description) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules forLocale(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules forLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules forLocale(android.icu.util.ULocale locale, android.icu.text.PluralRules.PluralType type) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.PluralRules forLocale(java.util.Locale locale, android.icu.text.PluralRules.PluralType type) { throw new RuntimeException("Stub!"); }
public  java.lang.String select(double number) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getKeywords() { throw new RuntimeException("Stub!"); }
public  double getUniqueKeywordValue(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.Double> getAllKeywordValues(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public  java.util.Collection<java.lang.Double> getSamples(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object rhs) { throw new RuntimeException("Stub!"); }
public  boolean equals(android.icu.text.PluralRules rhs) { throw new RuntimeException("Stub!"); }
public static final android.icu.text.PluralRules DEFAULT;
public static final java.lang.String KEYWORD_FEW = "few";
public static final java.lang.String KEYWORD_MANY = "many";
public static final java.lang.String KEYWORD_ONE = "one";
public static final java.lang.String KEYWORD_OTHER = "other";
public static final java.lang.String KEYWORD_TWO = "two";
public static final java.lang.String KEYWORD_ZERO = "zero";
public static final double NO_UNIQUE_VALUE = -0.00123456777;
static { DEFAULT = null; }
}
