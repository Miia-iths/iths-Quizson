package Meny;
import java.util.Scanner;

public class Questions {
    
    public static void allmänbildningsQuiz(){
        String [] frågor = {
            "Vilken kontinent är störst till ytan?",
            "Vilken krydda ingår INTE i klassiska pepparkakor?",
            "Vilket land har flest öar i världen?",
            "Vilken frukt används för att göra traditionell cider?",
            "Hur mycket är ett dussin?",
            "Vem målade Mona Lisa?",
            "Vad är öl gjort på?",
            "Hur många magar har en ko?",
            "Vilken svensk artist vann Eurovision 2012?",
            "Vilket år landade människan på månen?"
        };

        String [][] svarsAlternativ = {
            {"1. Afrika", "2. Nordamerika", "3. Asien", "4. Sydamerika"},
            {"1. Ingefära", "2. Kryddnejlika", "3. Peppar", "4. Kanel"},
            {"1. Kanada", "2. Finland", "3. Sverige", "4. Indonesien"},
            {"1. Äpple", "2. Päron", "3. Druva", "4. Apelsin"},
            {"1. 24", "2. 12", "3. 6", "4. 30"},
            {"1. Leonardo da Vinci", "2. Pablo Picasso", "3. Vincent van Gogh", "4. Claude Monet"},
            {"1. Korn", "2. Potatis", "3. Råg", "4. Havre"},
            {"1. En mage", "2. Två magar", "3. Tre magar", "4. Fyra magar"},
            {"1. Frans", "2. Måns Zelmerlöw", "3. Charlotte Perelli", "4. Loreen"},
            {"1. 1969", "2. 1972", "3. 1974", "4. 1967"}
        };

        int [] rättSvar = {3, 3, 3, 1, 2, 1, 1, 4, 4, 1};

        Metoder.frågorOchSvar(frågor, svarsAlternativ, rättSvar);
}
    

    public static void sportQuiz(){
        String [] frågor = {
            "Sveriges förbundskapten Jon Dahl Tommasson blev avskedad den 14 oktober efter en rad svaga resultat. Vem blev hans ersättare?",
            "Vem av de nuvarande förarna i F1 har vunnit flest VM titlar?",
            "Den svenska pingisspelaren Truls Möregårdh tog sig till final i OS 2024. Vilket land slog ut honom?",
            "Höjdhopparen Armand Duplantis satte ett nytt världsrekord i VM 2025. Hur högt hoppa han?",
            "Tennisturneringen US Open 2025 vann Carlos Alcaraz. Vilket land kommer han ifrån?",
            "Vilken svensk ryttare tog OS-Silver i hoppning både 2016 och 2021?",
            "Vilket svenskt damlag tog OS-Guld i curling i Pyeongchang 2018?",
            "Vilken fiskart är vanligast i svenska insjöar?",
            "Vad heter det största svenska LAN-evenmanget där tusentals spelare samlas för att spela och tävla?",
            "Vilken svensk hockeyspelare har gjort flest poäng i NHL genom tiderna?"
        };

        String [][] svarsAlternativ = { 
            {"1. Graham Potter", "2. Janne Andersson", "3. Alex Ferguson", "4. Lasse Lagerbäck"},
            {"1. Lewis Hamilton", "2. Max Verstappen", "3. Fernando Alonso", "4. George Russel"},
            {"1. Norge", "2. Brasilien", "3. Frankrike", "4. Kina"},
            {"1. 6,40 m", "2. 6,30 m", "3. 6,17 m", "4. 6,27 m"},
            {"1. Portugal", "2. Mexiko", "3. Spanien", "4. Argentina"},
            {"1. Peder Fredricson", "2. Rolf-Göran Bengtsson", "3. Henrik Von Eckermann", "4. Malin Baryard-Johnsson"},
            {"1. Lag Wrang", "2. Lag Edin", "3. Lag Hasselborg", "4. Lag Norberg"},
            {"1. Gös", "2. Gädda", "3. Mört", "4. Abborre"},
            {"1. GameX", "2. Dreamhack", "3. Assembly", "4. GamerCon"},
            {"1. Henrik Zetterbergn", "2. Peter Forsberg", "3. Mats Sundi", "4. Daniel Alfredsson"}
        };

        int [] rättSvar = {1, 1, 4, 2, 3, 1, 3, 4, 2, 3}; 

        Metoder.frågorOchSvar(frågor, svarsAlternativ, rättSvar);

        
    }

