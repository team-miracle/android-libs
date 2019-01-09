/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/drivingstate/ICarDrivingState.aidl
 */
package android.car.drivingstate;
/**
 * Binder interface for {@link android.car.drivingstate.CarDrivingStateManager}.
 * Check {@link android.car.drivingstate.CarDrivingStateManager} APIs for expected behavior of
 * each call.
 *
 * @hide
 */
public interface ICarDrivingState extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.drivingstate.ICarDrivingState
{
private static final java.lang.String DESCRIPTOR = "android.car.drivingstate.ICarDrivingState";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.drivingstate.ICarDrivingState interface,
 * generating a proxy if needed.
 */
public static android.car.drivingstate.ICarDrivingState asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.drivingstate.ICarDrivingState))) {
return ((android.car.drivingstate.ICarDrivingState)iin);
}
return new android.car.drivingstate.ICarDrivingState.Stub.Proxy(obj);
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
case TRANSACTION_registerDrivingStateChangeListener:
{
data.enforceInterface(descriptor);
android.car.drivingstate.ICarDrivingStateChangeListener _arg0;
_arg0 = android.car.drivingstate.ICarDrivingStateChangeListener.Stub.asInterface(data.readStrongBinder());
this.registerDrivingStateChangeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterDrivingStateChangeListener:
{
data.enforceInterface(descriptor);
android.car.drivingstate.ICarDrivingStateChangeListener _arg0;
_arg0 = android.car.drivingstate.ICarDrivingStateChangeListener.Stub.asInterface(data.readStrongBinder());
this.unregisterDrivingStateChangeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentDrivingState:
{
data.enforceInterface(descriptor);
android.car.drivingstate.CarDrivingStateEvent _result = this.getCurrentDrivingState();
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
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.drivingstate.ICarDrivingState
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
@Override public void registerDrivingStateChangeListener(android.car.drivingstate.ICarDrivingStateChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerDrivingStateChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterDrivingStateChangeListener(android.car.drivingstate.ICarDrivingStateChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterDrivingStateChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.car.drivingstate.CarDrivingStateEvent getCurrentDrivingState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.drivingstate.CarDrivingStateEvent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentDrivingState, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.drivingstate.CarDrivingStateEvent.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_registerDrivingStateChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterDrivingStateChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentDrivingState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void registerDrivingStateChangeListener(android.car.drivingstate.ICarDrivingStateChangeListener listener) throws android.os.RemoteException;
public void unregisterDrivingStateChangeListener(android.car.drivingstate.ICarDrivingStateChangeListener listener) throws android.os.RemoteException;
public android.car.drivingstate.CarDrivingStateEvent getCurrentDrivingState() throws android.os.RemoteException;
}
