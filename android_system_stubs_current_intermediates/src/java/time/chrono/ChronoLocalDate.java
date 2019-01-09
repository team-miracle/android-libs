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
* Copyright (c) 2012, Stephen Colebourne & Michael Nascimento Santos
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
package java.time.chrono;
public interface ChronoLocalDate
  extends java.time.temporal.Temporal, java.time.temporal.TemporalAdjuster, java.lang.Comparable<java.time.chrono.ChronoLocalDate>
{
public static  java.util.Comparator<java.time.chrono.ChronoLocalDate> timeLineOrder() { throw new RuntimeException("Stub!"); }
public static  java.time.chrono.ChronoLocalDate from(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
public abstract  java.time.chrono.Chronology getChronology();
default public  java.time.chrono.Era getEra() { throw new RuntimeException("Stub!"); }
default public  boolean isLeapYear() { throw new RuntimeException("Stub!"); }
public abstract  int lengthOfMonth();
default public  int lengthOfYear() { throw new RuntimeException("Stub!"); }
default public  boolean isSupported(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
default public  boolean isSupported(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate with(java.time.temporal.TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate with(java.time.temporal.TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate plus(java.time.temporal.TemporalAmount amount) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate plus(long amountToAdd, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate minus(java.time.temporal.TemporalAmount amount) { throw new RuntimeException("Stub!"); }
default public  java.time.chrono.ChronoLocalDate minus(long amountToSubtract, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
default public <R> R query(java.time.temporal.TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
default public  java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal temporal) { throw new RuntimeException("Stub!"); }
public abstract  long until(java.time.temporal.Temporal endExclusive, java.time.temporal.TemporalUnit unit);
public abstract  java.time.chrono.ChronoPeriod until(java.time.chrono.ChronoLocalDate endDateExclusive);
default public  java.lang.String format(java.time.format.DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
default public  java.time.chrono.ChronoLocalDateTime<?> atTime(java.time.LocalTime localTime) { throw new RuntimeException("Stub!"); }
default public  long toEpochDay() { throw new RuntimeException("Stub!"); }
default public  int compareTo(java.time.chrono.ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
default public  boolean isAfter(java.time.chrono.ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
default public  boolean isBefore(java.time.chrono.ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
default public  boolean isEqual(java.time.chrono.ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
public abstract  boolean equals(java.lang.Object obj);
public abstract  int hashCode();
public abstract  java.lang.String toString();
}
