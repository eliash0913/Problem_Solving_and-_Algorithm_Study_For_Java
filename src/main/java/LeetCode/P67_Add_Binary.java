package LeetCode;

public class P67_Add_Binary {
    public String addBinary(String a, String b) {
        String result = "";
        String carry = "0";
        boolean aIsBigger = a.length()>b.length();
        int size = aIsBigger ? a.length() : b.length();
        for(int i = 1; i <= size; i++){
            int aIdx = a.length() - i;
            int bIdx = b.length() - i;
            if(a.length()-i >= 0 && b.length()-i >= 0){
                if(a.charAt(aIdx)=='1' && b.charAt(bIdx)=='1'){
                    if(carry=="1"){
                        result = "1"+result;
                    } else {
                        result = "0"+result;
                        carry="1";
                    }
                } else if(a.charAt(aIdx)=='1' || b.charAt(bIdx)=='1') {
                    if(carry=="1"){
                        result = "0"+result;
                        carry="1";
                    } else {
                        result = "1"+result;
                    }
                } else {
                    result = carry + result;
                    carry="0";
                }
            } else {
                if(a.length()-i >= 0){
                    if(a.charAt(aIdx)=='1'){
                        if(carry=="1"){
                            result = "0"+result;
                        } else {
                            result = "1"+result;
                        }
                    } else {
                        result = carry + result;
                        carry="0";
                    }
                } else if (b.length()-i >= 0){
                    if(b.charAt(bIdx)=='1'){
                        if(carry=="1"){
                            result = "0"+result;
                        } else {
                            result = "1"+result;
                        }
                    } else {
                        result = carry + result;
                        carry="0";
                    }
                }
            }
        }
        return carry == "0" ? result : carry + result;
    }
}
