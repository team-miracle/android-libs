/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.accounts;
public abstract class AbstractAccountAuthenticator
{
public  AbstractAccountAuthenticator(android.content.Context context) { throw new RuntimeException("Stub!"); }
public final  android.os.IBinder getIBinder() { throw new RuntimeException("Stub!"); }
public abstract  android.os.Bundle editProperties(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType);
public abstract  android.os.Bundle addAccount(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle confirmCredentials(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  java.lang.String getAuthTokenLabel(java.lang.String authTokenType);
public abstract  android.os.Bundle updateCredentials(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.accounts.NetworkErrorException;
public abstract  android.os.Bundle hasFeatures(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String[] features) throws android.accounts.NetworkErrorException;
public  android.os.Bundle getAccountRemovalAllowed(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getAccountCredentialsForCloning(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle addAccountFromCredentials(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, android.os.Bundle accountCredentials) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle startAddAccountSession(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType, java.lang.String authTokenType, java.lang.String[] requiredFeatures, android.os.Bundle options) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle startUpdateCredentialsSession(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String authTokenType, android.os.Bundle options) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle finishSession(android.accounts.AccountAuthenticatorResponse response, java.lang.String accountType, android.os.Bundle sessionBundle) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public  android.os.Bundle isCredentialsUpdateSuggested(android.accounts.AccountAuthenticatorResponse response, android.accounts.Account account, java.lang.String statusToken) throws android.accounts.NetworkErrorException { throw new RuntimeException("Stub!"); }
public static final java.lang.String KEY_CUSTOM_TOKEN_EXPIRY = "android.accounts.expiry";
}
