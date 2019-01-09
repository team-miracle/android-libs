/*
* Copyright (C) 2014 The Android Open Source Project
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

package android.content;
public class RestrictionsManager
{
RestrictionsManager() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getApplicationRestrictions() { throw new RuntimeException("Stub!"); }
public  boolean hasRestrictionsProvider() { throw new RuntimeException("Stub!"); }
public  void requestPermission(java.lang.String requestType, java.lang.String requestId, android.os.PersistableBundle request) { throw new RuntimeException("Stub!"); }
public  android.content.Intent createLocalApprovalIntent() { throw new RuntimeException("Stub!"); }
public  void notifyPermissionResponse(java.lang.String packageName, android.os.PersistableBundle response) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.content.RestrictionEntry> getManifestRestrictions(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public static  android.os.Bundle convertRestrictionsToBundle(java.util.List<android.content.RestrictionEntry> entries) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_PERMISSION_RESPONSE_RECEIVED = "android.content.action.PERMISSION_RESPONSE_RECEIVED";
public static final java.lang.String ACTION_REQUEST_LOCAL_APPROVAL = "android.content.action.REQUEST_LOCAL_APPROVAL";
public static final java.lang.String ACTION_REQUEST_PERMISSION = "android.content.action.REQUEST_PERMISSION";
public static final java.lang.String EXTRA_PACKAGE_NAME = "android.content.extra.PACKAGE_NAME";
public static final java.lang.String EXTRA_REQUEST_BUNDLE = "android.content.extra.REQUEST_BUNDLE";
public static final java.lang.String EXTRA_REQUEST_ID = "android.content.extra.REQUEST_ID";
public static final java.lang.String EXTRA_REQUEST_TYPE = "android.content.extra.REQUEST_TYPE";
public static final java.lang.String EXTRA_RESPONSE_BUNDLE = "android.content.extra.RESPONSE_BUNDLE";
public static final java.lang.String META_DATA_APP_RESTRICTIONS = "android.content.APP_RESTRICTIONS";
public static final java.lang.String REQUEST_KEY_APPROVE_LABEL = "android.request.approve_label";
public static final java.lang.String REQUEST_KEY_DATA = "android.request.data";
public static final java.lang.String REQUEST_KEY_DENY_LABEL = "android.request.deny_label";
public static final java.lang.String REQUEST_KEY_ICON = "android.request.icon";
public static final java.lang.String REQUEST_KEY_ID = "android.request.id";
public static final java.lang.String REQUEST_KEY_MESSAGE = "android.request.mesg";
public static final java.lang.String REQUEST_KEY_NEW_REQUEST = "android.request.new_request";
public static final java.lang.String REQUEST_KEY_TITLE = "android.request.title";
public static final java.lang.String REQUEST_TYPE_APPROVAL = "android.request.type.approval";
public static final java.lang.String RESPONSE_KEY_ERROR_CODE = "android.response.errorcode";
public static final java.lang.String RESPONSE_KEY_MESSAGE = "android.response.msg";
public static final java.lang.String RESPONSE_KEY_RESPONSE_TIMESTAMP = "android.response.timestamp";
public static final java.lang.String RESPONSE_KEY_RESULT = "android.response.result";
public static final int RESULT_APPROVED = 1;
public static final int RESULT_DENIED = 2;
public static final int RESULT_ERROR = 5;
public static final int RESULT_ERROR_BAD_REQUEST = 1;
public static final int RESULT_ERROR_INTERNAL = 3;
public static final int RESULT_ERROR_NETWORK = 2;
public static final int RESULT_NO_RESPONSE = 3;
public static final int RESULT_UNKNOWN_REQUEST = 4;
}
