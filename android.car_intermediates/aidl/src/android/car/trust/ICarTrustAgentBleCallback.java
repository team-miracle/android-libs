/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentBleCallback.aidl
 */
package android.car.trust;
/**
 * Callback interface for BLE connection state changes.
 *
 * @hide
 */
public interface ICarTrustAgentBleCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentBleCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentBleCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentBleCallback interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentBleCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentBleCallback))) {
return ((android.car.trust.ICarTrustAgentBleCallback)iin);
}
return new android.car.trust.ICarTrustAgentBleCallback.Stub.Proxy(obj);
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
case TRANSACTION_onBleServerStartSuccess:
{
data.enforceInterface(descriptor);
this.onBleServerStartSuccess();
return true;
}
case TRANSACTION_onBleServerStartFailure:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.onBleServerStartFailure(_arg0);
return true;
}
case TRANSACTION_onBleDeviceConnected:
{
data.enforceInterface(descriptor);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onBleDeviceConnected(_arg0);
return true;
}
case TRANSACTION_onBleDeviceDisconnected:
{
data.enforceInterface(descriptor);
android.bluetooth.BluetoothDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onBleDeviceDisconnected(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentBleCallback
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
     * Called when the GATT server is started and BLE is successfully advertising.
     */
@Override public void onBleServerStartSuccess() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onBleServerStartSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when the BLE advertisement fails to start.
     * see AdvertiseCallback#ADVERTISE_FAILED_* for possible error codes.
     */
@Override public void onBleServerStartFailure(int errorCode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
mRemote.transact(Stub.TRANSACTION_onBleServerStartFailure, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a device is connected.
     */
@Override public void onBleDeviceConnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onBleDeviceConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a device is disconnected.
     */
@Override public void onBleDeviceDisconnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onBleDeviceDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onBleServerStartSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onBleServerStartFailure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onBleDeviceConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onBleDeviceDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Called when the GATT server is started and BLE is successfully advertising.
     */
public void onBleServerStartSuccess() throws android.os.RemoteException;
/**
     * Called when the BLE advertisement fails to start.
     * see AdvertiseCallback#ADVERTISE_FAILED_* for possible error codes.
     */
public void onBleServerStartFailure(int errorCode) throws android.os.RemoteException;
/**
     * Called when a device is connected.
     */
public void onBleDeviceConnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
/**
     * Called when a device is disconnected.
     */
public void onBleDeviceDisconnected(android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
}
