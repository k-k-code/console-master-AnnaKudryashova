package com.brunoyam.consolemaster.service;

import com.brunoyam.consolemaster.console.Task;

import java.util.LinkedList;
import java.util.Queue;

public class CommandExecutorService implements Runnable, CommandExecutor {
        private final Queue<Task> tasksQueue = new LinkedList();

        private static CommandExecutorService instance;
        public static CommandExecutorService getInstance() {
        if (instance == null) {
            instance = new CommandExecutorService();
    }
        return instance;

    }
        private CommandExecutorService() {}
                private void execute(Task task) {
        TaskService taskService = createServiceByTask(task);
        if(taskService != null) {
            taskService.doTask(task);
        }
    }
    private TaskService createServiceByTask(Task task) {

        switch (task.getRequest()) {
            case create: return new CreateService();
            case delete: return new DeleteService();
            case exit: return new ExitService();
            default: return null;
                    }
    }
    @Override
    public void run() {
        while(true){
            Task nextTask = tasksQueue.poll();
            if(nextTask == null) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                execute(nextTask);
            }
        }
    }
@Override
    public void addTask(Task task) {
            tasksQueue.offer(task);
        }
}
