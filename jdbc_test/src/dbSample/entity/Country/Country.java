package dbSample.entity.Country;

public class Country {
    
    
    private String name;
    private int population;

    // 引数なしコンストラクタ
    public Country() {

    }

    // 引数ありコンストラクタ
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Country(String name, int population) {
        this.name = name;
        this.population = population;

}

}