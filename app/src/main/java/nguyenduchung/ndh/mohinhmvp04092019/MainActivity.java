package nguyenduchung.ndh.mohinhmvp04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mEdtUser,mEdtPass;
    Button mBtnLogin;
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtUser=findViewById(R.id.edittextUser);
        mEdtPass=findViewById(R.id.edittextPass);
        mBtnLogin=findViewById(R.id.buttonDangnhap);
        mainPresenter = new MainPresenter();

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user= mEdtUser.getText().toString().trim();
                String pass= mEdtPass.getText().toString().trim();

                mainPresenter.validateLogin(user,pass);

            }
        });
    }
}
