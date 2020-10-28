package homeworkWeek3RB;

import java.util.Objects;
import java.util.Scanner;
// this program calls city name using user input
public class Answer8CityName {
    static String city="";
    public static void main(String[] args) {
        Scanner rb1 = new Scanner(System.in);
        String any;
        System.out.print("Enter any alphabet between 'a' and 'f' : ");
        any = rb1.next();
        System.out.print(cityName(any));

    }
    public static String cityName(String any){
        String  str1 = any.toLowerCase();
        if(str1.equals ("a")){
            city = "Amsterdam";

         }else if(Objects.equals (str1, "b")){
            city = "Barcelona";
        } else if(Objects.equals (str1,"c")){
            city = "Cannes";
        }else if (Objects.equals (str1 ,"d")){
            city = "Denmark";
        }else if (Objects.equals(str1 , "e")){
            city = "Egypt";
        }else if(Objects.equals (str1 , "f")){
            city = "France";
        }else {city = "Not within the range.";}
        return city;
    }
}
