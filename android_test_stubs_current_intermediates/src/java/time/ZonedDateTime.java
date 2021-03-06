/*
* Copyright (c) 2012, 2015, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

/*
* This file is available under and governed by the GNU General Public
* License version 2 only, as published by the Free Software Foundation.
* However, the following notice accompanied the original version of this
* file:
*
* Copyright (c) 2007-2012, Stephen Colebourne & Michael Nascimento Santos
*
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*
*  * Redistributions of source code must retain the above copyright notice,
*    this list of conditions and the following disclaimer.
*
*  * Redistributions in binary form must reproduce the above copyright notice,
*    this list of conditions and the following disclaimer in the documentation
*    and/or other materials provided with the distribution.
*
*  * Neither the name of JSR-310 nor the names of its contributors
*    may be used to endorse or promote products derived from this software
*    without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
* EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
* PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
* PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
* LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package java.time;
public final class ZonedDateTime
  implements java.time.temporal.Temporal, java.time.chrono.ChronoZonedDateTime<java.time.LocalDate>, java.io.Serializable
{
ZonedDateTime() { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime now() { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime now(java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime now(java.time.Clock clock) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime of(java.time.LocalDate date, java.time.LocalTime time, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime of(java.time.LocalDateTime localDateTime, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime ofLocal(java.time.LocalDateTime localDateTime, java.time.ZoneId zone, java.time.ZoneOffset preferredOffset) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime ofInstant(java.time.Instant instant, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime ofInstant(java.time.LocalDateTime localDateTime, java.time.ZoneOffset offset, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime ofStrict(java.time.LocalDateTime localDateTime, java.time.ZoneOffset offset, java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime from(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime parse(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static  java.time.ZonedDateTime parse(java.lang.CharSequence text, java.time.format.DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
public  boolean isSupported(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  boolean isSupported(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.ValueRange range(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  int get(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  long getLong(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  java.time.ZoneOffset getOffset() { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withEarlierOffsetAtOverlap() { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withLaterOffsetAtOverlap() { throw new RuntimeException("Stub!"); }
public  java.time.ZoneId getZone() { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withZoneSameLocal(java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withZoneSameInstant(java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withFixedOffsetZone() { throw new RuntimeException("Stub!"); }
public  java.time.LocalDateTime toLocalDateTime() { throw new RuntimeException("Stub!"); }
public  java.time.LocalDate toLocalDate() { throw new RuntimeException("Stub!"); }
public  int getYear() { throw new RuntimeException("Stub!"); }
public  int getMonthValue() { throw new RuntimeException("Stub!"); }
public  java.time.Month getMonth() { throw new RuntimeException("Stub!"); }
public  int getDayOfMonth() { throw new RuntimeException("Stub!"); }
public  int getDayOfYear() { throw new RuntimeException("Stub!"); }
public  java.time.DayOfWeek getDayOfWeek() { throw new RuntimeException("Stub!"); }
public  java.time.LocalTime toLocalTime() { throw new RuntimeException("Stub!"); }
public  int getHour() { throw new RuntimeException("Stub!"); }
public  int getMinute() { throw new RuntimeException("Stub!"); }
public  int getSecond() { throw new RuntimeException("Stub!"); }
public  int getNano() { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime with(java.time.temporal.TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime with(java.time.temporal.TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withYear(int year) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withMonth(int month) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withDayOfMonth(int dayOfMonth) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withDayOfYear(int dayOfYear) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withHour(int hour) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withSecond(int second) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime truncatedTo(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plus(java.time.temporal.TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plus(long amountToAdd, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusYears(long years) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusMonths(long months) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusDays(long days) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusHours(long hours) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime plusNanos(long nanos) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minus(java.time.temporal.TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minus(long amountToSubtract, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusYears(long years) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusMonths(long months) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusDays(long days) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusHours(long hours) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime minusNanos(long nanos) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <R> R query(java.time.temporal.TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
public  long until(java.time.temporal.Temporal endExclusive, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.lang.String format(java.time.format.DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
public  java.time.OffsetDateTime toOffsetDateTime() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
