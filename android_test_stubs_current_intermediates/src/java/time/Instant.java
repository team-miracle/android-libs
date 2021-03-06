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
public final class Instant
  implements java.time.temporal.Temporal, java.time.temporal.TemporalAdjuster, java.lang.Comparable<java.time.Instant>, java.io.Serializable
{
Instant() { throw new RuntimeException("Stub!"); }
public static  java.time.Instant now() { throw new RuntimeException("Stub!"); }
public static  java.time.Instant now(java.time.Clock clock) { throw new RuntimeException("Stub!"); }
public static  java.time.Instant ofEpochSecond(long epochSecond) { throw new RuntimeException("Stub!"); }
public static  java.time.Instant ofEpochSecond(long epochSecond, long nanoAdjustment) { throw new RuntimeException("Stub!"); }
public static  java.time.Instant ofEpochMilli(long epochMilli) { throw new RuntimeException("Stub!"); }
public static  java.time.Instant from(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
public static  java.time.Instant parse(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  boolean isSupported(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  boolean isSupported(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.ValueRange range(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  int get(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  long getLong(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }
public  long getEpochSecond() { throw new RuntimeException("Stub!"); }
public  int getNano() { throw new RuntimeException("Stub!"); }
public  java.time.Instant with(java.time.temporal.TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
public  java.time.Instant with(java.time.temporal.TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
public  java.time.Instant truncatedTo(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.Instant plus(java.time.temporal.TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Instant plus(long amountToAdd, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.Instant plusSeconds(long secondsToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Instant plusMillis(long millisToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Instant plusNanos(long nanosToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Instant minus(java.time.temporal.TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Instant minus(long amountToSubtract, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.Instant minusSeconds(long secondsToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Instant minusMillis(long millisToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Instant minusNanos(long nanosToSubtract) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <R> R query(java.time.temporal.TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal temporal) { throw new RuntimeException("Stub!"); }
public  long until(java.time.temporal.Temporal endExclusive, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.time.OffsetDateTime atOffset(java.time.ZoneOffset offset) { throw new RuntimeException("Stub!"); }
public  java.time.ZonedDateTime atZone(java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }
public  long toEpochMilli() { throw new RuntimeException("Stub!"); }
public  int compareTo(java.time.Instant otherInstant) { throw new RuntimeException("Stub!"); }
public  boolean isAfter(java.time.Instant otherInstant) { throw new RuntimeException("Stub!"); }
public  boolean isBefore(java.time.Instant otherInstant) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object otherInstant) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.time.Instant EPOCH;
public static final java.time.Instant MAX;
public static final java.time.Instant MIN;
static { EPOCH = null; MAX = null; MIN = null; }
}
