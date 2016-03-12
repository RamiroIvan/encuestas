package com.certuit.encuestas.Activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.certuit.encuestas.R;
import com.certuit.encuestas.Util.RestClient;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

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

            JSONObject obj = new JSONObject();
            try {
                obj.put("method", "get_session_key");
                JSONObject usuario = new JSONObject();
                usuario.put("username", "admin");
                usuario.put("password", "9ZTsZ2UW");
                obj.put("params", usuario);
                obj.put("id", "1");
            } catch (JSONException e) {
                e.printStackTrace();
            }


            Log.i("json",obj.toString());

            RestClient.get().auteticacion(obj, new Callback<JSONObject>() {


                @Override
                public void success(JSONObject json, Response response) {
                    if (response.getStatus() == 200) {
                        Log.i("OK", json.toString());

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
