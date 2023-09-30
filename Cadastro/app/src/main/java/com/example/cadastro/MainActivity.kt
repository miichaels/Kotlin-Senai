package com.example.cadastro

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.E


class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var lastName: EditText
    lateinit var email: EditText
    lateinit var phoneNumber: EditText
    lateinit var fem: RadioButton
    lateinit var masc: RadioButton
    lateinit var notRespost: RadioButton
    lateinit var limpar: Button
    lateinit var RadioGroup: RadioGroup
    lateinit var mostrar: Button
    lateinit var enviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name) as EditText
        lastName = findViewById(R.id.lastName) as EditText
        email = findViewById(R.id.email) as EditText
        phoneNumber = findViewById(R.id.phoneNumber) as EditText
        limpar = findViewById(R.id.limpar) as Button
        fem = findViewById(R.id.fem) as RadioButton
        masc = findViewById(R.id.masc) as RadioButton
        notRespost = findViewById(R.id.notRespost) as RadioButton
        RadioGroup = findViewById(R.id.radio) as RadioGroup
        mostrar = findViewById(R.id.mostrar) as Button
        enviar = findViewById(R.id.enviar) as Button


        var sexo = ""
        if (masc.isChecked) {
            sexo = "Masculino"
        } else if (fem.isChecked) {
            sexo = "Feminino"
        } else{
            sexo = "Not Respost"
    }


        limpar.setOnClickListener {
            name.text.clear()
            lastName.text.clear()
            email.text.clear()
            phoneNumber.text.clear()
            RadioGroup.clearCheck()
            }


        enviar.setOnClickListener {
            var aluno = aluno(name.text.toString() , lastName.text.toString() , email.text.toString() , phoneNumber.text.toString(), sexo)

            val db = DBHelper(this,null)
            try {
                db.addName(aluno.name, aluno.lastName, aluno.email, aluno.phoneNumber)
            }catch (e: Exception){
                Toast.makeText(this, "É "+ E.toString(), Toast.LENGTH_SHORT).show()
            }




        }



        mostrar.setOnClickListener {

            var aluno = aluno (name.text.toString() , lastName.text.toString() , email.text.toString() , phoneNumber.text.toString(), sexo)

            val popup = AlertDialog.Builder(this)
            popup.setTitle("Cadastro de aluno")
            popup.setMessage(
                "Conta cadastrada com sucesso \n" +
                        "dados do aluno: \n" +
                        "Nome: ${aluno.name} \n" +
                        "Sobrenome: ${aluno.lastName} \n" +
                        "E-mail: ${aluno.email} \n" +
                        "Telefone: ${aluno.phoneNumber}"


            )
            popup.setPositiveButton("Confirmar", DialogInterface.OnClickListener { dialog, which ->
              //  Toast.makeText(this, "Confirmado", Toast.LENGTH_SHORT).show()
            })
            popup.show()

        }







    }

}