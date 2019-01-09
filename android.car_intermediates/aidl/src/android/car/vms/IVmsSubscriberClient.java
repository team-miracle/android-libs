/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/vms/IVmsSubscriberClient.aidl
 */
package android.car.vms;
/**
 * @hide
 */
public interface IVmsSubscriberClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.vms.IVmsSubscriberClient
{
private static final java.lang.String DESCRIPTOR = "android.car.vms.IVmsSubscriberClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.vms.IVmsSubscriberClient interface,
 * generating a proxy if needed.
 */
public static android.car.vms.IVmsSubscriberClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.vms.IVmsSubscriberClient))) {
return ((android.car.vms.IVmsSubscriberClient)iin);
}
return new android.car.vms.IVmsSubscriberClient.Stub.Proxy(obj);
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
case TRANSACTION_onVmsMessageReceived:
{
data.enforceInterface(descriptor);
android.car.vms.VmsLayer _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.vms.VmsLayer.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
byte[] _arg1;
_arg1 = data.createByteArray();
this.onVmsMessageReceived(_arg0, _arg1);
return true;
}
case TRANSACTION_onLayersAvailabilityChanged:
{
data.enforceInterface(descriptor);
android.car.vms.VmsAvailableLayers _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.vms.VmsAvailableLayers.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onLayersAvailabilityChanged(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.vms.IVmsSubscriberClient
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
     * A VmsService uses this callback to pass messages to subscribers.
     */
@Override public void onVmsMessageReceived(android.car.vms.VmsLayer layer, byte[] payload) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((layer!=null)) {
_data.writeInt(1);
layer.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeByteArray(payload);
mRemote.transact(Stub.TRANSACTION_onVmsMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onLayersAvailabilityChanged(android.car.vms.VmsAvailableLayers availableLayers) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((availableLayers!=null)) {
_data.writeInt(1);
availableLayers.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onLayersAvailabilityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onVmsMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onLayersAvailabilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * A VmsService uses this callback to pass messages to subscribers.
     */
public void onVmsMessageReceived(android.car.vms.VmsLayer layer, byte[] payload) throws android.os.RemoteException;
public void onLayersAvailabilityChanged(android.car.vms.VmsAvailableLayers availableLayers) throws android.os.RemoteException;
}
