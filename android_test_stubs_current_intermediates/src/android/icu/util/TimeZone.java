/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2016 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
/*
* @(#)TimeZone.java    1.51 00/01/19
*
* Copyright (C) 1996-2016, International Business Machines
* Corporation and others.  All Rights Reserved.
*/

package android.icu.util;
public abstract class TimeZone
  implements java.io.Serializable, java.lang.Cloneable, android.icu.util.Freezable<android.icu.util.TimeZone>
{
public static enum SystemTimeZoneType
{
ANY(),
CANONICAL(),
CANONICAL_LOCATION();
}
public  TimeZone() { throw new RuntimeException("Stub!"); }
public abstract  int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds);
public  int getOffset(long date) { throw new RuntimeException("Stub!"); }
public  void getOffset(long date, boolean local, int[] offsets) { throw new RuntimeException("Stub!"); }
public abstract  void setRawOffset(int offsetMillis);
public abstract  int getRawOffset();
public  java.lang.String getID() { throw new RuntimeException("Stub!"); }
public  void setID(java.lang.String ID) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }
public final  java.lang.String getDisplayName(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getDisplayName(android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getDisplayName(boolean daylight, int style) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName(boolean daylight, int style, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.lang.String getDisplayName(boolean daylight, int style, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
public  int getDSTSavings() { throw new RuntimeException("Stub!"); }
public abstract  boolean useDaylightTime();
@java.lang.SuppressWarnings(value={"javadoc"})
public  boolean observesDaylightTime() { throw new RuntimeException("Stub!"); }
public abstract  boolean inDaylightTime(java.util.Date date);
public static  android.icu.util.TimeZone getTimeZone(java.lang.String ID) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.TimeZone getFrozenTimeZone(java.lang.String ID) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.TimeZone getTimeZone(java.lang.String ID, int type) { throw new RuntimeException("Stub!"); }
public static  java.util.Set<java.lang.String> getAvailableIDs(android.icu.util.TimeZone.SystemTimeZoneType zoneType, java.lang.String region, java.lang.Integer rawOffset) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getAvailableIDs(int rawOffset) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getAvailableIDs(java.lang.String country) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] getAvailableIDs() { throw new RuntimeException("Stub!"); }
public static  int countEquivalentIDs(java.lang.String id) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getEquivalentID(java.lang.String id, int index) { throw new RuntimeException("Stub!"); }
public static  android.icu.util.TimeZone getDefault() { throw new RuntimeException("Stub!"); }
public  boolean hasSameRules(android.icu.util.TimeZone other) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getTZDataVersion() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCanonicalID(java.lang.String id) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCanonicalID(java.lang.String id, boolean[] isSystemID) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getRegion(java.lang.String id) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getWindowsID(java.lang.String id) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getIDForWindowsID(java.lang.String winid, java.lang.String region) { throw new RuntimeException("Stub!"); }
public  boolean isFrozen() { throw new RuntimeException("Stub!"); }
public  android.icu.util.TimeZone freeze() { throw new RuntimeException("Stub!"); }
public  android.icu.util.TimeZone cloneAsThawed() { throw new RuntimeException("Stub!"); }
public static final int GENERIC_LOCATION = 7;
public static final android.icu.util.TimeZone GMT_ZONE;
public static final int LONG = 1;
public static final int LONG_GENERIC = 3;
public static final int LONG_GMT = 5;
public static final int SHORT = 0;
public static final int SHORT_COMMONLY_USED = 6;
public static final int SHORT_GENERIC = 2;
public static final int SHORT_GMT = 4;
public static final int TIMEZONE_ICU = 0;
public static final int TIMEZONE_JDK = 1;
public static final android.icu.util.TimeZone UNKNOWN_ZONE;
public static final java.lang.String UNKNOWN_ZONE_ID = "Etc/Unknown";
static { GMT_ZONE = null; UNKNOWN_ZONE = null; }
}
