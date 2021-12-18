package com.example.manicuraapp3.casos_de_uso;

import android.database.Cursor;

import com.example.manicuraapp3.modelos.Servicio;
import com.example.manicuraapp3.modelos.Sucursal;

import java.util.ArrayList;

public class CasoUsoSucursales {
    public ArrayList<Sucursal> llenarListaSucursal(Cursor cursor){
        ArrayList<Sucursal> list = new ArrayList<>();
        if(cursor.getCount() == 0){
            return list;
        }else{
            while (cursor.moveToNext()){
                Sucursal sucursal = new Sucursal(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getBlob(4)
                );
                list.add(sucursal);
            }
            return list;
        }
    }
}
