package com.doctor.blue.signin_signupsamples.sample1

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import com.doctor.blue.signin_signupsamples.R
import com.doctor.blue.signin_signupsamples.sample2.Sample2Activity
import kotlinx.android.synthetic.main.activity_sample1.*

class Sample1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)
        btn_sample1_next.setOnClickListener {
            if (!isPasswordValid(edt_sample1_password.text!!)) {
                textInput_sample1_password.error = getString(R.string.error_password)
            } else {
                textInput_sample1_password.error = null
                startActivity(Intent(this@Sample1Activity, Sample2Activity::class.java))
            }
        }
        edt_sample1_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_sample1_password.text!!)) {
                textInput_sample1_password.error = null
            }
            false
        }
    }

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }
}
