/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;

/**
 *
 * @author Dewberry 
 */
public class AnswerSheet {
    public int indexCategory, indexQuestion;
    
    public String answer;
    public String question;
    public String category;
    
    public ArrayList<String> riddles, countries, science, technology;
    public ArrayList<ArrayList> categories;

    public AnswerSheet() {
        
        categories = new ArrayList();
        
        riddles = new ArrayList();
        countries = new ArrayList();
        science = new ArrayList();
        technology = new ArrayList();
        
        addQuestion("What becomes wetter the more it dries?", "A Towel", "Riddles");
        addQuestion("What is so fragile, even saying its name can break it?", "Silence", "Riddles");
        addQuestion("What can run but never walks, often murmurs, never talks, has a mouth but never eats, has a bed but never sleeps?", "A River", "Riddles");
        addQuestion("Anyone can hold me, even without their hands, yet no one can do it for long. What am I?", "Breath", "Riddles");
        addQuestion("I have a hundred eyes, yet cannot see. What am I?", "A Potato", "Riddles");
        addQuestion("I am invisible, weigh nothing, and if you put me in a barrel, it will become lighter. What am I?", "A Hole", "Riddles");
        addQuestion("The man who made it doesn't want it. The man who bought it doesn't need it. The man who needs it doesn't know it. What is it?", "A Coffin", "Riddles");
        addQuestion("I am not alive, yet I grow; I have no lungs, yet I need air; I have no mouth, yet I can drown. What am I?", "Fire", "Riddles");
        addQuestion("Throw me off the highest building, and I shall not break, but toss me in the smallest pool, and my life's at stake. What am I?", "A Tissue", "Riddles");
        addQuestion("For what crime can an offender be arrested for attempting, but not committing?", "Suicide", "Riddles");
        addQuestion("What can you always count on when trying to solve math problems?", "Fingers", "Riddles");
        addQuestion("The rich want it, and the poor have it; it is greater than God, but worse than Satan; and if you eat it you will die. What is it?", "Nothing", "Riddles");
        addQuestion("If you have me, you want to share me. If you share me, I no longer exist. What am I?", "A Secret", "Riddles");
        addQuestion("Before Mount Everest was discovered, what was the tallest mountain in the world?", "Mount Everest", "Riddles");
        addQuestion("A man living in the UK cannot be buried in America because he is ______.", "Living", "Riddles");
        addQuestion("If there are 10 apples and you take away 2, how many do you have left?", "Two", "Riddles");
        addQuestion("What has been around for millions of years, but is never more than a month old?", "The Moon", "Riddles");
        addQuestion("What belongs to you, but is used mostly by others?", "Name", "Riddles");
        addQuestion("What goes up but never comes down?", "Age", "Riddles");
        addQuestion("The more there is, the less you see. What is it?", "Darkness", "Riddles");
        addQuestion("What can go up and come down without moving?", "Temperature", "Riddles");
        addQuestion("What has holes all around, but can still hold water?", "A Sponge", "Riddles");
        addQuestion("What two things can always see what the other sees, but can never see each other?", "Eyes", "Riddles");
        addQuestion("The more you take of me, the more you leave behind. What am I?", "Footsteps", "Riddles");
        addQuestion("What type of building has the most stories?", "Library", "Riddles");
        addQuestion("At night they come without being fetched. By day they are lost without being stolen. What are they?", "The Stars", "Riddles");
        addQuestion("What is always coming but never arrives?", "Tomorrow", "Riddles");
        addQuestion("What is black when you buy it, red when you use it, and gray when you throw it away?", "Charcoal", "Riddles");
        addQuestion("What cannot talk, but will always respond when spoken to?", "An Echo", "Riddles");
        addQuestion("I have many keys but usually only two or three locks. What am I?", "Computer Keyboard", "Riddles");
        addQuestion("Which one of the words in this sentence is missspelled?", "Misspelled", "Riddles");
        addQuestion("What has wheels and flies, but is not an aircraft?", "A Garbage Truck", "Riddles");
        addQuestion("What is a five letter word which becomes shorter with two letters added onto it?", "Short", "Riddles");
        addQuestion("What comes once in a minute, twice in a moment, but never in a thousand years?", "Letter M", "Riddles");
        
        addQuestion("What is the capital of Argentina?", "Buenos Aires", "Countries");
        addQuestion("What is the capital of Portugal?", "Lisbon", "Countries");
        addQuestion("What is the currency of Indonesia?", "Cair o", "Countries");
        addQuestion("Zurich is the largest city in what country?", "Switzerland", "Countries");
        addQuestion("What is the capital of Bangladesh?", "Dhaka", "Countries");
        addQuestion("In what country is the Great Pyramid of Giza found?", "Egypt", "Countries");
        addQuestion("What is the capital of South Korea?", "Seoul", "Countries");
        addQuestion("Which country will you find the cities of Marseilles and Lyon?", "France", "Countries");
        addQuestion("What is the capital of Afghanistan?", "Kabul", "Countries");
        addQuestion("What is the capital of Philippines?", "Manila", "Countries");
        addQuestion("What is the capital of Spain?", "Madrid", "Countries");
        addQuestion("What is the currency of China?", "Yuan", "Countries");
        addQuestion("What is the capital of Japan?", "Tokyo", "Countries");
        addQuestion("What was the original name of Sri Lanka?", "Ceylon", "Countries");
        addQuestion("Which country will you find the islands Mykonos and Santorini?", "Greece", "Countries");
        addQuestion("What is the capital of Kenya?", "Nairobi", "Countries");
        addQuestion("Which country will you find the city of Ankara?", "Turkey", "Countries");
        addQuestion("Which is the highest mountain in Japan?", "Mount Fuji", "Countries");
        addQuestion("Mount Fuji", "Italy", "Countries");
        addQuestion("What is the capital of Russia?", "Moscow", "Countries");
        addQuestion("What is the currency of Afghanistan", "Afghani", "Countries");
        addQuestion("What is the capital of England?", "London", "Countries");
        addQuestion("Which countries share the longest border in the world", "USA and Canada", "Countries");
        addQuestion("Which desert is the biggest desert in the world, outside the Polar region?", "Sahara Desert", "Countries");
        addQuestion("Which country has the largest volcano in the world?", "Hawaii", "Countries");
        addQuestion("Which is the world's largest country in size (area)?", "Russia", "Countries");
        addQuestion("Which country in Europe has the biggest number of  inhabitants?", "Germany", "Countries");
        addQuestion("Which is the longest river in Africa?", "Nile River", "Countries");
        addQuestion("Which is the largest metropolitan city in the world (by population)?", "Japan", "Countries");
        addQuestion("Only American state to begin with Letter P", "Pennsylvania", "Countries");
        
        addQuestion("Pollination by birds is called?", "Ornithophily", "Science");
        addQuestion("The fastest-running terrestrial animal", "Cheetah", "Science");
        addQuestion("What do we call the process when a gas is turned into a liquid", "Condensation", "Science");
        addQuestion("The study of phenomena at very low temperatures", "Cryogenics", "Science");
        addQuestion("Cystitis is the infection of what?", "urinary bladder", "Science");
        addQuestion("Yeast, used in making bread is a? ", "Fungus", "Science");
        addQuestion("A gas used as a disinfectant in drinking water", "Chlorine", "Science");
        addQuestion("The moon comes between the sun and the earth is what we call?", "Solar Eclipse", "Science");
        addQuestion("The removal of top soil by water or wind is called", "Soil erosion", "Science");
        addQuestion("The Panda belongs to the same family as that of ____.", "Bear", "Science");
        addQuestion("What type of animal is dugong?", "Mammal", "Science");
        addQuestion("The hardest substance available on earth.", "Diamond", "Science");
        addQuestion("The animal which uses sounds as its 'eyes'.", "Bat", "Science");
        addQuestion("What was the first planet to be discovered using the telescope in 1781", "Uranus", "Science");
        addQuestion("What element begins with letter K?", "Krypton", "Science");
        addQuestion("Which is the largest and densest of the four rocky planets?", "Earth", "Science");
        addQuestion("World's largest ocean", "Pacific Ocean", "Science");
        addQuestion("What does the C stand for in LCD?", "Crystal", "Science");
      
        addQuestion("First search engine in the Internet", "Archie", "Technology");
        addQuestion("Programming Language to create Applets", "Java", "Technology");
        addQuestion("First Computer Virus", "Creeper", "Technology");
        addQuestion("Mac OS is developed by what company?", "Apple", "Technology");
        addQuestion("Headquarter of Microsoft office located", "Washington", "Technology");
        addQuestion("A computer use what type of number system to store and calculate data?", "Binary", "Technology");
        addQuestion("Browser developed by Google", "Google Chrome", "Technology");
        addQuestion("Company that developed Java", "Sun Microsystems", "Technology");
        addQuestion("Facebook Owner", "Mark Zuckerberg", "Technology");
        addQuestion("Founder of Microsoft", "Bill Gates", "Technology");
        addQuestion("Who invented the Telephone?", "Alexander Graham Bell", "Technology");
        addQuestion("Purpose of Telephone?", "Communication", "Technology");
      
        
        loadCategories();
        
    }
    
    
    
    private void addQuestion(String question, String answer, String category) {
        
        this.question = question;
        this.answer = answer;
        this.category = category;
        
        switch(category){
            case "Riddles":
                riddles.add(question);
                riddles.add(answer);
                riddles.add(category);
                break;
            
            case "Countries":
                countries.add(question);
                countries.add(answer);
                countries.add(category);
                break;
                
            case "Science":
                science.add(question);
                science.add(answer);
                science.add(category);
                break;
                
                
            case "Technology":
                technology.add(question);
                technology.add(answer);
                technology.add(category);
                break;
                
            default: System.out.println("Error adding " + question);
            break;
        }
        
    }

    private void loadCategories() {
        categories.add(riddles);
        categories.add(countries);
        categories.add(science);
        categories.add(technology);
    }

    
}
 