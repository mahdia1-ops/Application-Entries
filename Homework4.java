import java.util.Scanner;

class main {
    static void main(String[] args) {
        System.out.println("Formulate a name please");
        Scanner scanner = new Scanner(System.in);
// Player and weapon creation section
        gameplayer CertificateofWest = new gameplayer("CertificateofWest");
        gameplayer CertificateofEast = new gameplayer("CertificateofEast");
        gameplayer CertificateofNorth = new gameplayer("CertificateofNorth");
        gameplayer CertificateofSouth = new gameplayer("CertificateofSouth");
        gameplayer fireball = new gameplayer("fireball");
        gameplayer iceSpike = new gameplayer("iceSpike");
        gameplayer dragon = new gameplayer("dragon");
        String player3 = scanner.next();
        gameplayer player2 = new gameplayer("Harry_Potter");
        gameplayer player1 = new gameplayer(player3);
        gameplayer goblinKing = new gameplayer("goblinKing");
        gameplayer knife = new gameplayer("knife");
        gameplayer legendaryFierySword = new gameplayer("legendaryfierysword");
        gameplayer restart = new gameplayer("restart");
        System.out.println("Welcome " + player1.getName() + " ;To the untold tale ");
//Name input section
        player1.increaseScore(10);
        player2.increaseScore(99999);
// Score and HP section
        player1.increaseHP(1000);
        player2.increaseHP(50000);
// Gameplay section
        System.out.println(player1.getName() + "'s score: " + player1.getScore());
        System.out.println(player2.getName() + "'s score: " + player2.getScore());
// Score display section
        System.out.println(player1.getName() + " has " + player1.HP + " HP.");
        System.out.println(player2.getName() + " has " + player2.HP + " HP.");
// HP display section
        knife.increaseDamage(15);
        legendaryFierySword.increaseDamage(20000);
// Weapon damage section
        dragon.increaseDamage(100);
        dragon.increaseHP(500);
        fireball.increaseDamage(5);
        iceSpike.increaseDamage(30);
// Dragon stats section
        goblinKing.increaseDamage(800);
        goblinKing.increaseHP(400);

        while (player1.HP > 0 || restart != null) {
            System.out.println(player1.getName() + player2.getName() + ", there is a crossroad in front of you. " +
                    "Which direction do you chose to go?");
            System.out.println("1. North");
            System.out.println("2. West");
            System.out.println("3. South");
            System.out.println("4. East");
            int choice = scanner.nextInt();
            if (choice == 1) {
                // This is the adventure of the North
                if (choice == 1) ;
                {
                    System.out.println(player1.getName() + " and " + player2.getName() + "  have headed North ");
                    System.out.println(player1.getName() + " and " + player2.getName() + " kept walking they find" +
                            " a river.");
                    System.out.println(player1.getName() + " and " + player2.getName() + " sees a dragon near the river." +
                            " What do you do?");
                    System.out.println("1. Attack");
                    System.out.println("2. Run");
                    System.out.println("3. Hide");
                    System.out.println("4.     ");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println(player1.getName() + " has decided to attack ");
                        System.out.println(player1.getName() + " did " + dragon.dragondamage + "damage to the dragon.");
                        System.out.println("The dragon has " + dragon + " HP left.");
                        System.out.println("The dragon attacks back and does " + dragon.dragondamage + " damage to " + player1.getName() + ".");
                        player1.decreaseHP(dragon.dragondamage);
                        System.out.println(player2.getName() + " has decided to attack and kill the dragon, but died in the process.");
                        System.out.println(" The dragon has dropped a legendary sword. Would you like to obtain it? ");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println(player1.getName() + " has obtained the legendary sword! ");
                            player1.increaseScore(5000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        } else {
                            System.out.println(player1.getName() + " has decided to leave the sword behind.");
                            System.out.println("You walk south of the River and you reach the  crossroad! Where do you go next?");
                        }
                        System.out.println(player1.getName() + " has earned the certificate of the North.");
                    } else if (choice2 == 2) {
                        System.out.println(player1.getName() + ", " + player2.getName() + " has decided to run away ");
                        System.out.println(" You run away back South and reach the cross road.");
                    } else if (choice2 == 3) {
                        System.out.println(player1.getName() + ", " + player2.getName() + " has decided to hide ");
                        System.out.println(" While hiding, the dragon goes on a rampage and destroys everything known to mankind.");
                        System.out.println(" You have perished in the adventure. Game Over.");
                        System.out.println("Would you like to restart and play again?");
                        System.out.println("1. Restart again");
                        System.out.println("2. Play again");
                        int action = scanner.nextInt();
                        if (action == 1 || action == 2) {
                            player1.increaserestart();
                        }
                    } else {
                        System.out.println(player1.getName() + ", " + player2.getName() + " has decided to befriend the dragon ");
                        System.out.println(" The dragon is pleased and gives you a ride to the crossroad.");
                        System.out.println(" You have reached the cross road.");
                        player1.increaseScore(2000);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        System.out.println(player1.getName() + " has earned the certificate of the North.");
                        player1.getCertificateofNorth();
                    }
                }
            } else if (choice == 2) {
                // This is teh adventure of the West
                if (CertificateofWest != null ||  CertificateofNorth != null || CertificateofEast != null || CertificateofWest != null) {
                    System.out.println("You have decided to head West, Your friend says he feels weird about this.");
                    System.out.println(player1.getName() + " and " + player2.getName() + " kept walking til they find" +
                            " a castle.");
                    System.out.println(player1.getName() + " and " + player2.getName() + " walks in and find the goblin king." +
                            " What do you do?");
                    System.out.println("1. Attack");
                    System.out.println("2. Run");
                    System.out.println("3. Hide");
                    System.out.println("4. Speak ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 4) {
                        System.out.println(player1.getName() + " Hello, we would li... ");
                        System.out.println("Well, well, well, what do we have here?" +
                                " I have been waiting for you for quite a while now.");
                        System.out.println(" The goblin king reveals that he is actually your long lost uncle.");
                        System.out.println(" You have reunited with your uncle and live happily ever after.");
                        player1.increaseScore(500000);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        System.out.println(player1.getName() + " has earned the certificate of the West.");

                    } else if (choice4 == 1) {
                        System.out.println(player1.getName() + " has decided to attack the goblin king.");
                        System.out.println(" The goblin king is too strong and defeats you.");
                        System.out.println(" You have perished in the adventure. Game Over.");
                        player1.decreaseHP(-99999);
                        System.out.println("Would you like to restart and play again?");
                        System.out.println("1. Restart again");
                        System.out.println("2. Play again");
                        int action = scanner.nextInt();
                        if (action == 1 || action == 2) {
                            player1.increaserestart();
                        }
                    } else if (choice4 == 2) {
                        System.out.println(player1.getName() + " has decided to run away from the goblin king.");
                        System.out.println(" You run away back east and reach the cross road.");
                    } else if (choice4 == 3) {
                        System.out.println(player1.getName() + " has decided to hide from the goblin king.");
                        System.out.println(" You successfully hid from the goblin king and sneak out of the castle.");
                        System.out.println(" You run away back east and reach the cross road.");
                    }

                } else {
                    System.out.println(player1.getName() + " and " + player2.getName() + "  have headed West ");
                    System.out.println(player1.getName() + " and " + player2.getName() + " kept walking til they find" +
                            " a castle.");
                    System.out.println(player1.getName() + " and " + player2.getName() + " walks in and find the goblin king." +
                            " What do you do?");
                    System.out.println("1. Attack");
                    System.out.println("2. Run");
                    System.out.println("3. Hide");
                    System.out.println("4. Speak ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 4) {
                        System.out.println(player1.getName() + " has decided to speak to the goblin king. ");
                        System.out.println("This worthless fool thinks he is worthy of speaking to me" +
                                " Guards, kill him.");
                        System.out.println("The guards take you and throws you into a prison cell. They kil your friend  and steal his loot.");
                        System.out.println(" Your prisonmate tells you he thinks he can get you out only if you answer his riddle correctly.");
                        System.out.println(" What robotics team is the best team (better than Stuyvescant)? ");
                        System.out.println("1. Bronx Science");
                        System.out.println("2. Brooklyn Tech");
                        System.out.println("3. Manhattan Hunter");
                        System.out.println("4. Townsend Harris");
                        int choice5 = scanner.nextInt();
                        if (choice5 == 1) {
                            System.out.println("Correct! The prisonmate helps you escape the prison.");
                            System.out.println(" You run away back east and reach the cross road.");
                            player1.increaseScore(3000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                            System.out.println(player1.getName() + " has earned the certificate of the West.");
                        } else {
                            System.out.println("Wrong! The prisonmate is furious and attacks you.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            player1.decreaseHP(-99999);
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int action = scanner.nextInt();
                            if (action == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        }
                    }
                }

            } else if (choice == 3) {
                // This is the adventure of the South
                if (CertificateofNorth != null) {
                    System.out.println("You have decided to head South, Your friend says he does not want to go with you.");
                    System.out.println(player1.getName() + " kept walking till they find" +
                            " The forbidden forest.");
                    System.out.println(" Do you wish to enter the forest? yes/no");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println(player1.getName() + " has entered the forbidden forest.");
                        System.out.println(" You continue walking until you find a cemetary covered by the thick bushes and tree.");
                        System.out.println(" You hear the command Imperio and than you are hit on the head.");
                        player1.decreaseHP(player1.HP / 2);
                        System.out.println(" You wake up in a dark place, you see a figure coming towards you.");
                        System.out.println(" It is your friend! Something seems off about him.");
                        System.out.println("Im sorry but you have to die now." + " He raises his wand to attack you.");
                        System.out.println(" What do you do? ");
                        System.out.println("1. Fight back with your legendarysword.");
                        System.out.println("2. Try to reason with him.");
                        System.out.println("3. Run away.");
                        System.out.println("4. Hide behind a tombstone.");
                        int action = scanner.nextInt();
                        if (action == 1) {
                            while (player2.HP > 0 ) {
                                    System.out.println(" You try to fight back with your legendarysword.");
                                    player2.decreaseHP(player2.HP -= legendaryFierySword.legendarysworddamage);
                                System.out.println(player2.HP + " is the HP of your friend after the attack.");
                            }
                            player1.increaseScore(5000);
                            if (player2.HP <= 0) {
                                System.out.println(" You have defeated your friend and broken the Imperio curse.");
                                System.out.println(player1.getName() + " has earned the certificate of the South.");
                                player1.increaseScore(50000);
                                System.out.println(" Your score is now: " + player1.getScore());
                                player1.getCertificateofSouth();
                            }
                        } else if (action == 2) {
                            System.out.println(" You try to reason with him but he is under the Imperio curse.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int definition = scanner.nextInt();
                            if (definition == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        } else if (action == 3) {
                            System.out.println(" You run away back east and reach the cross road.");
                            player1.increaseScore(3000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        } else if (action == 4) {
                            System.out.println(" You hide behind a tombstone and wait for your friend to pass by.");
                            System.out.println(" You successfully escape and run back east to the cross road.");
                            player1.increaseScore(4000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        } else {
                            System.out.println(" Invalid action. You hesitated and your friend caught you off guard.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int incompetence = scanner.nextInt();
                            if (incompetence == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        }

                    } else {
                        System.out.println(player1.getName() + " decided not to enter the forest and went back to the crossroad.");
                        player1.increaseScore(2000);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        System.out.println(player1.getName() + " has earned the certificate of the South.");

                    }
                } else {
                    System.out.println("You have decided to head South, Your friend says he does not want to go with you.");
                    System.out.println(player1.getName() + " kept walking till they find" +
                            " The forbidden forest.");
                    System.out.println(" Do you wish toe enter the forest? yes/no");
                    System.out.println("1. yes");
                    System.out.println("2. no");
                    int decision = scanner.nextInt();
                    if (decision == 1) {
                        System.out.println(player1.getName() + " has entered the forbidden forest.");
                        System.out.println(" You continue walking untill you find a cemetary covered by the thick bushes and trees.");
                        System.out.println(" You hear the command Imperio and than you are hit on the head.");
                        player1.decreaseHP(player1.HP / 2);
                        System.out.println(" You wake up in a dark place, you see a figure coming towards you.");
                        System.out.println(" It is your friend! Something seems off about him.");
                        System.out.println("Im sorry but you have to die now." + " He raises his wand to attack you.");
                        System.out.println(" What do you do? ");
                        System.out.println("1. Fight back with your knife.");
                        System.out.println("2. Try to reason with him.");
                        System.out.println("3. Run away.");
                        System.out.println(" Hide behind a tombstone.");
                        int action = scanner.nextInt();
                        if (action == 1) {
                            System.out.println(" You try to fight back with your knife but your friend is too strong.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int fib = scanner.nextInt();
                            if (fib == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        } else if (action == 2) {
                            System.out.println(" You try to reason with him but he is under the Imperio curse.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int nip = scanner.nextInt();
                            if (nip == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        } else if (action == 3) {
                            System.out.println(" You run away back east and reach the cross road.");
                            player1.increaseScore(3000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        } else if (action == 4) {
                            System.out.println(" You hide behind a tombstone and wait for your friend to pass by.");
                            System.out.println(" You successfully escape and run back east to the cross road.");
                            player1.increaseScore(4000);
                            System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        } else {
                            System.out.println(" Invalid action. You hesitated and your friend caught you off guard.");
                            System.out.println(" You have perished in the adventure. Game Over.");
                            System.out.println("Would you like to restart and play again?");
                            System.out.println("1. Restart again");
                            System.out.println("2. Play again");
                            int lip = scanner.nextInt();
                            if (lip == 1 || action == 2) {
                                player1.increaserestart();
                            }
                        }
                    } else {
                        System.out.println(player1.getName() + " decided not to enter the forest and went back to the crossroad.");
                        player1.increaseScore(2000);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                    }
                }
            } else {
                if (CertificateofNorth !=null && CertificateofSouth !=null) {
                    System.out.println(player1.getName() + " has decided to head East along with " + player2.getName());
                    System.out.println(" After walking for 2 years they find a small village. ");
                    player1.decreaseHP(player1.HP / 2);
                    System.out.println(" They are welcomed by the villagers and given food and shelter. ");
                    player1.increaseScore(500);
                    System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                    System.out.println(player1.getName() + " Gets shot by Lord Voldemort with Crucio and " + player2.getName() + " with Avada Kedavra.");
                    player1.decreaseHP(player1.HP / 2);
                    player2.decreaseHP(player2.HP * 0);
                    System.out.println(player1.getName() + " has survived the curse and attacks with his legendaryFierySword!");
                    System.out.println("Lord Voldemort has perished");
                            player1.increaseScore(500000);
                    System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                    player1.getCertificateofEast();
                } else if (CertificateofNorth != null) {
                    if (CertificateofNorth != null && CertificateofSouth != null) {
                        System.out.println(player1.getName() + " has decided to head East along with " + player2.getName());
                        System.out.println(" After walking for 2 years they find a small village. ");
                        player1.decreaseHP(player1.HP / 2);
                        System.out.println(" They are welcomed by the villagers and given food and shelter. ");
                        player1.increaseScore(500);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        System.out.println(player1.getName() + " Gets shot by Lord Voldemort with Crucio and " + player2.getName() + " with Avada Kedavra.");
                        player1.decreaseHP(player1.HP / 2);
                        player2.decreaseHP(player2.HP * 0);
                        System.out.println(player1.getName() + " has survived the curse and calls on his fiery friend!");
                        System.out.println(" The dragon tansforms into its awakened form; Fawkes the phoenix and kills Voldemort once and for all ");
                        player1.increaseScore(50000);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                    } else {
                        System.out.println(player1.getName() + " has decided to head East along with " + player2.getName());
                        System.out.println(" After walking for 2 years they find a small village. ");
                        player1.decreaseHP(player1.HP / 2);
                        System.out.println(" They are welcomed by the villagers and given food and shelter. ");
                        player1.increaseScore(500);
                        System.out.println(player1.getName() + "'s score is now: " + player1.getScore());
                        System.out.println(player1.getName() + " Gets shot by Lord Voldemort with Avada Kedavra. Game Over.");
                        player1.decreaseHP(player1.HP * 0);
                        System.out.println("Would you like to restart and play again?");
                        System.out.println("1. Restart again");
                        System.out.println("2. Play again");
                        int action = scanner.nextInt();
                        if (action == 1 || action == 2) {
                            player1.increaserestart();
                        }
                    }
                }
            }

        }
        if (CertificateofNorth != null && CertificateofSouth != null && CertificateofWest != null && CertificateofEast != null) {
            System.out.println("Congratulations, you have beat the game.");
            System.out.println("Would you like to restart and play again?");
            System.out.println("1. Restart again");
            System.out.println("2. Play again");
            int action = scanner.nextInt();
            if (action == 1 || action == 2) {
                player1.increaserestart();
            }
        }
    }
}