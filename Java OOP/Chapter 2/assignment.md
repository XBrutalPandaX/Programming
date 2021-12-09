
# Number Format Class  

Is an abstract base class for all number formats. This class provides interface for formatting and parsing numbers.  NumberFormat can provide methods to determine which locales (India, US, Italy..) have number formats and what their name are.  NumberFormat helps us format and parse numbers for any locale. 

A good example for this would be having a double type number. This number can be represented in different ways in different countries.  

Example 

For instance lets have a double  

Double number = 108889.987 

In Us it is represented as 108,889.987 

Mean while in Italy it can be represented as 108.889,987 

(will use this own example later on as a java code in detail below) 

# Decimal Format  

DecimalFormat is a concreat of subclass of NumberFormat that formats decimal numbers. Its fetures is designed to make it possible to parse and fromat numbers in any locale. This includes . Western, Arabic and Indic digits. We can further use different kinds of numbers including integers (123), fixed-point numbers (123.4) ,scientific notation (1.23E4), percentages (12%), and currency amounts ($123).  

It can also be used inversely, to parse Strings into numbers. 

Example  

A good example for where we would use is to make patterns for decimals. 

Lets say we have a decimal  

Double number = 1089288920.99 

String pattern = “###,###.##” 

(Our goal is to turn the above decimal as the pattern or as  10,8928,8920.99) 

The java code example will be stated below in detail 

 

 

# Example in java code 

##    Number Format Example 
``` java
import java.text.DecimalFormat;

public class ex_one {
   public static void main(String[] args) {
      String pattern = "##,####,####.##";//12 Digit with our own pattern
      double number = 1089288920.99d;
      DecimalFormat format_style = new DecimalFormat(pattern);
      System.out.println("without any format : "+number);      
      System.out.println("Customized format: "+format_style.format(number));
      /* Output
        without any format : 1.08928892099E9
        Customized format: 10,8928,8920.99
       */
   }
}

```

In the Above example we have imported java.txt.Numberformat & java.util.Locale 

    NumberFormat will be used to provides methods for determining which locales have number formats, and what their names are.                                                                                                               A Locale object represents a specific geographical, political, or cultural region in java 

    We declared a double a so that we can use this double to apply our format on 

    We used getInstance or getNumberInstance to get the normal number format into different Locale. 

    We used 2 types of Locale US (united states) and Italy . SInce both have different number format. 

    Then we output both of them and we get our outputs as we expected and shown on the comment 


   ## Decimal Format 
```java

import java.text.NumberFormat;
import java.util.Locale;

class ex_one{
  public static void main(String[] args){
    double a=108889.987 ;
    NumberFormat n_us= NumberFormat.getInstance(Locale.US);
    NumberFormat n_it= NumberFormat.getInstance(Locale.ITALY);
    System.out.println(" US form : " + n_us.format(a));
    System.out.println(" Italian form : " + n_it.format(a));
    /* Expected result 
     US form : 108,889.987
     Italian form : 108.889,987
    */
  }
}
```
    We imported java.text.DecimalFormat so that we can use DecimalFormat to comprises a pattern and a set of symobls. 

    We made our pattern with 12 digit and named the string “pattern” 

    We made format_style object using DecimalFormat class and create pattern we want 

    Then to compare we printed out the decimal without any pattern and one with pattern 
