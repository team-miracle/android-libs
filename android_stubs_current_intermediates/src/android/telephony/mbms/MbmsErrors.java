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
* limitations under the License
*/

package android.telephony.mbms;
public class MbmsErrors
{
public static class InitializationErrors
{
InitializationErrors() { throw new RuntimeException("Stub!"); }
public static final int ERROR_APP_PERMISSIONS_NOT_GRANTED = 102;
public static final int ERROR_DUPLICATE_INITIALIZE = 101;
public static final int ERROR_UNABLE_TO_INITIALIZE = 103;
}
public static class GeneralErrors
{
GeneralErrors() { throw new RuntimeException("Stub!"); }
public static final int ERROR_CARRIER_CHANGE_NOT_ALLOWED = 207;
public static final int ERROR_IN_E911 = 204;
public static final int ERROR_MIDDLEWARE_NOT_YET_READY = 201;
public static final int ERROR_MIDDLEWARE_TEMPORARILY_UNAVAILABLE = 203;
public static final int ERROR_NOT_CONNECTED_TO_HOME_CARRIER_LTE = 205;
public static final int ERROR_OUT_OF_MEMORY = 202;
public static final int ERROR_UNABLE_TO_READ_SIM = 206;
}
public static class StreamingErrors
{
StreamingErrors() { throw new RuntimeException("Stub!"); }
public static final int ERROR_CONCURRENT_SERVICE_LIMIT_REACHED = 301;
public static final int ERROR_DUPLICATE_START_STREAM = 303;
public static final int ERROR_UNABLE_TO_START_SERVICE = 302;
}
public static class DownloadErrors
{
DownloadErrors() { throw new RuntimeException("Stub!"); }
public static final int ERROR_CANNOT_CHANGE_TEMP_FILE_ROOT = 401;
public static final int ERROR_UNKNOWN_DOWNLOAD_REQUEST = 402;
public static final int ERROR_UNKNOWN_FILE_INFO = 403;
}
MbmsErrors() { throw new RuntimeException("Stub!"); }
public static final int ERROR_MIDDLEWARE_LOST = 3;
public static final int ERROR_MIDDLEWARE_NOT_BOUND = 2;
public static final int ERROR_NO_UNIQUE_MIDDLEWARE = 1;
public static final int SUCCESS = 0;
public static final int UNKNOWN = -1;
}
