package com.example.tasker;

import android.app.Application;


import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {

    private TaskRepository mRepository;

    private LiveData<List<Task>> mAllTasks;

    public TaskViewModel (Application application) {
        super(application);
        mRepository = new TaskRepository(application);
        mAllTasks = mRepository.getAllTasks();
    }
    LiveData<List<Task>> getAllTasks() { return mAllTasks; }
    public void insert(Task task) { mRepository.insert(task); }

    public void deleteAll() {mRepository.deleteAll();}

    public void deleteTask(Task task) {mRepository.deleteTask(task);}
}
