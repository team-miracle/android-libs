/*
** Copyright 2012, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/

// This source file is automatically generated

package android.opengl;
public class EGL14
{
public  EGL14() { throw new RuntimeException("Stub!"); }
public static native  int eglGetError();
public static native  android.opengl.EGLDisplay eglGetDisplay(int display_id);
public static native  boolean eglInitialize(android.opengl.EGLDisplay dpy, int[] major, int majorOffset, int[] minor, int minorOffset);
public static native  boolean eglTerminate(android.opengl.EGLDisplay dpy);
public static native  java.lang.String eglQueryString(android.opengl.EGLDisplay dpy, int name);
public static native  boolean eglGetConfigs(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig[] configs, int configsOffset, int config_size, int[] num_config, int num_configOffset);
public static native  boolean eglChooseConfig(android.opengl.EGLDisplay dpy, int[] attrib_list, int attrib_listOffset, android.opengl.EGLConfig[] configs, int configsOffset, int config_size, int[] num_config, int num_configOffset);
public static native  boolean eglGetConfigAttrib(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig config, int attribute, int[] value, int offset);
public static  android.opengl.EGLSurface eglCreateWindowSurface(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig config, java.lang.Object win, int[] attrib_list, int offset) { throw new RuntimeException("Stub!"); }
public static native  android.opengl.EGLSurface eglCreatePbufferSurface(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig config, int[] attrib_list, int offset);
@java.lang.Deprecated()
public static native  android.opengl.EGLSurface eglCreatePixmapSurface(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig config, int pixmap, int[] attrib_list, int offset);
public static native  boolean eglDestroySurface(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface);
public static native  boolean eglQuerySurface(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface, int attribute, int[] value, int offset);
public static native  boolean eglBindAPI(int api);
public static native  int eglQueryAPI();
public static native  boolean eglWaitClient();
public static native  boolean eglReleaseThread();
public static native  android.opengl.EGLSurface eglCreatePbufferFromClientBuffer(android.opengl.EGLDisplay dpy, int buftype, int buffer, android.opengl.EGLConfig config, int[] attrib_list, int offset);
public static native  boolean eglSurfaceAttrib(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface, int attribute, int value);
public static native  boolean eglBindTexImage(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface, int buffer);
public static native  boolean eglReleaseTexImage(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface, int buffer);
public static native  boolean eglSwapInterval(android.opengl.EGLDisplay dpy, int interval);
public static native  android.opengl.EGLContext eglCreateContext(android.opengl.EGLDisplay dpy, android.opengl.EGLConfig config, android.opengl.EGLContext share_context, int[] attrib_list, int offset);
public static native  boolean eglDestroyContext(android.opengl.EGLDisplay dpy, android.opengl.EGLContext ctx);
public static native  boolean eglMakeCurrent(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface draw, android.opengl.EGLSurface read, android.opengl.EGLContext ctx);
public static native  android.opengl.EGLContext eglGetCurrentContext();
public static native  android.opengl.EGLSurface eglGetCurrentSurface(int readdraw);
public static native  android.opengl.EGLDisplay eglGetCurrentDisplay();
public static native  boolean eglQueryContext(android.opengl.EGLDisplay dpy, android.opengl.EGLContext ctx, int attribute, int[] value, int offset);
public static native  boolean eglWaitGL();
public static native  boolean eglWaitNative(int engine);
public static native  boolean eglSwapBuffers(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface);
public static native  boolean eglCopyBuffers(android.opengl.EGLDisplay dpy, android.opengl.EGLSurface surface, int target);
public static final int EGL_ALPHA_MASK_SIZE = 12350;
public static final int EGL_ALPHA_SIZE = 12321;
public static final int EGL_BACK_BUFFER = 12420;
public static final int EGL_BAD_ACCESS = 12290;
public static final int EGL_BAD_ALLOC = 12291;
public static final int EGL_BAD_ATTRIBUTE = 12292;
public static final int EGL_BAD_CONFIG = 12293;
public static final int EGL_BAD_CONTEXT = 12294;
public static final int EGL_BAD_CURRENT_SURFACE = 12295;
public static final int EGL_BAD_DISPLAY = 12296;
public static final int EGL_BAD_MATCH = 12297;
public static final int EGL_BAD_NATIVE_PIXMAP = 12298;
public static final int EGL_BAD_NATIVE_WINDOW = 12299;
public static final int EGL_BAD_PARAMETER = 12300;
public static final int EGL_BAD_SURFACE = 12301;
public static final int EGL_BIND_TO_TEXTURE_RGB = 12345;
public static final int EGL_BIND_TO_TEXTURE_RGBA = 12346;
public static final int EGL_BLUE_SIZE = 12322;
public static final int EGL_BUFFER_DESTROYED = 12437;
public static final int EGL_BUFFER_PRESERVED = 12436;
public static final int EGL_BUFFER_SIZE = 12320;
public static final int EGL_CLIENT_APIS = 12429;
public static final int EGL_COLOR_BUFFER_TYPE = 12351;
public static final int EGL_CONFIG_CAVEAT = 12327;
public static final int EGL_CONFIG_ID = 12328;
public static final int EGL_CONFORMANT = 12354;
public static final int EGL_CONTEXT_CLIENT_TYPE = 12439;
public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
public static final int EGL_CONTEXT_LOST = 12302;
public static final int EGL_CORE_NATIVE_ENGINE = 12379;
public static final int EGL_DEFAULT_DISPLAY = 0;
public static final int EGL_DEPTH_SIZE = 12325;
public static final int EGL_DISPLAY_SCALING = 10000;
public static final int EGL_DRAW = 12377;
public static final int EGL_EXTENSIONS = 12373;
public static final int EGL_FALSE = 0;
public static final int EGL_GREEN_SIZE = 12323;
public static final int EGL_HEIGHT = 12374;
public static final int EGL_HORIZONTAL_RESOLUTION = 12432;
public static final int EGL_LARGEST_PBUFFER = 12376;
public static final int EGL_LEVEL = 12329;
public static final int EGL_LUMINANCE_BUFFER = 12431;
public static final int EGL_LUMINANCE_SIZE = 12349;
public static final int EGL_MATCH_NATIVE_PIXMAP = 12353;
public static final int EGL_MAX_PBUFFER_HEIGHT = 12330;
public static final int EGL_MAX_PBUFFER_PIXELS = 12331;
public static final int EGL_MAX_PBUFFER_WIDTH = 12332;
public static final int EGL_MAX_SWAP_INTERVAL = 12348;
public static final int EGL_MIN_SWAP_INTERVAL = 12347;
public static final int EGL_MIPMAP_LEVEL = 12419;
public static final int EGL_MIPMAP_TEXTURE = 12418;
public static final int EGL_MULTISAMPLE_RESOLVE = 12441;
public static final int EGL_MULTISAMPLE_RESOLVE_BOX = 12443;
public static final int EGL_MULTISAMPLE_RESOLVE_BOX_BIT = 512;
public static final int EGL_MULTISAMPLE_RESOLVE_DEFAULT = 12442;
public static final int EGL_NATIVE_RENDERABLE = 12333;
public static final int EGL_NATIVE_VISUAL_ID = 12334;
public static final int EGL_NATIVE_VISUAL_TYPE = 12335;
public static final int EGL_NONE = 12344;
public static final int EGL_NON_CONFORMANT_CONFIG = 12369;
public static final int EGL_NOT_INITIALIZED = 12289;
public static android.opengl.EGLContext EGL_NO_CONTEXT;
public static android.opengl.EGLDisplay EGL_NO_DISPLAY;
public static android.opengl.EGLSurface EGL_NO_SURFACE;
public static final int EGL_NO_TEXTURE = 12380;
public static final int EGL_OPENGL_API = 12450;
public static final int EGL_OPENGL_BIT = 8;
public static final int EGL_OPENGL_ES2_BIT = 4;
public static final int EGL_OPENGL_ES_API = 12448;
public static final int EGL_OPENGL_ES_BIT = 1;
public static final int EGL_OPENVG_API = 12449;
public static final int EGL_OPENVG_BIT = 2;
public static final int EGL_OPENVG_IMAGE = 12438;
public static final int EGL_PBUFFER_BIT = 1;
public static final int EGL_PIXEL_ASPECT_RATIO = 12434;
public static final int EGL_PIXMAP_BIT = 2;
public static final int EGL_READ = 12378;
public static final int EGL_RED_SIZE = 12324;
public static final int EGL_RENDERABLE_TYPE = 12352;
public static final int EGL_RENDER_BUFFER = 12422;
public static final int EGL_RGB_BUFFER = 12430;
public static final int EGL_SAMPLES = 12337;
public static final int EGL_SAMPLE_BUFFERS = 12338;
public static final int EGL_SINGLE_BUFFER = 12421;
public static final int EGL_SLOW_CONFIG = 12368;
public static final int EGL_STENCIL_SIZE = 12326;
public static final int EGL_SUCCESS = 12288;
public static final int EGL_SURFACE_TYPE = 12339;
public static final int EGL_SWAP_BEHAVIOR = 12435;
public static final int EGL_SWAP_BEHAVIOR_PRESERVED_BIT = 1024;
public static final int EGL_TEXTURE_2D = 12383;
public static final int EGL_TEXTURE_FORMAT = 12416;
public static final int EGL_TEXTURE_RGB = 12381;
public static final int EGL_TEXTURE_RGBA = 12382;
public static final int EGL_TEXTURE_TARGET = 12417;
public static final int EGL_TRANSPARENT_BLUE_VALUE = 12341;
public static final int EGL_TRANSPARENT_GREEN_VALUE = 12342;
public static final int EGL_TRANSPARENT_RED_VALUE = 12343;
public static final int EGL_TRANSPARENT_RGB = 12370;
public static final int EGL_TRANSPARENT_TYPE = 12340;
public static final int EGL_TRUE = 1;
public static final int EGL_VENDOR = 12371;
public static final int EGL_VERSION = 12372;
public static final int EGL_VERTICAL_RESOLUTION = 12433;
public static final int EGL_VG_ALPHA_FORMAT = 12424;
public static final int EGL_VG_ALPHA_FORMAT_NONPRE = 12427;
public static final int EGL_VG_ALPHA_FORMAT_PRE = 12428;
public static final int EGL_VG_ALPHA_FORMAT_PRE_BIT = 64;
public static final int EGL_VG_COLORSPACE = 12423;
public static final int EGL_VG_COLORSPACE_LINEAR = 12426;
public static final int EGL_VG_COLORSPACE_LINEAR_BIT = 32;
public static final int EGL_VG_COLORSPACE_sRGB = 12425;
public static final int EGL_WIDTH = 12375;
public static final int EGL_WINDOW_BIT = 4;
}
