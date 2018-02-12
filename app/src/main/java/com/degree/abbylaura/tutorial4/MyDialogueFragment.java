package com.degree.abbylaura.tutorial4;

/**
 * Created by abbylaura on 29/01/2018.
 */

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.*;

public class MyDialogueFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        //^Allows us to build dialog box

        theDialog.setTitle("Sample Dialog");
        theDialog.setMessage("Hello I am a Dialog");
        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Clicked OK",
                        Toast.LENGTH_SHORT).show();
            }
        });
        theDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Clicked CANCEL",
                        Toast.LENGTH_SHORT).show();
            }
        });


        return theDialog.create();
    }
}
