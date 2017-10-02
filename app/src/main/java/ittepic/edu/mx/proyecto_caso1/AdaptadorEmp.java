package ittepic.edu.mx.proyecto_caso1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NandoLizola on 02/10/2017.
 */

public class AdaptadorEmp extends ArrayAdapter{
    private Context context;
    private ArrayList<Empleado> datos;
    public AdaptadorEmp(Context context, ArrayList lista){
        super(context,R.layout.empleados,lista);
        datos=lista;
        this.context=context;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.empleados, null);


        CheckBox chk_emp=(CheckBox) item.findViewById(R.id.chk_emp);

        chk_emp.setText(datos.get(position).getNombre());

        //nombre.setText(c.getNombre());
        return item;
    }
}
