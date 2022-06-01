package com.battlelancer.seriesguide.streaming;

import java.lang.System;

@androidx.room.Entity(tableName = "sg_watch_provider", indices = {@androidx.room.Index(unique = true, value = {"provider_id", "type"}), @androidx.room.Index(value = {"provider_name"}), @androidx.room.Index(value = {"display_priority"}), @androidx.room.Index(value = {"enabled"}), @androidx.room.Index(value = {"type"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/SgWatchProvider;", "", "_id", "", "provider_id", "provider_name", "", "display_priority", "logo_path", "type", "enabled", "", "(IILjava/lang/String;ILjava/lang/String;IZ)V", "get_id", "()I", "getDisplay_priority", "getEnabled", "()Z", "getLogo_path", "()Ljava/lang/String;", "getProvider_id", "getProvider_name", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Type", "app_amazonDebug"})
public final class SgWatchProvider {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int _id = 0;
    private final int provider_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String provider_name = null;
    private final int display_priority = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logo_path = null;
    
    /**
     * Type 1 is shows, type 2 is movies. This splits the providers by type which may lead
     * to duplicates, but allows a different enabled set for shows than for movies.
     */
    private final int type = 0;
    private final boolean enabled = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.battlelancer.seriesguide.streaming.SgWatchProvider copy(int _id, int provider_id, @org.jetbrains.annotations.NotNull()
    java.lang.String provider_name, int display_priority, @org.jetbrains.annotations.NotNull()
    java.lang.String logo_path, int type, boolean enabled) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SgWatchProvider(int _id, int provider_id, @org.jetbrains.annotations.NotNull()
    java.lang.String provider_name, int display_priority, @org.jetbrains.annotations.NotNull()
    java.lang.String logo_path, int type, boolean enabled) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getProvider_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProvider_name() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDisplay_priority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogo_path() {
        return null;
    }
    
    /**
     * Type 1 is shows, type 2 is movies. This splits the providers by type which may lead
     * to duplicates, but allows a different enabled set for shows than for movies.
     */
    public final int component6() {
        return 0;
    }
    
    /**
     * Type 1 is shows, type 2 is movies. This splits the providers by type which may lead
     * to duplicates, but allows a different enabled set for shows than for movies.
     */
    public final int getType() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/battlelancer/seriesguide/streaming/SgWatchProvider$Type;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "SHOWS", "MOVIES", "app_amazonDebug"})
    public static enum Type {
        /*public static final*/ SHOWS /* = new SHOWS(0) */,
        /*public static final*/ MOVIES /* = new MOVIES(0) */;
        private final int id = 0;
        
        Type(int id) {
        }
        
        public final int getId() {
            return 0;
        }
    }
}