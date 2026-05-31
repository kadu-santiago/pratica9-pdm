import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pratica9_pdm.R
class DestinoAdapter(private val destinos: List<DestinoModel>,private val onItemClicked: (DestinoModel) -> Unit) :
    RecyclerView.Adapter<DestinoAdapter.DestinoViewHolder>() {
    class DestinoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgDestino)
        val nome: TextView = view.findViewById(R.id.txtNomeDestino)
        val desc: TextView = view.findViewById(R.id.txtDescricaoBreve)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_destino, parent, false)
        return DestinoViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinoViewHolder, position: Int) {
        val destino = destinos[position]
        holder.nome.text = destino.nome
        holder.desc.text = destino.descricaoBreve
        holder.img.setImageResource(destino.imagemResId)


        holder.itemView.setOnClickListener { onItemClicked(destino) }
    }

    override fun getItemCount(): Int = destinos.size
}