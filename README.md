# Ex.No:3b To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as ExplicitIntent and click Next.

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Display factorial number using Explicit Intents in MainActivity file.

Step 7: Save and run the application.



## PROGRAM:
###Activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <EditText
        android:id="@+id/edt1"
        android:layout_width="350dp"
        android:layout_height="60dp"
        android:layout_centerHorizontal="true"
        android:hint="Enter a number"
        android:textAlignment="center"
        android:inputType="number"
        android:layout_marginTop="220dp"
        android:textStyle="bold"
        android:textSize="30sp"/>

    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@+id/edt1"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="50dp"
        android:text="Factorial" />

</RelativeLayout>

Activity_main2.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/txt2"
        android:layout_width="500dp"
        android:layout_height="40dp"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="40dp"
        android:textStyle="bold"
        android:textAlignment="center"
        android:textSize="30sp"
        />

</RelativeLayout>

MainActivity.java
package com.example.explicitintent;
import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        btn1 = findViewById(R.id.btn1);
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        btn1.setOnClickListener(View->{
            i.putExtra("number",edt1.getText().toString());
            startActivity(i);
        });

    }
}

Main Activity2.java
package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();

        int no = Integer.parseInt(b.getString("number"));
        long f=1;

        for(int i=no; i>0; i--)
        {
            f = f * i;
        }

        txt2 = findViewById(R.id.txt2);
        txt2.setText("Factorial of " + no + " is " + f);
    }
}

## OUTPUT

![311594405-4ba103e1-4b29-4f04-aa32-bb88fae2a0b5](https://github.com/Ritz514/ExplicitIntent-MAD-120/assets/142646304/8e594d18-4290-47e3-ba20-c40ed221e9a9)

![311594511-772ad660-2c18-4c33-9450-f8e44f1efa14](https://github.com/Ritz514/ExplicitIntent-MAD-120/assets/142646304/dc1b3230-75cf-44f4-a471-13e88fc1d20d)


![311594596-e3e2cfe2-fff8-4425-ad2b-f2f2879e45ae](https://github.com/Ritz514/ExplicitIntent-MAD-120/assets/142646304/4a3f63a0-738a-4d91-809f-2c8db050997e)



## RESULT
Thus a Simple Android Application create a Explicit Intents using Android Studio is developed and executed successfully.


