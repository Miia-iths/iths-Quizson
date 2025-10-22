https://github.com/Miia-iths/iths-Quizson

https://docs.google.com/document/d/15taa9QHJX8c0faNT_e0D5Ju10aVy3urvs7jPgV-54Qc/edit?pli=1&tab=t.0

https://www.gitmastery.me/


uppgifter 20okt tills 22okt
Miia:
Skriva Film/Tv-serie frågor 10 frågor med 4 svarsalternativ.
researcha tidnedräkning, tidsbegränsning, spara total tid, tilldela poäng per sekund.

Research
1. Stoppur (Mäta hur snabbt spelaren svarar)
    
    //För att veta hur lång tid som gått, använd datorns inbyggda klocka:
        long startTid = System.currentTimeMillis();
    
    //För att spara sluttiden (i long först för att få plats med milisekunder)
        long slutTid = System.currentTimeMillis();
    
    //För att räkna ut tiden som har gått och konvertera (1000 millisekunder = 1 sekund)
        long totalTidMillis = slutTid - startTid;
        int totalTidSekunder = (int) (totalTidMillis / 1000);
    
2. Poängsätting för tiden -nooope inte vad jag kör sen
    
    //För att sätta max värdet (kan ändras om vi vill göra svarstiden längre)
        int maxPoang = 60;
        int poang = maxPoang - totalTidSekunder; 
    
    //För att se till att  poängen inte blir negativ
        if (poang < 0) {
            poang = 0;
        }

    //Lägg till i totalsumman
        totalPoang = totalPoang + poang;

3. Tidsbegränsning
   
    //chat gpt och gemini föreslår att använda TimerTask och override, 
    men jag tror det går att återanvända System.currentTimeMillis()
    att den sparar tiden för rätta svar tillsammans i rightMilliS eller så och räknar ut poäng först efter det
    svar ja
    så jag kodar klass för att starta tid när enskild fråga startas, och slutar när de frågat
    om de svarar rätt så läggs den tiden det tog in i totalRightTimeMillis
    som i slutet koverteras till sekunder och därmed poäng
    fuck.. det tar bara tiden det tog.. de sätter inte begränsning.. skit oxå



kladd eftersom det ska räkna ner från tex 60 behöver rätt tiden vara 60 - millis
eller så tar jag totalRightMillis minus 60*10 i själva poängräkningen - bättre val
och i samma vända förvandlar till sekunder 