package com.physics.coffeeorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.order;

public class MainActivity extends AppCompatActivity {
    int numberCupsCoffee;
    int price = 2;
    int finalPrice;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        final EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        final Button orderButton = (Button) findViewById(R.id.createOrder);
        final TextView finalOrderTextView = (TextView) findViewById(R.id.finalText);



        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numberCupsCoffee = Integer.parseInt(numberEditText.getText().toString());

                finalPrice = price*numberCupsCoffee;

                name = nameEditText.getText().toString();

                finalOrderTextView.setText(name+", Your order: "+numberCupsCoffee+" cups of Coffee, which cost "+ finalPrice + " dollars");

                finalOrderTextView.setVisibility(View.VISIBLE);
            }
        });
    }

}
