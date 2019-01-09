/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
**********************************************************************
* Copyright (c) 2004-2016, International Business Machines
* Corporation and others.  All Rights Reserved.
**********************************************************************
* Author: Alan Liu
* Created: April 6, 2004
* Since: ICU 3.0
**********************************************************************
*/
package android.icu.text;
public class MessageFormat
  extends android.icu.text.UFormat
{
public static class Field
  extends java.text.Format.Field
{
protected  Field(java.lang.String name) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
protected  java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
public static final android.icu.text.MessageFormat.Field ARGUMENT;
static { ARGUMENT = null; }
}
public  MessageFormat(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  MessageFormat(java.lang.String pattern, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  MessageFormat(java.lang.String pattern, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public  void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  void setLocale(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale getULocale() { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String pttrn) { throw new RuntimeException("Stub!"); }
public  void applyPattern(java.lang.String pattern, android.icu.text.MessagePattern.ApostropheMode aposMode) { throw new RuntimeException("Stub!"); }
public  android.icu.text.MessagePattern.ApostropheMode getApostropheMode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public  void setFormatsByArgumentIndex(java.text.Format[] newFormats) { throw new RuntimeException("Stub!"); }
public  void setFormatsByArgumentName(java.util.Map<java.lang.String, java.text.Format> newFormats) { throw new RuntimeException("Stub!"); }
public  void setFormats(java.text.Format[] newFormats) { throw new RuntimeException("Stub!"); }
public  void setFormatByArgumentIndex(int argumentIndex, java.text.Format newFormat) { throw new RuntimeException("Stub!"); }
public  void setFormatByArgumentName(java.lang.String argumentName, java.text.Format newFormat) { throw new RuntimeException("Stub!"); }
public  void setFormat(int formatElementIndex, java.text.Format newFormat) { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormatsByArgumentIndex() { throw new RuntimeException("Stub!"); }
public  java.text.Format[] getFormats() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getArgumentNames() { throw new RuntimeException("Stub!"); }
public  java.text.Format getFormatByArgumentName(java.lang.String argumentName) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object[] arguments, java.lang.StringBuffer result, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.util.Map<java.lang.String, java.lang.Object> arguments, java.lang.StringBuffer result, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.lang.String pattern, java.lang.Object... arguments) { throw new RuntimeException("Stub!"); }
public static  java.lang.String format(java.lang.String pattern, java.util.Map<java.lang.String, java.lang.Object> arguments) { throw new RuntimeException("Stub!"); }
public  boolean usesNamedArguments() { throw new RuntimeException("Stub!"); }
public final  java.lang.StringBuffer format(java.lang.Object arguments, java.lang.StringBuffer result, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arguments) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Object> parseToMap(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Object[] parse(java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Object> parseToMap(java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
public  java.lang.Object parseObject(java.lang.String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  java.lang.String autoQuoteApostrophe(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
}
