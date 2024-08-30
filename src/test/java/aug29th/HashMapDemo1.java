package aug29th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		Map<String, String> hMap=new HashMap<String, String>();
		
		hMap.put("Ravi", "Tester");
		hMap.put("Gopi", "Developer");
		hMap.put("Ganesh", "Manager");
		
		System.out.println(hMap);
		
		System.out.println(hMap.size());
		
		Set<Entry<String, String>>  entries=hMap.entrySet();
		
		for(Entry<String, String> entry:entries)
		{
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}

		
		Iterator<Entry<String, String>> it=entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, String>  entry=it.next();
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
		
		hMap.put("Ravi", "Test Lead");
		hMap.put("Gopi", "Senoir Developer");
		hMap.put("Ganesh", "CEO");
		
		System.out.println(hMap.size());
		
		System.out.println(hMap);
		
		entries=hMap.entrySet();
		
		for(Entry<String, String> entry:entries)
		{
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}

		
		it=entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, String>  entry=it.next();
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
		
	}

}
