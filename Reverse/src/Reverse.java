public class Reverse {
    String name = "Shubham";

    void reverse(){
        String[] arr = new String[name.length()];

        for(int i=0;i<name.length();i++){
            arr[i] = name.split("")[name.length()-1-i];
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }

    void reverseWithoutExtraArr(){
        String[] arr =  name.split("");
        int start=0,end=arr.length-1;
        while(start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(String ch : arr){
            System.out.println(ch);
        }
    }
}
