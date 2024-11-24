package com.example.roomapplicationaula;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/roomapplicationaula/CarDAO;", "", "atualizar", "", "o", "Lcom/example/roomapplicationaula/Car;", "deletar", "listarAno", "", "listarCarros", "listarMarca", "listarModelo", "salvar", "app_debug"})
@androidx.room.Dao()
public abstract interface CarDAO {
    
    @androidx.room.Insert()
    public abstract void salvar(@org.jetbrains.annotations.NotNull()
    com.example.roomapplicationaula.Car o);
    
    @androidx.room.Query(value = "SELECT * FROM Car ORDER BY marca")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.roomapplicationaula.Car> listarMarca();
    
    @androidx.room.Query(value = "SELECT * FROM Car ORDER BY modelo")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.roomapplicationaula.Car> listarModelo();
    
    @androidx.room.Query(value = "SELECT * FROM Car ORDER BY ano")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.roomapplicationaula.Car> listarAno();
    
    @androidx.room.Query(value = "SELECT * FROM Car")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.roomapplicationaula.Car> listarCarros();
    
    @androidx.room.Delete()
    public abstract void deletar(@org.jetbrains.annotations.NotNull()
    com.example.roomapplicationaula.Car o);
    
    @androidx.room.Update()
    public abstract void atualizar(@org.jetbrains.annotations.NotNull()
    com.example.roomapplicationaula.Car o);
}