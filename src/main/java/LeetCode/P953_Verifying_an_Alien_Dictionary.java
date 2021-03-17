package LeetCode;

public class P953_Verifying_an_Alien_Dictionary {
    public boolean isAlienSorted(String[] words, String order) {
        for(int index = 0; index < words.length-1; index++){
            if(!isWordsInOrder(words[index],words[index+1],order))
                return false;
        }
        return true;
    }

    Boolean isWordsInOrder(String word1, String word2, String order){
        if(word1.equals(word2))
            return true;
        if(word1.contains(word2) && word1.length() > word2.length())
            return false;
        if(word2.contains(word1) && word1.length() < word2.length())
            return true;

        int size = word1.length()<word2.length() ? word1.length() : word2.length();
        for(int index = 0; index < size; index++){
            Character c1 = word1.charAt(index);
            Character c2 = word2.charAt(index);
            int number1 = order.indexOf(c1)+1;
            int number2 = order.indexOf(c2)+1;
            if(number1<number2)
                return true;
            else if (number1>number2)
                return false;
        }
        return false;
    }
}
