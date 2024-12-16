package dam.pmdmtarea2_ln;

public class GameData {

    private final String image;
    private final String name;

    private final String description;
    private final String habilidades;

    public GameData(String image, String name,  String description, String habilidades) {
        this.image = image;
        this.name = name;

        this.description = description;
        this.habilidades = habilidades;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }



    public String getDescription() {
        return description;
    }

    public String getHabilidades() {
        return habilidades;
    }
}

