package com.example.cadastro

import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


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
    lateinit var listView: AbsListView


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
        listView = findViewById(R.id.listView) as ListView

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
                Toast.makeText(this, "CADASTRO REALIZADO COM SUCESSO!", Toast.LENGTH_SHORT).show()
            }catch (e: Exception){
                Toast.makeText(this, "É "+ e.message, Toast.LENGTH_SHORT).show()
            }

        }
        var users = arrayListOf<Any>()
        var codig = arrayListOf<Any>()

        mostrar.setOnClickListener {
            val db = DBHelper(this,null)

            val cursor = db.getName()

            cursor!!.moveToFirst()
            cursor.getString(1)
           // var ArrayAdapter: ArrayAdapter<*>



            users = arrayListOf(
                " " + cursor.getString(1)
                        +" " + cursor.getString(2)
                        +" " + cursor.getString(3)
                        +" " + cursor.getString(4)
            )

            codig.add(cursor.getString(0))
            while (cursor.moveToNext()){

                users.add(
                    " " + cursor.getString(1)
                             +" " + cursor.getString(2)
                             +" " + cursor.getString(3)
                             +" " + cursor.getString(4)
                )
                codig.add(cursor.getString(0))
            }

            var adapter: ArrayAdapter<*>
            adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1, users
            )
            listView.adapter = adapter
        }


        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, ind: Long ->


            var num  = codig[position]
            val db = DBHelper(this,null)

            val cursor2 = db.getDados(num.toString())
            cursor2!!.moveToFirst()


            name.setText(cursor2.getString(1).toString())
            lastName.setText(cursor2.getString(2).toString())
            email.setText(cursor2.getString(3).toString())
            phoneNumber.setText(cursor2.getString(4).toString())


        }

        limpar.setOnClickListener {
            //name.clear
            //val db = DBHelper(this,null)
            //db.deletetodosDados()
            Toast.makeText(
                applicationContext,
                "Deletados", Toast.LENGTH_LONG
            )
                .show()
        }

/*
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

 */


    }

}