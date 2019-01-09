/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentTokenResponseCallback.aidl
 */
package android.car.trust;
/**
 * Callback interface for escrow token exchange response.
 *
 * TrustAgentService uses async pattern and we therefore divide the
 * request and response into two separate AIDL interfaces.
 *
 * @hide
 */
public interface ICarTrustAgentTokenResponseCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentTokenResponseCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentTokenResponseCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentTokenResponseCallback interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentTokenResponseCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentTokenResponseCallback))) {
return ((android.car.trust.ICarTrustAgentTokenResponseCallback)iin);
}
return new android.car.trust.ICarTrustAgentTokenResponseCallback.Stub.Proxy(obj);
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
case TRANSACTION_onEscrowTokenAdded:
{
data.enforceInterface(descriptor);
byte[] _arg0;
int _arg0_length = data.readInt();
if ((_arg0_length<0)) {
_arg0 = null;
}
else {
_arg0 = new byte[_arg0_length];
}
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.onEscrowTokenAdded(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeByteArray(_arg0);
return true;
}
case TRANSACTION_onEscrowTokenRemoved:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onEscrowTokenRemoved(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onEscrowTokenActiveStateChanged:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onEscrowTokenActiveStateChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentTokenResponseCallback
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
/** Called after escrow token is added for foreground user */
@Override public void onEscrowTokenAdded(byte[] token, long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((token==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(token.length);
}
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_onEscrowTokenAdded, _data, _reply, 0);
_reply.readException();
_reply.readByteArray(token);
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called after escrow token is removed for foreground user */
@Override public void onEscrowTokenRemoved(long handle, boolean successful) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(((successful)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEscrowTokenRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called after escrow token active state is changed for foreground user */
@Override public void onEscrowTokenActiveStateChanged(long handle, boolean active) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(((active)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onEscrowTokenActiveStateChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onEscrowTokenAdded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onEscrowTokenRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onEscrowTokenActiveStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/** Called after escrow token is added for foreground user */
public void onEscrowTokenAdded(byte[] token, long handle, int uid) throws android.os.RemoteException;
/** Called after escrow token is removed for foreground user */
public void onEscrowTokenRemoved(long handle, boolean successful) throws android.os.RemoteException;
/** Called after escrow token active state is changed for foreground user */
public void onEscrowTokenActiveStateChanged(long handle, boolean active) throws android.os.RemoteException;
}
