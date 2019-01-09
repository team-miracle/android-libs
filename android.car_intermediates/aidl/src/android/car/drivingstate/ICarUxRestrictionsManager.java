/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/drivingstate/ICarUxRestrictionsManager.aidl
 */
package android.car.drivingstate;
/**
 * Binder interface for {@link android.car.drivingstate.CarUxRestrictionsManager}.
 * Check {@link android.car.drivingstate.CarUxRestrictionsManager} APIs for expected behavior of
 * each call.
 *
 * @hide
 */
public interface ICarUxRestrictionsManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.drivingstate.ICarUxRestrictionsManager
{
private static final java.lang.String DESCRIPTOR = "android.car.drivingstate.ICarUxRestrictionsManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.drivingstate.ICarUxRestrictionsManager interface,
 * generating a proxy if needed.
 */
public static android.car.drivingstate.ICarUxRestrictionsManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.drivingstate.ICarUxRestrictionsManager))) {
return ((android.car.drivingstate.ICarUxRestrictionsManager)iin);
}
return new android.car.drivingstate.ICarUxRestrictionsManager.Stub.Proxy(obj);
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
case TRANSACTION_registerUxRestrictionsChangeListener:
{
data.enforceInterface(descriptor);
android.car.drivingstate.ICarUxRestrictionsChangeListener _arg0;
_arg0 = android.car.drivingstate.ICarUxRestrictionsChangeListener.Stub.asInterface(data.readStrongBinder());
this.registerUxRestrictionsChangeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterUxRestrictionsChangeListener:
{
data.enforceInterface(descriptor);
android.car.drivingstate.ICarUxRestrictionsChangeListener _arg0;
_arg0 = android.car.drivingstate.ICarUxRestrictionsChangeListener.Stub.asInterface(data.readStrongBinder());
this.unregisterUxRestrictionsChangeListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCurrentUxRestrictions:
{
data.enforceInterface(descriptor);
android.car.drivingstate.CarUxRestrictions _result = this.getCurrentUxRestrictions();
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
private static class Proxy implements android.car.drivingstate.ICarUxRestrictionsManager
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
@Override public void registerUxRestrictionsChangeListener(android.car.drivingstate.ICarUxRestrictionsChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerUxRestrictionsChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterUxRestrictionsChangeListener(android.car.drivingstate.ICarUxRestrictionsChangeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterUxRestrictionsChangeListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.car.drivingstate.CarUxRestrictions getCurrentUxRestrictions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.drivingstate.CarUxRestrictions _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCurrentUxRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.drivingstate.CarUxRestrictions.CREATOR.createFromParcel(_reply);
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
static final int TRANSACTION_registerUxRestrictionsChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterUxRestrictionsChangeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCurrentUxRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void registerUxRestrictionsChangeListener(android.car.drivingstate.ICarUxRestrictionsChangeListener listener) throws android.os.RemoteException;
public void unregisterUxRestrictionsChangeListener(android.car.drivingstate.ICarUxRestrictionsChangeListener listener) throws android.os.RemoteException;
public android.car.drivingstate.CarUxRestrictions getCurrentUxRestrictions() throws android.os.RemoteException;
}
