package frc.robot;

public class Constants {

    public static class OI_Constants {
        public static int XBOX_PORT = 0;
    }

    public static class DriveConstants {

        // Motor CAN IDs
        public static int LEFT_ID = 1;
        public static int RIGHT_ID = 2;

        // Maximum voltage each motor can produce
        public static double MAX_VOLTS = 4;

        // Change these booleans to tune the drivetrain for correct
        // behavior!
        public static boolean INVERT_STEER = false;
        public static boolean INVERT_LEFT = false;
        public static boolean INVERT_RIGHT = false;
        public static boolean INVERT_LEFT_ENCODER = false;
        public static boolean INVERT_RIGHT_ENCODER = false;

        // You'll have to calculate this for Auto!
        public static double ENCODER_SCALING = 1; 
    }
    
}
