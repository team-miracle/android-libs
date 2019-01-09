/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
*******************************************************************************
* Copyright (C) 2011-2016, International Business Machines Corporation and
* others. All Rights Reserved.
*******************************************************************************
*/
package android.icu.text;
public abstract class TimeZoneNames
  implements java.io.Serializable
{
public static enum NameType
{
EXEMPLAR_LOCATION(),
LONG_DAYLIGHT(),
LONG_GENERIC(),
LONG_STANDARD(),
SHORT_DAYLIGHT(),
SHORT_GENERIC(),
SHORT_STANDARD();
}
TimeZoneNames() { throw new RuntimeException("Stub!"); }
public static  android.icu.text.TimeZoneNames getInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.TimeZoneNames getInstance(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  android.icu.text.TimeZoneNames getTZDBInstance(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public abstract  java.util.Set<java.lang.String> getAvailableMetaZoneIDs();
public abstract  java.util.Set<java.lang.String> getAvailableMetaZoneIDs(java.lang.String tzID);
public abstract  java.lang.String getMetaZoneID(java.lang.String tzID, long date);
public abstract  java.lang.String getReferenceZoneID(java.lang.String mzID, java.lang.String region);
public abstract  java.lang.String getMetaZoneDisplayName(java.lang.String mzID, android.icu.text.TimeZoneNames.NameType type);
public final  java.lang.String getDisplayName(java.lang.String tzID, android.icu.text.TimeZoneNames.NameType type, long date) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getTimeZoneDisplayName(java.lang.String tzID, android.icu.text.TimeZoneNames.NameType type);
public  java.lang.String getExemplarLocationName(java.lang.String tzID) { throw new RuntimeException("Stub!"); }
}
