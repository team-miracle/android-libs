/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/ICarSensorEventListener.aidl
 */
package android.car.hardware;
/**
 * Binder callback for OnSensorChangedListener.
 * This is generated per each CarClient.
 * @hide
 */
public interface ICarSensorEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.ICarSensorEventListener
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.ICarSensorEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.ICarSensorEventListener interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.ICarSensorEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.ICarSensorEventListener))) {
return ((android.car.hardware.ICarSensorEventListener)iin);
}
return new android.car.hardware.ICarSensorEventListener.Stub.Proxy(obj);
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
case TRANSACTION_onSensorChanged:
{
data.enforceInterface(descriptor);
java.util.List<android.car.hardware.CarSensorEvent> _arg0;
_arg0 = data.createTypedArrayList(android.car.hardware.CarSensorEvent.CREATOR);
this.onSensorChanged(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.hardware.ICarSensorEventListener
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
@Override public void onSensorChanged(java.util.List<android.car.hardware.CarSensorEvent> events) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(events);
mRemote.transact(Stub.TRANSACTION_onSensorChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onSensorChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onSensorChanged(java.util.List<android.car.hardware.CarSensorEvent> events) throws android.os.RemoteException;
}
