package com.doctor.blue.signin_signupsamples.sample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.doctor.blue.signin_signupsamples.R
import kotlinx.android.synthetic.main.activity_sample1.*

class Sample1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)
        btn_sample1_next.setOnClickListener{
            if (!isPasswordValid(edt_sample1_password.text!!)){
                textInput_password_sample_1.error=getString(R.string.error_password)
            }else{
                textInput_password_sample_1.error=null
                Toast.makeText(this,R.string.logged_in_successfully,Toast.LENGTH_SHORT).show()
            }
        }
        edt_sample1_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_sample1_password.text!!)){
                textInput_password_sample_1.error=null
            }
            false
        }
    }
    private fun isPasswordValid(text: Editable?):Boolean{
        return text!=null &&text.length>=8
    }
}
