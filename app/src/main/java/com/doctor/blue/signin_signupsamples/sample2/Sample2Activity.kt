package com.doctor.blue.signin_signupsamples.sample2

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import com.doctor.blue.signin_signupsamples.R
import kotlinx.android.synthetic.main.activity_sample2.*

class Sample2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample2)
        btn_sample2_sign_in.setOnClickListener {
            if (!isPasswordValid(edt_sample2_password.text!!)) {
                textInput_sample2_password.error = getString(R.string.error_password)
            } else {
                textInput_sample2_password.error = null
            }
        }
        edt_sample2_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_sample2_password.text!!)) {
                textInput_sample2_password.error = null
            }
            false
        }
    }

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }
}
