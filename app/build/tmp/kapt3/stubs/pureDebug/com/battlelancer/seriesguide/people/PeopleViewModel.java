package com.battlelancer.seriesguide.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/battlelancer/seriesguide/people/PeopleViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "tmdbId", "", "mediaType", "Lcom/battlelancer/seriesguide/people/PeopleActivity$MediaType;", "(Landroid/app/Application;ILcom/battlelancer/seriesguide/people/PeopleActivity$MediaType;)V", "credits", "Landroidx/lifecycle/MutableLiveData;", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "getCredits", "()Landroidx/lifecycle/MutableLiveData;", "loadCredits", "", "app_pureDebug"})
public final class PeopleViewModel extends androidx.lifecycle.AndroidViewModel {
    private final int tmdbId = 0;
    private final com.battlelancer.seriesguide.people.PeopleActivity.MediaType mediaType = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.uwetrottmann.tmdb2.entities.Credits> credits = null;
    
    public PeopleViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, int tmdbId, @org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.people.PeopleActivity.MediaType mediaType) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.uwetrottmann.tmdb2.entities.Credits> getCredits() {
        return null;
    }
    
    public final void loadCredits() {
    }
}