package com.ssu.week08.example61

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val idObj: EditText = findViewById(R.id.editText01)
        val passwdObj: EditText = findViewById(R.id.editText02)
        val button: Button = findViewById(R.id.button)

        // 로그인 버튼 클릭 시 입력한 로그인 정보를 토스트로 출력
        button.setOnClickListener {
            val id = idObj.text.toString()
            val passwd = passwdObj.text.toString()
            Toast.makeText(applicationContext, "아이디 : $id\n비밀번호 : $passwd",
                Toast.LENGTH_SHORT).show()
        }
    }
}
