package app.com.angel.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import app.com.angel.R;

public class SignUp_Activity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Toast.makeText(this, "Go To Hell...", Toast.LENGTH_SHORT).show();
    }
}
