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
public class FontsContract
{
public static final class Columns
  implements android.provider.BaseColumns
{
Columns() { throw new RuntimeException("Stub!"); }
public static final java.lang.String FILE_ID = "file_id";
public static final java.lang.String ITALIC = "font_italic";
public static final java.lang.String RESULT_CODE = "result_code";
public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
public static final int RESULT_CODE_MALFORMED_QUERY = 3;
public static final int RESULT_CODE_OK = 0;
public static final java.lang.String TTC_INDEX = "font_ttc_index";
public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
public static final java.lang.String WEIGHT = "font_weight";
}
public static class FontInfo
{
FontInfo() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getUri() { throw new RuntimeException("Stub!"); }
public  int getTtcIndex() { throw new RuntimeException("Stub!"); }
public  android.graphics.fonts.FontVariationAxis[] getAxes() { throw new RuntimeException("Stub!"); }
public  int getWeight() { throw new RuntimeException("Stub!"); }
public  boolean isItalic() { throw new RuntimeException("Stub!"); }
public  int getResultCode() { throw new RuntimeException("Stub!"); }
}
public static class FontFamilyResult
{
FontFamilyResult() { throw new RuntimeException("Stub!"); }
public  int getStatusCode() { throw new RuntimeException("Stub!"); }
public  android.provider.FontsContract.FontInfo[] getFonts() { throw new RuntimeException("Stub!"); }
public static final int STATUS_OK = 0;
public static final int STATUS_REJECTED = 3;
public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
public static final int STATUS_WRONG_CERTIFICATES = 1;
}
public static class FontRequestCallback
{
public  FontRequestCallback() { throw new RuntimeException("Stub!"); }
public  void onTypefaceRetrieved(android.graphics.Typeface typeface) { throw new RuntimeException("Stub!"); }
public  void onTypefaceRequestFailed(int reason) { throw new RuntimeException("Stub!"); }
public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
public static final int FAIL_REASON_MALFORMED_QUERY = 3;
public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
}
FontsContract() { throw new RuntimeException("Stub!"); }
public static  void requestFonts(android.content.Context context, android.provider.FontRequest request, android.os.Handler handler, android.os.CancellationSignal cancellationSignal, android.provider.FontsContract.FontRequestCallback callback) { throw new RuntimeException("Stub!"); }
public static  android.provider.FontsContract.FontFamilyResult fetchFonts(android.content.Context context, android.os.CancellationSignal cancellationSignal, android.provider.FontRequest request) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
public static  android.graphics.Typeface buildTypeface(android.content.Context context, android.os.CancellationSignal cancellationSignal, android.provider.FontsContract.FontInfo[] fonts) { throw new RuntimeException("Stub!"); }
}
