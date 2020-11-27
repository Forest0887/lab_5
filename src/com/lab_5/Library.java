package com.lab_5;

import java.util.ArrayList;

public class Library {
    private final ArrayList<LibraryVisitors> lib_vis = new ArrayList<>();

    public void set_lib_vis(LibraryVisitors lib_vis){
        this.lib_vis.add(lib_vis);
    }

    public int get_lib_vis(){
        return lib_vis.size();
    }

    public ArrayList<LibraryVisitors> findMaxReader(){
        ArrayList<LibraryVisitors> copy_lib_viz = new ArrayList<>();
        int max = lib_vis.get(0).getColl_book().size();
        for (LibraryVisitors lib_vi : lib_vis) {
            if (lib_vi.getColl_book().size() > max) {
                max = lib_vi.getColl_book().size();
                copy_lib_viz.clear();
                copy_lib_viz.add(lib_vi);
            } else if (lib_vi.getColl_book().size() == max) {
                copy_lib_viz.add(lib_vi);
            }
        }
        return copy_lib_viz;
    }

    public void findReaderByTittleBook(String arg){
        for (LibraryVisitors lib_vi : lib_vis){
            for (Book book : lib_vi.getColl_book()){
                if (book.getName_book().equals(arg)){
                    System.out.println(lib_vi.getSurname());
                }
            }
        }
    }
}
