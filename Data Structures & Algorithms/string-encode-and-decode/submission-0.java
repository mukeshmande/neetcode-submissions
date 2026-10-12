class Solution {

    public String encode(List<String> strs) {
     StringBuilder encodedStr = new StringBuilder();
    for(String str: strs){
      encodedStr.append(str.length()).append("#").append(str);
    }
    return encodedStr.toString();
    }

    public List<String> decode(String str) {
 List<String> decodedList = new ArrayList<>();
    int i=0;
    String num = "";
    while(i<str.length()){
      if(str.charAt(i) == '#'){
        int size = Integer.valueOf(num)+i;
        StringBuilder stringBuilder = new StringBuilder();
        while(i<size){
          i++;
          stringBuilder.append(str.charAt(i));

        }
        decodedList.add(stringBuilder.toString());
        num = "";
      } else{
        num+=str.charAt(i);
      }
      i++;
    }
    return decodedList;
    }
}
