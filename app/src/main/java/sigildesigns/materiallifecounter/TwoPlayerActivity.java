package sigildesigns.materiallifecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoPlayerActivity extends AppCompatActivity {

    private Button player1MinusOneHealth;
    private Button player1MinusFiveHealth;
    private TextView player1HealthView;
    private Button player1PlusOneHealth;
    private Button player1PlusFiveHealth;
    private Button player1MinusEnergy;
    private TextView player1EnergyView;
    private Button player1PlusEnergy;
    private Button player1MinusPoison;
    private TextView player1PoisonView;
    private Button player1PlusPoison;
    private Button player2MinusOneHealth;
    private Button player2MinusFiveHealth;
    private TextView player2HealthView;
    private Button player2PlusOneHealth;
    private Button player2PlusFiveHealth;
    private Button player2MinusEnergy;
    private TextView player2EnergyView;
    private Button player2PlusEnergy;
    private Button player2MinusPoison;
    private TextView player2PoisonView;
    private Button player2PlusPoison;

    // Variables for tracking player health, energy, and poison
    private int healthPlayer1 = 20;
    private int healthPlayer2 = 20;
    private int poisonPlayer1 = 0;
    private int poisonPlayer2 = 0;
    private int energyPlayer1 = 0;
    private int energyPlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        // Store the views and buttons in variables.
        Button player1MinusOneHealth = (Button) findViewById(R.id.two_player_p1_minus_onehealth);
        Button player1MinusFiveHealth = (Button) findViewById(R.id.two_player_p1_minus_fivehealth);

        Button player1PlusOneHealth = (Button) findViewById(R.id.two_player_p1_plus_onehealth);
        Button player1PlusFiveHealth = (Button) findViewById(R.id.two_player_p1_plus_fivehealth);
        Button player1MinusEnergy = (Button) findViewById(R.id.two_player_p1_minus_energy);
        TextView player1EnergyView = (TextView) findViewById(R.id.two_player_p1_energy);
        Button player1PlusEnergy = (Button) findViewById(R.id.two_player_p1_plus_energy);
        Button player1MinusPoison = (Button) findViewById(R.id.two_player_p1_minus_poison);
        TextView player1PoisonView = (TextView) findViewById(R.id.two_player_p1_poison);
        Button player1PlusPoison = (Button) findViewById(R.id.two_player_p1_plus_poison);
        Button player2MinusOneHealth = (Button) findViewById(R.id.two_player_p2_minus_onehealth);
        Button player2MinusFiveHealth = (Button) findViewById(R.id.two_player_p2_minus_fivehealth);
        TextView player2HealthView = (TextView) findViewById(R.id.two_player_p2_health);
        Button player2PlusOneHealth = (Button) findViewById(R.id.two_player_p2_plus_onehealth);
        Button player2PlusFiveHealth = (Button) findViewById(R.id.two_player_p2_plus_fivehealth);
        Button player2MinusEnergy = (Button) findViewById(R.id.two_player_p2_minus_energy);
        TextView player2EnergyView = (TextView) findViewById(R.id.two_player_p2_energy);
        Button player2PlusEnergy = (Button) findViewById(R.id.two_player_p2_plus_energy);
        Button player2MinusPoison = (Button) findViewById(R.id.two_player_p2_minus_poison);
        TextView player2PoisonView = (TextView) findViewById(R.id.two_player_p2_poison);
        Button player2PlusPoison = (Button) findViewById(R.id.two_player_p2_plus_poison);

        // OnClickListeners for buttons
        player1MinusOneHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer1 = healthPlayer1 - 1;
                refreshPlayer1Health();
            }
        });
        player1MinusFiveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer1 = healthPlayer1 - 5;
                refreshPlayer1Health();
            }
        });

        player1PlusOneHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer1 = healthPlayer1 + 1;
                refreshPlayer1Health();
            }
        });

        player1PlusFiveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer1 = healthPlayer1 + 5;
                refreshPlayer1Health();
            }
        });

        player1MinusEnergy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                energyPlayer1 = energyPlayer1 - 1;
                refreshPlayer1Energy();
            }
        });

        player1PlusEnergy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                energyPlayer1 = energyPlayer1 + 1;
                refreshPlayer1Energy();
            }
        });

        player1MinusPoison.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                poisonPlayer1 = poisonPlayer1 - 1;
                refreshPlayer1Poison();
            }
        });

        player1PlusPoison.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                poisonPlayer1 = poisonPlayer1 + 1;
                refreshPlayer1Poison();
            }
        });

        player2MinusOneHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer2 = healthPlayer2 - 1;
                refreshPlayer2Health();
            }
        });
        player2MinusFiveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer2 = healthPlayer2 - 5;
                refreshPlayer2Health();
            }
        });

        player2PlusOneHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer2 = healthPlayer2 + 1;
                refreshPlayer2Health();
            }
        });

        player2PlusFiveHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                healthPlayer2 = healthPlayer2 + 5;
                refreshPlayer2Health();
            }
        });

        player2MinusEnergy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                energyPlayer2 = energyPlayer2 - 1;
                refreshPlayer2Energy();
            }
        });

        player2PlusEnergy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                energyPlayer2 = energyPlayer2 + 1;
                refreshPlayer2Energy();
            }
        });

        player2MinusPoison.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                poisonPlayer2 = poisonPlayer2 - 1;
                refreshPlayer2Poison();
            }
        });

        player2PlusPoison.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                poisonPlayer2 = poisonPlayer2 + 1;
                refreshPlayer2Poison();
            }
        });
    }

    private void refreshPlayer1Health() {
        TextView player1HealthView = (TextView) findViewById(R.id.two_player_p1_health);
        player1HealthView.setText(String.valueOf(healthPlayer1));
    }
    private void refreshPlayer1Energy() {
        TextView player1EnergyView = (TextView) findViewById(R.id.two_player_p1_energy);
        player1EnergyView.setText(String.valueOf(energyPlayer1));
    }
    private void refreshPlayer1Poison() {
        TextView player1PoisonView = (TextView) findViewById(R.id.two_player_p1_poison);
        player1PoisonView.setText(String.valueOf(poisonPlayer1));
    }
    private void refreshPlayer2Health() {
        TextView player2HealthView = (TextView) findViewById(R.id.two_player_p2_health);
        player2HealthView.setText(String.valueOf(healthPlayer2));
    }
    private void refreshPlayer2Energy() {
        TextView player2EnergyView = (TextView) findViewById(R.id.two_player_p2_energy);
        player2EnergyView.setText(String.valueOf(energyPlayer2));
    }
    private void refreshPlayer2Poison() {
        TextView player2PoisonView = (TextView) findViewById(R.id.two_player_p2_poison);
        player2PoisonView.setText(String.valueOf(poisonPlayer2));
    }

}
