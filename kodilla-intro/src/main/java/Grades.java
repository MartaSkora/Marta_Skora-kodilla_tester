public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

        public int getLastAdded() {
                return this.grades[this.size - 1];
            }

    public double getAverage() {
        int result = 0;
        for (int i = 0; i < this.size; i++) {
            result = result + this.grades[i];
        }
        double average = result / this.size;
        return average;
    }
}
