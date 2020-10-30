package com.example.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        // нам нужно разбить наш код на другие куски кода, для этого в обьекте стринг есть метод сплит
//        String nameString = "Андрей, Алексей, Роман, Павел, Михаил";
//        //создадим массив строк, который будет содержать данные имена, для того чтобы разбить данную строку на 5 различных имен, необходимо у данной строки вызвать метод сплит
//        String[] names = nameString.split(", ");
//        for (String name : names){
//            Log.i("MyName", name);
//        }
//        String geometry = "Геометрия";
//        String meter = geometry.substring(3, 7);
//        Log.i("MyName", meter);

        String url = "<img src='https://vmma.ru/wp-content/uploads/2018/10/MCGREGOR_CONOR-150x150.png' alt='Конор МакГрегор' />";
        Pattern patternImg = Pattern.compile("img src='(.*?)' ");
        Pattern patternName = Pattern.compile("alt='(.*?)' />");
        Matcher matcherImg = patternImg.matcher(url);
        Matcher matcherName = patternName.matcher(url);
        while (matcherImg.find()) {
            Log.i("MyName", matcherImg.group(1));
        }
        while ( (matcherName.find())){
            Log.i("MyName", matcherName.group(1));
        }
    }
    }