/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/hardware/power/ICarPowerStateListener.aidl
 */
package android.car.hardware.power;
/**
 * Binder callback for CarPowerStateListener.
 * @hide
 */
public interface ICarPowerStateListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.hardware.power.ICarPowerStateListener
{
private static final java.lang.String DESCRIPTOR = "android.car.hardware.power.ICarPowerStateListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.hardware.power.ICarPowerStateListener interface,
 * generating a proxy if needed.
 */
public static android.car.hardware.power.ICarPowerStateListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.hardware.power.ICarPowerStateListener))) {
return ((android.car.hardware.power.ICarPowerStateListener)iin);
}
return new android.car.hardware.power.ICarPowerStateListener.Stub.Proxy(obj);
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
case TRANSACTION_onStateChanged:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onStateChanged(_arg0, _arg1);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.hardware.power.ICarPowerStateListener
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
/**
     * Called when a power state change occurs
     */
@Override public void onStateChanged(int state, int token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(state);
_data.writeInt(token);
mRemote.transact(Stub.TRANSACTION_onStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when a power state change occurs
     */
public void onStateChanged(int state, int token) throws android.os.RemoteException;
}
