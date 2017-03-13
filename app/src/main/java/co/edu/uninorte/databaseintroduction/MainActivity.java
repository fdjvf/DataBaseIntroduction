package co.edu.uninorte.databaseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DataEntryDAO myDataentrydao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDataentrydao=new DataEntryDAO(getApplicationContext());
    }
}
