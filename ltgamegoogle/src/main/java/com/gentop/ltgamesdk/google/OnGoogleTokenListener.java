package com.gentop.ltgamesdk.google;

public interface OnGoogleTokenListener {

    void onSuccess(String token);

    void onFailed(String failed);
}
