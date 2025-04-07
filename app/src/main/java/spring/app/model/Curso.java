package spring.app.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

    @Entity
@Table(name = "cursos")
public class Curso {
        @Id
        private String id;
        @Column(name = "name", nullable = false, length = 20)
        private String name;
        @Column(name = "code", nullable = false)
        private String codig;
        @Column(name = "credits", nullable = false)
        private String credit;
        @ManyToOne
        @JoinColumn(name = "profesor_id", nullable = false)
        private Profesor profesor;

    
        
        public Curso() {
        }


        public Curso(String id, String name, String codig, String credit) {
            this.id = id;
            this.name = name;
            this.codig = codig;
            this.credit = credit;
        }


        public String getId() {
            return id;
        }


        public void setId(String id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public String getCodig() {
            return codig;
        }


        public void setCodig(String codig) {
            this.codig = codig;
        }


        public String getCredit() {
            return credit;
        }


        public void setCredit(String credit) {
            this.credit = credit;
        }


        public Profesor getProfesor() {
            return profesor;
        }


        public void setProfesor(Profesor profesor) {
            this.profesor = profesor;
        }


    
}