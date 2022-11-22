package com.wellington.crud.saladereuniao.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name="meetingroom")
public class Room {

        private long id;
        private String name;
        private String data;
        private String startHour;
        private String endHour;

        public Room() {

        }

        public Room(long id, String name, String data, String startHour, String endHpur) {
            this.id = id;
            this.name = name;
            this.data = data;
            this.startHour = startHour;
            this.endHour = endHpur;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        @Column(name="name", nullable = false)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Column(name="data", nullable = false)
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Column(name="startHour", nullable = false)
        public String getStartHour() {
            return startHour;
        }

        public void setStartHour(String startHour) {
            this.startHour = startHour;
        }

        @Column(name="endHour", nullable = false)
        public String getEndHour() {
            return endHour;
        }

        public void setEndHour(String endHour) {
            this.endHour = endHour;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", data='" + data + '\'' +
                    ", startHour='" + startHour + '\'' +
                    ", endHour='" + endHour + '\'' +
                    '}';
        }
}

