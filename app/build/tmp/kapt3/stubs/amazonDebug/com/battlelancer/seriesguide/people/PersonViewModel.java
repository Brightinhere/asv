package com.battlelancer.seriesguide.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/battlelancer/seriesguide/people/PersonViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "personTmdbId", "", "(Landroid/app/Application;I)V", "languageCode", "Landroidx/lifecycle/MutableLiveData;", "", "getLanguageCode", "()Landroidx/lifecycle/MutableLiveData;", "personLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/uwetrottmann/tmdb2/entities/Person;", "getPersonLiveData", "()Landroidx/lifecycle/LiveData;", "app_amazonDebug"})
public final class PersonViewModel extends androidx.lifecycle.AndroidViewModel {
    private final int personTmdbId = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> languageCode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.uwetrottmann.tmdb2.entities.Person> personLiveData = null;
    
    public PersonViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int personTmdbId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.uwetrottmann.tmdb2.entities.Person> getPersonLiveData() {
        return null;
    }
}