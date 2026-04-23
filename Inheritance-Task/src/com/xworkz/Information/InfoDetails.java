package com.xworkz.Information;
    public class InfoDetails extends Information {
        boolean verified;
        int rating;

        public InfoDetails(String topic, int pages, String[] points, InfoSource source, InfoType type, boolean verified, int rating) {
            super(topic, pages, points, source, type);
            this.verified = verified;
            this.rating = rating;
        }

        @Override
        public void read() {
            System.out.println("The Child is reading the information..");
        }

        @Override
        public void save() {
            System.out.println("The Child save the content which is more important..");
        }

        @Override
        public String toString() {
            return super.toString() + ", " + verified + ", " + rating;
        }
    }

