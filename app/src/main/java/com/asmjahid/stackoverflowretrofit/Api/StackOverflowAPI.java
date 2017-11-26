package com.asmjahid.stackoverflowretrofit.Api;

import com.asmjahid.stackoverflowretrofit.Adapter.ListWrapper;
import com.asmjahid.stackoverflowretrofit.Model.Answer;
import com.asmjahid.stackoverflowretrofit.Model.Question;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.Call;

public interface StackOverflowAPI {
    String BASE_URL = "https://api.stackexchange.com";

    @GET("/2.2/questions?order=desc&sort=votes&site=stackoverflow&tagged=android&filter=withbody")
    Call<ListWrapper<Question>> getQuestions();

    @GET("/2.2/questions/{id}/answers?order=desc&sort=votes&site=stackoverflow")
    Call<ListWrapper<Answer>> getAnswersForQuestion(@Path("id") String questionId);

}