package ChapterFour;

import java.util.Scanner;

public class Nokia3310 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                1 ------> Phone Book
                2 ------> Messages
                3 ------> Chat
                4 ------> Call Register
                5 ------> Tones
                6 ------> Settings
                7 ------> Call Divert
                8 ------> Games
                9 ------> Calculator
                10 -----> Reminders
                11 -----> Clock
                12 -----> Profiles
                13 -----> Sim Services             
                """);
            System.out.println("Enter A Number");
            int menu = input.nextInt();
            switch (menu) {

                case 1:
                    System.out.println("PhoneBook");
                    System.out.println("""
                        1----> Search
                        2----> Service Nos
                        3----> Add Name
                        4----> Erase
                        5----> Edit
                        6----> Assign Tone
                        7----> Send B'card
                        8----> Option
                        9----> Speed Dial
                        10---> Voice Tags
                        """);
                    int phoneBook = input.nextInt();
                    switch (phoneBook) {
                        case 1:
                            System.out.println("Search");
                            break;
                        case 2:
                            System.out.println("Service Nos.");
                            break;
                        case 3:
                            System.out.println("Add Name");
                            break;
                        case 4:
                            System.out.println("Phone Book Erased");
                            break;
                        case 5:
                            System.out.println("Edit");
                            break;
                        case 6:
                            System.out.println("Assign Tone");
                            break;
                        case 7:
                            System.out.println("Send B'card");
                            break;
                        case 8:
                            System.out.println("Options");
                            System.out.println("""
                                1- Type of  view
                                2- Memory Status
                                """);
                            int options = input.nextInt();
                            switch (options) {
                                case 1:
                                    System.out.println("Your View is LandScape");
                                    break;
                                case 2:
                                    System.out.println("Your Memory is 60% Full");
                                    break;
                            }
                            break;
                        case 9:
                            System.out.println("Speed Dials");
                            break;
                        case 10:
                            System.out.println("Voice Tags");

                        default:
                            System.out.println("Input Not Avaialable ODE");

                    }
                    break;

                case 2:
                    System.out.println("Messages");
                    System.out.println("""
                        1 -----> Write Messages
                        2 -----> Inbox
                        3 -----> Outbox
                        4 -----> Picture Messages
                        5 -----> Templates
                        6 -----> Smileys
                        7 -----> Messages Settings
                        8 -----> Info Services
                        9 -----> Voice Mailbox Number
                        10 ----> Service Command Editor
                        """);
                    int messages = input.nextInt();
                    switch (messages) {
                        case 1:
                            System.out.println("Write Messages");
                            break;
                        case 2:
                            System.out.println("inbox");
                            break;
                        case 3:
                            System.out.println("Outbox");
                            break;
                        case 4:
                            System.out.println("Picture Messages");
                            break;
                        case 5:
                            System.out.println("Templates");
                            break;
                        case 6:
                            System.out.println("Smileys");
                        case 7:
                            System.out.println("Message Settings");
                            System.out.println("""
                                1- Set1
                                2- Common
                                                                
                                """);
                            int messageSettings = input.nextInt();
                            switch (messageSettings) {
                                case 1:
                                    System.out.println("Set 1");
                                    System.out.println("""
                                        1-----> Message Center Number
                                        2-----> Message Sent As
                                        3-----> Message Validity
                                                                             
                                        """);
                                    int set1 = input.nextInt();
                                    switch (set1) {
                                        case 1:
                                            System.out.println("Message Center Number");
                                            break;
                                        case 2:
                                            System.out.println("Messages Sent As");
                                            break;
                                        case 3:
                                            System.out.println("Message Validity");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Common");
                                    System.out.println("""
                                               1- Delivery reports
                                               2- Reply Via Same Centre
                                               3- Character Support
                                        """);
                                    int common = input.nextInt();
                                    switch (common) {
                                        case 1:
                                            System.out.println("Delivery Reports");
                                            break;
                                        case 2:
                                            System.out.println("Reply Via Same Centre");
                                            break;
                                        case 3:
                                            System.out.println("Character Support");
                                            break;
                                    }
                                    break;
                            }
                            break;

                        case 8:
                            System.out.println("Info Service");
                            break;
                        case 9:
                            System.out.println("Voice MailBox Number");
                            break;
                        case 10:
                            System.out.println("Service Command Editor");
                            break;
                    }

                    break;


                case 3:
                    System.out.println("Chat");
                    break;

                case 4:
                    System.out.println("Call Register");
                    System.out.println("""
                                1-----> Missed Calls
                                2-----> Received Calls
                                3-----> Dialled Numbers
                                4-----> Erase Recent Call Lists
                                5-----> Show Call Duration
                                6-----> Call Cost
                                7-----> Call Cost Settings
                                8-----> Prepaid Credit
                                """);
                    int callRegister = input.nextInt();
                    switch (callRegister) {
                        case 1:
                            System.out.println("You Have No Missed Calls");
                            break;
                        case 2:
                            System.out.println("You Have No Recieved Calls");
                            break;
                        case 3:
                            System.out.println("You Have No Dialled Number");
                            break;
                        case 4:
                            System.out.println("Content list erased");
                            break;
                        case 5:
                            System.out.println("Show Call Duration");
                            System.out.println("""
                                             1------> Last Call Duration
                                             2------> All Calls' Duration
                                             3------> Received Calls' Duration
                                             4------> Dialled Call's Duration
                                             5------> Clear Timers
                                             
                                        """);
                            int callDuration = input.nextInt();
                            switch (callDuration) {
                                case 1:
                                    System.out.println("Your last call duration was 10mins and 20secs");
                                    break;
                                case 2:
                                    System.out.println("Your total call's duration was 16hrs and 1min");
                                    break;
                                case 3:
                                    System.out.println("Your Received call duration was 4hrs");
                                    break;
                                case 4:
                                    System.out.println("Your dialled call duration is 12hrs and 1min");
                                    break;
                                case 5:
                                    System.out.println("Your timers are cleared");
                                    break;
                            }

                            break;

                        case 6:
                            System.out.println("Call Cost");
                            System.out.println("""
                                          1-----> Last Call Cost
                                          2-----> All Calls' Cost
                                          3-----> Clear Counters
                                        """);
                            int callCost = input.nextInt();
                            switch (callCost) {
                                case 1:
                                    System.out.println("Your last call cost is 60Kobo/secs");
                                    break;
                                case 2:
                                    System.out.println("Your total call cost is 1000 Naira");
                                    break;
                                case 3:
                                    System.out.println("Counters is cleared");
                                    break;
                            }
                        case 7:
                            System.out.println("Call Cost Settings");
                            System.out.println("""
                                        1-----> Call Cost Limit
                                        2-----> Show Costs In
                                        """);
                            int callCostSettings = input.nextInt();
                            switch (callCostSettings) {
                                case 1:
                                    System.out.println("Your call cost limit is 60kobo/secs");
                                    break;
                                case 2:
                                    System.out.println("Kobo/secs\nOR\nlKobo\nmins");
                                    break;
                            }


                            break;
                        case 8:
                            System.out.println("Prepaid Credit");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Tones");
                    System.out.println("""
                        1------> Ringing Tone
                        2------> Ringing Volume
                        3------> Incoming Call Alert
                        4------> Composer
                        5------> Message Alert Tone
                        6------> Keypad Tones
                        7------> Warning and Game Tones
                        8------> Vibrating Alert
                        9------> Screen Saver
                        """);
                    int tones = input.nextInt();
                    switch (tones) {
                        case 1:
                            System.out.println("your ringing tone is chirp");
                            break;
                        case 2:
                            System.out.println("Your volume is 2");
                            break;
                        case 3:
                            System.out.println("Sweet low");
                            break;
                        case 4:
                            System.out.println("Your cannot compose song");
                            break;
                        case 5:
                            System.out.println("Dami duro");
                            break;
                        case 6:
                            System.out.println("Silent");
                            break;
                        case 7:
                            System.out.println("Frog");
                            break;
                        case 8:
                            System.out.println("Pig");
                            break;
                        case 9:
                            System.out.println("Your screen saver can now be set");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Settings");
                    System.out.println("""
                        1-----> Call Settings
                        2-----> Phone Settings
                        3-----> Security Settings
                        4-----> Restore Factory Settings
                        """);
                    int settings = input.nextInt();
                    switch (settings) {
                        case 1:
                            System.out.println("Call Settings");
                            System.out.println("""
                                    1-----> Automatic Redial
                                    2-----> Speed Dialling
                                    3-----> Call Waiting Options
                                    4-----> Own Number Sending
                                    5-----> Phone Line in Use
                                    6-----> Automatic Answer
                                    """);
                            int callSettings = input.nextInt();
                            switch (callSettings) {
                                case 1:
                                    System.out.println("You can now perform automatic redial");
                                    break;
                                case 2:
                                    System.out.println("You have no number on speed dial");
                                    break;
                                case 3:
                                    System.out.println("Your Call is on waiting");
                                    break;
                                case 4:
                                    System.out.println("Your cannot send own number");
                                    break;
                                case 5:
                                    System.out.println("Your phone line is in use");
                                    break;
                                case 6:
                                    System.out.println("Your phone can now answer automatically");
                                    break;

                            }
                            break;

                        case 2:
                            System.out.println("Phone Settings");
                            System.out.println("""
                                    1----> Language
                                    2----> Cell Info Display
                                    3----> Welcome Note
                                    4----> Network Selection
                                    5----> Light
                                    6----> Confirm Sim Service Actions
                                                                                            
                                    """);
                            int phoneSettings = input.nextInt();
                            switch (phoneSettings) {
                                case 1:
                                    System.out.println("Select Language");
                                    break;
                                case 2:
                                    System.out.println("Change Display");
                                    break;
                                case 4:
                                    System.out.println("Nokia, Connecting People");
                                    break;
                                case 5:
                                    System.out.println("Choose Network");
                                    break;
                                case 6:
                                    System.out.println("Increase Light\n Decrease Light");
                                    break;
                                case 7:
                                    System.out.println("Sim is Activated");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Security Settings");
                            System.out.println("""
                                    1------> Pin Code Request
                                    2------> Call Barring Service
                                    3------> Fixed Dialling
                                    4------> Closed User Group
                                    5------> Phone Security
                                    6------> Change Access Codes
                                    """);
                            int securitySettings = input.nextInt();
                            switch (securitySettings) {
                                case 1:
                                    System.out.println("Pin code request granted");
                                    break;
                                case 2:
                                    System.out.println("You can barr anybody ypu wish to bar");
                                    break;
                                case 3:
                                    System.out.println("Your fixed dialling is activated");
                                    break;
                                case 4:
                                    System.out.println("Closed user group granted");
                                    break;
                                case 5:
                                    System.out.println("Your phone is secured");
                                    break;
                                case 6:
                                    System.out.println("Access code changed");
                            }
                            break;


                        case 4:
                            System.out.println("Factory Settings Retored");
                            break;
                    }

                        case 7:
                            System.out.println("Call Divert");
                            break;
                        case 8:
                            System.out.println("Games");
                            break;
                        case 9:
                            System.out.println("Calculator");
                            break;
                        case 10:
                            System.out.println("Reminders");
                            break;
                        case 11:
                            System.out.println("Clock");
                            System.out.println("""
                                1-----> Alarm Clock
                                2-----> Clock Settings
                                3-----> Date Settings
                                4-----> Stopwatch
                                5-----> Countdown Timer
                                6-----> Auto Update Of Date And Time
                                                                          
                                """);
                            int clock = input.nextInt();
                            switch (clock) {
                                case 1:
                                    System.out.println("Your alarm clock is on");
                                    break;
                                case 2:
                                    System.out.println("Adjust your clock");
                                    break;
                                case 3:
                                    System.out.println("Adjust your date");
                                    break;
                                case 4:
                                    System.out.println("Set stopwatch");
                                    break;
                                case 5:
                                    System.out.println("Set stopwatch ");
                                    break;
                                case 6:
                                    System.out.println("Update date and time");
                                    break;


                            }
                            break;

                        case 12:
                            System.out.println("Profiles");
                            break;

                        case 13:
                            System.out.println("Sim Services");
                            break;
                    }
            }


        }






