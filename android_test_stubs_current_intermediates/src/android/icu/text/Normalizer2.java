/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
*   Copyright (C) 2009-2016, International Business Machines
*   Corporation and others.  All Rights Reserved.
*******************************************************************************
*/

package android.icu.text;
public abstract class Normalizer2
{
public static enum Mode
{
COMPOSE(),
COMPOSE_CONTIGUOUS(),
DECOMPOSE(),
FCD();
}
Normalizer2() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getNFCInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getNFDInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getNFKCInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getNFKDInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getNFKCCasefoldInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.Normalizer2 getInstance(java.io.InputStream data, java.lang.String name, android.icu.text.Normalizer2.Mode mode) { throw new RuntimeException("Stub!"); }
public  java.lang.String normalize(java.lang.CharSequence src) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.StringBuilder normalize(java.lang.CharSequence src, java.lang.StringBuilder dest);
public abstract  java.lang.Appendable normalize(java.lang.CharSequence src, java.lang.Appendable dest);
public abstract  java.lang.StringBuilder normalizeSecondAndAppend(java.lang.StringBuilder first, java.lang.CharSequence second);
public abstract  java.lang.StringBuilder append(java.lang.StringBuilder first, java.lang.CharSequence second);
public abstract  java.lang.String getDecomposition(int c);
public  java.lang.String getRawDecomposition(int c) { throw new RuntimeException("Stub!"); }
public  int composePair(int a, int b) { throw new RuntimeException("Stub!"); }
public  int getCombiningClass(int c) { throw new RuntimeException("Stub!"); }
public abstract  boolean isNormalized(java.lang.CharSequence s);
public abstract  android.icu.text.Normalizer.QuickCheckResult quickCheck(java.lang.CharSequence s);
public abstract  int spanQuickCheckYes(java.lang.CharSequence s);
public abstract  boolean hasBoundaryBefore(int c);
public abstract  boolean hasBoundaryAfter(int c);
public abstract  boolean isInert(int c);
}
