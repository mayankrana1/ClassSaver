package com.example.comp.timetableapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

/**
 * Created by Mayank on 13-10-2017.
 */

public class VibrateMode extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        AudioManager audio_mngr = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        audio_mngr.setRingerMode(AudioManager.RINGER_MODE_SILENT);

    }
}
