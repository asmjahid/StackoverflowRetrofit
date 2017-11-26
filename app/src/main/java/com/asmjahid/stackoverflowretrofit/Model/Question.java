package com.asmjahid.stackoverflowretrofit.Model;

/**
 * Created by asmjahid on 26-Nov-17.
 */
import com.google.gson.annotations.SerializedName;

public class Question {

    public String title;
    public String body;

    @SerializedName("question_id")
    public String questionId;

    @Override
    public String toString() {
        return(title);
    }
}