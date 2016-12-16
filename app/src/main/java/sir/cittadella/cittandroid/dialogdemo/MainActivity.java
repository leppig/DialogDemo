package sir.cittadella.cittandroid.dialogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Bundle fargs = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                       // MyDialog myDialog= new MyDialog();
                        MyDialog myDialog = MyDialog.newFrag("pippo","pluto","paperino");



                        myDialog.show(getFragmentManager(), "1233");
                    }


                }
        );
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v){
                        // MyDialog myDialog= new MyDialog();
                        MyDialog myDialog = new MyDialog();
//                        MyDialog myDialog = MyDialog.newFrag("piopo","pulto","rapeerino");





                        myDialog.show(getFragmentManager(), "123");
                    }


                }
        );
    }
}
