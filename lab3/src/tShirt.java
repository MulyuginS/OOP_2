public class tShirt extends Clothes implements WomenClothes, ManClothes {
 public tShirt(ClothesSize clothesSize, float pay, String color){
     super(clothesSize, pay, color);
 }


    @Override
    public void DressMan() {
        System.out.println("Мужчина одет в футболку " + getColor() + " цвета, размер " + getClothesSize().getDescription() );
    }

    @Override
    public void DressWoman() {
        System.out.println("Женщина одета в футболку " + getColor() + " цвета, размер " + getClothesSize().getDescription() );
    }
}

