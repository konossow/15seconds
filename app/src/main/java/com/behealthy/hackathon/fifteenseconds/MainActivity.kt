package com.behealthy.hackathon.fifteenseconds

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.RingtoneManager
import android.media.Ringtone
import android.net.Uri
import android.os.Build
import android.os.Vibrator
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            getSupportActionBar()?.setDisplayShowHomeEnabled(true)
            getSupportActionBar()?.setLogo(R.mipmap.ic_launcher)
            getSupportActionBar()?.setDisplayUseLogoEnabled(true)
        textView.text = getString(R.string.welcome_messege_0)
    }

    fun goToExercises(view: View){
        val exercisesIntent = Intent(this, ExercisesActivity::class.java)
        startActivity(exercisesIntent)
    }

    fun goToCalendar(view: View){
        val calendarIntent = Intent(this, CalendarActivity::class.java)
        startActivity(calendarIntent)
    }

    fun goToShowoff(view: View){
        val showoffIntent = Intent(this, ShowoffActivity::class.java)
        startActivity(showoffIntent)
    }

    fun goToSettings(view: View){
        val settingsIntent = Intent(this, SettingsActivity::class.java)
        startActivity(settingsIntent)
    }

    fun testbtn(view: View){
//        val notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
//        val r = RingtoneManager.getRingtone(applicationContext, notification)
//        r.play()
        val mp = MediaPlayer.create(this, R.raw.crab_rave)
       // val vib = Vibrator().vibrate()
        val intent = Intent(this, ShowoffActivity::class.java)
        intent.putExtra("startWorkout", true)
        val pIntent = PendingIntent.getActivity(this, 0, intent, 0)
        //NotificationChannel()
        val channelID = "CHANNEL_ID"
        val notificationID = 1
        val notificationBuilder = NotificationCompat.Builder(this, channelID)
            .setContentTitle("Notification Demo")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentIntent(pIntent)
            .setContentText("You have got notification.")
            .setSound(Uri.parse("android.resource://com.behealthy.hackathon.fifteenseconds/" + R.raw.crab_rave))
            .setVibrate(longArrayOf(0, 15000))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Channel's name"
            val description = "Channel's description"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(channelID, name, importance)
            channel.description = description

            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager?.createNotificationChannel(channel)
            notificationManager.notify(notificationID, notificationBuilder.build())
        }
        else{
            val notificationManagerCompat = NotificationManagerCompat.from(this)
            notificationManagerCompat.notify(notificationID, notificationBuilder.build())
        }
//        var builder = NotificationCompat.Builder(this, "channelId")
//            .setSmallIcon(R.drawable.ic_launcher_background)
//            .setContentTitle("Test")
//            .setContentText("test")
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        //add sound
        //val uri = RingtoneManager.getDefaultUri(RingtoneManager.);
        //notificationBuilder
        //vibrate
        //notificationBuilder
        //(getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager).notify(1, notificationBuilder.build())

    }
}
