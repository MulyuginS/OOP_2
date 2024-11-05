import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Clothes[] clothesArray = {
                new tShirt(ClothesSize.M, 100, "Красный"),
                new Trousers(ClothesSize.L, 150, "Синий"),
                new Tie(ClothesSize.M, 50, "Зеленый")
        };
        Studio studio = new Studio();
        studio.dressMan(clothesArray);
        System.out.println("------------------------------------------------------------------");
        studio.dressWomen(clothesArray);


    }
}


