package com.hfad.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ToDoMain : AppCompatActivity() {

    var data = arrayListOf<String>()
    var nowIndex: Int = 0
    lateinit var adapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview = findViewById(R.id.todolist) as ListView
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listview.setAdapter(adapter)
        listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, v: View, position: Int, id: Long) {
                nowIndex = position
            }
        }
    }

    fun onAddClick(view: View) {
        val todoIn: EditText = findViewById(R.id.todoin)
        data.add(todoIn.text.toString())
        adapter.notifyDataSetChanged()
        todoIn.setText("")
    }
    fun onDeleteClick(view: View) {
        data.removeAt(nowIndex)
        adapter.notifyDataSetChanged()
    }
    fun onChangeClick(view: View) {
        val toChangeIn: EditText = findViewById(R.id.todoin)
        data.removeAt(nowIndex)
        data.add(nowIndex, toChangeIn.text.toString())
        adapter.notifyDataSetChanged()
    }

}
