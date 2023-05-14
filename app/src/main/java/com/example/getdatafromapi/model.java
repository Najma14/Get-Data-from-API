package com.example.getdatafromapi;

import java.util.ArrayList;

public class model {
    public  int pages;
    public int per_pages;
    public int total;
    public int total_pages;
    public ArrayList<data> data;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPer_pages() {
        return per_pages;
    }

    public void setPer_pages(int per_pages) {
        this.per_pages = per_pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public ArrayList<data> getData() {
        return data;
    }

    public void setData(ArrayList<data> data) {
        this.data = data;
    }


    public class data{

        public int id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public data(int id, String email, String first_name, String last_name, String avatar) {
            this.id = id;
            this.email = email;
            this.first_name = first_name;
            this.last_name = last_name;
            this.avatar = avatar;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }



}
