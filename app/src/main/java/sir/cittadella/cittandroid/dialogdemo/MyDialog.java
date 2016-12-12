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
            /*
            Bundle args = getArguments();

            args.getBundle("dialog1");

            this.msg=args.getString("msg");
            this.msgok=args.getString("msgok");
            this.msgko=args.getString("msgko");
            */
        }

        public static MyDialog newFrag(String m1,String m2,String m3){

            MyDialog f = new MyDialog();

            Bundle args = new Bundle();

            args.putString("msg", m1);
            args.putString("msgok", m2);
            args.putString("msgko", m3);
            f.setArguments(args);
            return f;
        }

        @Override public Dialog onCreateDialog(Bundle savedInstanceState){
            AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
            // build dialog
            Bundle args = getArguments();

        //    if(args.getBundle("dialog1")){

            this.msg=args.getString("msg");
            this.msgok=args.getString("msgok");
            this.msgko=args.getString("msgko");
          //  };

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
