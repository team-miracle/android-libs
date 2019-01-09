/*
* Copyright (C) 2015 The Android Open Source Project
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

package android.renderscript;
public final class ScriptIntrinsicBLAS
  extends android.renderscript.ScriptIntrinsic
{
ScriptIntrinsicBLAS() { throw new RuntimeException("Stub!"); }
public static  android.renderscript.ScriptIntrinsicBLAS create(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  void SGEMV(int TransA, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, float beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void DGEMV(int TransA, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, double beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void CGEMV(int TransA, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Float2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void ZGEMV(int TransA, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Double2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void SGBMV(int TransA, int KL, int KU, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, float beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void DGBMV(int TransA, int KL, int KU, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, double beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void CGBMV(int TransA, int KL, int KU, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Float2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void ZGBMV(int TransA, int KL, int KU, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Double2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void STRMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTRMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTRMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTRMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void STBMV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTBMV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTBMV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTBMV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void STPMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTPMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTPMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTPMV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void STRSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTRSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTRSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTRSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void STBSV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTBSV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTBSV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTBSV(int Uplo, int TransA, int Diag, int K, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void STPSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void DTPSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void CTPSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void ZTPSV(int Uplo, int TransA, int Diag, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX) { throw new RuntimeException("Stub!"); }
public  void SSYMV(int Uplo, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, float beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void SSBMV(int Uplo, int K, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, float beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void SSPMV(int Uplo, float alpha, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX, float beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void SGER(float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void SSYR(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void SSPR(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void SSYR2(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void SSPR2(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void DSYMV(int Uplo, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, double beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void DSBMV(int Uplo, int K, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, double beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void DSPMV(int Uplo, double alpha, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX, double beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void DGER(double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void DSYR(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void DSPR(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void DSYR2(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void DSPR2(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void CHEMV(int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Float2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void CHBMV(int Uplo, int K, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Float2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void CHPMV(int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX, android.renderscript.Float2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void CGERU(android.renderscript.Float2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void CGERC(android.renderscript.Float2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void CHER(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void CHPR(int Uplo, float alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void CHER2(int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void CHPR2(int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void ZHEMV(int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Double2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void ZHBMV(int Uplo, int K, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation X, int incX, android.renderscript.Double2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void ZHPMV(int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation Ap, android.renderscript.Allocation X, int incX, android.renderscript.Double2 beta, android.renderscript.Allocation Y, int incY) { throw new RuntimeException("Stub!"); }
public  void ZGERU(android.renderscript.Double2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void ZGERC(android.renderscript.Double2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void ZHER(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void ZHPR(int Uplo, double alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void ZHER2(int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation A) { throw new RuntimeException("Stub!"); }
public  void ZHPR2(int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation X, int incX, android.renderscript.Allocation Y, int incY, android.renderscript.Allocation Ap) { throw new RuntimeException("Stub!"); }
public  void SGEMM(int TransA, int TransB, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void DGEMM(int TransA, int TransB, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CGEMM(int TransA, int TransB, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Float2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZGEMM(int TransA, int TransB, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Double2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void SSYMM(int Side, int Uplo, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void DSYMM(int Side, int Uplo, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CSYMM(int Side, int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Float2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZSYMM(int Side, int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Double2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void SSYRK(int Uplo, int Trans, float alpha, android.renderscript.Allocation A, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void DSYRK(int Uplo, int Trans, double alpha, android.renderscript.Allocation A, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CSYRK(int Uplo, int Trans, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Float2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZSYRK(int Uplo, int Trans, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Double2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void SSYR2K(int Uplo, int Trans, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void DSYR2K(int Uplo, int Trans, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CSYR2K(int Uplo, int Trans, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Float2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZSYR2K(int Uplo, int Trans, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Double2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void STRMM(int Side, int Uplo, int TransA, int Diag, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void DTRMM(int Side, int Uplo, int TransA, int Diag, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void CTRMM(int Side, int Uplo, int TransA, int Diag, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void ZTRMM(int Side, int Uplo, int TransA, int Diag, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void STRSM(int Side, int Uplo, int TransA, int Diag, float alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void DTRSM(int Side, int Uplo, int TransA, int Diag, double alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void CTRSM(int Side, int Uplo, int TransA, int Diag, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void ZTRSM(int Side, int Uplo, int TransA, int Diag, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B) { throw new RuntimeException("Stub!"); }
public  void CHEMM(int Side, int Uplo, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Float2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZHEMM(int Side, int Uplo, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, android.renderscript.Double2 beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CHERK(int Uplo, int Trans, float alpha, android.renderscript.Allocation A, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZHERK(int Uplo, int Trans, double alpha, android.renderscript.Allocation A, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void CHER2K(int Uplo, int Trans, android.renderscript.Float2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, float beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void ZHER2K(int Uplo, int Trans, android.renderscript.Double2 alpha, android.renderscript.Allocation A, android.renderscript.Allocation B, double beta, android.renderscript.Allocation C) { throw new RuntimeException("Stub!"); }
public  void BNNM(android.renderscript.Allocation A, int a_offset, android.renderscript.Allocation B, int b_offset, android.renderscript.Allocation C, int c_offset, int c_mult) { throw new RuntimeException("Stub!"); }
public static final int CONJ_TRANSPOSE = 113;
public static final int LEFT = 141;
public static final int LOWER = 122;
public static final int NON_UNIT = 131;
public static final int NO_TRANSPOSE = 111;
public static final int RIGHT = 142;
public static final int TRANSPOSE = 112;
public static final int UNIT = 132;
public static final int UPPER = 121;
}
