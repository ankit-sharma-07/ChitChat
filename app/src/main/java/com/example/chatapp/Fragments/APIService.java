package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAefmdj8s:APA91bEHQ93yCFQnuiFM6agG9AfbJ9u_SFvoCgoEVz-dmNxwjRpKFYxVoKa5kb8hOpm37_srbcPFKOYyOJzV5ERIIppcThnFZXWRLBTUFTqwrB7z_rhlFMR6YZaJkRFXRhrRMxCb4IYA"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
