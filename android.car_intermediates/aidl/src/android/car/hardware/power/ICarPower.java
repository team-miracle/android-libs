/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/power/ICarPower.aidl
 */
package android.car.hardware.power;
/** @hide */
public interface ICarPower extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.power.ICarPower
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.power.ICarPower";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.power.ICarPower interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.power.ICarPower asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.power.ICarPower))) {
return ((android.car.hardware.power.ICarPower)iin);
}
return new android.car.hardware.power.ICarPower.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(descriptor);
android.car.hardware.power.ICarPowerStateListener _arg0;
_arg0 = android.car.hardware.power.ICarPowerStateListener.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(descriptor);
android.car.hardware.power.ICarPowerStateListener _arg0;
_arg0 = android.car.hardware.power.ICarPowerStateListener.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestShutdownOnNextSuspend:
{
data.enforceInterface(descriptor);
this.requestShutdownOnNextSuspend();
reply.writeNoException();
return true;
}
case TRANSACTION_getBootReason:
{
data.enforceInterface(descriptor);
int _result = this.getBootReason();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_finished:
{
data.enforceInterface(descriptor);
android.car.hardware.power.ICarPowerStateListener _arg0;
_arg0 = android.car.hardware.power.ICarPowerStateListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.finished(_arg0, _arg1);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.hardware.power.ICarPower
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
@Override public void registerListener(android.car.hardware.power.ICarPowerStateListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.car.hardware.power.ICarPowerStateListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestShutdownOnNextSuspend() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_requestShutdownOnNextSuspend, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getBootReason() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBootReason, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void finished(android.car.hardware.power.ICarPowerStateListener listener, int token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(token);
mRemote.transact(Stub.TRANSACTION_finished, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestShutdownOnNextSuspend = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getBootReason = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_finished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void registerListener(android.car.hardware.power.ICarPowerStateListener listener) throws android.os.RemoteException;
public void unregisterListener(android.car.hardware.power.ICarPowerStateListener listener) throws android.os.RemoteException;
public void requestShutdownOnNextSuspend() throws android.os.RemoteException;
public int getBootReason() throws android.os.RemoteException;
public void finished(android.car.hardware.power.ICarPowerStateListener listener, int token) throws android.os.RemoteException;
}
