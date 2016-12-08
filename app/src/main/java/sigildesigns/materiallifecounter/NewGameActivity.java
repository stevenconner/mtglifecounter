package sigildesigns.materiallifecounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewGameActivity extends AppCompatActivity {

    // Spinner to change the amount of players
    private Spinner mPlayersSpinner;

    // Number of players
    private int mPlayers = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.start_game_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewGameActivity.this, TwoPlayerActivity.class);
                startActivity(intent);
            }
        });

        // Find all relevant views that we will need to read user input from
        mPlayersSpinner = (Spinner) findViewById(R.id.spinner_players);

        // Set up the spinner
        setupSpinner();
    }

    /**
     * Setup the dropdown spinner that allows the user to select the amount of players.
     */
    private void setupSpinner() {
        // Create adapter for spinner. The list options are from the String array it will use
        // the default layout.
        ArrayAdapter playersSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array
                .array_player_options, android.R.layout.simple_spinner_item);

        // Specify dropdown layout style - siple list view with 1 item per line.
        playersSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        // Apply the adapter to the spinner
        mPlayersSpinner.setAdapter(playersSpinnerAdapter);

        // Set the integer mPlayers to the amount of players, currently defaults to 2
        mPlayersSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = (String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    mPlayers = 2;
                } else if (selection.equals(getString(R.string.players_two))) {
                    mPlayers = 2;
                }
            }
            // Because AdapterView is an abstract class, onNothingSelected must be defined.
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                mPlayers = 2;
            }
        });

    }
}
