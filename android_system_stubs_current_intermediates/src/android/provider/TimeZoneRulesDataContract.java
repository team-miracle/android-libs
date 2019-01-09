/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.provider;
public final class TimeZoneRulesDataContract
{
public static final class Operation
{
Operation() { throw new RuntimeException("Stub!"); }
public static final java.lang.String COLUMN_DISTRO_MAJOR_VERSION = "distro_major_version";
public static final java.lang.String COLUMN_DISTRO_MINOR_VERSION = "distro_minor_version";
public static final java.lang.String COLUMN_REVISION = "revision";
public static final java.lang.String COLUMN_RULES_VERSION = "rules_version";
public static final java.lang.String COLUMN_TYPE = "type";
public static final android.net.Uri CONTENT_URI;
public static final java.lang.String TYPE_INSTALL = "INSTALL";
public static final java.lang.String TYPE_NO_OP = "NOOP";
public static final java.lang.String TYPE_UNINSTALL = "UNINSTALL";
static { CONTENT_URI = null; }
}
TimeZoneRulesDataContract() { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUTHORITY = "com.android.timezone";
}
