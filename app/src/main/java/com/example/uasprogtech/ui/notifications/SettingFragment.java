package com.example.uasprogtech.ui.notifications;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.uasprogtech.Info;
import com.example.uasprogtech.MainActivity;
import com.example.uasprogtech.R;

public class SettingFragment extends Fragment  {
Button info,play,stop;
MediaPlayer sound;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        play = (Button) view.findViewById(R.id.play);
        info = (Button) view.findViewById(R.id.info);
        stop = (Button) view.findViewById(R.id.stop);


        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.song2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sound.setLooping(true);
                sound.start();


            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sound.isPlaying()){
                    sound.pause();

                }
            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Info.class));
            }
        });




return view;

    }






}
