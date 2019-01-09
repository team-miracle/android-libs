/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2003-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/

package android.icu.text;
public abstract class IDNA
{
public static final class Info
{
public  Info() { throw new RuntimeException("Stub!"); }
public  boolean hasErrors() { throw new RuntimeException("Stub!"); }
public  java.util.Set<android.icu.text.IDNA.Error> getErrors() { throw new RuntimeException("Stub!"); }
public  boolean isTransitionalDifferent() { throw new RuntimeException("Stub!"); }
}
public static enum Error
{
BIDI(),
CONTEXTJ(),
CONTEXTO_DIGITS(),
CONTEXTO_PUNCTUATION(),
DISALLOWED(),
DOMAIN_NAME_TOO_LONG(),
EMPTY_LABEL(),
HYPHEN_3_4(),
INVALID_ACE_LABEL(),
LABEL_HAS_DOT(),
LABEL_TOO_LONG(),
LEADING_COMBINING_MARK(),
LEADING_HYPHEN(),
PUNYCODE(),
TRAILING_HYPHEN();
}
IDNA() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.IDNA getUTS46Instance(int options) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuilder labelToASCII(java.lang.CharSequence label, java.lang.StringBuilder dest, android.icu.text.IDNA.Info info);
public abstract  java.lang.StringBuilder labelToUnicode(java.lang.CharSequence label, java.lang.StringBuilder dest, android.icu.text.IDNA.Info info);
public abstract  java.lang.StringBuilder nameToASCII(java.lang.CharSequence name, java.lang.StringBuilder dest, android.icu.text.IDNA.Info info);
public abstract  java.lang.StringBuilder nameToUnicode(java.lang.CharSequence name, java.lang.StringBuilder dest, android.icu.text.IDNA.Info info);
public static final int CHECK_BIDI = 4;
public static final int CHECK_CONTEXTJ = 8;
public static final int CHECK_CONTEXTO = 64;
public static final int DEFAULT = 0;
public static final int NONTRANSITIONAL_TO_ASCII = 16;
public static final int NONTRANSITIONAL_TO_UNICODE = 32;
public static final int USE_STD3_RULES = 2;
}
