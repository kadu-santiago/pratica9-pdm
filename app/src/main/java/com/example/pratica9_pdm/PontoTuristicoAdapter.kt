import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PontoTuristicoAdapter(private val pontos: List<String>) :
    RecyclerView.Adapter<PontoTuristicoAdapter.PontoViewHolder>() {

    class PontoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtPonto: TextView = view.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PontoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return PontoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PontoViewHolder, position: Int) {
        holder.txtPonto.text = pontos[position]
    }

    override fun getItemCount() = pontos.size
}