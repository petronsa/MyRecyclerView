package com.petron.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.petron.myrecyclerview.databinding.ItemLibreriaBinding
import com.squareup.picasso.Picasso

class LibreriaAdapter (val libreria: List<Libreria>):RecyclerView.Adapter<LibreriaAdapter.LibreriaHolder>(){



    class LibreriaHolder(val view: View):RecyclerView.ViewHolder(view){
        // El bildind en el RecyclerView
        val binding = ItemLibreriaBinding.bind(view)

        fun render(libreria:Libreria){

            binding.textLibro.text = libreria.libro
            binding.textAutor.text = libreria.autor
            binding.textGenero.text = libreria.genero
            //val imagen = view.findViewById<ImageView>(R.id.imagePortada)
            Picasso.get().load(libreria.portada).into(binding.imagePortada)

            // Un setOnClickListener sencillito

            view.setOnClickListener{Toast.makeText(view.context, "Has seleccionado el libro ${libreria.libro}", Toast.LENGTH_SHORT).show()}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibreriaHolder {
        //Se llama cuando RecyclerView necesita un nuevo RecyclerView.ViewHolder
        // del tipo dado para representar un elemento.
        val layoutInflater = LayoutInflater.from(parent.context)
        return LibreriaHolder(layoutInflater.inflate(R.layout.item_libreria, parent, false))
    }

    override fun onBindViewHolder(holder: LibreriaHolder, position: Int) {
        //Lo llama RecyclerView para mostrar los datos en la posición especificada.
        holder.render(libreria[position])
    }

    override fun getItemCount(): Int {
        //Le dice al RecyclerView los item que tenemos
        return libreria.size
    }
}