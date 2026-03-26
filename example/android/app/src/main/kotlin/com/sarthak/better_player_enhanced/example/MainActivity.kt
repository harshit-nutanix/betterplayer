package com.sarthak.better_player_enhanced.example

import android.app.PictureInPictureUiState
import android.os.Build
import androidx.annotation.RequiresApi
import com.sarthak.better_player_enhanced.BetterPlayerPlugin
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onPictureInPictureUiStateChanged(pipState: PictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pipState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            BetterPlayerPlugin.handlePictureInPictureUiStateChanged(pipState.isStashed)
        }
    }
}
