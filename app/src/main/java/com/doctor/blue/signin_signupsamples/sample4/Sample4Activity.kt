package com.doctor.blue.signin_signupsamples.sample4

import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.doctor.blue.signin_signupsamples.R
import kotlinx.android.synthetic.main.activity_sample4.*

class Sample4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample4)
        btn_sample4_register.setOnClickListener {
            register()
        }

        edt_sample4_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_sample4_password.text!!)) {
                textInput_sample_4_password.error = null
            }
            false
        }

        edt_sample4_confirm_password.setOnKeyListener { _, _, _ ->
            register()
            false
        }
    }

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }

    private fun register() {
        if (!isPasswordValid(edt_sample4_password.text!!)) {
            textInput_sample_4_password.error = getString(R.string.error_password)
        } else {
            textInput_sample_4_password.error = null
        }

        if (!isPasswordValid(edt_sample4_confirm_password.text!!)) {
            textInput_sample_4_confirm_password.error = getString(R.string.error_password)
        } else {
            if (edt_sample4_confirm_password.text.toString() != edt_sample4_password.text.toString()) {
                textInput_sample_4_confirm_password.error = getString(R.string.confirm_failed)
            } else {
                textInput_sample_4_confirm_password.error = null
            }
        }
        if (textInput_sample_4_confirm_password.error == null && textInput_sample_4_password.error == null && cb_sample4_confirm_terms.isChecked) {
            Toast.makeText(this, R.string.logged_in_successfully, Toast.LENGTH_SHORT).show()
        }
    }
}
