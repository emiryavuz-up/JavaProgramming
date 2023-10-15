package aHomeTasks.day19;

import java.util.Scanner;

public class RoomReservation {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean reserveAnotherRoom = true;
            double totalReservationPrice = 0.0;

            while (reserveAnotherRoom) {
                System.out.println("Welcome for reservation");
                System.out.println("Our bed type: KingBed, QueenBed, SingleBed");

                String bedType = "";
                boolean validBedType = false;
                while (!validBedType) {
                    System.out.print("Please enter which kind of bed u want reservation: ");
                    bedType = scanner.nextLine();

                    if (bedType.equalsIgnoreCase("kingbed") || bedType.equalsIgnoreCase("queenbed")
                            || bedType.equalsIgnoreCase("singlebed")) {
                        validBedType = true;
                    } else {
                        System.out.println("Invalid kurwa Please Re Enter.");
                    }
                }

                int numberOfNights = 0;
                boolean validNumberOfNights = false;
                while (!validNumberOfNights) {
                    System.out.print("How many days u want stay? ");
                    String kurwa = scanner.nextLine();
                    try {
                        numberOfNights = Integer.parseInt(kurwa);
                        validNumberOfNights = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid night days Please Re Enter again.");
                    }
                }

                double pricePerNight;
                if (bedType.equalsIgnoreCase("kingbed")) {
                    pricePerNight = 120;
                } else if (bedType.equalsIgnoreCase("queenbed")) {
                    pricePerNight = 100;
                } else {
                    pricePerNight = 80;
                }
                double reservationPrice = pricePerNight * numberOfNights;
                totalReservationPrice += reservationPrice;

                String answer = "";
                boolean validAnswer = false;
                while (!validAnswer) {
                    System.out.print("Would u like to choose another room? (tak/nie): ");
                    answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("tak") || answer.equalsIgnoreCase("nie")) {
                        validAnswer = true;
                    } else {
                        System.out.println("Invalid answer Please again enter blet.");
                    }
                }

                if (answer.equalsIgnoreCase("nie")) {
                    reserveAnotherRoom = false;
                    
                }
            }
            scanner.close();
        
            System.out.println("Total reservation price: $" + totalReservationPrice);
            
        }
    }

