package com.apurba.jetpackcomponentnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.apurba.jetpackcomponentnew.withDataBindingFirstWay.DemoPrinter;
import com.apurba.jetpackcomponentnew.withDataBindingFirstWay.ItemNameImage;
import com.apurba.jetpackcomponentnew.withDataBindingFirstWay.ItemNameImgDesc;
import com.apurba.jetpackcomponentnew.withDataBindingFirstWay.ItemNameImgImg;
import com.apurba.jetpackcomponentnew.withDataBindingFirstWay.ListAdapterWithBindingFirstWay;
import com.apurba.jetpackcomponentnew.withoutDataBinding.ListAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setRecyclerView();


        printTheDemoList();
    }


    private void setRecyclerView(){
        RecyclerView rvList = findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL
                , false);
        rvList.setLayoutManager(layoutManager);

        //ListAdapter adapter = new ListAdapter();
        ListAdapterWithBindingFirstWay adapter = new ListAdapterWithBindingFirstWay(getDataSet());

        rvList.setAdapter(adapter);
    }


    private List<Object> getDataSet(){
        List<Object> dataSet = new ArrayList<>();
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        dataSet.add(new ItemNameImgDesc("This is Name-Image-Description Model"
                , "https://media-cdn.tripadvisor.com/media/photo-s/14/15/0c/12/beautiful-weather.jpg", "Lorem ipsum, or lipsum as it " +
                "is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown " +
                "typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum" +
                " et Malorum for use in a type specimen book."));
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));

        dataSet.add(new ItemNameImgImg("This is Name-Image_Image Model", "https://bumblepuppies.files.wordpress.com/2015/06/pond-sunny-weather.jpg?w=640"
                , "https://www.teahub.io/photos/full/259-2591420_beautiful-weather.jpg"));

        dataSet.add(new ItemNameImgImg("This is Name-Image_Image Model", "https://bumblepuppies.files.wordpress.com/2015/06/pond-sunny-weather.jpg?w=640"
                , "https://www.teahub.io/photos/full/259-2591420_beautiful-weather.jpg"));
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        dataSet.add(new ItemNameImgDesc("This is Name-Image-Description Model"
                , "https://media-cdn.tripadvisor.com/media/photo-s/14/15/0c/12/beautiful-weather.jpg", "Lorem ipsum, or lipsum as it " +
                "is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown " +
                "typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum" +
                " et Malorum for use in a type specimen book."));
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));

        List<ItemNameImage> nameImageList = new ArrayList<>();
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        nameImageList.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));

        dataSet.add(nameImageList);


        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));
        dataSet.add(new ItemNameImage("This is Name-Image Model", "https://cdnpt01.viewbug.com/media/mediafiles/2016/04/30/65766312_large1300.jpg"));



        return dataSet;
    }


    @BindingAdapter({ "avatar" })
    public static void loadImage(ImageView imageView, String imageURL) {
        Picasso.get()
                .load(imageURL)
                .fit()
                .centerCrop()
                .into(imageView);
    }





    private void printTheDemoList(){
        DemoPrinter<DemoPrinter.MyClass<String>> printer = new DemoPrinter<>();

        List<DemoPrinter.MyClass<String>> list = new ArrayList<>();
        list.add(new DemoPrinter.MyClass<>("This is Data 1"));
        list.add(new DemoPrinter.MyClass<>("This is Data 2"));
        list.add(new DemoPrinter.MyClass<>("This is Data 3"));
        list.add(new DemoPrinter.MyClass<>("This is Data 4"));
        list.add(new DemoPrinter.MyClass<>("This is Data 5"));
        list.add(new DemoPrinter.MyClass<>("This is Data 6"));
        list.add(new DemoPrinter.MyClass<>("This is Data 7"));
        list.add(new DemoPrinter.MyClass<>("This is Data 8"));
        list.add(new DemoPrinter.MyClass<>("This is Data 9"));
        list.add(new DemoPrinter.MyClass<>("This is Data 10"));

        printer.printList(list);

    }

}