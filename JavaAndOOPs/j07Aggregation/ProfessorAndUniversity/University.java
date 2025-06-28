package ProfessorAndUniversity;

import java.util.*;
class University {
    private String universityName;
    private List<Professor> professors;
    
    public University(String universityName) {
        this.universityName = universityName;
        this.professors = new ArrayList<>();
    }
    
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    
    public void showProfessors() {
        System.out.println("Professors at " + universityName + ":");
        for (Professor professor : professors) {
             professor.teach();
        }
    }
}

