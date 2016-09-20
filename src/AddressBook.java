
import java.util.*;

public class AddressBook 
{
	public ArrayList<BuddyInfo> ContactList;

	public AddressBook()
	{
		ContactList = new ArrayList<BuddyInfo>();
	}
	
	public boolean AddBuddy(String firstName)
	{
		if(FindIndex(firstName) == -1 )
		{
			ContactList.add(new BuddyInfo(firstName));
			return true;
		}
		return false;
	}
	
	public boolean RemoveBuddy(String firstName)
	{
		int removeIndex = FindIndex(firstName);
		if(removeIndex != -1)
		{
			ContactList.remove(removeIndex);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int NumberOfContacts()
	{
		return ContactList.size();
	}
	
	private int FindIndex(String firstName)
	{
		for (int i = 0; i < ContactList.size(); i++) 
		{
			BuddyInfo buddy = ContactList.get(i);
			if(buddy.GetFirstName().equalsIgnoreCase(firstName))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("AddressBook");
		AddressBook book = new AddressBook();
		System.out.println(book.NumberOfContacts());
		book.AddBuddy("Jaspreet");
		System.out.println(book.NumberOfContacts());
		book.RemoveBuddy("Jaspreet");
		System.out.println(book.NumberOfContacts());
	}
}
