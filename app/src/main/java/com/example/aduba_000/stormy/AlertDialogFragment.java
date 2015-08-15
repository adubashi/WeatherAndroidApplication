package com.example.aduba_000.stormy; /**
 * Created by aduba_000 on 5/24/2015.
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Oops! Sorry!")
                .setMessage("There was an error, please try again!")
                .setPositiveButton("OK", null);

        AlertDialog dialog = builder.create();
        return dialog;

    }
}
