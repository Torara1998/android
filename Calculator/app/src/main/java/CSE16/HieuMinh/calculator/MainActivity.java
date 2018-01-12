package CSE16.HieuMinh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNo1, btnNo2, btnNo3, btnNo4, btnNo5, btnNo6, btnNo7, btnNo8, btnNo9, btnNo0 ;
    private Button btncong, btntru, btnnhan, btnchia, btncanbac, btnphantram, btnphanso, btndau;
    private Button btnPoint, btnResult, btnClear, btnClearAll, btnMR, btnMC, btnMS, btnMtru, btnMcong, btnQ;
    private final String    TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();
    }

    public void initWidget(){

        edtNumber = (EditText) findViewById(R.id.edt_number);
        tvResult = (TextView) findViewById(R.id.v_result);

        btnNo1 = (Button)findViewById(R.id.btnNo1);
        btnNo2 = (Button)findViewById(R.id.btnNo2);
        btnNo3 = (Button)findViewById(R.id.btnNo3);
        btnNo4 = (Button)findViewById(R.id.btnNo4);
        btnNo5 = (Button)findViewById(R.id.btnNo5);
        btnNo6 = (Button)findViewById(R.id.btnNo6);
        btnNo7 = (Button)findViewById(R.id.btnNo7);
        btnNo8 = (Button)findViewById(R.id.btnNo8);
        btnNo9 = (Button)findViewById(R.id.btnNo9);
        btnNo0 = (Button)findViewById(R.id.btnNo0);
        btncong = (Button)findViewById(R.id.btn_cong);
        btntru = (Button)findViewById(R.id.btn_tru);
        btnnhan = (Button)findViewById(R.id.btn_nhan);
        btnchia = (Button)findViewById(R.id.btn_chia);
        btncanbac = (Button)findViewById(R.id.btn_canbac);
        btnphantram = (Button)findViewById(R.id.btn_phantram);
        btnphanso = (Button)findViewById(R.id.btn_phanso);
        btndau = (Button)findViewById(R.id.btn_dau);
        btnPoint = (Button)findViewById(R.id.btn_point);
        btnResult = (Button)findViewById(R.id.btn_Result);
        btnClear = (Button)findViewById(R.id.btn_Clear);
        btnClearAll = (Button)findViewById(R.id.btn_AllClear);
        btnMR = (Button)findViewById(R.id.btn_MR);
        btnMC = (Button)findViewById(R.id.btn_MC);
        btnMS = (Button)findViewById(R.id.btn_MS);
        btnMtru = (Button)findViewById(R.id.btn_Mtru);
        btnMcong = (Button)findViewById(R.id.btn_Mcong);
        btnQ = (Button)findViewById(R.id.btn_Q);

    }

    public void setEventClickViews () {
        btnNo1.setOnClickListener(this);
        btnNo2.setOnClickListener(this);
        btnNo3.setOnClickListener(this);
        btnNo4.setOnClickListener(this);
        btnNo5.setOnClickListener(this);
        btnNo6.setOnClickListener(this);
        btnNo7.setOnClickListener(this);
        btnNo8.setOnClickListener(this);
        btnNo9.setOnClickListener(this);
        btnNo0.setOnClickListener(this);
        btncong.setOnClickListener(this);
        btntru.setOnClickListener(this);
        btnnhan.setOnClickListener(this);
        btnchia.setOnClickListener(this);
        btncanbac.setOnClickListener(this);
        btnphantram.setOnClickListener(this);
        btnphanso.setOnClickListener(this);
        btndau.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearAll.setOnClickListener(this);
        btnMR.setOnClickListener(this);
        btnMC.setOnClickListener(this);
        btnMS.setOnClickListener(this);
        btnMtru.setOnClickListener(this);
        btnMcong.setOnClickListener(this);
        btnQ.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNo0:
                // To do
                edtNumber.append("0");
                break;
            case R.id.btnNo1:
                // To do
                edtNumber.append("1");
                break;
            case R.id.btnNo2:
                // To do
                edtNumber.append("2");
                break;
            case R.id.btnNo3:
                // To do
                edtNumber.append("3");
                break;
            case R.id.btnNo4:
                // To do
                edtNumber.append("4");
                break;
            case R.id.btnNo5:
                // To do
                edtNumber.append("5");
                break;
            case R.id.btnNo6:
                // To do
                edtNumber.append("6");
                break;
            case R.id.btnNo7:
                // To do
                edtNumber.append("7");
                break;
            case R.id.btnNo8:
                // To do
                edtNumber.append("8");
                break;
            case R.id.btnNo9:
                // To do
                edtNumber.append("9");
                break;

            case R.id.btn_cong:
                // To do
                edtNumber.append("+");
                break;
            case R.id.btn_tru:
                // To do
                edtNumber.append("-");
                break;
            case R.id.btn_nhan:
                // To do
                edtNumber.append("*");
                break;
            case R.id.btn_chia:
                // To do
                edtNumber.append("/");
                break;
            case R.id.btn_canbac:
                // To do
                break;
            case R.id.btn_phantram:
                // To do
                break;
            case R.id.btn_phanso:
                // To do
                break;
            case R.id.btn_dau:
                // To do
                break;
            case R.id.btn_point:
                // To do
                edtNumber.append(".");
                break;
            case R.id.btn_Result:
                // To do
                double result = 0 ;
                addOperation(edtNumber.getText().toString());
                addNumber(edtNumber.getText().toString());
                //if
                if(arrayOperation.size() >= arrNumber.size()) {
                    tvResult.setText("error");
                } else {
                // thuật toán tính
                for (int i = 0; i < (arrNumber.size() -1); i++) {
                    switch (arrayOperation.get(i)) {
                        case "+":
                            if (i == 0) {
                                result = arrNumber.get(i) + arrNumber.get(i + 1);
                            } else {
                                result = result + arrNumber.get(i + 1);
                            }
                            break;
                        case "-":
                            if (i == 0) {
                                result = arrNumber.get(i) - arrNumber.get(i + 1);
                            } else {
                                result = result - arrNumber.get(i + 1);
                            }
                            break;
                        case "*":
                            if (i == 0) {
                                result = arrNumber.get(i) * arrNumber.get(i + 1);
                            } else {
                                result = result * arrNumber.get(i + 1);
                            }
                            break;
                        case "/":
                            if (i == 0) {
                                result = arrNumber.get(i) / arrNumber.get(i + 1);
                            } else {
                                result = result / arrNumber.get(i + 1);
                            }
                            break;
                        default:
                            break;

                         }
                     }
                }
                tvResult.setText(result + "");

            case R.id.btn_Clear:
                // To do
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edtNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL ));
                break;
            case R.id.btn_AllClear:
                // To do
                edtNumber.setText("");
                break;
            case R.id.btn_MR:
                // To do
                break;
            case R.id.btn_MC:
                // To do
                break;
            case R.id.btn_MS:
                // To do
                break;
            case R.id.btn_Mcong:
                // To do
                break;
            case R.id.btn_Mtru:
                // To do
                break;

        }
    }

    //hằng +-*/
    public ArrayList<String> arrayOperation;
    //hằng chứa số
    public ArrayList<Double> arrNumber;
    //lấy tất cả các phép tính lưu vào
    public int addOperation(String input){
        arrayOperation = new ArrayList<>();

        char[] cArray = input.toCharArray();
        for (int i = 0; i < cArray.length; i++){
            switch (cArray[i]) {
                case '+' :
                    arrayOperation.add(cArray[i] + "");
                    break;
                case '-' :
                    arrayOperation.add(cArray[i] + "");
                    break;
                case '*' :
                    arrayOperation.add(cArray[i] + "");
                    break;
                case '/' :
                    arrayOperation.add(cArray[i] + "");
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    //lấy số
    public void addNumber(String stringInput) {
        Pattern regex = Pattern.compile("(\\d+(?:\\.\\d+)?)");
        Matcher matcher = regex.matcher(stringInput);
        while (matcher.find()) {
            arrNumber.add(Double.valueOf(matcher.group(1)));
        }
    }
//public String deleteANumber (String number){
  //      int lenght = number.length();
    //    String tem = number.substring(0,lenght-1);
      //  return tem;
//}
}
