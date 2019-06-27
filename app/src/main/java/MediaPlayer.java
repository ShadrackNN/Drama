import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;

import com.pylanconsultancy.drama.Landing;
import com.pylanconsultancy.drama.R;

public class MediaPlayer extends Landing implements TextureView.SurfaceTextureListener {
    private TextureView myTextureView;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.content_landing);

        myTextureView= findViewById(R.id.adTextureView);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {


    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
