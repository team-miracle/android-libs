/*
* Copyright (C) 2006 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.content;
public interface DialogInterface
{
public static interface OnCancelListener
{
public abstract  void onCancel(android.content.DialogInterface dialog);
}
public static interface OnDismissListener
{
public abstract  void onDismiss(android.content.DialogInterface dialog);
}
public static interface OnShowListener
{
public abstract  void onShow(android.content.DialogInterface dialog);
}
public static interface OnClickListener
{
public abstract  void onClick(android.content.DialogInterface dialog, int which);
}
public static interface OnMultiChoiceClickListener
{
public abstract  void onClick(android.content.DialogInterface dialog, int which, boolean isChecked);
}
public static interface OnKeyListener
{
public abstract  boolean onKey(android.content.DialogInterface dialog, int keyCode, android.view.KeyEvent event);
}
public abstract  void cancel();
public abstract  void dismiss();
@java.lang.Deprecated()
public static final int BUTTON1 = -1;
@java.lang.Deprecated()
public static final int BUTTON2 = -2;
@java.lang.Deprecated()
public static final int BUTTON3 = -3;
public static final int BUTTON_NEGATIVE = -2;
public static final int BUTTON_NEUTRAL = -3;
public static final int BUTTON_POSITIVE = -1;
}
