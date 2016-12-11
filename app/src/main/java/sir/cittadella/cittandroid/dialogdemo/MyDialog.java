package sir.cittadella.cittandroid.dialogdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by giorgio on 11/12/16.
 */

public class MyDialog extends DialogFragment {


    String msg="default";
        String msgok="OK";
        String msgko="Cancel";

        public MyDialog(){
            Bundle arguments = getArguments();
            arguments.getBundle("dialog1")

            this.msg="Make a Selection";
            this.msgko="Cancel";
            this.msgok="OK";
        }

        public MyDialog(String m1,String m2,String m3){
            this.msg=m1;
            this.msgok=m2;
            this.msgko=m3;
        }

        @Override public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
            // build dialog
            builder.setMessage(this.msg)
                    .setPositiveButton(this.msgok, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        // nothing
                        }
                    })
                    // cancel;
                    .setNegativeButton(this.msgko,new DialogInterface.OnClickListener(){
                         public void onClick(DialogInterface dialog, int id){
                         //nothing
                }
            });
            return builder.create();
        }

}
