/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/cluster/renderer/IInstrumentCluster.aidl
 */
package android.car.cluster.renderer;
/**
 * Binder API for Instrument Cluster.
 *
 * @hide
 */
public interface IInstrumentCluster extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.cluster.renderer.IInstrumentCluster
{
private static final java.lang.String DESCRIPTOR = "android.car.cluster.renderer.IInstrumentCluster";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.cluster.renderer.IInstrumentCluster interface,
 * generating a proxy if needed.
 */
public static android.car.cluster.renderer.IInstrumentCluster asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.cluster.renderer.IInstrumentCluster))) {
return ((android.car.cluster.renderer.IInstrumentCluster)iin);
}
return new android.car.cluster.renderer.IInstrumentCluster.Stub.Proxy(obj);
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
case TRANSACTION_getNavigationService:
{
data.enforceInterface(descriptor);
android.car.cluster.renderer.IInstrumentClusterNavigation _result = this.getNavigationService();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_setNavigationContextOwner:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.setNavigationContextOwner(_arg0, _arg1);
return true;
}
case TRANSACTION_onKeyEvent:
{
data.enforceInterface(descriptor);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onKeyEvent(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.cluster.renderer.IInstrumentCluster
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
/** Returns {@link IInstrumentClusterNavigation} that will be passed to the Nav app */
@Override public android.car.cluster.renderer.IInstrumentClusterNavigation getNavigationService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.cluster.renderer.IInstrumentClusterNavigation _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNavigationService, _data, _reply, 0);
_reply.readException();
_result = android.car.cluster.renderer.IInstrumentClusterNavigation.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** Supplies Instrument Cluster Renderer with current owner of Navigation app context */
@Override public void setNavigationContextOwner(int uid, int pid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
_data.writeInt(pid);
mRemote.transact(Stub.TRANSACTION_setNavigationContextOwner, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/** Called when key event that was addressed to instrument cluster display has been received. */
@Override public void onKeyEvent(android.view.KeyEvent keyEvent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((keyEvent!=null)) {
_data.writeInt(1);
keyEvent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onKeyEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getNavigationService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setNavigationContextOwner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onKeyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/** Returns {@link IInstrumentClusterNavigation} that will be passed to the Nav app */
public android.car.cluster.renderer.IInstrumentClusterNavigation getNavigationService() throws android.os.RemoteException;
/** Supplies Instrument Cluster Renderer with current owner of Navigation app context */
public void setNavigationContextOwner(int uid, int pid) throws android.os.RemoteException;
/** Called when key event that was addressed to instrument cluster display has been received. */
public void onKeyEvent(android.view.KeyEvent keyEvent) throws android.os.RemoteException;
}
