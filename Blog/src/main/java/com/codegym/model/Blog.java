package com.codegym.model;

import javax.persistence.*;

    @Entity
    @Table(name = "blogs")
    public class Blog {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Long id;
        private String content;
        private String name;

        public Blog() {}

        public Blog(String content, String name) {
            this.content = content;
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("Blog[id=%d, content='%s', name='%s']", id, content, name);
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getNameBlog() {
            return name;
        }

        public void setNameBlog(String nameBlog) {
            this.name = nameBlog;
        }
    }
