package Model;

import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T extends Mahasiswa> {
    private final List<T> records = new ArrayList<>();
    public void add(T value) {
        records.add(value);
    }

    public List<T> getList() {
        return new ArrayList<>(records);
    }
    public void printALl() {
        String[]fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++) {
            T records = this.records.get(i);
            String[] values = this.convertModelToValues(records);
            System.out.println("a");
            for (int j = 0; j < fields.length ; j++) {
                System.out.println(fields[j] + "\t" + values[j]);
            }
            System.out.println(" ");
        }
    }
    public void printByPk(String primaryKey){
        for (T value : records {
            if (primaryKey = records.getNim()) {
                System.out.println(value);
            }
        }

    }
    public void showInsertForm(){
    String []fields = this.getFields();
    for (int i = 0; i < this.records.size(); i++) {
        System.out.println(fields[i]);
    }
    }
    public void showUpdateForm(){
    String []fields = this.getFields();
    for (int i = 0; i < this.records.size(); i++) {
        T records = this.records.get(i);
        String[] values = this.convertModelToValues(records);
    }
    }
    public void promptDelete(){
    String []fields = this.getFields();
    for (int i = 0; i < this.records.size(); i++) {
        T records = this.records.get(i);
        String[] values = this.convertModelToValues(records);
    }
    }
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel(String[]values);
    protected abstract String[] convertModelToValues(T data);



}
