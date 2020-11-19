package com.example.fingerprintauthentication;

import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.widget.Toast;

public class AuthenticationHandler  extends FingerprintManager.AuthenticationCallback {
    private MainActivity mainActivity;
    public AuthenticationHandler(MainActivity mainActivity){
        this.mainActivity=mainActivity;
    }



    @Override
    public void onAuthenticationError(int errorCode, CharSequence errString) {
        super.onAuthenticationError(errorCode, errString);
        Toast.makeText(mainActivity,"Auth Error:"+ errString,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAuthenticationHelp(int helpCode, CharSequence helpString) {
        super.onAuthenticationHelp(helpCode, helpString);
        Toast.makeText(mainActivity,"Auth Help:"+helpString,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        super.onAuthenticationSucceeded(result);
        Toast.makeText(mainActivity,"Auth Suceeded:",Toast.LENGTH_SHORT).show();
        resul(1);


    }

    @Override
    public void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        Toast.makeText(mainActivity,"Auth Failed:",Toast.LENGTH_SHORT).show();
    }

    private void resul(int a)
    {
       Intent intent=new Intent(mainActivity,Main2Activity.class);
       mainActivity.startActivity(intent);

    }
}
