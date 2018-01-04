package CSE16.DangHieuMinh.tonghaiso;

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
    EditText edta,edtb;
    TextView tvSum;
    Button btSum,btClear,btExit;
    Context context = this;
    int a,b,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // kết nối id xml với class
        edta =(EditText)findViewById(R.id.edta);
        edtb =(EditText)findViewById(R.id.edtb);
        btClear =(Button)findViewById(R.id.btclear);
        btExit =(Button)findViewById(R.id.btexit);
        btSum = (Button)findViewById(R.id.btsum);
        tvSum=(TextView)findViewById(R.id.tvSum);

        // gọi các hàm
        Tinh_tong();
        clear_data();
        exit_app();

    }

    private void exit_app() {
        // TODO Auto-generated method stub
        btExit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AlertDialog.Builder b = new  AlertDialog.Builder(context);
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
        });
    }

    public void Tinh_tong()
    {
        btSum.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // kiểm tra nhập số liệu có đúng kiểu nguyên không
                try {
                    a =Integer.parseInt(edta.getText()+"");
                } catch (Exception e) {
                    edta.setText("");
                    edta.requestFocus();
                    Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
                    return;
                }

                try {
                    b=Integer.parseInt(edtb.getText()+"");
                } catch (Exception e) {
                    edtb.setText("");
                    edtb.requestFocus();
                    Toast.makeText(getApplication(), "Nhập số tự nhiên", 1).show();
                    return;
                }
                // bắt đầu tính toán
                // tổng hai số
                sum = a+b;
                //hiện thị tổng
                tvSum.setText(tvSum.getText().toString()+sum);


            }
        });
    }
    public void clear_data()
    {
        btClear.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                edta.setText("");
                edtb.setText("");
                a=b=sum=0;
                tvSum.setText("Tổng hai số vừa nhập là : ");
            }
        });
    }
}

