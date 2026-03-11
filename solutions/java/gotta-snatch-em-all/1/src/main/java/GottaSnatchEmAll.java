import java.util.List;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean set1=false;
        boolean set2=false;
        for(String s : myCollection)
            {
                if(!theirCollection.contains(s)){
                    set1=true;
                    break;
                }
            }
        for(String s : theirCollection)
            {
                if(!myCollection.contains(s)){
                    set2=true;
                    break;
                }
            }
        return set1&&set2;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> ans=new HashSet<>(collections.get(0));
        for(Set<String> set :collections)
            {
                ans.retainAll(set);
            }
        return ans;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> ans=new HashSet<>(collections.get(0));
        for(Set<String> set :collections)
            {
                ans.addAll(set);
            }
        return ans;
    }
}
