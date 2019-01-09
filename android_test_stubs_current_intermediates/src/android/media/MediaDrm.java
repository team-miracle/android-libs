/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.media;
public final class MediaDrm
  implements java.lang.AutoCloseable
{
public static final class MediaDrmStateException
  extends java.lang.IllegalStateException
{
MediaDrmStateException() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDiagnosticInfo() { throw new RuntimeException("Stub!"); }
}
public static interface OnExpirationUpdateListener
{
public abstract  void onExpirationUpdate(android.media.MediaDrm md, byte[] sessionId, long expirationTime);
}
public static interface OnKeyStatusChangeListener
{
public abstract  void onKeyStatusChange(android.media.MediaDrm md, byte[] sessionId, java.util.List<android.media.MediaDrm.KeyStatus> keyInformation, boolean hasNewUsableKey);
}
public static final class KeyStatus
{
KeyStatus() { throw new RuntimeException("Stub!"); }
public  int getStatusCode() { throw new RuntimeException("Stub!"); }
public  byte[] getKeyId() { throw new RuntimeException("Stub!"); }
public static final int STATUS_EXPIRED = 1;
public static final int STATUS_INTERNAL_ERROR = 4;
public static final int STATUS_OUTPUT_NOT_ALLOWED = 2;
public static final int STATUS_PENDING = 3;
public static final int STATUS_USABLE = 0;
}
public static interface OnEventListener
{
public abstract  void onEvent(android.media.MediaDrm md, byte[] sessionId, int event, int extra, byte[] data);
}
public static final class KeyRequest
{
KeyRequest() { throw new RuntimeException("Stub!"); }
public  byte[] getData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultUrl() { throw new RuntimeException("Stub!"); }
public  int getRequestType() { throw new RuntimeException("Stub!"); }
public static final int REQUEST_TYPE_INITIAL = 0;
public static final int REQUEST_TYPE_NONE = 3;
public static final int REQUEST_TYPE_RELEASE = 2;
public static final int REQUEST_TYPE_RENEWAL = 1;
public static final int REQUEST_TYPE_UPDATE = 4;
}
public static final class ProvisionRequest
{
ProvisionRequest() { throw new RuntimeException("Stub!"); }
public  byte[] getData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultUrl() { throw new RuntimeException("Stub!"); }
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface HdcpLevel
{
}
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface SecurityLevel
{
}
public final class CryptoSession
{
CryptoSession() { throw new RuntimeException("Stub!"); }
public  byte[] encrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); }
public  byte[] decrypt(byte[] keyid, byte[] input, byte[] iv) { throw new RuntimeException("Stub!"); }
public  byte[] sign(byte[] keyid, byte[] message) { throw new RuntimeException("Stub!"); }
public  boolean verify(byte[] keyid, byte[] message, byte[] signature) { throw new RuntimeException("Stub!"); }
}
public static final class MetricsConstants
{
MetricsConstants() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CLOSE_SESSION_ERROR_COUNT = "drm.mediadrm.close_session.error.count";
public static final java.lang.String CLOSE_SESSION_ERROR_LIST = "drm.mediadrm.close_session.error.list";
public static final java.lang.String CLOSE_SESSION_OK_COUNT = "drm.mediadrm.close_session.ok.count";
public static final java.lang.String EVENT_KEY_EXPIRED_COUNT = "drm.mediadrm.event.KEY_EXPIRED.count";
public static final java.lang.String EVENT_KEY_NEEDED_COUNT = "drm.mediadrm.event.KEY_NEEDED.count";
public static final java.lang.String EVENT_PROVISION_REQUIRED_COUNT = "drm.mediadrm.event.PROVISION_REQUIRED.count";
public static final java.lang.String EVENT_SESSION_RECLAIMED_COUNT = "drm.mediadrm.event.SESSION_RECLAIMED.count";
public static final java.lang.String EVENT_VENDOR_DEFINED_COUNT = "drm.mediadrm.event.VENDOR_DEFINED.count";
public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_COUNT = "drm.mediadrm.get_device_unique_id.error.count";
public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_LIST = "drm.mediadrm.get_device_unique_id.error.list";
public static final java.lang.String GET_DEVICE_UNIQUE_ID_OK_COUNT = "drm.mediadrm.get_device_unique_id.ok.count";
public static final java.lang.String GET_KEY_REQUEST_ERROR_COUNT = "drm.mediadrm.get_key_request.error.count";
public static final java.lang.String GET_KEY_REQUEST_ERROR_LIST = "drm.mediadrm.get_key_request.error.list";
public static final java.lang.String GET_KEY_REQUEST_OK_COUNT = "drm.mediadrm.get_key_request.ok.count";
public static final java.lang.String GET_KEY_REQUEST_OK_TIME_MICROS = "drm.mediadrm.get_key_request.ok.average_time_micros";
public static final java.lang.String GET_PROVISION_REQUEST_ERROR_COUNT = "drm.mediadrm.get_provision_request.error.count";
public static final java.lang.String GET_PROVISION_REQUEST_ERROR_LIST = "drm.mediadrm.get_provision_request.error.list";
public static final java.lang.String GET_PROVISION_REQUEST_OK_COUNT = "drm.mediadrm.get_provision_request.ok.count";
public static final java.lang.String KEY_STATUS_EXPIRED_COUNT = "drm.mediadrm.key_status.EXPIRED.count";
public static final java.lang.String KEY_STATUS_INTERNAL_ERROR_COUNT = "drm.mediadrm.key_status.INTERNAL_ERROR.count";
public static final java.lang.String KEY_STATUS_OUTPUT_NOT_ALLOWED_COUNT = "drm.mediadrm.key_status_change.OUTPUT_NOT_ALLOWED.count";
public static final java.lang.String KEY_STATUS_PENDING_COUNT = "drm.mediadrm.key_status_change.PENDING.count";
public static final java.lang.String KEY_STATUS_USABLE_COUNT = "drm.mediadrm.key_status_change.USABLE.count";
public static final java.lang.String OPEN_SESSION_ERROR_COUNT = "drm.mediadrm.open_session.error.count";
public static final java.lang.String OPEN_SESSION_ERROR_LIST = "drm.mediadrm.open_session.error.list";
public static final java.lang.String OPEN_SESSION_OK_COUNT = "drm.mediadrm.open_session.ok.count";
public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_key_response.error.count";
public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_key_response.error.list";
public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_COUNT = "drm.mediadrm.provide_key_response.ok.count";
public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_TIME_MICROS = "drm.mediadrm.provide_key_response.ok.average_time_micros";
public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_provision_response.error.count";
public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_provision_response.error.list";
public static final java.lang.String PROVIDE_PROVISION_RESPONSE_OK_COUNT = "drm.mediadrm.provide_provision_response.ok.count";
public static final java.lang.String SESSION_END_TIMES_MS = "drm.mediadrm.session_end_times_ms";
public static final java.lang.String SESSION_START_TIMES_MS = "drm.mediadrm.session_start_times_ms";
}
public  MediaDrm(java.util.UUID uuid) throws android.media.UnsupportedSchemeException { throw new RuntimeException("Stub!"); }
public static  boolean isCryptoSchemeSupported(java.util.UUID uuid) { throw new RuntimeException("Stub!"); }
public static  boolean isCryptoSchemeSupported(java.util.UUID uuid, java.lang.String mimeType) { throw new RuntimeException("Stub!"); }
public  void setOnExpirationUpdateListener(android.media.MediaDrm.OnExpirationUpdateListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnKeyStatusChangeListener(android.media.MediaDrm.OnKeyStatusChangeListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void setOnEventListener(android.media.MediaDrm.OnEventListener listener) { throw new RuntimeException("Stub!"); }
public  byte[] openSession() throws android.media.NotProvisionedException, android.media.ResourceBusyException { throw new RuntimeException("Stub!"); }
public native  byte[] openSession(@android.media.MediaDrm.SecurityLevel()
int level) throws android.media.NotProvisionedException, android.media.ResourceBusyException;
public native  void closeSession(byte[] sessionId);
public native  android.media.MediaDrm.KeyRequest getKeyRequest(byte[] scope, byte[] init, java.lang.String mimeType, int keyType, java.util.HashMap<java.lang.String, java.lang.String> optionalParameters) throws android.media.NotProvisionedException;
public native  byte[] provideKeyResponse(byte[] scope, byte[] response) throws android.media.NotProvisionedException, android.media.DeniedByServerException;
public native  void restoreKeys(byte[] sessionId, byte[] keySetId);
public native  void removeKeys(byte[] sessionId);
public native  java.util.HashMap<java.lang.String, java.lang.String> queryKeyStatus(byte[] sessionId);
public  android.media.MediaDrm.ProvisionRequest getProvisionRequest() { throw new RuntimeException("Stub!"); }
public  void provideProvisionResponse(byte[] response) throws android.media.DeniedByServerException { throw new RuntimeException("Stub!"); }
public native  java.util.List<byte[]> getSecureStops();
public native  java.util.List<byte[]> getSecureStopIds();
public native  byte[] getSecureStop(byte[] ssid);
public native  void releaseSecureStops(byte[] ssRelease);
public native  void removeSecureStop(byte[] ssid);
public native  void removeAllSecureStops();
@Deprecated
public  void releaseAllSecureStops() { throw new RuntimeException("Stub!"); }
@android.media.MediaDrm.HdcpLevel()
public native  int getConnectedHdcpLevel();
@android.media.MediaDrm.HdcpLevel()
public native  int getMaxHdcpLevel();
public native  int getOpenSessionCount();
public native  int getMaxSessionCount();
@android.media.MediaDrm.SecurityLevel()
public static  int getMaxSecurityLevel() { throw new RuntimeException("Stub!"); }
@android.media.MediaDrm.SecurityLevel()
public native  int getSecurityLevel(byte[] sessionId);
public native  java.lang.String getPropertyString(java.lang.String propertyName);
public native  void setPropertyString(java.lang.String propertyName, java.lang.String value);
public native  byte[] getPropertyByteArray(java.lang.String propertyName);
public native  void setPropertyByteArray(java.lang.String propertyName, byte[] value);
public  android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
public  android.media.MediaDrm.CryptoSession getCryptoSession(byte[] sessionId, java.lang.String cipherAlgorithm, java.lang.String macAlgorithm) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void release() { throw new RuntimeException("Stub!"); }
@Deprecated
public static final int EVENT_KEY_EXPIRED = 3;
public static final int EVENT_KEY_REQUIRED = 2;
@Deprecated
public static final int EVENT_PROVISION_REQUIRED = 1;
public static final int EVENT_SESSION_RECLAIMED = 5;
public static final int EVENT_VENDOR_DEFINED = 4;
public static final int HDCP_LEVEL_UNKNOWN = 0;
public static final int HDCP_NONE = 1;
public static final int HDCP_NO_DIGITAL_OUTPUT = 2147483647;
public static final int HDCP_V1 = 2;
public static final int HDCP_V2 = 3;
public static final int HDCP_V2_1 = 4;
public static final int HDCP_V2_2 = 5;
public static final int KEY_TYPE_OFFLINE = 2;
public static final int KEY_TYPE_RELEASE = 3;
public static final int KEY_TYPE_STREAMING = 1;
public static final java.lang.String PROPERTY_ALGORITHMS = "algorithms";
public static final java.lang.String PROPERTY_DESCRIPTION = "description";
public static final java.lang.String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
public static final java.lang.String PROPERTY_VENDOR = "vendor";
public static final java.lang.String PROPERTY_VERSION = "version";
public static final int SECURITY_LEVEL_HW_SECURE_ALL = 5;
public static final int SECURITY_LEVEL_HW_SECURE_CRYPTO = 3;
public static final int SECURITY_LEVEL_HW_SECURE_DECODE = 4;
public static final int SECURITY_LEVEL_SW_SECURE_CRYPTO = 1;
public static final int SECURITY_LEVEL_SW_SECURE_DECODE = 2;
public static final int SECURITY_LEVEL_UNKNOWN = 0;
}
