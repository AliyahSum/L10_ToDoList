package sg.edu.rp.c346.id22015529.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context ;
    int layout_id ;
    ArrayList<ToDoItem> toDoList ;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        parent_context = context ;
        layout_id = resource ;
        toDoList = objects ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View rowView = inflater.inflate(layout_id, parent, false) ;

        TextView tvItem = rowView.findViewById(R.id.textViewItem) ;
        TextView tvDate = rowView.findViewById(R.id.textViewDate) ;

        ToDoItem currentToDo = toDoList.get(position) ;

        tvItem.setText(currentToDo.getTitle()) ;
        tvDate.setText(currentToDo.toString()) ;

        return rowView ;
    }
}
