/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.system;
public final class Os
{
Os() { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor accept(java.io.FileDescriptor fd, java.net.InetSocketAddress peerAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  boolean access(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void bind(java.io.FileDescriptor fd, java.net.InetAddress address, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void chmod(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void chown(java.lang.String path, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void close(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void connect(java.io.FileDescriptor fd, java.net.InetAddress address, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor dup(java.io.FileDescriptor oldFd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor dup2(java.io.FileDescriptor oldFd, int newFd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] environ() { throw new RuntimeException("Stub!"); }
public static  void execv(java.lang.String filename, java.lang.String[] argv) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void execve(java.lang.String filename, java.lang.String[] argv, java.lang.String[] envp) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void fchmod(java.io.FileDescriptor fd, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void fchown(java.io.FileDescriptor fd, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void fdatasync(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  android.system.StructStat fstat(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  android.system.StructStatVfs fstatvfs(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void fsync(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void ftruncate(java.io.FileDescriptor fd, long length) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.lang.String gai_strerror(int error) { throw new RuntimeException("Stub!"); }
public static  int getegid() { throw new RuntimeException("Stub!"); }
public static  int geteuid() { throw new RuntimeException("Stub!"); }
public static  int getgid() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getenv(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.net.SocketAddress getpeername(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int getpid() { throw new RuntimeException("Stub!"); }
public static  int getppid() { throw new RuntimeException("Stub!"); }
public static  java.net.SocketAddress getsockname(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int gettid() { throw new RuntimeException("Stub!"); }
public static  int getuid() { throw new RuntimeException("Stub!"); }
public static  byte[] getxattr(java.lang.String path, java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.lang.String if_indextoname(int index) { throw new RuntimeException("Stub!"); }
public static  int if_nametoindex(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.net.InetAddress inet_pton(int family, java.lang.String address) { throw new RuntimeException("Stub!"); }
public static  boolean isatty(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
public static  void kill(int pid, int signal) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void lchown(java.lang.String path, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void link(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void listen(java.io.FileDescriptor fd, int backlog) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] listxattr(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  long lseek(java.io.FileDescriptor fd, long offset, int whence) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  android.system.StructStat lstat(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void mincore(long address, long byteCount, byte[] vector) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void mkdir(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void mkfifo(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void mlock(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  long mmap(long address, long byteCount, int prot, int flags, java.io.FileDescriptor fd, long offset) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void msync(long address, long byteCount, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void munlock(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void munmap(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor open(java.lang.String path, int flags, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor[] pipe() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int poll(android.system.StructPollfd[] fds, int timeoutMs) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void posix_fallocate(java.io.FileDescriptor fd, long offset, long length) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int pread(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int pread(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int pwrite(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int pwrite(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int read(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int read(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  java.lang.String readlink(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int readv(java.io.FileDescriptor fd, java.lang.Object[] buffers, int[] offsets, int[] byteCounts) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int recvfrom(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, int flags, java.net.InetSocketAddress srcAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  int recvfrom(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.InetSocketAddress srcAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void remove(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void removexattr(java.lang.String path, java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void rename(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  long sendfile(java.io.FileDescriptor outFd, java.io.FileDescriptor inFd, android.system.Int64Ref offset, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int sendto(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, int flags, java.net.InetAddress inetAddress, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  int sendto(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.InetAddress inetAddress, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }
public static  void setegid(int egid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void setenv(java.lang.String name, java.lang.String value, boolean overwrite) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void seteuid(int euid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void setgid(int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int setsid() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void setsockoptInt(java.io.FileDescriptor fd, int level, int option, int value) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void setuid(int uid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void setxattr(java.lang.String path, java.lang.String name, byte[] value, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void shutdown(java.io.FileDescriptor fd, int how) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.io.FileDescriptor socket(int domain, int type, int protocol) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void socketpair(int domain, int type, int protocol, java.io.FileDescriptor fd1, java.io.FileDescriptor fd2) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  android.system.StructStat stat(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  android.system.StructStatVfs statvfs(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  java.lang.String strerror(int errno) { throw new RuntimeException("Stub!"); }
public static  java.lang.String strsignal(int signal) { throw new RuntimeException("Stub!"); }
public static  void symlink(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  long sysconf(int name) { throw new RuntimeException("Stub!"); }
public static  void tcdrain(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  void tcsendbreak(java.io.FileDescriptor fd, int duration) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int umask(int mask) { throw new RuntimeException("Stub!"); }
public static  android.system.StructUtsname uname() { throw new RuntimeException("Stub!"); }
public static  void unsetenv(java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }
public static  int write(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int write(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
public static  int writev(java.io.FileDescriptor fd, java.lang.Object[] buffers, int[] offsets, int[] byteCounts) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
}
