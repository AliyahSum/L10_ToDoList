package sg.edu.rp.c346.id22015529.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo ;
    ArrayList<ToDoItem> alToDo ;
    CustomAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo) ;
        alToDo = new ArrayList<>() ;

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, 8, 1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2020, 8, 2);

        ToDoItem item1 = new ToDoItem("Go for movie", date1) ;
        ToDoItem item2 = new ToDoItem("Go for haircut", date2) ;

        alToDo.add(item1) ;
        alToDo.add(item2) ;

        adapter = new CustomAdapter(this, R.layout.rows, alToDo) ;
        lvToDo.setAdapter(adapter) ;
    }
}