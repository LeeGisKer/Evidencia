
package Presentacion;


public class Control {
    private View view;
    private Model model;

    public Control(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setControl(this);
        view.setModel(model);
    }

    
}
