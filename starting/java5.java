class MyClass{
public static void main (String[] args){
String name = "thestring";
int count=0;
int i=8;
for(int j=0;j<=i;j++){
		char it=name.charAt(i);
        if(it=='a'||it=='e'||it=='i'||it=='o'||it=='u'){
        	count++;}
}
System.out.println("vowels:"+count);
}}
