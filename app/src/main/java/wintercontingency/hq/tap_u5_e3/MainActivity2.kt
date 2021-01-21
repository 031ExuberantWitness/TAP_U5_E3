package wintercontingency.hq.tap_u5_e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnMostrar.setOnClickListener {
            var cadena = editText.text.toString().toLowerCase()

            if(cadena.startsWith("sol")){
                imageView.setImageDrawable(getDrawable(R.drawable.sun))
            }else{
                if(cadena.startsWith("luna")){
                    imageView.setImageDrawable(getDrawable(R.drawable.moon))
                }else{
                    imageView.setImageDrawable(getDrawable(R.drawable.cloud))
                }
            }
        }

        setTitle("(C) Daniel López")

        ckDerechos.setOnClickListener {
            ckSaludos.isChecked = false
            if(ckDerechos.isChecked == true){
                setTitle("(C) Daniel López")
            }else{
                setTitle("Ejercicio 3")
            }
        }

        ckSaludos.setOnClickListener {
            ckDerechos.isChecked = false
            if(ckSaludos.isChecked == true){
                setTitle("¿Como estas?")
            }else{
                setTitle("Ejercicio 3")
            }
        }

        rbCasado.setOnClickListener {
            pollito()
        }

        rbSoltero.setOnClickListener {
            pollito()
        }

        sImagen.setOnClickListener {
            if(sImagen.isChecked){
                imageView.setImageDrawable(getDrawable(R.drawable.vac))
            }else{
                imageView.setImageDrawable(getDrawable(R.drawable.face))
            }
        }

        toggleButton.setOnClickListener {
            var inmd = "El color es: " + spinner.selectedItem.toString()
            if(toggleButton.isChecked){
                Toast.makeText(this, inmd, Toast.LENGTH_SHORT).show()
            }else{
                AlertDialog.Builder(this)
                    .setMessage(inmd)
                    .setTitle("El elegido es: ")
                    .setPositiveButton("ok"){d, i ->}
                    .show()
            }
        }
    }

    fun pollito(){
        if(rbSoltero.isChecked){
            Toast.makeText(this, "SOLTERO(A)", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "CASADO(A)", Toast.LENGTH_SHORT).show()
        }
    }
}