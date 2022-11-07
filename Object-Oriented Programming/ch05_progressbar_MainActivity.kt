package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import com.example.register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private fun updateWidgets(){
        var progress=0                                                      // [01.] 초기화
        if(binding.editTextTextPersonName.text.isNotEmpty())                // [02.] 바인딩된 텍스트박스에 글자가 하나라도 있다면
            progress++                                                      //      진행도 1 증가시킴
        if(binding.editTextPhone.text.isNotEmpty())
            progress++
        // check radio - 선택된 버튼이 없을 때 -1
        if(binding.radioGroup.checkedRadioButtonId > -1)
            progress++
        if(binding.checkBoxEURA.isChecked)
            progress++

        binding.progressBar.progress = progress                             // [03.] 진행도 변수를 프로그래스바에 바인딩시킴
        binding.buttonApply.isEnabled = progress==binding.progressBar.max   //      확인 버튼의 활성화 여부(isEnabled)를 프로그래스바의 총량과
                                                                            //      현재 진행도가 4로 일치하는지 확인하여 바인딩 시킴
    }

    private val textWatcher:TextWatcher = object:TextWatcher{
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        override fun afterTextChanged(s: Editable?) {
            updateWidgets()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.progressBar.max=4   // 프로그래스바의 총량을 4로 지정

        binding.editTextTextPersonName.addTextChangedListener(textWatcher)
        binding.editTextPhone.addTextChangedListener(textWatcher)

        binding.radioGroup.setOnCheckedChangeListener { _, _ ->  updateWidgets()}
        binding.checkBoxEURA.setOnClickListener { updateWidgets() }
    }
}