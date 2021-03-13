package com.apurba.jetpackcomponentnew.withDataBindingFirstWay;

import android.util.Log;

import java.util.List;

public class DemoPrinter<T>{


    public void printList(List<T> list){

        for (T data : list){
            Log.d("Apurba", "Data : " + data);
        }
    }





    public static class MyClass<T>{
        private final T data;

        public MyClass(T data) {
            this.data = data;
        }

        public T getData(){
            return this.data;
        }


        @Override
        public String toString() {
            return "MyClass{" +
                    "data=" + data +
                    '}';
        }
    }
}
