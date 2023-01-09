package ru.synergy;

//ПСЕВДОКОД
/*
class ИмяКласса{
        типПоля1 имяПоля1; // имя Переменной1
        типПоля2 имяПлоя2; // имя Переменной2

                типРезультата1 имяМетода1 (параметрыМетода1) {
                    //телоМетода1
                }
        типРезультата2 имяМетода2 (параметрыМетода2) {

                        //телоМетода2
        }
}
*/
public class Rect {
    double width;
    double height;

    String nameOfRect;


    double getArea(){
        return width*height;
    }

    void maignify (double koeff){
        width *= koeff;
        height *= koeff;
    }


    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }
}
