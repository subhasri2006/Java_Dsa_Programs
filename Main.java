import java.util.*;
class pairvalues{
	int bookid;
	String b_name,a_name;
	boolean available;
	
	pairvalues(String b_name,String a_name,boolean available){
		this.b_name=b_name;
		this.a_name=a_name;
		this.available=available;
	}
	
}

class Book{
	int bookid;
	String b_name,a_name;
	boolean available;
	
	HashMap<Integer,pairvalues> map = new HashMap<>();
	String addbook(int id,String b_name,String a_name){
	  if(map.containsKey(id)){
		  return "Book Already Exists";
		  
	  }
		map.put(id,new pairvalues(b_name,a_name,true));
		return "Book added";
	}
	void retrievebook(int id){
		pairvalues pair = map.get(id);

        
        if (pair != null) {
            
            String first = pair.b_name;
            String second = pair.a_name;
			System.out.println(id);
			System.out.println(pair.b_name);
			System.out.println(second);
        } else {
            System.out.println("Key not found!");
        }
		
	}
	void display(){
		if(map.isEmpty()){
			System.out.println("No books are available");
		}
		else{
			for(Map.Entry<Integer,pairvalues> entry: map.entrySet()){
				int id = entry.getKey();
				pairvalues pair = entry.getValue();
				String first = pair.b_name;
				String second = pair.a_name;
			
				
				System.out.println("ID: " + id + " | Book_Name: " + first + " | Author_Name: " + second+ "| "+ pair.available);
			}
		}
	}
	void borrow(int id) {
    
		pairvalues pair = map.get(id);

		
		if (pair != null) {
			pair.available= false; 
			System.out.println("borrowed successfully");
		} else {
			System.out.println("Key not found!");
		}
	}
	void returnbook(int id) {
		pairvalues pair = map.get(id);

		
		if (pair != null) {
			pair.available= true; 
			System.out.println("returned successfully");
		} else {
			System.out.println("Key not found!");
		}
	}
	void availdisplay(){
		if(map.isEmpty()){
			System.out.println("No books are available");
		}
		else{
			for(Map.Entry<Integer,pairvalues> entry: map.entrySet()){
				int id = entry.getKey();
				pairvalues pair = entry.getValue();
				String first = pair.b_name;
				String second = pair.a_name;
				if(pair.available){
					System.out.println("ID: " + id + " | Book_Name: " + first + " | Author_Name: " + second);
				}
				
				
			}
		}
	}

}

class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Book b = new Book();
		
		int choice = 0;
		while(choice!=7){
			System.out.println("1.add book\n 2.searchbook_with_id\n 3.Display_total_books\n 4.book_to_borrow\n 5.book_to_return\n 6.display_available_books\n 7.exit_application");
			 choice = s.nextInt();
			 s.nextLine();
			switch(choice){
				case 1:
					System.out.println("Enter the Id");
					int id=s.nextInt();
					s.nextLine();
					System.out.println("Enter the Book Name: ");
					String b_name=s.nextLine();
					
					System.out.println("Enter the Author Name: ");
					String a_name=s.nextLine();
					
					System.out.println(b.addbook(id,b_name,a_name));
					break;
				case 2:
					System.out.println("Enter book id");
					int ip=s.nextInt();
					s.nextLine();
					b.retrievebook(ip);
					break;
				case 3:
					System.out.println("Total Books");
					b.display();
					break;
				case 4:
					System.out.println("Enter the book id to borrow");
					int bid=s.nextInt();
					b.borrow(bid);
					break;
				case 5:
					System.out.println("Enter the book id to return");
					int rid=s.nextInt();
					b.returnbook(rid);
					break;
				case 6:
					b.availdisplay();
					break;
					
				case 7:
					return;
			}
		}
		
			
		
	}
	
}