package com.brunoyam.consolemaster.service;

import com.brunoyam.consolemaster.model.Task;

public interface CommandExecutor extends Runnable {
     public void addTask(Task task);

}
