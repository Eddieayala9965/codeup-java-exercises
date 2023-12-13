//package movies;
//
//import util.Input;
//
//public class MoviesApplication {
//    public static void main(String[] args){
//        do {
//        System.out.println("What would you like to do? ");
//        System.out.println("0 - exit\n1 - view all movies \n2 - view animated movies \n3 - view drama movies\n4 - view movies in horror category\n5 - view scifi movies");
//        Input input = new Input();
//
//        int userChoice = input.getInt(0, 5);
//        boolean userContinue = true;
//
//
//        for (Movie movie : MoviesArray.findAll()) {
//            switch (userChoice) {
//                case 0:
//                    System.exit(0);
//                    break;
//                case 1:
//                    System.out.println(movie.getName() + movie.getCategory());
//                    break;
//                case 2:
//                    if (movie.getCategory().equals("animated")) {
//                        System.out.println(movie.getName());
//                    }
//                    break;
//                case 3:
//                    if (movie.getCategory().equals("drama")) {
//                        System.out.println(movie.getName());
//                    }
//                    break;
//                case 4:
//                    if (movie.getCategory().equals("horror")) {
//                        System.out.println(movie.getName());
//                    }
//                    break;
//                case 5:
//                    if (movie.getCategory().equals("scifi")) {
//                        System.out.println(movie.getName());
//                    }
//                    break;
//            }
//
//
//        } while (true);
//    }
//
//}
