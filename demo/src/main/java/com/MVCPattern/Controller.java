package com.MVCPattern;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processData(String input){
        String processedData = input.toUpperCase();
        model.setdata(processedData);
        view.displayData(model.getdata());
    }
}
