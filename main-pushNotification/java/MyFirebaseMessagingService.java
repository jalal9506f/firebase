package com.example.jalalhassane.pushnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by jalal.hassane on 2/14/2019.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService{
    private static final String TAG = MyFirebaseMessagingService.class.getSimpleName();
    private  Context context;
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
//        boolean isOpen=PrefUtils.getBoolean(getApplicationContext(),"isOpen",false);
//        System.out.println(remoteMessage.getNotification().getBody());
//        remoteMessage.getNotification().toString();
//        sendNotifications();
//      if(remoteMessage.getMessageType()==null)
//           sendNotifications();

        System.out.println("Enter");
        sendNotifications();

      // RemoteMessage.Notification notification=remoteMessage.getNotification();
      // if(notification.toString().equals(""))
      //     sendNotifications("myTitle","body");
      // else
      //     sendNotifications("myTitle","body");

        // TODO: Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated.
     //  if (isOpen){
     //      // App is running
     //      Intent notificationIntent= new Intent(getApplicationContext(),MainActivity.class);
     //      PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),0,notificationIntent,0);
     //      NotificationCompat.Builder builder= new NotificationCompat.Builder(getApplicationContext())
     //              .setSmallIcon(R.mipmap.ic_launcher)
     //              .setContentTitle("This tfdsf")
     //              .setContentIntent(pendingIntent)
     //              .setContentText("message")
     //              .setAutoCancel(true)
     //              .setDefaults(Notification.DEFAULT_SOUND);

     //      Notification notification = builder.build();
     //      NotificationManager mNotificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
     //      mNotificationManager.notify(0, notification);
     //  }else{
     //      // App is not running
     //      Intent notificationIntent= new Intent(getApplicationContext(),MainActivity.class);
     //      PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),0,notificationIntent,0);
     //      NotificationCompat.Builder builder= new NotificationCompat.Builder(getApplicationContext())
     //              .setSmallIcon(R.mipmap.ic_launcher)
     //              .setContentTitle("This tfdsf")
     //              .setContentIntent(pendingIntent)
     //              .setContentText("message")
     //              .setAutoCancel(true)
     //              .setDefaults(Notification.DEFAULT_SOUND);

     //      Notification notification = builder.build();
     //      NotificationManager mNotificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
     //      mNotificationManager.notify(0, notification);
     //  }

    }

public void sendNotifications(){

    Intent notificationIntent= new Intent(getApplicationContext(),MainActivity.class);
    notificationIntent.putExtra("data","My name is Jalal");
    PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),0,notificationIntent,0);
    NotificationCompat.Builder builder= new NotificationCompat.Builder(getApplicationContext())
            .setSmallIcon(R.mipmap.high)
            .setContentTitle("title")
            .setContentIntent(pendingIntent)
            .setContentText("body")
            .setAutoCancel(true);

    Notification notification = builder.build();
    notification.sound = Uri.parse("android.resource://"
            + getBaseContext().getPackageName() + "/" + R.raw.estornudo);// R.raw est l
    NotificationManager mNotificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
    mNotificationManager.notify(0, notification);

}


}
