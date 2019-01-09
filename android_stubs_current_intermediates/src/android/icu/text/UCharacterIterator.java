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
public abstract class UCharacterIterator
  implements java.lang.Cloneable
{
protected  UCharacterIterator() { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(android.icu.text.Replaceable source) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(java.lang.String source) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(char[] source) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(char[] source, int start, int limit) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(java.lang.StringBuffer source) { throw new RuntimeException("Stub!"); }
public static final  android.icu.text.UCharacterIterator getInstance(java.text.CharacterIterator source) { throw new RuntimeException("Stub!"); }
public  java.text.CharacterIterator getCharacterIterator() { throw new RuntimeException("Stub!"); }
public abstract  int current();
public  int currentCodePoint() { throw new RuntimeException("Stub!"); }
public abstract  int getLength();
public abstract  int getIndex();
public abstract  int next();
public  int nextCodePoint() { throw new RuntimeException("Stub!"); }
public abstract  int previous();
public  int previousCodePoint() { throw new RuntimeException("Stub!"); }
public abstract  void setIndex(int index);
public  void setToLimit() { throw new RuntimeException("Stub!"); }
public  void setToStart() { throw new RuntimeException("Stub!"); }
public abstract  int getText(char[] fillIn, int offset);
public final  int getText(char[] fillIn) { throw new RuntimeException("Stub!"); }
public  java.lang.String getText() { throw new RuntimeException("Stub!"); }
public  int moveIndex(int delta) { throw new RuntimeException("Stub!"); }
public  int moveCodePointIndex(int delta) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public static final int DONE = -1;
}
