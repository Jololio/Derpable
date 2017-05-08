package ctec.derpable.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class DerpyColorsActivity extends Activity
{
    private Button colorButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derpy_colors);

        colorButton = (Button) findViewById(R.id.derpyButton);
    }

    private void setupListeners()
    {

    }
}
