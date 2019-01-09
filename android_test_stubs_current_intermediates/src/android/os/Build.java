/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.os;
public class Build
{
public static class VERSION
{
public  VERSION() { throw new RuntimeException("Stub!"); }
public static final java.lang.String BASE_OS;
public static final java.lang.String CODENAME;
public static final int FIRST_SDK_INT;
public static final java.lang.String INCREMENTAL;
public static final int PREVIEW_SDK_INT;
public static final java.lang.String RELEASE;
public static final int RESOURCES_SDK_INT;
@java.lang.Deprecated()
public static final java.lang.String SDK;
public static final int SDK_INT;
public static final java.lang.String SECURITY_PATCH;
static { BASE_OS = null; CODENAME = null; FIRST_SDK_INT = 0; INCREMENTAL = null; PREVIEW_SDK_INT = 0; RELEASE = null; RESOURCES_SDK_INT = 0; SDK = null; SDK_INT = 0; SECURITY_PATCH = null; }
}
public static class VERSION_CODES
{
public  VERSION_CODES() { throw new RuntimeException("Stub!"); }
public static final int BASE = 1;
public static final int BASE_1_1 = 2;
public static final int CUPCAKE = 3;
public static final int CUR_DEVELOPMENT = 10000;
public static final int DONUT = 4;
public static final int ECLAIR = 5;
public static final int ECLAIR_0_1 = 6;
public static final int ECLAIR_MR1 = 7;
public static final int FROYO = 8;
public static final int GINGERBREAD = 9;
public static final int GINGERBREAD_MR1 = 10;
public static final int HONEYCOMB = 11;
public static final int HONEYCOMB_MR1 = 12;
public static final int HONEYCOMB_MR2 = 13;
public static final int ICE_CREAM_SANDWICH = 14;
public static final int ICE_CREAM_SANDWICH_MR1 = 15;
public static final int JELLY_BEAN = 16;
public static final int JELLY_BEAN_MR1 = 17;
public static final int JELLY_BEAN_MR2 = 18;
public static final int KITKAT = 19;
public static final int KITKAT_WATCH = 20;
public static final int LOLLIPOP = 21;
public static final int LOLLIPOP_MR1 = 22;
public static final int M = 23;
public static final int N = 24;
public static final int N_MR1 = 25;
public static final int O = 26;
public static final int O_MR1 = 27;
public static final int P = 28;
}
public  Build() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getSerial() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getRadioVersion() { throw new RuntimeException("Stub!"); }
public static final java.lang.String BOARD;
public static final java.lang.String BOOTLOADER;
public static final java.lang.String BRAND;
@java.lang.Deprecated()
public static final java.lang.String CPU_ABI;
@java.lang.Deprecated()
public static final java.lang.String CPU_ABI2;
public static final java.lang.String DEVICE;
public static final java.lang.String DISPLAY;
public static final java.lang.String FINGERPRINT;
public static final java.lang.String HARDWARE;
public static final java.lang.String HOST;
public static final java.lang.String ID;
public static final java.lang.String MANUFACTURER;
public static final java.lang.String MODEL;
public static final java.lang.String PRODUCT;
@java.lang.Deprecated()
public static final java.lang.String RADIO;
@java.lang.Deprecated()
public static final java.lang.String SERIAL;
public static final java.lang.String[] SUPPORTED_32_BIT_ABIS = null;
public static final java.lang.String[] SUPPORTED_64_BIT_ABIS = null;
public static final java.lang.String[] SUPPORTED_ABIS = null;
public static final java.lang.String TAGS;
public static final long TIME;
public static final java.lang.String TYPE;
public static final java.lang.String UNKNOWN = "unknown";
public static final java.lang.String USER;
static { BOARD = null; BOOTLOADER = null; BRAND = null; CPU_ABI = null; CPU_ABI2 = null; DEVICE = null; DISPLAY = null; FINGERPRINT = null; HARDWARE = null; HOST = null; ID = null; MANUFACTURER = null; MODEL = null; PRODUCT = null; RADIO = null; SERIAL = null; TAGS = null; TIME = 0; TYPE = null; USER = null; }
}
