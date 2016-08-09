package main.java.codeu.unnamed.frontend;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashSet;
import java.util.Scanner;

public class UserQuery
{
  //maps from query to query weight
  private Map<String, Integer> query;
  /**
  * Constructor
  */
  public UserQuery(String[] s)
  {
    this.query = processArrayQueries(s);
  }
  /**
  * Takes query string and creates mapping from query to query weight
  */
	public Map<String,Integer> processQueries(String s)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = s.split("\\s");
		for(String k: arr)
		{	
			if(map.containsKey(k))
			{
				map.put(k, map.get(k)+1);
			}
			else
			{
				map.put(k,1);
			}
		}
		return map;
	}
	public Map<String, Integer> processArrayQueries(String[] queries)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String s:queries)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s,1);
			}
		}
		return map;
	}
  //returns specific query weight
  public Integer getWeight(String s)
  {
    return query.get(s)==null ? 0: query.get(s);
  }
  public Set<Map.Entry<String,Integer>> getQueries()
  {
    return this.query.entrySet();
  }
  private void print()
  {
	  Set<Map.Entry<String, Integer>> qset = this.getQueries();
	  for(Map.Entry<String, Integer> e: qset)
	  {
		  System.out.println(e);
	  }
	  
  }
 }

