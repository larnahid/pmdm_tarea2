package dam.pmdmtarea2_ln;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import dam.pmdmtarea2_ln.databinding.GameCardviewBinding;

public class GameViewHolder extends RecyclerView.ViewHolder {

    private final GameCardviewBinding binding;

    public GameViewHolder(GameCardviewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind (GameData game){
        Picasso.get()
                .load(game.getImage())
                .into(binding.image);
        binding.name.setText(game.getName());
        ;
        binding.executePendingBindings();
    }
}