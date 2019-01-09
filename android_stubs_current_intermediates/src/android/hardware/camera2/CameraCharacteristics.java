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

package android.hardware.camera2;
public final class CameraCharacteristics
  extends android.hardware.camera2.CameraMetadata<android.hardware.camera2.CameraCharacteristics.Key<?>>
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
CameraCharacteristics() { throw new RuntimeException("Stub!"); }
public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.hardware.camera2.CameraCharacteristics.Key<?>> getKeys() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailableSessionKeys() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.List<android.hardware.camera2.CaptureRequest.Key<?>> getAvailableCaptureRequestKeys() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  java.util.List<android.hardware.camera2.CaptureResult.Key<?>> getAvailableCaptureResultKeys() { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getPhysicalCameraIds() { throw new RuntimeException("Stub!"); }
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AE_AVAILABLE_ANTIBANDING_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AE_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>[]> CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> CONTROL_AE_COMPENSATION_RANGE;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Rational> CONTROL_AE_COMPENSATION_STEP;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> CONTROL_AE_LOCK_AVAILABLE;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AF_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_EFFECTS;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_SCENE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> CONTROL_AWB_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> CONTROL_AWB_LOCK_AVAILABLE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AF;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> CONTROL_MAX_REGIONS_AWB;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> DEPTH_DEPTH_IS_EXCLUSIVE;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> DISTORTION_CORRECTION_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> EDGE_AVAILABLE_EDGE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> FLASH_INFO_AVAILABLE;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> INFO_SUPPORTED_HARDWARE_LEVEL;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.String> INFO_VERSION;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size[]> JPEG_AVAILABLE_THUMBNAIL_SIZES;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_DISTORTION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_FACING;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_APERTURES;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_FILTER_DENSITIES;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_INFO_FOCUS_DISTANCE_CALIBRATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> LENS_INFO_HYPERFOCAL_DISTANCE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> LENS_INFO_MINIMUM_FOCUS_DISTANCE;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_INTRINSIC_CALIBRATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LENS_POSE_REFERENCE;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_POSE_ROTATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_POSE_TRANSLATION;
@java.lang.Deprecated()
public static final android.hardware.camera2.CameraCharacteristics.Key<float[]> LENS_RADIAL_DISTORTION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> LOGICAL_MULTI_CAMERA_SENSOR_SYNC_TYPE;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REPROCESS_MAX_CAPTURE_STALL;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> REQUEST_AVAILABLE_CAPABILITIES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_INPUT_STREAMS;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_PROC;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_PROC_STALLING;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_MAX_NUM_OUTPUT_RAW;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> REQUEST_PARTIAL_RESULT_COUNT;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Byte> REQUEST_PIPELINE_MAX_DEPTH;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Float> SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SCALER_CROPPING_TYPE;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.StreamConfigurationMap> SCALER_STREAM_CONFIGURATION_MAP;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> SENSOR_AVAILABLE_TEST_PATTERN_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.BlackLevelPattern> SENSOR_BLACK_LEVEL_PATTERN;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM1;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_CALIBRATION_TRANSFORM2;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_COLOR_TRANSFORM1;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_COLOR_TRANSFORM2;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_FORWARD_MATRIX1;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.params.ColorSpaceTransform> SENSOR_FORWARD_MATRIX2;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect> SENSOR_INFO_ACTIVE_ARRAY_SIZE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_COLOR_FILTER_ARRANGEMENT;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Long>> SENSOR_INFO_EXPOSURE_TIME_RANGE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Boolean> SENSOR_INFO_LENS_SHADING_APPLIED;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Long> SENSOR_INFO_MAX_FRAME_DURATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.SizeF> SENSOR_INFO_PHYSICAL_SIZE;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Size> SENSOR_INFO_PIXEL_ARRAY_SIZE;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect> SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.util.Range<java.lang.Integer>> SENSOR_INFO_SENSITIVITY_RANGE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_TIMESTAMP_SOURCE;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_INFO_WHITE_LEVEL;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_MAX_ANALOG_SENSITIVITY;
public static final android.hardware.camera2.CameraCharacteristics.Key<android.graphics.Rect[]> SENSOR_OPTICAL_BLACK_REGIONS;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_ORIENTATION;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SENSOR_REFERENCE_ILLUMINANT1;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Byte> SENSOR_REFERENCE_ILLUMINANT2;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> SHADING_AVAILABLE_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<boolean[]> STATISTICS_INFO_AVAILABLE_HOT_PIXEL_MAP_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> STATISTICS_INFO_AVAILABLE_OIS_DATA_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> STATISTICS_INFO_MAX_FACE_COUNT;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> SYNC_MAX_LATENCY;
public static final android.hardware.camera2.CameraCharacteristics.Key<int[]> TONEMAP_AVAILABLE_TONE_MAP_MODES;
public static final android.hardware.camera2.CameraCharacteristics.Key<java.lang.Integer> TONEMAP_MAX_CURVE_POINTS;
static { COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES = null; CONTROL_AE_AVAILABLE_ANTIBANDING_MODES = null; CONTROL_AE_AVAILABLE_MODES = null; CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = null; CONTROL_AE_COMPENSATION_RANGE = null; CONTROL_AE_COMPENSATION_STEP = null; CONTROL_AE_LOCK_AVAILABLE = null; CONTROL_AF_AVAILABLE_MODES = null; CONTROL_AVAILABLE_EFFECTS = null; CONTROL_AVAILABLE_MODES = null; CONTROL_AVAILABLE_SCENE_MODES = null; CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES = null; CONTROL_AWB_AVAILABLE_MODES = null; CONTROL_AWB_LOCK_AVAILABLE = null; CONTROL_MAX_REGIONS_AE = null; CONTROL_MAX_REGIONS_AF = null; CONTROL_MAX_REGIONS_AWB = null; CONTROL_POST_RAW_SENSITIVITY_BOOST_RANGE = null; DEPTH_DEPTH_IS_EXCLUSIVE = null; DISTORTION_CORRECTION_AVAILABLE_MODES = null; EDGE_AVAILABLE_EDGE_MODES = null; FLASH_INFO_AVAILABLE = null; HOT_PIXEL_AVAILABLE_HOT_PIXEL_MODES = null; INFO_SUPPORTED_HARDWARE_LEVEL = null; INFO_VERSION = null; JPEG_AVAILABLE_THUMBNAIL_SIZES = null; LENS_DISTORTION = null; LENS_FACING = null; LENS_INFO_AVAILABLE_APERTURES = null; LENS_INFO_AVAILABLE_FILTER_DENSITIES = null; LENS_INFO_AVAILABLE_FOCAL_LENGTHS = null; LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION = null; LENS_INFO_FOCUS_DISTANCE_CALIBRATION = null; LENS_INFO_HYPERFOCAL_DISTANCE = null; LENS_INFO_MINIMUM_FOCUS_DISTANCE = null; LENS_INTRINSIC_CALIBRATION = null; LENS_POSE_REFERENCE = null; LENS_POSE_ROTATION = null; LENS_POSE_TRANSLATION = null; LENS_RADIAL_DISTORTION = null; LOGICAL_MULTI_CAMERA_SENSOR_SYNC_TYPE = null; NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES = null; REPROCESS_MAX_CAPTURE_STALL = null; REQUEST_AVAILABLE_CAPABILITIES = null; REQUEST_MAX_NUM_INPUT_STREAMS = null; REQUEST_MAX_NUM_OUTPUT_PROC = null; REQUEST_MAX_NUM_OUTPUT_PROC_STALLING = null; REQUEST_MAX_NUM_OUTPUT_RAW = null; REQUEST_PARTIAL_RESULT_COUNT = null; REQUEST_PIPELINE_MAX_DEPTH = null; SCALER_AVAILABLE_MAX_DIGITAL_ZOOM = null; SCALER_CROPPING_TYPE = null; SCALER_STREAM_CONFIGURATION_MAP = null; SENSOR_AVAILABLE_TEST_PATTERN_MODES = null; SENSOR_BLACK_LEVEL_PATTERN = null; SENSOR_CALIBRATION_TRANSFORM1 = null; SENSOR_CALIBRATION_TRANSFORM2 = null; SENSOR_COLOR_TRANSFORM1 = null; SENSOR_COLOR_TRANSFORM2 = null; SENSOR_FORWARD_MATRIX1 = null; SENSOR_FORWARD_MATRIX2 = null; SENSOR_INFO_ACTIVE_ARRAY_SIZE = null; SENSOR_INFO_COLOR_FILTER_ARRANGEMENT = null; SENSOR_INFO_EXPOSURE_TIME_RANGE = null; SENSOR_INFO_LENS_SHADING_APPLIED = null; SENSOR_INFO_MAX_FRAME_DURATION = null; SENSOR_INFO_PHYSICAL_SIZE = null; SENSOR_INFO_PIXEL_ARRAY_SIZE = null; SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE = null; SENSOR_INFO_SENSITIVITY_RANGE = null; SENSOR_INFO_TIMESTAMP_SOURCE = null; SENSOR_INFO_WHITE_LEVEL = null; SENSOR_MAX_ANALOG_SENSITIVITY = null; SENSOR_OPTICAL_BLACK_REGIONS = null; SENSOR_ORIENTATION = null; SENSOR_REFERENCE_ILLUMINANT1 = null; SENSOR_REFERENCE_ILLUMINANT2 = null; SHADING_AVAILABLE_MODES = null; STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES = null; STATISTICS_INFO_AVAILABLE_HOT_PIXEL_MAP_MODES = null; STATISTICS_INFO_AVAILABLE_LENS_SHADING_MAP_MODES = null; STATISTICS_INFO_AVAILABLE_OIS_DATA_MODES = null; STATISTICS_INFO_MAX_FACE_COUNT = null; SYNC_MAX_LATENCY = null; TONEMAP_AVAILABLE_TONE_MAP_MODES = null; TONEMAP_MAX_CURVE_POINTS = null; }
}
