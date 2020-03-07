package com.brunoyam.consolemaster.service;

import com.brunoyam.consolemaster.console.Task;

public interface CommandExecutor extends Runnable {
     public void addTask(Task task);

}
