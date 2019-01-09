/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/cluster/renderer/IInstrumentClusterNavigation.aidl
 */
package android.car.cluster.renderer;
/**
 * Binder API for Instrument Cluster Navigation.
 *
 * @hide
 */
public interface IInstrumentClusterNavigation extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.cluster.renderer.IInstrumentClusterNavigation
{
private static final java.lang.String DESCRIPTOR = "android.car.cluster.renderer.IInstrumentClusterNavigation";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.cluster.renderer.IInstrumentClusterNavigation interface,
 * generating a proxy if needed.
 */
public static android.car.cluster.renderer.IInstrumentClusterNavigation asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.cluster.renderer.IInstrumentClusterNavigation))) {
return ((android.car.cluster.renderer.IInstrumentClusterNavigation)iin);
}
return new android.car.cluster.renderer.IInstrumentClusterNavigation.Stub.Proxy(obj);
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
case TRANSACTION_onEvent:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
android.os.Bundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getInstrumentClusterInfo:
{
data.enforceInterface(descriptor);
android.car.navigation.CarNavigationInstrumentCluster _result = this.getInstrumentClusterInfo();
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
private static class Proxy implements android.car.cluster.renderer.IInstrumentClusterNavigation
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
@Override public void onEvent(int eventType, android.os.Bundle bundle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(eventType);
if ((bundle!=null)) {
_data.writeInt(1);
bundle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.car.navigation.CarNavigationInstrumentCluster getInstrumentClusterInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.navigation.CarNavigationInstrumentCluster _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInstrumentClusterInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.navigation.CarNavigationInstrumentCluster.CREATOR.createFromParcel(_reply);
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
static final int TRANSACTION_onEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getInstrumentClusterInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onEvent(int eventType, android.os.Bundle bundle) throws android.os.RemoteException;
public android.car.navigation.CarNavigationInstrumentCluster getInstrumentClusterInfo() throws android.os.RemoteException;
}
