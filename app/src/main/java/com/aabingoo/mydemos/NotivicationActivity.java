package com.aabingoo.mydemos;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotivicationActivity extends AppCompatActivity {

    private NotificationManager mNotificationManager;

    private String mChannelNoneId = "channel_none_id";
    private String mChannelMinId = "channel_Min_id";
    private String mChannelChatId = "channel_chat_id";
    private String mChannelDownloadId = "channel_download_id";
    private String mChannelPushId = "channel_push_id";

    private String mChannelNoneName = "none name";
    private String mChannelMinName = "min name";
    private String mChannelChatName = "聊天";
    private String mChannelDownloadName = "下载";
    private String mChannelPushName = "推送";

    private String mChannelNoneDesc = "none desc";
    private String mChannelMinDesc = "min desc";
    private String mChannelChatDesc = "聊天详情";
    private String mChannelDownloadDesc = "下载详情";
    private String mChannelPushDesc = "推送详情";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notivication);

        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        setUpNotificationChannel();

        findViewById(R.id.none_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyNone();
            }
        });

        findViewById(R.id.min_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyMin();
            }
        });

        findViewById(R.id.chat_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyChat();
            }
        });

        findViewById(R.id.download_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyDownload();
            }
        });

        findViewById(R.id.push_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyPush();
            }
        });
    }

    private void setUpNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(mChannelNoneId, mChannelNoneName, NotificationManager.IMPORTANCE_NONE);
        notificationChannel.setDescription(mChannelNoneDesc);
        mNotificationManager.createNotificationChannel(notificationChannel);

        notificationChannel = new NotificationChannel(mChannelMinId, mChannelMinName, NotificationManager.IMPORTANCE_MIN);
        notificationChannel.setDescription(mChannelMinDesc);
        mNotificationManager.createNotificationChannel(notificationChannel);

        notificationChannel = new NotificationChannel(mChannelChatId, mChannelChatName, NotificationManager.IMPORTANCE_LOW);
        notificationChannel.setDescription(mChannelChatDesc);
        mNotificationManager.createNotificationChannel(notificationChannel);

        notificationChannel = new NotificationChannel(mChannelDownloadId, mChannelDownloadName, NotificationManager.IMPORTANCE_DEFAULT);
        notificationChannel.setDescription(mChannelDownloadDesc);
        mNotificationManager.createNotificationChannel(notificationChannel);

        notificationChannel = new NotificationChannel(mChannelPushId, mChannelPushName, NotificationManager.IMPORTANCE_HIGH);
        notificationChannel.setDescription(mChannelPushDesc);
        mNotificationManager.createNotificationChannel(notificationChannel);
    }

    private void notifyNone() {
        Notification notification = new NotificationCompat.Builder(this, mChannelNoneId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("none title")
                .setContentText("none text")
                .build();
        mNotificationManager.notify(1, notification);
    }

    private void notifyMin() {
        Notification notification = new NotificationCompat.Builder(this, mChannelMinId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("min title")
                .setContentText("min text")
                .build();
        mNotificationManager.notify(2, notification);
    }

    private void notifyChat() {
        Notification notification = new NotificationCompat.Builder(this, mChannelChatId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("chat title")
                .setContentText("chat text")
                .build();
        mNotificationManager.notify(3, notification);
    }

    private void notifyDownload() {
        Notification notification = new NotificationCompat.Builder(this, mChannelDownloadId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("download title")
                .setContentText("download text")
                .build();
        mNotificationManager.notify(4, notification);
    }

    private void notifyPush() {
        Notification notification = new NotificationCompat.Builder(this, mChannelPushId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("push title")
                .setContentText("push text")
                .build();
        mNotificationManager.notify(3, notification);
    }


}
