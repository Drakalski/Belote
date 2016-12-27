package com.belote.belote;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);


        Button singleButton = (Button) findViewById(R.id.btnSingle);
        Button tournamentButton = (Button) findViewById(R.id.btnTournament);


        singleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    clickSingle();
            }


        });

        tournamentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickTourn();
            }
        });
     }

    private void clickSingle(){
        Intent intent = new Intent(this, singlegame.class);

        startActivity(intent);
    }

    private void clickTourn(){
        Intent intent = new Intent(this, tournamentgame.class);

        startActivity(intent);
    }

}
