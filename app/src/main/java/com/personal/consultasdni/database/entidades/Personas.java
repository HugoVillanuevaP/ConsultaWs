package com.personal.consultasdni.database.entidades;

import android.content.IntentFilter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class Personas {
    @Entity( tableName = "personas")
    public static class tb {
        @PrimaryKey
        @ColumnInfo(name = "dni") @NonNull                       private String dni;
        @ColumnInfo(name = "nombre") @NonNull                    private String nombre;
        @ColumnInfo(name = "cod_verificacion") @Nullable         private String cod_verificacion;
        @ColumnInfo(name = "ap_paterno") @NonNull                private String ap_paterno;
        @ColumnInfo(name = "ap_materno") @NonNull                private String ap_materno;
        @ColumnInfo(name = "fecha_nacimiento") @Nullable         private String fecha_nacimiento;
        @ColumnInfo(name = "edad") @Nullable                     private String edad;
        @ColumnInfo(name = "sexo") @Nullable                     private String sexo;
        @ColumnInfo(name = "ubi_dir_dist") @Nullable             private String ubi_dir_dist;
        @ColumnInfo(name = "ubi_dir_prov") @Nullable             private String ubi_dir_prov;
        @ColumnInfo(name = "ubi_dir_depa") @Nullable             private String ubi_dir_depa;

        public tb(@NonNull String dni, @NonNull String nombre, @Nullable String cod_verificacion, @NonNull String ap_paterno, @NonNull String ap_materno, @Nullable String fecha_nacimiento, @Nullable String edad, @Nullable String sexo, @Nullable String ubi_dir_dist, @Nullable String ubi_dir_prov, @Nullable String ubi_dir_depa) {
            this.dni = dni;
            this.nombre = nombre;
            this.cod_verificacion = cod_verificacion;
            this.ap_paterno = ap_paterno;
            this.ap_materno = ap_materno;
            this.fecha_nacimiento = fecha_nacimiento;
            this.edad = edad;
            this.sexo = sexo;
            this.ubi_dir_dist = ubi_dir_dist;
            this.ubi_dir_prov = ubi_dir_prov;
            this.ubi_dir_depa = ubi_dir_depa;
        }

        @NonNull
        public String getDni() { return dni; }
        public void setDni(@NonNull String dni) { this.dni = dni; }

        @NonNull
        public String getNombre() { return nombre; }
        public void setNombre(@NonNull String nombre) { this.nombre = nombre; }

        @Nullable
        public String getCod_verificacion() {
            return cod_verificacion;
        }

        public void setCod_verificacion(@Nullable String cod_verificacion) {
            this.cod_verificacion = cod_verificacion;
        }

        @NonNull
        public String getAp_paterno() {
            return ap_paterno;
        }

        public void setAp_paterno(@NonNull String ap_paterno) {
            this.ap_paterno = ap_paterno;
        }

        @NonNull
        public String getAp_materno() {
            return ap_materno;
        }

        public void setAp_materno(@NonNull String ap_materno) {
            this.ap_materno = ap_materno;
        }

        @Nullable
        public String getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setFecha_nacimiento(@Nullable String fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }

        @Nullable
        public String getEdad() {
            return edad;
        }

        public void setEdad(@Nullable String edad) {
            this.edad = edad;
        }

        @Nullable
        public String getSexo() {
            return sexo;
        }

        public void setSexo(@Nullable String sexo) {
            this.sexo = sexo;
        }

        @Nullable
        public String getUbi_dir_dist() {
            return ubi_dir_dist;
        }

        public void setUbi_dir_dist(@Nullable String ubi_dir_dist) {
            this.ubi_dir_dist = ubi_dir_dist;
        }

        @Nullable
        public String getUbi_dir_prov() {
            return ubi_dir_prov;
        }

        public void setUbi_dir_prov(@Nullable String ubi_dir_prov) {
            this.ubi_dir_prov = ubi_dir_prov;
        }

        @Nullable
        public String getUbi_dir_depa() {
            return ubi_dir_depa;
        }

        public void setUbi_dir_depa(@Nullable String ubi_dir_depa) {
            this.ubi_dir_depa = ubi_dir_depa;
        }
    }

    @Dao
    public interface sql{

        @Insert
        void insert( tb persona);

        @Update
        void update( tb persona );

        @Query( "SELECT * FROM personas" )
        List<tb> all();

        @Query( "SELECT COUNT(0) FROM personas" )
        int count();

        @Query( "SELECT * FROM personas WHERE dni =:dni LIMIT 1" )
        tb find ( String dni );

    }
}
