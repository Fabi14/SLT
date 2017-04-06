package com.example.fisch.slt;

import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

public class Krafttraining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krafttraining);

       TextView textInArbeit = (TextView) findViewById(R.id.textViewKrafttraining);
        textInArbeit.setText("Aktivität Krafttraning in Arbeit");

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("https://www.youtube.com/embed/TU7OLAUcBX4"));

    }
}
