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
public abstract class BreakIterator
  implements java.lang.Cloneable
{
protected  BreakIterator() { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public abstract  int first();
public abstract  int last();
public abstract  int next(int n);
public abstract  int next();
public abstract  int previous();
public abstract  int following(int offset);
public  int preceding(int offset) { throw new RuntimeException("Stub!"); }
public  boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); }
public abstract  int current();
public  int getRuleStatus() { throw new RuntimeException("Stub!"); }
public  int getRuleStatusVec(int[] fillInArray) { throw new RuntimeException("Stub!"); }
public abstract  java.text.CharacterIterator getText();
public  void setText(java.lang.String newText) { throw new RuntimeException("Stub!"); }
public abstract  void setText(java.text.CharacterIterator newText);
public static  android.icu.text.BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getWordInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getWordInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getLineInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getLineInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getCharacterInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getCharacterInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getSentenceInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getSentenceInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getTitleInstance() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getTitleInstance(java.util.Locale where) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.BreakIterator getTitleInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
public static synchronized  java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public static final int DONE = -1;
public static final int KIND_CHARACTER = 0;
public static final int KIND_LINE = 2;
public static final int KIND_SENTENCE = 3;
public static final int KIND_TITLE = 4;
public static final int KIND_WORD = 1;
public static final int WORD_IDEO = 400;
public static final int WORD_IDEO_LIMIT = 500;
public static final int WORD_KANA = 300;
public static final int WORD_KANA_LIMIT = 400;
public static final int WORD_LETTER = 200;
public static final int WORD_LETTER_LIMIT = 300;
public static final int WORD_NONE = 0;
public static final int WORD_NONE_LIMIT = 100;
public static final int WORD_NUMBER = 100;
public static final int WORD_NUMBER_LIMIT = 200;
}
