package com.aptron.fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        b3= findViewById(R.id.b3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        FragmentManager manager= getFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        switch (view.getId())
        {
            case R.id.b1:
                Fragment1 one = new Fragment1();
                transaction.add(R.id.layout1, one);
                transaction.addToBackStack("");
                transaction.commit();
                break;
            case R.id.b2:
                Fragment2 two= new Fragment2();
                transaction.add(R.id.layout2, two);
                transaction.addToBackStack("");
                transaction.commit();
                break;
            case R.id.b3:
                Fragment3 three= new Fragment3();
                transaction.add(R.id.layout3, three);
                transaction.addToBackStack("");
                transaction.commit();
                break;

        }
    }
}
