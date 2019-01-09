/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/drivingstate/ICarUxRestrictionsChangeListener.aidl
 */
package android.car.drivingstate;
/**
 * Binder callback for onUxRestrictionsChanged.
 */
public interface ICarUxRestrictionsChangeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.drivingstate.ICarUxRestrictionsChangeListener
{
private static final java.lang.String DESCRIPTOR = "android.car.drivingstate.ICarUxRestrictionsChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.drivingstate.ICarUxRestrictionsChangeListener interface,
 * generating a proxy if needed.
 */
public static android.car.drivingstate.ICarUxRestrictionsChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.drivingstate.ICarUxRestrictionsChangeListener))) {
return ((android.car.drivingstate.ICarUxRestrictionsChangeListener)iin);
}
return new android.car.drivingstate.ICarUxRestrictionsChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onUxRestrictionsChanged:
{
data.enforceInterface(descriptor);
android.car.drivingstate.CarUxRestrictions _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.drivingstate.CarUxRestrictions.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onUxRestrictionsChanged(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.drivingstate.ICarUxRestrictionsChangeListener
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
@Override public void onUxRestrictionsChanged(android.car.drivingstate.CarUxRestrictions event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onUxRestrictionsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onUxRestrictionsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onUxRestrictionsChanged(android.car.drivingstate.CarUxRestrictions event) throws android.os.RemoteException;
}
