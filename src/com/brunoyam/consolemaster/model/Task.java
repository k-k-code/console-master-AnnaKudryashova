package com.brunoyam.consolemaster.model;

import com.brunoyam.consolemaster.console.Request;

public class Task {

    private final Request request;
    private final String[] arguments;

    public Task(Request request, String[] arguments) {
        this.request = request;
        this.arguments = arguments;
    }

    public Request getRequest() {
        return request;
    }

    public String[] getArguments() {
        return arguments;
    }
}
