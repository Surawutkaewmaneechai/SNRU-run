package snru.kaewmaneechai.surawut.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class
SignUp extends AppCompatActivity {
//Explicit
    private EditText nameEditText,UserEditText, PasswordEditText;
    private RadioButton radioGroup;
    private RadioButton choice1RadioButton,choice2RadioButton, choice3RadioButton , choice4RadioButton, choice5RadioButton;
    private String nameString, userString, PasswordString, avataString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();


    }//Main Method

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText);
        UserEditText = (EditText) findViewById(R.id.editText2);
        PasswordEditText =(EditText) findViewById(R.id.editText3);
        radioGroup = (RadioButton) findViewById(R.id.ragAvatar);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);


    }

    public void clickSignUpsign(View view) {

        //Get value From EditText
        nameString = nameEditText.getText().toString().trim();
        userString = UserEditText.getText().toString().trim();
        PasswordString = PasswordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("")  || userString.equals("")  || PasswordString.equals("")  ) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง", "กรุณากรอกทุกช่อง");
        } else {
        }

    }
}//Main Class
