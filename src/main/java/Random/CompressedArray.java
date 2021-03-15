package Random;

class CompressedArray extends Exception {
    int currentIndex = 0;
    int cAIndex = 1;
    int count = 0;
    int length = 0;
    Integer[] cArray;

    public CompressedArray(Integer[] compressedArray){
        for(int index = 1; index < compressedArray.length; index+=2){
            this.length+=compressedArray[index];
            System.out.println(this.length);
        }
        cArray = compressedArray;
    }

    boolean hasNext(){
        return currentIndex < length ? true : false;
    }

    Integer next() {
        if (hasNext()){
            if (count < cArray[cAIndex]) {
                count++;
            } else {
                count = 1;
                cAIndex += 2;
            }
            currentIndex++;
        } else {
            System.out.println("X");
        }
        return cArray[cAIndex-1];
    }
}
