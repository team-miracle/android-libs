/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarBluetoothUserService.aidl
 */
package android.car;
/** @hide */
public interface ICarBluetoothUserService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarBluetoothUserService
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarBluetoothUserService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarBluetoothUserService interface,
 * generating a proxy if needed.
 */
public static android.car.ICarBluetoothUserService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarBluetoothUserService))) {
return ((android.car.ICarBluetoothUserService)iin);
}
return new android.car.ICarBluetoothUserService.Stub.Proxy(obj);
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
case TRANSACTION_setupBluetoothConnectionProxy:
{
data.enforceInterface(descriptor);
this.setupBluetoothConnectionProxy();
reply.writeNoException();
return true;
}
case TRANSACTION_closeBluetoothConnectionProxy:
{
data.enforceInterface(descriptor);
this.closeBluetoothConnectionProxy();
reply.writeNoException();
return true;
}
case TRANSACTION_isBluetoothConnectionProxyAvailable:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isBluetoothConnectionProxyAvailable(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_bluetoothConnectToProfile:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.BluetoothDevice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.bluetoothConnectToProfile(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setProfilePriority:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
android.bluetooth.BluetoothDevice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setProfilePriority(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarBluetoothUserService
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
// Bluetooth related APIs

@Override public void setupBluetoothConnectionProxy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setupBluetoothConnectionProxy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void closeBluetoothConnectionProxy() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeBluetoothConnectionProxy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isBluetoothConnectionProxyAvailable(int profile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
mRemote.transact(Stub.TRANSACTION_isBluetoothConnectionProxyAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void bluetoothConnectToProfile(int profile, android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_bluetoothConnectToProfile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setProfilePriority(int profile, android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(priority);
mRemote.transact(Stub.TRANSACTION_setProfilePriority, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setupBluetoothConnectionProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_closeBluetoothConnectionProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isBluetoothConnectionProxyAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_bluetoothConnectToProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setProfilePriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
// Bluetooth related APIs

public void setupBluetoothConnectionProxy() throws android.os.RemoteException;
public void closeBluetoothConnectionProxy() throws android.os.RemoteException;
public boolean isBluetoothConnectionProxyAvailable(int profile) throws android.os.RemoteException;
public void bluetoothConnectToProfile(int profile, android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
public void setProfilePriority(int profile, android.bluetooth.BluetoothDevice device, int priority) throws android.os.RemoteException;
}
