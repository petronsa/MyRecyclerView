package com.petron.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.petron.myrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Variable para el binding
    private lateinit var binding: ActivityMainBinding

    val libreria : List<Libreria> = listOf(
        Libreria("Sira","Maria Dueñas", "Novela contemporanea", "https://imagessl1.casadellibro.com/a/l/t5/11/9788408241911.jpg"),
        Libreria("Lo que la marea esconde", "Maria Oruña", "Novela negra", "https://imagessl0.casadellibro.com/a/l/t5/60/9788423359660.jpg"),
        Libreria("Castellano", "Lorenzo Silva", "Historica", "https://imagessl1.casadellibro.com/a/l/t5/61/9788423359561.jpg"),
        Libreria("De ninguna parte", "Maria Navarro", "Narrativa", "https://imagessl4.casadellibro.com/a/l/t5/24/9788401024924.jpg"),
        Libreria("Las armas de mañana", "Jesus Sanchez Adalid", "Novela Historica", "https://imagessl2.casadellibro.com/a/l/t5/62/9788491394662.jpg"),
        Libreria("Reina roja", "Juan Gomez-Jurado","Novela negra", "https://imagessl7.casadellibro.com/a/l/t5/17/9788466664417.jpg"),
        Libreria("Los ingratos", "Pedro Simon", "Narrativa", "https://imagessl7.casadellibro.com/a/l/t5/67/9788467060867.jpg"),
        Libreria("Derrivando muros","Maria Abramovic", "Arte", "https://imagessl0.casadellibro.com/a/l/t5/80/9788417893880.jpg"),
        Libreria("La agenda de mi bebe", "Lucia Galan", "Medicina", "https://imagessl4.casadellibro.com/a/l/t5/04/9788408214304.jpg"),
        Libreria("Loki", "Oscar Baldazua", "Comic", "https://imagessl7.casadellibro.com/a/l/t5/27/9788413344027.jpg")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // El binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniciarRecycler()
    }

    fun iniciarRecycler(){

        // Iniciamos el RecyclerView
        binding.rvRecycleView1.layoutManager = LinearLayoutManager(this)
        val adapter = LibreriaAdapter(libreria)
        binding.rvRecycleView1.adapter = adapter

    }
}