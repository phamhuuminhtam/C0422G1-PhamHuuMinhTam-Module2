package common;

public class Random {
    public static String random(){
        int random1 =(int) Math.floor(Math.random()*10)/1 ;
        int random2 =(int) Math.floor(Math.random()*10)/1 ;
        int random3 =(int) Math.floor(Math.random()*10)/1 ;
        int random4 =(int) Math.floor(Math.random()*10)/1 ;


        String random = ""+random1 + random2+random3+random4;
        return random;
    }

    public static void main(String[] args) {
        System.out.println(random());
    }
}
