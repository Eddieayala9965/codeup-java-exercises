public class ArraysExercises {

    public static class PersonUtils {
        public static Person[] addPerson(Person[] existingArray, Person personToAdd) {
            // create array
            Person[] newArray = new Person[existingArray.length + 1];
            //copy old array to new array
            for (int i = 0; i < existingArray.length; i++) {
                newArray[i] = existingArray[i];
            }
            // add object at end of the array
            newArray[newArray.length - 1] = personToAdd;
            // return new array
            return newArray;
        }
    }

    public static void main(String[] args){
        Person person1 = new Person("Eddie");
        Person person2 = new Person("Rob");
        Person person3 = new Person("Micah");
        String[] people = {person1.getName(), person2.getName(), person3.getName()};

        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i]);
        }



//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


    }
}
