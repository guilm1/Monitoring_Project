package com.example.guilherme.project;

import android.content.Context;

import com.example.guilherme.project.modelo.Disciplina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SharedResourcesDisciplina {
    private static SharedResourcesDisciplina shared = null;
    //Singleton elements
    private static ArrayList<Disciplina>disciplinas;

    public static SharedResourcesDisciplina getInstance(){
        if(shared == null){
            shared = new SharedResourcesDisciplina();
        }
        return shared;
    }

    private SharedResourcesDisciplina(){
        disciplinas = new ArrayList<Disciplina>();
    }

    public static ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void salvaDisciplinas(Context context){
        try{
            FileOutputStream fos = context.openFileOutput("disciplinas.dat", Context.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(disciplinas);
            oos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void carregaDisciplinas(Context context){
        try{
            FileInputStream fis = context.openFileInput("disciplinas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            disciplinas = (ArrayList<Disciplina>) ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
