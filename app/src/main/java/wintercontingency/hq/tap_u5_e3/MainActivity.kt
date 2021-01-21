package wintercontingency.hq.tap_u5_e3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuppal.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> {
                    var main2 = Intent(this, MainActivity2::class.java)
                    startActivity(main2)
                }
                1 -> {
                    startActivity(Intent(this, MainActivity3::class.java))
                }
                2 -> {
                    startActivity(Intent(this, MainActivity4::class.java))
                }
                3 -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                }
            }
        }
    }
}