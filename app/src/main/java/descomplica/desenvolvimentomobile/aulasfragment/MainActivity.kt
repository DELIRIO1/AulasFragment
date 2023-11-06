package descomplica.desenvolvimentomobile.aulasfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import fragments.ChamadasFragment
import fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btn_Conversas:Button
    private lateinit var btn_Chamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Conversas = findViewById(R.id.btn_conversas)
        btn_Chamadas = findViewById(R.id.btn_Chamadas)

        /*val fragmentManager = supportFragmentManager.beginTransaction()

        fragmentManager.add(R.id.fragment_conteudo,ConversasFragment())

        fragmentManager.commit()*/

        //encadeando os metodos colocando um abaixo do outro



        val conversasFragment = ConversasFragment()


        btn_Conversas.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, conversasFragment)
                .commit()
        }

        btn_Chamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                //.remove(conversasFragment)
                .commit()
        }
    }
}