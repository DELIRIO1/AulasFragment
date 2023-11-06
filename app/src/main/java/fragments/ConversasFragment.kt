package fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import descomplica.desenvolvimentomobile.aulasfragment.R

class ConversasFragment : Fragment() {

    private lateinit var btnExecutar: Button
    private lateinit var textNome: TextView
    private lateinit var editNome:  EditText

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida","Fragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida","Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida","Fragment onACreatView")

        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        btnExecutar = view.findViewById(R.id.btnExecutar )
        editNome = view.findViewById(R.id.editNome )
        textNome = view.findViewById(R.id.textNome )


        btnExecutar.setOnClickListener{


            textNome.text = editNome.text.toString()
        }

        return view
    }

    /* Depreciado
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }*/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida","Fragment onViewCreated")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida","Fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida","Fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida","Fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida","Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida","Fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida","Fragment onDetach")
    }

}