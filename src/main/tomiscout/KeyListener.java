package main.tomiscout;
import com.melloware.jintellitype.IntellitypeListener;
import com.melloware.jintellitype.JIntellitype;

import main.tomiscout.player.FXMediaPlayer;

public class KeyListener implements IntellitypeListener{
	
	public KeyListener(){
		
		//Global hotkeys
		JIntellitype.getInstance().addIntellitypeListener(this);
		
	}

	// listen for hotkey
		public void onIntellitype(int aIdentifier) {
			if(aIdentifier == JIntellitype.APPCOMMAND_MEDIA_PLAY_PAUSE){
				FXMediaPlayer.togglePlay();
			}
		}
}
