package com.doctor.blue.signin_signupsamples.sample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.doctor.blue.signin_signupsamples.R
import kotlinx.android.synthetic.main.activity_sample3.*

class Sample3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample3)
        btn_sample3_next.setOnClickListener {
            if (!isPasswordValid(edt_sample3_password.text!!)) {
                textInput_sample3_password.error = getString(R.string.error_password)
            } else {
                textInput_sample3_password.error = null
            }
        }
        edt_sample3_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_sample3_password.text!!)) {
                textInput_sample3_password.error = null
            }
            false
        }
    }

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }
}
