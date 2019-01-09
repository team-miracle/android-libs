/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarProjection.aidl
 */
package android.car;
/**
 * Binder interface for {@link android.car.CarProjectionManager}.
 * Check {@link android.car.CarProjectionManager} APIs for expected behavior of each calls.
 *
 * @hide
 */
public interface ICarProjection extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarProjection
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarProjection";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarProjection interface,
 * generating a proxy if needed.
 */
public static android.car.ICarProjection asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarProjection))) {
return ((android.car.ICarProjection)iin);
}
return new android.car.ICarProjection.Stub.Proxy(obj);
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
case TRANSACTION_registerProjectionRunner:
{
data.enforceInterface(descriptor);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.registerProjectionRunner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterProjectionRunner:
{
data.enforceInterface(descriptor);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.unregisterProjectionRunner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerProjectionListener:
{
data.enforceInterface(descriptor);
android.car.ICarProjectionCallback _arg0;
_arg0 = android.car.ICarProjectionCallback.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.registerProjectionListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterProjectionListener:
{
data.enforceInterface(descriptor);
android.car.ICarProjectionCallback _arg0;
_arg0 = android.car.ICarProjectionCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterProjectionListener(_arg0);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarProjection
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
     * Registers projection runner on projection start with projection service
     * to create reverse binding.
     */
@Override public void registerProjectionRunner(android.content.Intent serviceIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((serviceIntent!=null)) {
_data.writeInt(1);
serviceIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registerProjectionRunner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregisters projection runner on projection stop with projection service to create
     * reverse binding.
     */
@Override public void unregisterProjectionRunner(android.content.Intent serviceIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((serviceIntent!=null)) {
_data.writeInt(1);
serviceIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unregisterProjectionRunner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Registers projection callback.
     * Re-registering same callback with different filter will cause only filter to update.
     */
@Override public void registerProjectionListener(android.car.ICarProjectionCallback callback, int filter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(filter);
mRemote.transact(Stub.TRANSACTION_registerProjectionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Unregisters projection callback.
     */
@Override public void unregisterProjectionListener(android.car.ICarProjectionCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterProjectionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerProjectionRunner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterProjectionRunner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registerProjectionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_unregisterProjectionListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Registers projection runner on projection start with projection service
     * to create reverse binding.
     */
public void registerProjectionRunner(android.content.Intent serviceIntent) throws android.os.RemoteException;
/**
     * Unregisters projection runner on projection stop with projection service to create
     * reverse binding.
     */
public void unregisterProjectionRunner(android.content.Intent serviceIntent) throws android.os.RemoteException;
/**
     * Registers projection callback.
     * Re-registering same callback with different filter will cause only filter to update.
     */
public void registerProjectionListener(android.car.ICarProjectionCallback callback, int filter) throws android.os.RemoteException;
/**
     * Unregisters projection callback.
     */
public void unregisterProjectionListener(android.car.ICarProjectionCallback callback) throws android.os.RemoteException;
}
