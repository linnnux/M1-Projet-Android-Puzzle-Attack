package com.puzzleAttack;

import com.puzzleAttack.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class PuzzleAttack extends Activity
{

    private PuzzleAttackView puzzAttView;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        puzzAttView = (PuzzleAttackView)findViewById(R.id.PuzzleAttackView);

        puzzAttView.setVisibility(View.VISIBLE);
    }
    
    public void onResume()
    {
    	super.onResume();
        puzzAttView.onResume();
    }

    public void onPause()
    {
    	super.onPause();
        puzzAttView.onPause();
    }
}