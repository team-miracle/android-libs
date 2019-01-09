/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
******************************************************************************
* Copyright (C) 2003-2016, International Business Machines Corporation and
* others. All Rights Reserved.
******************************************************************************
*/

package android.icu.util;
@java.lang.SuppressWarnings(value={"javadoc"})
public final class ULocale
  implements java.io.Serializable, java.lang.Comparable<android.icu.util.ULocale>
{
public static enum Category
{
DISPLAY(),
FORMAT();
}
public static final class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setLocale(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setLanguageTag(java.lang.String languageTag) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setLanguage(java.lang.String language) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setScript(java.lang.String script) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setRegion(java.lang.String region) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setVariant(java.lang.String variant) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setExtension(char key, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder setUnicodeLocaleKeyword(java.lang.String key, java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder addUnicodeLocaleAttribute(java.lang.String attribute) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder removeUnicodeLocaleAttribute(java.lang.String attribute) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder clear() { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale.Builder clearExtensions() { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale build() { throw new RuntimeException("Stub!"); }
}
public  ULocale(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  ULocale(java.lang.String a, java.lang.String b) { throw new RuntimeException("Stub!"); }
public  ULocale(java.lang.String a, java.lang.String b, java.lang.String c) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale forLocale(java.util.Locale loc) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale createCanonical(java.lang.String nonCanonicalID) { throw new RuntimeException("Stub!"); }
public  java.util.Locale toLocale() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale getDefault() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale getDefault(android.icu.util.ULocale.Category category) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int compareTo(android.icu.util.ULocale other) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getISOCountries() { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getISOLanguages() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLanguage() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getLanguage(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getScript() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getScript(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCountry() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCountry(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getVariant() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getVariant(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getFallback(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale getFallback() { throw new RuntimeException("Stub!"); }
public  java.lang.String getBaseName() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getBaseName(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getName(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.util.Iterator<java.lang.String> getKeywords() { throw new RuntimeException("Stub!"); }
public static  java.util.Iterator<java.lang.String> getKeywords(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getKeywordValue(java.lang.String keywordName) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getKeywordValue(java.lang.String localeID, java.lang.String keywordName) { throw new RuntimeException("Stub!"); }
public static  java.lang.String canonicalize(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  android.icu.util.ULocale setKeywordValue(java.lang.String keyword, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String setKeywordValue(java.lang.String localeID, java.lang.String keyword, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getISO3Language() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getISO3Language(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  java.lang.String getISO3Country() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getISO3Country(java.lang.String localeID) { throw new RuntimeException("Stub!"); }
public  boolean isRightToLeft() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayLanguage() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayLanguage(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayLanguage(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayLanguage(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayLanguageWithDialect() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayLanguageWithDialect(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayLanguageWithDialect(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayLanguageWithDialect(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayScript() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayScript(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayScript(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayScript(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayCountry() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayCountry(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayCountry(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayCountry(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayVariant() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayVariant(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayVariant(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayVariant(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayKeyword(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayKeyword(java.lang.String keyword, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayKeyword(java.lang.String keyword, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayKeywordValue(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayKeywordValue(java.lang.String keyword, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayKeywordValue(java.lang.String localeID, java.lang.String keyword, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayKeywordValue(java.lang.String localeID, java.lang.String keyword, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayName(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayName(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayNameWithDialect() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayNameWithDialect(android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayNameWithDialect(java.lang.String localeID, java.lang.String displayLocaleID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getDisplayNameWithDialect(java.lang.String localeID, android.icu.util.ULocale displayLocale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getCharacterOrientation() { throw new RuntimeException("Stub!"); }
public  java.lang.String getLineOrientation() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale acceptLanguage(java.lang.String acceptLanguageList, android.icu.util.ULocale[] availableLocales, boolean[] fallback) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale acceptLanguage(android.icu.util.ULocale[] acceptLanguageList, android.icu.util.ULocale[] availableLocales, boolean[] fallback) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale acceptLanguage(java.lang.String acceptLanguageList, boolean[] fallback) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale acceptLanguage(android.icu.util.ULocale[] acceptLanguageList, boolean[] fallback) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale addLikelySubtags(android.icu.util.ULocale loc) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale minimizeSubtags(android.icu.util.ULocale loc) { throw new RuntimeException("Stub!"); }
public  java.lang.String getExtension(char key) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.Character> getExtensionKeys() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getUnicodeLocaleAttributes() { throw new RuntimeException("Stub!"); }
public  java.lang.String getUnicodeLocaleType(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getUnicodeLocaleKeys() { throw new RuntimeException("Stub!"); }
public  java.lang.String toLanguageTag() { throw new RuntimeException("Stub!"); }
public static  android.icu.util.ULocale forLanguageTag(java.lang.String languageTag) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toUnicodeLocaleKey(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toUnicodeLocaleType(java.lang.String keyword, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toLegacyKey(java.lang.String keyword) { throw new RuntimeException("Stub!"); }
public static  java.lang.String toLegacyType(java.lang.String keyword, java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final android.icu.util.ULocale CANADA;
public static final android.icu.util.ULocale CANADA_FRENCH;
public static final android.icu.util.ULocale CHINA;
public static final android.icu.util.ULocale CHINESE;
public static final android.icu.util.ULocale ENGLISH;
public static final android.icu.util.ULocale FRANCE;
public static final android.icu.util.ULocale FRENCH;
public static final android.icu.util.ULocale GERMAN;
public static final android.icu.util.ULocale GERMANY;
public static final android.icu.util.ULocale ITALIAN;
public static final android.icu.util.ULocale ITALY;
public static final android.icu.util.ULocale JAPAN;
public static final android.icu.util.ULocale JAPANESE;
public static final android.icu.util.ULocale KOREA;
public static final android.icu.util.ULocale KOREAN;
public static final android.icu.util.ULocale PRC;
public static final char PRIVATE_USE_EXTENSION = 120;
public static final android.icu.util.ULocale ROOT;
public static final android.icu.util.ULocale SIMPLIFIED_CHINESE;
public static final android.icu.util.ULocale TAIWAN;
public static final android.icu.util.ULocale TRADITIONAL_CHINESE;
public static final android.icu.util.ULocale UK;
public static final char UNICODE_LOCALE_EXTENSION = 117;
public static final android.icu.util.ULocale US;
static { CANADA = null; CANADA_FRENCH = null; CHINA = null; CHINESE = null; ENGLISH = null; FRANCE = null; FRENCH = null; GERMAN = null; GERMANY = null; ITALIAN = null; ITALY = null; JAPAN = null; JAPANESE = null; KOREA = null; KOREAN = null; PRC = null; ROOT = null; SIMPLIFIED_CHINESE = null; TAIWAN = null; TRADITIONAL_CHINESE = null; UK = null; US = null; }
}
