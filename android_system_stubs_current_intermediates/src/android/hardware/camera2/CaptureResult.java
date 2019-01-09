/*
* Copyright (C) 2012 The Android Open Source Project
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

package android.hardware.camera2;
public class CaptureResult
  extends android.hardware.camera2.CameraMetadata<android.hardware.camera2.CaptureResult.Key<?>>
{
public static final class Key<T>
{
Key() { throw new RuntimeException("Stub!"); }
public  java.lang.String getName() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
CaptureResult() { throw new RuntimeException("Stub!"); }
public <T> T get(android.hardware.camera2.CaptureResult.Key<T> key) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.camera2.CaptureResult.Key<?>> getKeys() { throw new RuntimeException("Stub!"); }
public  android.hardware.camera2.CaptureRequest getRequest() { throw new RuntimeException("Stub!"); }
public  long getFrameNumber() { throw new RuntimeException("Stub!"); }
public  int getSequenceId() { throw new RuntimeException("Stub!"); }
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Boolean> BLACK_LEVEL_LOCK;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> COLOR_CORRECTION_ABERRATION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.RggbChannelVector> COLOR_CORRECTION_GAINS;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> COLOR_CORRECTION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.ColorSpaceTransform> COLOR_CORRECTION_TRANSFORM;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AE_ANTIBANDING_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AE_EXPOSURE_COMPENSATION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Boolean> CONTROL_AE_LOCK;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AE_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AE_PRECAPTURE_TRIGGER;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AE_REGIONS;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AE_STATE;
public static final android.hardware.camera2.CaptureResult.Key<android.util.Range<java.lang.Integer>> CONTROL_AE_TARGET_FPS_RANGE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AF_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AF_REGIONS;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AF_SCENE_CHANGE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AF_STATE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AF_TRIGGER;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Boolean> CONTROL_AWB_LOCK;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AWB_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.MeteringRectangle[]> CONTROL_AWB_REGIONS;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_AWB_STATE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_CAPTURE_INTENT;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_EFFECT_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Boolean> CONTROL_ENABLE_ZSL;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_POST_RAW_SENSITIVITY_BOOST;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_SCENE_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> CONTROL_VIDEO_STABILIZATION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> DISTORTION_CORRECTION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> EDGE_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> FLASH_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> FLASH_STATE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> HOT_PIXEL_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.location.Location> JPEG_GPS_LOCATION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> JPEG_ORIENTATION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Byte> JPEG_QUALITY;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Byte> JPEG_THUMBNAIL_QUALITY;
public static final android.hardware.camera2.CaptureResult.Key<android.util.Size> JPEG_THUMBNAIL_SIZE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> LENS_APERTURE;
public static final android.hardware.camera2.CaptureResult.Key<float[]> LENS_DISTORTION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> LENS_FILTER_DENSITY;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> LENS_FOCAL_LENGTH;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> LENS_FOCUS_DISTANCE;
public static final android.hardware.camera2.CaptureResult.Key<android.util.Pair<java.lang.Float, java.lang.Float>> LENS_FOCUS_RANGE;
public static final android.hardware.camera2.CaptureResult.Key<float[]> LENS_INTRINSIC_CALIBRATION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> LENS_OPTICAL_STABILIZATION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<float[]> LENS_POSE_ROTATION;
public static final android.hardware.camera2.CaptureResult.Key<float[]> LENS_POSE_TRANSLATION;
@java.lang.Deprecated()
public static final android.hardware.camera2.CaptureResult.Key<float[]> LENS_RADIAL_DISTORTION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> LENS_STATE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> NOISE_REDUCTION_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> REPROCESS_EFFECTIVE_EXPOSURE_FACTOR;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Byte> REQUEST_PIPELINE_DEPTH;
public static final android.hardware.camera2.CaptureResult.Key<android.graphics.Rect> SCALER_CROP_REGION;
public static final android.hardware.camera2.CaptureResult.Key<float[]> SENSOR_DYNAMIC_BLACK_LEVEL;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> SENSOR_DYNAMIC_WHITE_LEVEL;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Long> SENSOR_EXPOSURE_TIME;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Long> SENSOR_FRAME_DURATION;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> SENSOR_GREEN_SPLIT;
public static final android.hardware.camera2.CaptureResult.Key<android.util.Rational[]> SENSOR_NEUTRAL_COLOR_POINT;
public static final android.hardware.camera2.CaptureResult.Key<android.util.Pair<java.lang.Double, java.lang.Double>[]> SENSOR_NOISE_PROFILE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Long> SENSOR_ROLLING_SHUTTER_SKEW;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> SENSOR_SENSITIVITY;
public static final android.hardware.camera2.CaptureResult.Key<int[]> SENSOR_TEST_PATTERN_DATA;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> SENSOR_TEST_PATTERN_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Long> SENSOR_TIMESTAMP;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> SHADING_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.Face[]> STATISTICS_FACES;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> STATISTICS_FACE_DETECT_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.graphics.Point[]> STATISTICS_HOT_PIXEL_MAP;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Boolean> STATISTICS_HOT_PIXEL_MAP_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.LensShadingMap> STATISTICS_LENS_SHADING_CORRECTION_MAP;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> STATISTICS_LENS_SHADING_MAP_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> STATISTICS_OIS_DATA_MODE;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.OisSample[]> STATISTICS_OIS_SAMPLES;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> STATISTICS_SCENE_FLICKER;
public static final android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.params.TonemapCurve> TONEMAP_CURVE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Float> TONEMAP_GAMMA;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> TONEMAP_MODE;
public static final android.hardware.camera2.CaptureResult.Key<java.lang.Integer> TONEMAP_PRESET_CURVE;
static { BLACK_LEVEL_LOCK = null; COLOR_CORRECTION_ABERRATION_MODE = null; COLOR_CORRECTION_GAINS = null; COLOR_CORRECTION_MODE = null; COLOR_CORRECTION_TRANSFORM = null; CONTROL_AE_ANTIBANDING_MODE = null; CONTROL_AE_EXPOSURE_COMPENSATION = null; CONTROL_AE_LOCK = null; CONTROL_AE_MODE = null; CONTROL_AE_PRECAPTURE_TRIGGER = null; CONTROL_AE_REGIONS = null; CONTROL_AE_STATE = null; CONTROL_AE_TARGET_FPS_RANGE = null; CONTROL_AF_MODE = null; CONTROL_AF_REGIONS = null; CONTROL_AF_SCENE_CHANGE = null; CONTROL_AF_STATE = null; CONTROL_AF_TRIGGER = null; CONTROL_AWB_LOCK = null; CONTROL_AWB_MODE = null; CONTROL_AWB_REGIONS = null; CONTROL_AWB_STATE = null; CONTROL_CAPTURE_INTENT = null; CONTROL_EFFECT_MODE = null; CONTROL_ENABLE_ZSL = null; CONTROL_MODE = null; CONTROL_POST_RAW_SENSITIVITY_BOOST = null; CONTROL_SCENE_MODE = null; CONTROL_VIDEO_STABILIZATION_MODE = null; DISTORTION_CORRECTION_MODE = null; EDGE_MODE = null; FLASH_MODE = null; FLASH_STATE = null; HOT_PIXEL_MODE = null; JPEG_GPS_LOCATION = null; JPEG_ORIENTATION = null; JPEG_QUALITY = null; JPEG_THUMBNAIL_QUALITY = null; JPEG_THUMBNAIL_SIZE = null; LENS_APERTURE = null; LENS_DISTORTION = null; LENS_FILTER_DENSITY = null; LENS_FOCAL_LENGTH = null; LENS_FOCUS_DISTANCE = null; LENS_FOCUS_RANGE = null; LENS_INTRINSIC_CALIBRATION = null; LENS_OPTICAL_STABILIZATION_MODE = null; LENS_POSE_ROTATION = null; LENS_POSE_TRANSLATION = null; LENS_RADIAL_DISTORTION = null; LENS_STATE = null; NOISE_REDUCTION_MODE = null; REPROCESS_EFFECTIVE_EXPOSURE_FACTOR = null; REQUEST_PIPELINE_DEPTH = null; SCALER_CROP_REGION = null; SENSOR_DYNAMIC_BLACK_LEVEL = null; SENSOR_DYNAMIC_WHITE_LEVEL = null; SENSOR_EXPOSURE_TIME = null; SENSOR_FRAME_DURATION = null; SENSOR_GREEN_SPLIT = null; SENSOR_NEUTRAL_COLOR_POINT = null; SENSOR_NOISE_PROFILE = null; SENSOR_ROLLING_SHUTTER_SKEW = null; SENSOR_SENSITIVITY = null; SENSOR_TEST_PATTERN_DATA = null; SENSOR_TEST_PATTERN_MODE = null; SENSOR_TIMESTAMP = null; SHADING_MODE = null; STATISTICS_FACES = null; STATISTICS_FACE_DETECT_MODE = null; STATISTICS_HOT_PIXEL_MAP = null; STATISTICS_HOT_PIXEL_MAP_MODE = null; STATISTICS_LENS_SHADING_CORRECTION_MAP = null; STATISTICS_LENS_SHADING_MAP_MODE = null; STATISTICS_OIS_DATA_MODE = null; STATISTICS_OIS_SAMPLES = null; STATISTICS_SCENE_FLICKER = null; TONEMAP_CURVE = null; TONEMAP_GAMMA = null; TONEMAP_MODE = null; TONEMAP_PRESET_CURVE = null; }
}
