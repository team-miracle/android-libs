/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/media/ICarAudio.aidl
 */
package android.car.media;
/**
 * Binder interface for {@link android.car.media.CarAudioManager}.
 * Check {@link android.car.media.CarAudioManager} APIs for expected behavior of each call.
 *
 * @hide
 */
public interface ICarAudio extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.media.ICarAudio
{
private static final java.lang.String DESCRIPTOR = "android.car.media.ICarAudio";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.media.ICarAudio interface,
 * generating a proxy if needed.
 */
public static android.car.media.ICarAudio asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.media.ICarAudio))) {
return ((android.car.media.ICarAudio)iin);
}
return new android.car.media.ICarAudio.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_setGroupVolume:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setGroupVolume(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getGroupMaxVolume:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.getGroupMaxVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getGroupMinVolume:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.getGroupMinVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getGroupVolume:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.getGroupVolume(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setFadeTowardFront:
{
data.enforceInterface(descriptor);
float _arg0;
_arg0 = data.readFloat();
this.setFadeTowardFront(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setBalanceTowardRight:
{
data.enforceInterface(descriptor);
float _arg0;
_arg0 = data.readFloat();
this.setBalanceTowardRight(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getExternalSources:
{
data.enforceInterface(descriptor);
java.lang.String[] _result = this.getExternalSources();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_createAudioPatch:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
android.car.media.CarAudioPatchHandle _result = this.createAudioPatch(_arg0, _arg1, _arg2);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_releaseAudioPatch:
{
data.enforceInterface(descriptor);
android.car.media.CarAudioPatchHandle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.media.CarAudioPatchHandle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.releaseAudioPatch(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVolumeGroupCount:
{
data.enforceInterface(descriptor);
int _result = this.getVolumeGroupCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getVolumeGroupIdForUsage:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.getVolumeGroupIdForUsage(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getUsagesForVolumeGroupId:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int[] _result = this.getUsagesForVolumeGroupId(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_registerVolumeCallback:
{
data.enforceInterface(descriptor);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.registerVolumeCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterVolumeCallback:
{
data.enforceInterface(descriptor);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.unregisterVolumeCallback(_arg0);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.media.ICarAudio
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setGroupVolume(int groupId, int index, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
_data.writeInt(index);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setGroupVolume, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getGroupMaxVolume(int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_getGroupMaxVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getGroupMinVolume(int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_getGroupMinVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getGroupVolume(int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_getGroupVolume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setFadeTowardFront(float value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(value);
mRemote.transact(Stub.TRANSACTION_setFadeTowardFront, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setBalanceTowardRight(float value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(value);
mRemote.transact(Stub.TRANSACTION_setBalanceTowardRight, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getExternalSources() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getExternalSources, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.car.media.CarAudioPatchHandle createAudioPatch(java.lang.String sourceAddress, int usage, int gainInMillibels) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.media.CarAudioPatchHandle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sourceAddress);
_data.writeInt(usage);
_data.writeInt(gainInMillibels);
mRemote.transact(Stub.TRANSACTION_createAudioPatch, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.media.CarAudioPatchHandle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void releaseAudioPatch(android.car.media.CarAudioPatchHandle patch) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((patch!=null)) {
_data.writeInt(1);
patch.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_releaseAudioPatch, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getVolumeGroupCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVolumeGroupCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVolumeGroupIdForUsage(int usage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(usage);
mRemote.transact(Stub.TRANSACTION_getVolumeGroupIdForUsage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getUsagesForVolumeGroupId(int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_getUsagesForVolumeGroupId, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * IBinder is ICarVolumeCallback but passed as IBinder due to aidl hidden.
     */
@Override public void registerVolumeCallback(android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_registerVolumeCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterVolumeCallback(android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_unregisterVolumeCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setGroupVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getGroupMaxVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getGroupMinVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getGroupVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setFadeTowardFront = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setBalanceTowardRight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getExternalSources = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_createAudioPatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_releaseAudioPatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getVolumeGroupCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getVolumeGroupIdForUsage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getUsagesForVolumeGroupId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_registerVolumeCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_unregisterVolumeCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public void setGroupVolume(int groupId, int index, int flags) throws android.os.RemoteException;
public int getGroupMaxVolume(int groupId) throws android.os.RemoteException;
public int getGroupMinVolume(int groupId) throws android.os.RemoteException;
public int getGroupVolume(int groupId) throws android.os.RemoteException;
public void setFadeTowardFront(float value) throws android.os.RemoteException;
public void setBalanceTowardRight(float value) throws android.os.RemoteException;
public java.lang.String[] getExternalSources() throws android.os.RemoteException;
public android.car.media.CarAudioPatchHandle createAudioPatch(java.lang.String sourceAddress, int usage, int gainInMillibels) throws android.os.RemoteException;
public void releaseAudioPatch(android.car.media.CarAudioPatchHandle patch) throws android.os.RemoteException;
public int getVolumeGroupCount() throws android.os.RemoteException;
public int getVolumeGroupIdForUsage(int usage) throws android.os.RemoteException;
public int[] getUsagesForVolumeGroupId(int groupId) throws android.os.RemoteException;
/**
     * IBinder is ICarVolumeCallback but passed as IBinder due to aidl hidden.
     */
public void registerVolumeCallback(android.os.IBinder binder) throws android.os.RemoteException;
public void unregisterVolumeCallback(android.os.IBinder binder) throws android.os.RemoteException;
}
