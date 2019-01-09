/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentTokenRequestDelegate.aidl
 */
package android.car.trust;
/**
 * Delegate interface for escrow token exchange request.
 *
 * TrustAgentService uses async pattern and we therefore divide the
 * request and response into two separate AIDL interfaces.
 *
 * CarBleTrustAgent would implement this interface and set itself as a delegate.
 *
 * @hide
 */
public interface ICarTrustAgentTokenRequestDelegate extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentTokenRequestDelegate
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentTokenRequestDelegate";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentTokenRequestDelegate interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentTokenRequestDelegate asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentTokenRequestDelegate))) {
return ((android.car.trust.ICarTrustAgentTokenRequestDelegate)iin);
}
return new android.car.trust.ICarTrustAgentTokenRequestDelegate.Stub.Proxy(obj);
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
case TRANSACTION_revokeTrust:
{
data.enforceInterface(descriptor);
this.revokeTrust();
reply.writeNoException();
return true;
}
case TRANSACTION_addEscrowToken:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
this.addEscrowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeEscrowToken:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.removeEscrowToken(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isEscrowTokenActive:
{
data.enforceInterface(descriptor);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.isEscrowTokenActive(_arg0, _arg1);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentTokenRequestDelegate
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
/** Called to revoke trust */
@Override public void revokeTrust() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_revokeTrust, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called to add escrow token for foreground user */
@Override public void addEscrowToken(byte[] token, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_addEscrowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called to remove escrow token for foreground user */
@Override public void removeEscrowToken(long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_removeEscrowToken, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Called to query if the foreground user has active escrow token */
@Override public void isEscrowTokenActive(long handle, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(handle);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_isEscrowTokenActive, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_revokeTrust = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_addEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_removeEscrowToken = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isEscrowTokenActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/** Called to revoke trust */
public void revokeTrust() throws android.os.RemoteException;
/** Called to add escrow token for foreground user */
public void addEscrowToken(byte[] token, int uid) throws android.os.RemoteException;
/** Called to remove escrow token for foreground user */
public void removeEscrowToken(long handle, int uid) throws android.os.RemoteException;
/** Called to query if the foreground user has active escrow token */
public void isEscrowTokenActive(long handle, int uid) throws android.os.RemoteException;
}
