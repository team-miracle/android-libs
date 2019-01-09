/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/packages/SystemUI/shared/src/com/android/systemui/shared/recents/ISystemUiProxy.aidl
 */
package com.android.systemui.shared.recents;
/**
 * Temporary callbacks into SystemUI.
 */
public interface ISystemUiProxy extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.systemui.shared.recents.ISystemUiProxy
{
private static final java.lang.String DESCRIPTOR = "com.android.systemui.shared.recents.ISystemUiProxy";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.systemui.shared.recents.ISystemUiProxy interface,
 * generating a proxy if needed.
 */
public static com.android.systemui.shared.recents.ISystemUiProxy asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.systemui.shared.recents.ISystemUiProxy))) {
return ((com.android.systemui.shared.recents.ISystemUiProxy)iin);
}
return new com.android.systemui.shared.recents.ISystemUiProxy.Stub.Proxy(obj);
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
case TRANSACTION_screenshot:
{
data.enforceInterface(descriptor);
android.graphics.Rect _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
boolean _arg5;
_arg5 = (0!=data.readInt());
int _arg6;
_arg6 = data.readInt();
com.android.systemui.shared.system.GraphicBufferCompat _result = this.screenshot(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
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
case TRANSACTION_startScreenPinning:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.startScreenPinning(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setInteractionState:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.setInteractionState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onSplitScreenInvoked:
{
data.enforceInterface(descriptor);
this.onSplitScreenInvoked();
reply.writeNoException();
return true;
}
case TRANSACTION_onOverviewShown:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onOverviewShown(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds:
{
data.enforceInterface(descriptor);
android.graphics.Rect _result = this.getNonMinimizedSplitScreenSecondaryBounds();
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
case TRANSACTION_setBackButtonAlpha:
{
data.enforceInterface(descriptor);
float _arg0;
_arg0 = data.readFloat();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setBackButtonAlpha(_arg0, _arg1);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.android.systemui.shared.recents.ISystemUiProxy
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
     * Proxies SurfaceControl.screenshotToBuffer().
     */
@Override public com.android.systemui.shared.system.GraphicBufferCompat screenshot(android.graphics.Rect sourceCrop, int width, int height, int minLayer, int maxLayer, boolean useIdentityTransform, int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.systemui.shared.system.GraphicBufferCompat _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((sourceCrop!=null)) {
_data.writeInt(1);
sourceCrop.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(minLayer);
_data.writeInt(maxLayer);
_data.writeInt(((useIdentityTransform)?(1):(0)));
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_screenshot, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.systemui.shared.system.GraphicBufferCompat.CREATOR.createFromParcel(_reply);
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
/**
     * Begins screen pinning on the provided {@param taskId}.
     */
@Override public void startScreenPinning(int taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(taskId);
mRemote.transact(Stub.TRANSACTION_startScreenPinning, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enables/disables launcher/overview interaction features {@link InteractionType}.
     */
@Override public void setInteractionState(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setInteractionState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies SystemUI that split screen has been invoked.
     */
@Override public void onSplitScreenInvoked() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onSplitScreenInvoked, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies SystemUI that Overview is shown.
     */
@Override public void onOverviewShown(boolean fromHome) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((fromHome)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onOverviewShown, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the secondary split screen app's rectangle when not minimized.
     */
@Override public android.graphics.Rect getNonMinimizedSplitScreenSecondaryBounds() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.graphics.Rect _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.graphics.Rect.CREATOR.createFromParcel(_reply);
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
/**
     * Control the {@param alpha} of the back button in the navigation bar and {@param animate} if
     * needed from current value
     */
@Override public void setBackButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeFloat(alpha);
_data.writeInt(((animate)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setBackButtonAlpha, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_screenshot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startScreenPinning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setInteractionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onSplitScreenInvoked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onOverviewShown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getNonMinimizedSplitScreenSecondaryBounds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_setBackButtonAlpha = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
/**
     * Proxies SurfaceControl.screenshotToBuffer().
     */
public com.android.systemui.shared.system.GraphicBufferCompat screenshot(android.graphics.Rect sourceCrop, int width, int height, int minLayer, int maxLayer, boolean useIdentityTransform, int rotation) throws android.os.RemoteException;
/**
     * Begins screen pinning on the provided {@param taskId}.
     */
public void startScreenPinning(int taskId) throws android.os.RemoteException;
/**
     * Enables/disables launcher/overview interaction features {@link InteractionType}.
     */
public void setInteractionState(int flags) throws android.os.RemoteException;
/**
     * Notifies SystemUI that split screen has been invoked.
     */
public void onSplitScreenInvoked() throws android.os.RemoteException;
/**
     * Notifies SystemUI that Overview is shown.
     */
public void onOverviewShown(boolean fromHome) throws android.os.RemoteException;
/**
     * Get the secondary split screen app's rectangle when not minimized.
     */
public android.graphics.Rect getNonMinimizedSplitScreenSecondaryBounds() throws android.os.RemoteException;
/**
     * Control the {@param alpha} of the back button in the navigation bar and {@param animate} if
     * needed from current value
     */
public void setBackButtonAlpha(float alpha, boolean animate) throws android.os.RemoteException;
}
