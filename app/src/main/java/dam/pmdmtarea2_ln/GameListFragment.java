package dam.pmdmtarea2_ln;



import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dam.pmdmtarea2_ln.databinding.GameListFragmentBinding;

import java.util.ArrayList;

public class GameListFragment extends Fragment {

    private GameListFragmentBinding binding; // Binding para el layout
    private ArrayList<GameData> games; // Lista de juegos
    private GameRecyclerViewAdapter adapter; // Adaptador del RecyclerView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflar el layout utilizando el binding
        binding = GameListFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Inicializa la lista de juegos
        loadGames(); // Cargar los juegos (puedes implementar esta función para obtener datos)

        // Configurar el RecyclerView
        adapter = new GameRecyclerViewAdapter(games, getActivity());
        binding.gamesRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.gamesRecyclerview.setAdapter(adapter);


    }

    // Método para cargar juegos (puedes implementar tu lógica aquí)
    private void loadGames() {
        games = new ArrayList<GameData>();
        // Llenar la lista con datos de videojuegos
        games.add(new GameData(
                "https://images.wikidexcdn.net/mwuploads/esssbwiki/c/cb/latest/20220530212008/Mario_Mario_Party_Superstars.png", // Reemplaza con la ruta de la imagen
                "Mario",
                "El héroe principal del Reino Champiñón, un fontanero valiente y carismático que siempre salva a la Princesa Peach de Bowser.",
                "Equilibrado y versátil ."

        ));

        games.add(new GameData(
                "https://i.pinimg.com/736x/d3/6f/a4/d36fa4e5f6dcaa3871ca2bda247b3da6.jpg", // Reemplaza con la ruta de la imagen
                "Luigi",
                "El hermano alto y tímido de Mario, conocido por su valentía en juegos como Luigi's Mansion y su icónica vestimenta verde.",
                "Salto alto."

        ));

        games.add(new GameData(
                "https://assets.nintendo.com/image/upload/f_auto/q_auto/dpr_1.5/c_scale,w_400/Marketing/pmp-princess-peach-showtime-23x89jas979/characters/cast-and-crew/peach-cast-and-crew", // Reemplaza con la ruta de la imagen
                "Peach",
                "La princesa del Reino Champiñón, amable y compasiva. Es la figura central que Mario suele rescatar de las garras de Bowser.",
                "Flotar y gracia."

        ));

        games.add(new GameData(
                "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2022/08/super-mario-toad.png?resize=768%2C768&ssl=1", // Reemplaza con la ruta de la imagen
                "Toad",
                "Un fiel sirviente del Reino Champiñón, pequeño y enérgico, conocido por ayudar a Mario y Peach en sus aventuras.",
                "Rápido y fuerte."

        ));










    }


    @Override
    public void onStart() {
        super.onStart();
        // Cambia el título del ActionBar
        if (getActivity() != null) {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.lista_de_juegos);
        }
    }
}
