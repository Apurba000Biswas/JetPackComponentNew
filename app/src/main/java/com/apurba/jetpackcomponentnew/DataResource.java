package com.apurba.jetpackcomponentnew;

import java.util.List;

public class DataResource<T> {

    private DataState state;

    private T data;
    private String errorMessage;


    public enum DataState{
        LOADING, ERROR, NO_INTERNET, SUCCESS
    }

    public DataState getCurrentState(){
        return state;
    }

    public T getData(){
        return data;
    }

    public void setLoadingState(){
        this.state = DataState.LOADING;
    }

    public void setErrorState(String message){
        this.state = DataState.ERROR;
        this.errorMessage = message;
    }

    public void setSuccessState(T data){
        this.state = DataState.SUCCESS;
        this.data = data;
    }
}
