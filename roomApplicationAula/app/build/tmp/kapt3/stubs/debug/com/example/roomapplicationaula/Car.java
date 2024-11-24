package com.example.roomapplicationaula;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001J\b\u0010%\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014\u00a8\u0006&"}, d2 = {"Lcom/example/roomapplicationaula/Car;", "Ljava/io/Serializable;", "marca", "", "modelo", "placa", "ano", "", "id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getAno", "()I", "setAno", "(I)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarca", "()Ljava/lang/String;", "setMarca", "(Ljava/lang/String;)V", "getModelo", "setModelo", "getPlaca", "setPlaca", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/example/roomapplicationaula/Car;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
@androidx.room.Entity()
public final class Car implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String marca;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String modelo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String placa;
    private int ano;
    @androidx.room.PrimaryKey(autoGenerate = true)
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    
    public Car(@org.jetbrains.annotations.NotNull()
    java.lang.String marca, @org.jetbrains.annotations.NotNull()
    java.lang.String modelo, @org.jetbrains.annotations.NotNull()
    java.lang.String placa, int ano, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMarca() {
        return null;
    }
    
    public final void setMarca(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelo() {
        return null;
    }
    
    public final void setModelo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaca() {
        return null;
    }
    
    public final void setPlaca(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAno() {
        return 0;
    }
    
    public final void setAno(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomapplicationaula.Car copy(@org.jetbrains.annotations.NotNull()
    java.lang.String marca, @org.jetbrains.annotations.NotNull()
    java.lang.String modelo, @org.jetbrains.annotations.NotNull()
    java.lang.String placa, int ano, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
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
}