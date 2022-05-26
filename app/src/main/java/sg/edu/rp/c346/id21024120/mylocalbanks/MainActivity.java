package sg.edu.rp.c346.id21024120.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDBS, btnOCBC, btnUOB;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDBS = findViewById(R.id.buttonDBS);
        btnOCBC = findViewById(R.id.buttonOCBC);
        btnUOB = findViewById(R.id.buttonUOB);

        registerForContextMenu(btnDBS);
        registerForContextMenu(btnOCBC);
        registerForContextMenu(btnUOB);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            btnDBS.setText("DBS");
            btnOCBC.setText("OCBC");
            btnUOB.setText("UOB");
            return true;
        } else if (id == R.id.ChineseSelection) {
            btnDBS.setText("星展银行");
            btnOCBC.setText("华侨银行");
            btnUOB.setText("大华银行");
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "Website");
        menu.add(0, 1, 1, "Contact the bank");

        if (v == btnDBS) {
            wordClicked = "DBS";
        } else if (v == btnOCBC) {
            wordClicked = "OCBC";
        } else if (v == btnUOB) {
            wordClicked = "UOB";
        } else {
            wordClicked = "";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("dbs")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dbs.com.sg"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 62222200)); //18001111111
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("星展银行")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dbs.com.sg"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 62222200));
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("ocbc")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ocbc.com"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 63633333)); //18003633333
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("华侨银行")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ocbc.com"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 63633333));
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("uob")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uob.com.sg"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 68685101)); //18002222121
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        } else if (wordClicked.equalsIgnoreCase("大华银行")) {
            if (item.getItemId() == 0) { // checks whether the selected menu item is 0
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uob.com.sg"));
                startActivity(intent);
                return true; // menu item successfully handled
            } else if (item.getItemId() == 1) { // checks whether the selected menu item is 1
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 68685101));
                startActivity(intentCall);
                return true; // menu item successfully handled
            }
        }

        return super.onContextItemSelected(item);

    }
}




