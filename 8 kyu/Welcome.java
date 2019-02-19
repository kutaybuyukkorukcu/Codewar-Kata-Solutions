import java.util.*;

public class Welcome {
   public static String greet(String language){
      HashMap<String, String> hm = new HashMap<>();
        hm.put("english", "Welcome");
        hm.put("czech", "Vitejte");
        hm.put("danish", "Velkomst");
        hm.put("dutch", "Welkom");
        hm.put("estonian", "Tere tulemast");
        hm.put("finnish", "Tervetuloa");
        hm.put("flemish", "Welgekomen");
        hm.put("french", "Bienvenue");
        hm.put("german", "Willkommen");
        hm.put("irish", "Failte");
        hm.put("italian", "Benvenuto");
        hm.put("latvian", "Gaidits");
        hm.put("lithuanian", "Laukiamas");
        hm.put("polish", "Witamy");
        hm.put("spanish", "Bienvenido");
        hm.put("swedish", "Valkommen");
        hm.put("welsh", "Croeso");
        return hm.containsKey(language) ? hm.get(language) : hm.get("english");
   }
}
