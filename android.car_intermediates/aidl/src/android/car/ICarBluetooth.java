/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarBluetooth.aidl
 */
package android.car;
/** @hide */
public interface ICarBluetooth extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarBluetooth
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarBluetooth";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarBluetooth interface,
 * generating a proxy if needed.
 */
public static android.car.ICarBluetooth asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarBluetooth))) {
return ((android.car.ICarBluetooth)iin);
}
return new android.car.ICarBluetooth.Stub.Proxy(obj);
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
case TRANSACTION_setBluetoothDeviceConnectionPriority:
{
data.enforceInterface(descriptor);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setBluetoothDeviceConnectionPriority(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_clearBluetoothDeviceConnectionPriority:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.clearBluetoothDeviceConnectionPriority(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isPriorityDevicePresent:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isPriorityDevicePresent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDeviceNameWithPriority:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _result = this.getDeviceNameWithPriority(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarBluetooth
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
@Override public void setBluetoothDeviceConnectionPriority(android.bluetooth.BluetoothDevice deviceToSet, int profileToSet, int priorityToSet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((deviceToSet!=null)) {
_data.writeInt(1);
deviceToSet.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(profileToSet);
_data.writeInt(priorityToSet);
mRemote.transact(Stub.TRANSACTION_setBluetoothDeviceConnectionPriority, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearBluetoothDeviceConnectionPriority(int profileToClear, int priorityToClear) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profileToClear);
_data.writeInt(priorityToClear);
mRemote.transact(Stub.TRANSACTION_clearBluetoothDeviceConnectionPriority, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isPriorityDevicePresent(int profile, int priorityToCheck) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
_data.writeInt(priorityToCheck);
mRemote.transact(Stub.TRANSACTION_isPriorityDevicePresent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getDeviceNameWithPriority(int profile, int priorityToCheck) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(profile);
_data.writeInt(priorityToCheck);
mRemote.transact(Stub.TRANSACTION_getDeviceNameWithPriority, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setBluetoothDeviceConnectionPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_clearBluetoothDeviceConnectionPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isPriorityDevicePresent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getDeviceNameWithPriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void setBluetoothDeviceConnectionPriority(android.bluetooth.BluetoothDevice deviceToSet, int profileToSet, int priorityToSet) throws android.os.RemoteException;
public void clearBluetoothDeviceConnectionPriority(int profileToClear, int priorityToClear) throws android.os.RemoteException;
public boolean isPriorityDevicePresent(int profile, int priorityToCheck) throws android.os.RemoteException;
public java.lang.String getDeviceNameWithPriority(int profile, int priorityToCheck) throws android.os.RemoteException;
}
