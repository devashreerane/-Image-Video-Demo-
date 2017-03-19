package com.demo.model;

import java.io.Serializable;

/**
 * Created by DEVASHREE on 3/19/2017.
 */

    public class Image implements Serializable {
        private String name;
        private String small, large;


        public Image() {
        }

        public Image(String name, String small,  String large) {
            this.name = name;
            this.small = small;

            this.large = large;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }


        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }


    }
