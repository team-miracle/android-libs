/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2009-2016, International Business Machines Corporation and    *
* others. All Rights Reserved.                                                *
*******************************************************************************
*/
package android.icu.text;
public abstract class LocaleDisplayNames
{
public static enum DialectHandling
{
DIALECT_NAMES(),
STANDARD_NAMES();
}
public static class UiListItem
{
public  UiListItem(android.icu.util.ULocale minimized, android.icu.util.ULocale modified, java.lang.String nameInDisplayLocale, java.lang.String nameInSelf) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.util.Comparator<android.icu.text.LocaleDisplayNames.UiListItem> getComparator(java.util.Comparator<java.lang.Object> comparator, boolean inSelf) { throw new RuntimeException("Stub!"); }
public final android.icu.util.ULocale minimized;
public final android.icu.util.ULocale modified;
public final java.lang.String nameInDisplayLocale;
public final java.lang.String nameInSelf;
}
LocaleDisplayNames() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale, android.icu.text.LocaleDisplayNames.DialectHandling dialectHandling) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale locale, android.icu.text.DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.LocaleDisplayNames getInstance(java.util.Locale locale, android.icu.text.DisplayContext... contexts) { throw new RuntimeException("Stub!"); }
public abstract  android.icu.util.ULocale getLocale();
public abstract  android.icu.text.LocaleDisplayNames.DialectHandling getDialectHandling();
public abstract  android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type type);
public abstract  java.lang.String localeDisplayName(android.icu.util.ULocale locale);
public abstract  java.lang.String localeDisplayName(java.util.Locale locale);
public abstract  java.lang.String localeDisplayName(java.lang.String localeId);
public abstract  java.lang.String languageDisplayName(java.lang.String lang);
public abstract  java.lang.String scriptDisplayName(java.lang.String script);
public abstract  java.lang.String scriptDisplayName(int scriptCode);
public abstract  java.lang.String regionDisplayName(java.lang.String region);
public abstract  java.lang.String variantDisplayName(java.lang.String variant);
public abstract  java.lang.String keyDisplayName(java.lang.String key);
public abstract  java.lang.String keyValueDisplayName(java.lang.String key, java.lang.String value);
public  java.util.List<android.icu.text.LocaleDisplayNames.UiListItem> getUiList(java.util.Set<android.icu.util.ULocale> localeSet, boolean inSelf, java.util.Comparator<java.lang.Object> collator) { throw new RuntimeException("Stub!"); }
public abstract  java.util.List<android.icu.text.LocaleDisplayNames.UiListItem> getUiListCompareWholeItems(java.util.Set<android.icu.util.ULocale> localeSet, java.util.Comparator<android.icu.text.LocaleDisplayNames.UiListItem> comparator);
}
