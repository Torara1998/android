package CSE16.DangHieuMinh.tonghaiso2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText edta, edtb;
    TextView tvSum;
    Button btSum, btClear, btExit;
    Context context = this;
    int a, b, sum;

        private void Sum(View view) {
        // TODO Auto-generated method stub
        AlertDialog.Builder b = new AlertDialog.Builder(context);
        b.setTitle("Thoát");
        b.setMessage("thoát ứng dụng");
        b.setNegativeButton("No", null);
        b.setNeutralButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
        b.show();
    }
}

