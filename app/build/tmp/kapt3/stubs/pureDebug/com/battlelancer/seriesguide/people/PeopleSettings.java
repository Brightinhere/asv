package com.battlelancer.seriesguide.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/battlelancer/seriesguide/people/PeopleSettings;", "", "()V", "KEY_PERSON_LANGUAGE", "", "getPersonLanguage", "context", "Landroid/content/Context;", "setPersonLanguage", "", "languageCode", "app_pureDebug"})
public final class PeopleSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.people.PeopleSettings INSTANCE = null;
    private static final java.lang.String KEY_PERSON_LANGUAGE = "com.uwetrottmann.seriesguide.languageperson";
    
    private PeopleSettings() {
        super();
    }
    
    /**
     * @return Two letter ISO 639-1 language code plus an extra ISO-3166-1 region tag used by TMDB
     * as preferred by the user. Or the default language.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPersonLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setPersonLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
}