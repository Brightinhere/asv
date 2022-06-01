package com.battlelancer.seriesguide.shows.overview;

import java.lang.System;

/**
 * Displays extended information (poster, release info, description, ...) and actions (favoriting,
 * shortcut) for a particular show.
 */
@android.annotation.SuppressLint(value = {"NonConstantResourceId"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0006\u0010T\u001a\u00020UH\u0002J\n\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u0084\u0001\u001a\u00030\u0082\u0001H\u0002J\u0016\u0010\u0085\u0001\u001a\u00030\u0082\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016J-\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016J\n\u0010\u008d\u0001\u001a\u00030\u0082\u0001H\u0016J\u0014\u0010\u008e\u0001\u001a\u00030\u0082\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0007J\n\u0010\u0091\u0001\u001a\u00030\u0082\u0001H\u0016J\n\u0010\u0092\u0001\u001a\u00030\u0082\u0001H\u0016J\u001f\u0010\u0093\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u001f2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u0016J\u0016\u0010\u0095\u0001\u001a\u00030\u0082\u00012\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001H\u0002J\u0012\u0010\u0098\u0001\u001a\u00030\u0082\u00012\u0006\u0010\\\u001a\u00020]H\u0002J\n\u0010\u0099\u0001\u001a\u00030\u0082\u0001H\u0002J\u0014\u0010\u009a\u0001\u001a\u00030\u0082\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0082\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0002J\n\u0010\u009e\u0001\u001a\u00030\u0082\u0001H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001e\u0010\u0018\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001e\u0010\u001b\u001a\u00020\r8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001e\u0010\'\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR\u001e\u0010*\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR\u001e\u0010-\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001e\u00100\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR\u001e\u00103\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR\u001e\u00106\u001a\u00020\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR\u001e\u00109\u001a\u00020:8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020\u001f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001e\u0010H\u001a\u00020:8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\u001e\u0010K\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010B\"\u0004\bM\u0010DR\u001e\u0010N\u001a\u00020O8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010V\u001a\u00020W8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR\u0010\u0010\\\u001a\u0004\u0018\u00010]X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010_\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010B\"\u0004\ba\u0010DR\u001e\u0010b\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010B\"\u0004\bd\u0010DR\u001e\u0010e\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010B\"\u0004\bg\u0010DR\u001e\u0010h\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010B\"\u0004\bj\u0010DR\u001e\u0010k\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010B\"\u0004\bm\u0010DR\u001e\u0010n\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010B\"\u0004\bp\u0010DR\u001e\u0010q\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010B\"\u0004\bs\u0010DR\u001e\u0010t\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010B\"\u0004\bv\u0010DR\u001e\u0010w\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010B\"\u0004\by\u0010DR\u001e\u0010z\u001a\u00020@8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010B\"\u0004\b|\u0010DR\u0014\u0010}\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010~\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u007f\u001a\u00030\u0080\u0001X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00a0\u0001"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/ShowFragment;", "Landroidx/fragment/app/Fragment;", "showRowId", "", "(J)V", "()V", "buttonComments", "Landroid/widget/Button;", "getButtonComments$app_pureDebug", "()Landroid/widget/Button;", "setButtonComments$app_pureDebug", "(Landroid/widget/Button;)V", "buttonFavorite", "Lcom/google/android/material/button/MaterialButton;", "getButtonFavorite$app_pureDebug", "()Lcom/google/android/material/button/MaterialButton;", "setButtonFavorite$app_pureDebug", "(Lcom/google/android/material/button/MaterialButton;)V", "buttonHidden", "getButtonHidden$app_pureDebug", "setButtonHidden$app_pureDebug", "buttonImdb", "getButtonImdb$app_pureDebug", "setButtonImdb$app_pureDebug", "buttonLanguage", "getButtonLanguage$app_pureDebug", "setButtonLanguage$app_pureDebug", "buttonNotify", "getButtonNotify$app_pureDebug", "setButtonNotify$app_pureDebug", "buttonRate", "Landroid/view/View;", "getButtonRate$app_pureDebug", "()Landroid/view/View;", "setButtonRate$app_pureDebug", "(Landroid/view/View;)V", "buttonShare", "getButtonShare$app_pureDebug", "setButtonShare$app_pureDebug", "buttonShortcut", "getButtonShortcut$app_pureDebug", "setButtonShortcut$app_pureDebug", "buttonShowMetacritic", "getButtonShowMetacritic$app_pureDebug", "setButtonShowMetacritic$app_pureDebug", "buttonSimilar", "getButtonSimilar$app_pureDebug", "setButtonSimilar$app_pureDebug", "buttonTmdb", "getButtonTmdb$app_pureDebug", "setButtonTmdb$app_pureDebug", "buttonTrakt", "getButtonTrakt$app_pureDebug", "setButtonTrakt$app_pureDebug", "buttonWebSearch", "getButtonWebSearch$app_pureDebug", "setButtonWebSearch$app_pureDebug", "castContainer", "Landroid/widget/LinearLayout;", "getCastContainer$app_pureDebug", "()Landroid/widget/LinearLayout;", "setCastContainer$app_pureDebug", "(Landroid/widget/LinearLayout;)V", "castLabel", "Landroid/widget/TextView;", "getCastLabel$app_pureDebug", "()Landroid/widget/TextView;", "setCastLabel$app_pureDebug", "(Landroid/widget/TextView;)V", "containerPoster", "getContainerPoster$app_pureDebug", "setContainerPoster$app_pureDebug", "crewContainer", "getCrewContainer$app_pureDebug", "setCrewContainer$app_pureDebug", "crewLabel", "getCrewLabel$app_pureDebug", "setCrewLabel$app_pureDebug", "imageViewPoster", "Landroid/widget/ImageView;", "getImageViewPoster$app_pureDebug", "()Landroid/widget/ImageView;", "setImageViewPoster$app_pureDebug", "(Landroid/widget/ImageView;)V", "languageCode", "", "model", "Lcom/battlelancer/seriesguide/shows/overview/ShowViewModel;", "getModel", "()Lcom/battlelancer/seriesguide/shows/overview/ShowViewModel;", "model$delegate", "Lkotlin/Lazy;", "show", "Lcom/battlelancer/seriesguide/shows/database/SgShow2;", "showId", "textShowLastUpdated", "getTextShowLastUpdated$app_pureDebug", "setTextShowLastUpdated$app_pureDebug", "textViewContentRating", "getTextViewContentRating$app_pureDebug", "setTextViewContentRating$app_pureDebug", "textViewFirstRelease", "getTextViewFirstRelease$app_pureDebug", "setTextViewFirstRelease$app_pureDebug", "textViewGenres", "getTextViewGenres$app_pureDebug", "setTextViewGenres$app_pureDebug", "textViewOverview", "getTextViewOverview$app_pureDebug", "setTextViewOverview$app_pureDebug", "textViewRating", "getTextViewRating$app_pureDebug", "setTextViewRating$app_pureDebug", "textViewRatingRange", "getTextViewRatingRange$app_pureDebug", "setTextViewRatingRange$app_pureDebug", "textViewRatingUser", "getTextViewRatingUser$app_pureDebug", "setTextViewRatingUser$app_pureDebug", "textViewRatingVotes", "getTextViewRatingVotes$app_pureDebug", "setTextViewRatingVotes$app_pureDebug", "textViewReleaseCountry", "getTextViewReleaseCountry$app_pureDebug", "setTextViewReleaseCountry$app_pureDebug", "textViewReleaseTime", "textViewStatus", "unbinder", "Lbutterknife/Unbinder;", "changeShowLanguage", "", "createShortcut", "displayLanguageSettings", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onEventMainThread", "event", "Lcom/battlelancer/seriesguide/ui/dialogs/L10nDialogFragment$LanguageChangedEvent;", "onStart", "onStop", "onViewCreated", "view", "populateCredits", "credits", "Lcom/uwetrottmann/tmdb2/entities/Credits;", "populateShow", "rateShow", "setCastVisibility", "visible", "", "setCrewVisibility", "shareShow", "Companion", "app_pureDebug"})
public final class ShowFragment extends androidx.fragment.app.Fragment {
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerShowPoster)
    public android.view.View containerPoster;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.imageViewShowPoster)
    public android.widget.ImageView imageViewPoster;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowStatus)
    public android.widget.TextView textViewStatus;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowReleaseTime)
    public android.widget.TextView textViewReleaseTime;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowOverview)
    public android.widget.TextView textViewOverview;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowReleaseCountry)
    public android.widget.TextView textViewReleaseCountry;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowFirstAirdate)
    public android.widget.TextView textViewFirstRelease;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textShowLastUpdated)
    public android.widget.TextView textShowLastUpdated;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowContentRating)
    public android.widget.TextView textViewContentRating;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewShowGenres)
    public android.widget.TextView textViewGenres;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewRatingsValue)
    public android.widget.TextView textViewRating;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewRatingsRange)
    public android.widget.TextView textViewRatingRange;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewRatingsVotes)
    public android.widget.TextView textViewRatingVotes;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.textViewRatingsUser)
    public android.widget.TextView textViewRatingUser;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowFavorite)
    public com.google.android.material.button.MaterialButton buttonFavorite;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowNotify)
    public com.google.android.material.button.MaterialButton buttonNotify;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowHidden)
    public com.google.android.material.button.MaterialButton buttonHidden;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowShortcut)
    public android.widget.Button buttonShortcut;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowLanguage)
    public android.widget.Button buttonLanguage;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerRatings)
    public android.view.View buttonRate;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowSimilar)
    public android.widget.Button buttonSimilar;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowImdb)
    public android.widget.Button buttonImdb;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowMetacritic)
    public android.widget.Button buttonShowMetacritic;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowTmdb)
    public android.widget.Button buttonTmdb;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowTrakt)
    public android.widget.Button buttonTrakt;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowWebSearch)
    public android.widget.Button buttonWebSearch;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowComments)
    public android.widget.Button buttonComments;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.buttonShowShare)
    public android.widget.Button buttonShare;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.labelCast)
    public android.widget.TextView castLabel;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerCast)
    public android.widget.LinearLayout castContainer;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.labelCrew)
    public android.widget.TextView crewLabel;
    @butterknife.BindView(value = com.battlelancer.seriesguide.R.id.containerCrew)
    public android.widget.LinearLayout crewContainer;
    private butterknife.Unbinder unbinder;
    private long showId = 0L;
    private com.battlelancer.seriesguide.shows.database.SgShow2 show;
    private java.lang.String languageCode;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy model$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.battlelancer.seriesguide.shows.overview.ShowFragment.Companion Companion = null;
    private static final java.lang.String ARG_SHOW_ROWID = "show_id";
    
    public ShowFragment() {
        super();
    }
    
    public ShowFragment(long showRowId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getContainerPoster$app_pureDebug() {
        return null;
    }
    
    public final void setContainerPoster$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageViewPoster$app_pureDebug() {
        return null;
    }
    
    public final void setImageViewPoster$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewOverview$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewOverview$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewReleaseCountry$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewReleaseCountry$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewFirstRelease$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewFirstRelease$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextShowLastUpdated$app_pureDebug() {
        return null;
    }
    
    public final void setTextShowLastUpdated$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewContentRating$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewContentRating$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewGenres$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewGenres$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewRating$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewRating$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewRatingRange$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewRatingRange$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewRatingVotes$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewRatingVotes$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTextViewRatingUser$app_pureDebug() {
        return null;
    }
    
    public final void setTextViewRatingUser$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.button.MaterialButton getButtonFavorite$app_pureDebug() {
        return null;
    }
    
    public final void setButtonFavorite$app_pureDebug(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.button.MaterialButton getButtonNotify$app_pureDebug() {
        return null;
    }
    
    public final void setButtonNotify$app_pureDebug(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.button.MaterialButton getButtonHidden$app_pureDebug() {
        return null;
    }
    
    public final void setButtonHidden$app_pureDebug(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonShortcut$app_pureDebug() {
        return null;
    }
    
    public final void setButtonShortcut$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonLanguage$app_pureDebug() {
        return null;
    }
    
    public final void setButtonLanguage$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getButtonRate$app_pureDebug() {
        return null;
    }
    
    public final void setButtonRate$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonSimilar$app_pureDebug() {
        return null;
    }
    
    public final void setButtonSimilar$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonImdb$app_pureDebug() {
        return null;
    }
    
    public final void setButtonImdb$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonShowMetacritic$app_pureDebug() {
        return null;
    }
    
    public final void setButtonShowMetacritic$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonTmdb$app_pureDebug() {
        return null;
    }
    
    public final void setButtonTmdb$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonTrakt$app_pureDebug() {
        return null;
    }
    
    public final void setButtonTrakt$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonWebSearch$app_pureDebug() {
        return null;
    }
    
    public final void setButtonWebSearch$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonComments$app_pureDebug() {
        return null;
    }
    
    public final void setButtonComments$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getButtonShare$app_pureDebug() {
        return null;
    }
    
    public final void setButtonShare$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCastLabel$app_pureDebug() {
        return null;
    }
    
    public final void setCastLabel$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCastContainer$app_pureDebug() {
        return null;
    }
    
    public final void setCastContainer$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getCrewLabel$app_pureDebug() {
        return null;
    }
    
    public final void setCrewLabel$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCrewContainer$app_pureDebug() {
        return null;
    }
    
    public final void setCrewContainer$app_pureDebug(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.shows.overview.ShowViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void populateShow(com.battlelancer.seriesguide.shows.database.SgShow2 show) {
    }
    
    private final void populateCredits(com.uwetrottmann.tmdb2.entities.Credits credits) {
    }
    
    private final void setCastVisibility(boolean visible) {
    }
    
    private final void setCrewVisibility(boolean visible) {
    }
    
    private final void rateShow() {
    }
    
    private final void displayLanguageSettings() {
    }
    
    private final void changeShowLanguage(java.lang.String languageCode) {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull()
    com.battlelancer.seriesguide.ui.dialogs.L10nDialogFragment.LanguageChangedEvent event) {
    }
    
    private final void createShortcut() {
    }
    
    private final void shareShow() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.os.Bundle buildArgs(long showRowId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/shows/overview/ShowFragment$Companion;", "", "()V", "ARG_SHOW_ROWID", "", "buildArgs", "Landroid/os/Bundle;", "showRowId", "", "app_pureDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.os.Bundle buildArgs(long showRowId) {
            return null;
        }
    }
}