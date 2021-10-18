package com.example.desertshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.sameday:
                if (((RadioButton) view).isChecked())
                    Toast.makeText(getApplicationContext(), getString(R.string.chosen) +
                        getString(R.string.same_day_messenger_service), Toast.LENGTH_SHORT).show();
                break;
            case R.id.nextday:
                if (((RadioButton) view).isChecked())
                    Toast.makeText(getApplicationContext(), getString(R.string.chosen) +
                            getString(R.string.next_day_ground_delivery), Toast.LENGTH_SHORT).show();

                break;
            case R.id.pickup:
                if (((RadioButton) view).isChecked())
                    Toast.makeText(getApplicationContext(), getString(R.string.chosen) +
                            getString(R.string.pick_up), Toast.LENGTH_SHORT).show();

                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;
        }
    }
}