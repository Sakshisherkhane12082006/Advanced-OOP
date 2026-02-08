package ExperimentNo2;

class SortNames {
    public static void main(String[] args) {
        String[] names = {
            "Sakshi", "Manik", "Varsha", "Tushar", "Harsh",
            "Sairaj", "Anita", "Manav", "Sarita", "Shreya"
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
