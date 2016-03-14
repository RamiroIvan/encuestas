package com.certuit.encuestas.Activities;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.certuit.encuestas.R;
import com.certuit.limesurvey.client.LimeSurveyClient;
import com.certuit.limesurvey.model.Group;
import com.certuit.limesurvey.model.LimeSurveyJsonObject;
import com.certuit.limesurvey.model.Question;
import com.certuit.limesurvey.model.Survey;
import com.certuit.limesurvey.model.User;
import com.certuit.limesurvey.service.QuestionService;
import com.google.gson.JsonObject;

import org.json.JSONException;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new verificarLoginAsyncTask().execute();
    }


    private class verificarLoginAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.i("Iniciando", "Iniciando ejecución");
        }

        @Override
        protected Void doInBackground(Void... params) {

            Log.i("Descargando", "Descargando información");
            User userAuth=new User("admin","9ZTsZ2UW");
            JsonObject postData= null;
            try {
                Survey survey=new Survey();
                survey.setSid("20");
                Group group=new Group();
                group.setGid("3");
                postData = QuestionService.getJsonListQuestions(survey,group, "j2uq6giuxi2y22cxtz7djfm5yhsb4wvv","es");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            Log.i("json",postData.toString());

            LimeSurveyClient.get().listQuestions(postData, new Callback<LimeSurveyJsonObject<List<Question>>>() {


                @Override
                public void success(LimeSurveyJsonObject<List<Question>> json, Response response) {
                    if (response.getStatus() == 200) {
                        Log.i("OK", json.getResults().toString());

                    }
                }

                @Override
                public void failure(RetrofitError error) {
                    String mensaje = "";
                    switch (error.getKind()) {
                        case HTTP:
                            Response response = error.getResponse();
                            Log.i("Aplicacion", "Error HTTP : " + response.getStatus());
                            switch (response.getStatus()) {
                                case 400:
                                    Log.i("Aplicacion", "Error 400");
                                    break;
                                case 401:
                                    Log.i("Aplicacion", "Error 401");
                                    break;
                                case 403:
                                    Log.i("Aplicacion", "Error 403");
                                    break;
                                case 404:
                                    Log.i("Aplicacion", "Error 404");
                                    break;
                                case 500:
                                    Log.i("Aplicacion", "Error 500");
                                    break;
                                case 503:
                                    Log.i("Aplicacion", "Error 503");
                                    break;
                            }
                            mensaje = "No se pudo conectar al servidor";
                            break;

                        case NETWORK:
                            Log.i("Aplicacion", "NETWORK");
                            mensaje = "Verifique su conexión a internet";
                            Log.i("Error", mensaje);
                            break;

                        case UNEXPECTED:
                            Log.i("Aplicacion", "UNEXPECTED");
                            mensaje = "Error inesperado, reinicie la aplicación";
                            break;
                        default:
                            Log.i("Aplicacion", "Unknown error kind: " + error.getKind());
                            mensaje = "Error inesperado, reinicie la aplicación";
                    }
                }
            });

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.i("Finish", "Finalizó la ejecución");
        }
    }
}
