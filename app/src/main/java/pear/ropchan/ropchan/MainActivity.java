package pear.ropchan.ropchan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //QueryPreferences.setStoredQuery(this, "");

        //Button btn1 = (Button) findViewById(R.id.button1);
        //Button btn2 = (Button) findViewById(R.id.button2);

        ListView lv = (ListView) findViewById(R.id.ListV);
    }


    public void clickOk(View view) {

        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);

        String strET1 = et1.getText().toString();
        String strET2 = et2.getText().toString();

        QueryPreferences.setStoredQuery(this, "strET1", strET1);
        QueryPreferences.setStoredQuery(this, "strET2", strET2);

        byte [] ArrayStrET1 = QueryPreferences.getStoredQuery(this, "strET1").getBytes();
        byte [] ArrayStrET2 = QueryPreferences.getStoredQuery(this, "strET2").getBytes();

    }

    public void clickCleer(View view) {
        //QueryPreferences.setStoredQuery(getActivity(), null);


    }



}
