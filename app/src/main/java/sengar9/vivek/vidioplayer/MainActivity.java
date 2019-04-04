package sengar9.vivek.vidioplayer;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(R.layout.activity_main);
        VideoView videoView =findViewById(R.id.videoView);
        String path = "android.resource://" +getPackageName() + "/" + R.raw.mp4;
        videoView.setVideoURI(Uri.parse(path));
        MediaController mediaController = new MediaController(this);
        mediaController.setMediaPlayer(videoView);
        
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
    }
}
