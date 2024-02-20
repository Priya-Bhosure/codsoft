scanner.next(); // Consume invalid input
        }
        int rollNumber = scanner.nextInt();

        Student foundStudent = students.stream()
                .filter(student -> student.getRollNumber() == rollNumber)
                .findFirst()
                .orElse(null);

        if (foundStudent != null) {
            System.out.println("Student found:\n" + foundStudent);
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayAllStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}