package com.firman.tugasakhir.rest

import com.firman.tugasakhir.BuildConfig
import com.firman.tugasakhir.model.ModelRootData
import retrofit.http.GET
import rx.Observable

interface ApiService {
    // Untuk Get Data Jadwal Kuliah Lewat Api Key + NPM yang sudah di masukkan di Gradle

    @GET("detil_jadwal?key="+ BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(): Observable<ModelRootData>

    // Untuk Get Data Profile Lewat Api Key + NPM yang sudah di masukkan di Gradle

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(): Observable<ModelRootData>

}