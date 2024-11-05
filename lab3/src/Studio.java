public class Studio {
    public void dressWomen(Clothes[] clothesArray){
        for(Clothes clothes:clothesArray){
            if(clothes instanceof WomenClothes){
                ((WomenClothes) clothes).DressWoman(); // преобразование объекта clothes к типу WomenClothes

            }
        }
    }
    public void dressMan(Clothes[] clothesArray) {
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof ManClothes) {
                ((ManClothes) clothes).DressMan();
            }
        }
    }
}

