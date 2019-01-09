/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentBleService.aidl
 */
package android.car.trust;
/**
 * Binder interface for CarTrustAgentBleService.
 *
 * @hide
 */
public interface ICarTrustAgentBleService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentBleService
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentBleService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentBleService interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentBleService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentBleService))) {
return ((android.car.trust.ICarTrustAgentBleService)iin);
}
return new android.car.trust.ICarTrustAgentBleService.Stub.Proxy(obj);
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
case TRANSACTION_registerBleCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentBleCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentBleCallback.Stub.asInterface(data.readStrongBinder());
this.registerBleCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterBleCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentBleCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentBleCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterBleCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startEnrolmentAdvertising:
{
data.enforceInterface(descriptor);
this.startEnrolmentAdvertising();
reply.writeNoException();
return true;
}
case TRANSACTION_stopEnrolmentAdvertising:
{
data.enforceInterface(descriptor);
this.stopEnrolmentAdvertising();
reply.writeNoException();
return true;
}
case TRANSACTION_sendEnrolmentHandle:
{
data.enforceInterface(descriptor);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.sendEnrolmentHandle(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerEnrolmentCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentEnrolmentCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentEnrolmentCallback.Stub.asInterface(data.readStrongBinder());
this.registerEnrolmentCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterEnrolmentCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentEnrolmentCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentEnrolmentCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterEnrolmentCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startUnlockAdvertising:
{
data.enforceInterface(descriptor);
this.startUnlockAdvertising();
reply.writeNoException();
return true;
}
case TRANSACTION_stopUnlockAdvertising:
{
data.enforceInterface(descriptor);
this.stopUnlockAdvertising();
reply.writeNoException();
return true;
}
case TRANSACTION_registerUnlockCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentUnlockCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentUnlockCallback.Stub.asInterface(data.readStrongBinder());
this.registerUnlockCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterUnlockCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentUnlockCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentUnlockCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterUnlockCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setTokenRequestDelegate:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentTokenRequestDelegate _arg0;
_arg0 = android.car.trust.ICarTrustAgentTokenRequestDelegate.Stub.asInterface(data.readStrongBinder());
this.setTokenRequestDelegate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_revokeTrust:
{
data.enforceInterface(descriptor);
this.revokeTrust();
reply.writeNoException();
return true;
}
case TRANSACTION_addEscrowToken:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
this.addEscrowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeEscrowToken:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.removeEscrowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isEscrowTokenActive:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.isEscrowTokenActive(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setTokenResponseCallback:
{
data.enforceInterface(descriptor);
android.car.trust.ICarTrustAgentTokenResponseCallback _arg0;
_arg0 = android.car.trust.ICarTrustAgentTokenResponseCallback.Stub.asInterface(data.readStrongBinder());
this.setTokenResponseCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onEscrowTokenAdded:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.onEscrowTokenAdded(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onEscrowTokenRemoved:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onEscrowTokenRemoved(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onEscrowTokenActiveStateChanged:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onEscrowTokenActiveStateChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getUserIdByEscrowTokenHandle:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _result = this.getUserIdByEscrowTokenHandle(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentBleService
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
/** General BLE */
@Override public void registerBleCallback(android.car.trust.ICarTrustAgentBleCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerBleCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterBleCallback(android.car.trust.ICarTrustAgentBleCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterBleCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Enrolment */
@Override public void startEnrolmentAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startEnrolmentAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopEnrolmentAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopEnrolmentAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendEnrolmentHandle(android.bluetooth.BluetoothDevice device, long handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(handle);
mRemote.transact(Stub.TRANSACTION_sendEnrolmentHandle, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerEnrolmentCallback(android.car.trust.ICarTrustAgentEnrolmentCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerEnrolmentCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterEnrolmentCallback(android.car.trust.ICarTrustAgentEnrolmentCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterEnrolmentCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Unlock */
@Override public void startUnlockAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startUnlockAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopUnlockAdvertising() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopUnlockAdvertising, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerUnlockCallback(android.car.trust.ICarTrustAgentUnlockCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerUnlockCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterUnlockCallback(android.car.trust.ICarTrustAgentUnlockCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterUnlockCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Token request */
@Override public void setTokenRequestDelegate(android.car.trust.ICarTrustAgentTokenRequestDelegate delegate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((delegate!=null))?(delegate.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setTokenRequestDelegate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void revokeTrust() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_revokeTrust, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addEscrowToken(byte[] token, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_addEscrowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeEscrowToken(long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_removeEscrowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void isEscrowTokenActive(long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_isEscrowTokenActive, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Token response */
@Override public void setTokenResponseCallback(android.car.trust.ICarTrustAgentTokenResponseCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setTokenResponseCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onEscrowTokenAdded(byte[] token, long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onEscrowTokenAdded, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onEscrowTokenRemoved(long handle, boolean successful) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(((successful)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEscrowTokenRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onEscrowTokenActiveStateChanged(long handle, boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEscrowTokenActiveStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getUserIdByEscrowTokenHandle(long tokenHandle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(tokenHandle);
mRemote.transact(Stub.TRANSACTION_getUserIdByEscrowTokenHandle, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerBleCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterBleCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startEnrolmentAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopEnrolmentAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_sendEnrolmentHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_registerEnrolmentCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unregisterEnrolmentCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startUnlockAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_stopUnlockAdvertising = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_registerUnlockCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_unregisterUnlockCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setTokenRequestDelegate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_revokeTrust = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_removeEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isEscrowTokenActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_setTokenResponseCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_onEscrowTokenAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_onEscrowTokenRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_onEscrowTokenActiveStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getUserIdByEscrowTokenHandle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
}
/** General BLE */
public void registerBleCallback(android.car.trust.ICarTrustAgentBleCallback callback) throws android.os.RemoteException;
public void unregisterBleCallback(android.car.trust.ICarTrustAgentBleCallback callback) throws android.os.RemoteException;
/** Enrolment */
public void startEnrolmentAdvertising() throws android.os.RemoteException;
public void stopEnrolmentAdvertising() throws android.os.RemoteException;
public void sendEnrolmentHandle(android.bluetooth.BluetoothDevice device, long handle) throws android.os.RemoteException;
public void registerEnrolmentCallback(android.car.trust.ICarTrustAgentEnrolmentCallback callback) throws android.os.RemoteException;
public void unregisterEnrolmentCallback(android.car.trust.ICarTrustAgentEnrolmentCallback callback) throws android.os.RemoteException;
/** Unlock */
public void startUnlockAdvertising() throws android.os.RemoteException;
public void stopUnlockAdvertising() throws android.os.RemoteException;
public void registerUnlockCallback(android.car.trust.ICarTrustAgentUnlockCallback callback) throws android.os.RemoteException;
public void unregisterUnlockCallback(android.car.trust.ICarTrustAgentUnlockCallback callback) throws android.os.RemoteException;
/** Token request */
public void setTokenRequestDelegate(android.car.trust.ICarTrustAgentTokenRequestDelegate delegate) throws android.os.RemoteException;
public void revokeTrust() throws android.os.RemoteException;
public void addEscrowToken(byte[] token, int uid) throws android.os.RemoteException;
public void removeEscrowToken(long handle, int uid) throws android.os.RemoteException;
public void isEscrowTokenActive(long handle, int uid) throws android.os.RemoteException;
/** Token response */
public void setTokenResponseCallback(android.car.trust.ICarTrustAgentTokenResponseCallback callback) throws android.os.RemoteException;
public void onEscrowTokenAdded(byte[] token, long handle, int uid) throws android.os.RemoteException;
public void onEscrowTokenRemoved(long handle, boolean successful) throws android.os.RemoteException;
public void onEscrowTokenActiveStateChanged(long handle, boolean active) throws android.os.RemoteException;
public int getUserIdByEscrowTokenHandle(long tokenHandle) throws android.os.RemoteException;
}
