package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T > {
    private final List<T> data = new ArrayList<>();
    public void add(T value) {
        data.add(value);
    }

    public List<T> getList() {
        return new ArrayList<>(data);
    }
    public void printALl() {
        for (T value : data) {
            System.out.println(value);
        }
    }
    public void printByPk(String primaryKey){
        for (T value : data) {
            System.out.println(value);
        }

    }
    public void showInsertForm(){

    }
    public void showUpdateForm(){

    }
    public void promptDelete(){

    }
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel(String[]values);
    protected abstract String[] convertModelToValues(T data);



}
