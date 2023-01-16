public class Class {
    private int number;
    private  String word;
    private int[] array;


    public Class(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
        System.out.println(getValue());
    }
     public String getValue(){
        String info = "Number: "+number+". Word: "+word+". \n";
        String infoArray="Array: \n";
         for (int i = 0; i < array.length; i++)
             infoArray+=array[i]+"\n";
         return info + infoArray;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