    public static void vetenskapQuiz(){
        String [] frågor = {
            "Hur många hjärtan har en spindel?",
            "Vilken av följande metoder är inte ett sätt för växter att få näring?",
            "Vilket är det enda organet som kan regenerera sig själv?",
            "Vad kallas mitten av en atom?",
            "Vem är känd som den moderna fysikens fader?",
            "Var finns det minsta benet i människokroppen?",
            "Av vilket grundämne består en diamant?",
            "Vad kallas mängden materia i ett föremål?",
            "Vilket är det största flygande djuret?",
            "Vilken är den närmaste stjärnan till jorden efter solen?",
        };

        String [][] svarsAlternativ = {
            {"1. Som människor", "2. Cirkulationssystemet kallas dubbelt system. Varje hjärta ansvarar för fyra ben.", "3. Som bläckfisken som använder sina olika hjärtan för att röra sina olika ben.", "4. De saknar cirkulationssystem. Som andra djur, till exempel maneter."},
            {"1. Fotosyntes", "2. Köttätande", "3. Sporer", "4. Parasitisk"},
            {"1. Lungor", "2. Hud", "3. Hjärta", "4. Lever"},
            {"1. Proton", "2. Neutron", "3. Hackathon", "4. Elektron"},
            {"1. Albert Einstein", "2. Isaac Newton", "3. Nikola Tesla", "4. Galileo Galilei"},
            {"1. Näsa", "2. Öra", "3. Haka", "4. Armbåge"},
            {"1. Syre", "2. Kisel", "3. Kol", "4. Kväve"},
            {"1. Densitet", "2. Volym", "3. Vikt", "4. Massa"},
            {"1. Vandringsalbatross", "2. Australisk fladdermus", "3. Kejsarörn", "4. Skatan på min balkong"},
            {"1. Proxima Centauri", "2. Alfa Centauri 1", "3. Optimus Prime", "4. Alfa Centauri 2"}
        };

        int [] rättSvar = {1, 3, 4, 1, 1, 2, 3, 4, 1, 1};

        Metoder.frågorOchSvar(frågor, svarsAlternativ, rättSvar);
    }

    public static void seriefilmQuiz(){
        String[] frågor = {
            "Vem regisserade kultfilmen Pulp Fiction från 1994, en film känd för sin icke-linjära berättarstruktur?",
            "Jon Snow är en nyckelfigur i Game of Thrones. Vilket hus betraktade han sig själv som en del av under större delen av serien?",
            "Vem spelar huvudrollen Katniss Everdeen i filmserien The Hunger Games?",
            "Vilken TV-serie, baserad på en serietidning, handlar om en grupp överlevande efter en zombieapokalyps?",
            "Vilken är den första Disney-filmen där en prinsessa inte behöver räddas av en man?",
            "Vilken skådespelare spelar huvudrollen som den excentriske detektiven Sherlock Holmes i BBC-serien Sherlock (2010–2017)?",
            "I Matrix-filmerna, vilken färg har pillret som Neo tar för att upptäcka sanningen om Matrix?",
            "Vem komponerade den ikoniska musiken till Star Wars-filmerna?",
            "Vad kallar Dexter Morgan sin inre, mordiska personlighet i TV-serien Dexter?",
            "Vilken fiktiv advokatby i Albuquerque, där Jimmy McGill (Saul Goodman) börjar sin karriär, spelar en central roll i Better Call Saul?"
        };

        String[][] svarsAlternativ = {
            {"1. Steven Spielberg", "2. Quentin Tarantino", "3. Martin Scorsese", "4. Coen-bröderna"},
            {"1. Huset Lannister", "2. Huset Stark", "3. Huset Targaryen", "4. Huset Baratheon"},
            {"1. Emma Watson", "2. Jennifer Lawrence", "3. Shailene Woodley", "4. Kristen Stewart"},
            {"1. Z Nation", "2. The Last of Us", "3. The Walking Dead", "4. Fear the Walking Dead"},
            {"1. Pocahontas", "2. Mulan", "3. Skönheten och Odjuret", "4. Frozen"},
            {"1. Martin Freeman", "2. Tom Hiddleston", "3. Benedict Cumberbatch", "4. Andrew Scott"},
            {"1. Svart", "2. Blå", "3. Röd", "4. Grön"},
            {"1. Hans Zimmer", "2. Ennio Morricone", "3. John Williams", "4. Howard Shore"},
            {"1. The Dark Passenger", "2. The Inner Demon", "3. The Shadow Killer", "4. Mr. Hyde"},
            {"1. Hamlin, Hamlin & McGill", "2. Wexler & Associates", "3. Davis & Main", "4. Mesa Verde Law Group"}
        };

        int[] rättSvar = {2, 2, 2, 3, 2, 3, 3, 3, 1, 1};

        Metoder.frågorOchSvar(frågor, svarsAlternativ, rättSvar);
    }
}