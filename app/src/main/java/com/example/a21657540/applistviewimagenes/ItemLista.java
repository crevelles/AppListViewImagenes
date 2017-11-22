package com.example.a21657540.applistviewimagenes;

/**
 * Created by 21657540 on 22/11/2017.
 */

public class ItemLista {

    private int idImagen;
    private String txtSuperior;
    private String txtInferior;

    public ItemLista(int idImagen, String txtSuperior, String txtInferior) {
        this.idImagen = idImagen;
        this.txtSuperior = txtSuperior;
        this.txtInferior = txtInferior;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTxtSuperior() {
        return txtSuperior;
    }

    public String getTxtInferior() {
        return txtInferior;
    }
}

