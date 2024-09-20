public class MedianChars {
public String getMedianChars(String str){
    int medianElem = str.length() / 2;
    return str.substring(medianElem - 1, medianElem + 1);
}

}
