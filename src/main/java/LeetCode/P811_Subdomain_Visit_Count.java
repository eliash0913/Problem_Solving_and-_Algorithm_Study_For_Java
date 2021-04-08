package LeetCode;

import java.util.*;

public class P811_Subdomain_Visit_Count {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> hmap = new HashMap<>();
        for(String cpdomain : cpdomains){
            String[] cpdomainArray = cpdomain.split(" ");
            Integer count = Integer.parseInt(cpdomainArray[0]);
            String domain = cpdomainArray[1];
            String[] subDomain = domain.split("\\.");
            hmap.computeIfPresent(domain, (key,val)->val+count);
            hmap.putIfAbsent(domain, count);
            if(subDomain.length==3){
                subDomain = domain.split("\\.",2);
                hmap.computeIfPresent(subDomain[1], (key, val) -> val+count);
                hmap.putIfAbsent(subDomain[1], count);
                subDomain = subDomain[1].split("\\.",2);
            }
            if(subDomain.length==2){
                hmap.computeIfPresent(subDomain[1], (key, val) -> val+count);
                hmap.putIfAbsent(subDomain[1], count);
            }

        }

        List<String> result = new ArrayList<>();
        for(Map.Entry entry : hmap.entrySet()){
            String e = entry.getValue().toString()+" "+entry.getKey();
            result.add(e);
        }

        return result;
    }
}
