ELSE IF

import java.util.*;
class demo{
public static void main(String args[]){
int score=66;
if(score>=30){
System.out.print("buy phone");}
elseif(score>60){
System.out.print("buy bike");
}
elseif(score>90){
System.out.print("buy car");
}
}
}

USING COMPARISION OPERATOR;

import java.util.*;
class demo{
public static void main(String args[]){
int score=66;
if(score>30 && score<60){
System.out.print("buy bag");}
elseif(score>60 && score>90){
System.out.print("buy playstation");}
else if(score>90){
System.out.print("buy car");}
}
}


NESTED IF;
import java.util.*;
class demo{
public static void main(String args[]){
boolean kfc =true;
boolean burger=true;
boolean soda=true;
if(kfc){
System.out.print("enter kfc");
}
if(burger){
System.out.print("eat burger");
}
if(soda){
System.out.print("drink soda")}
}
}
in this condition all are true
in another condition even if the any one condition is false which statement u will give the false that not print if the first statement is false all condition will not print


