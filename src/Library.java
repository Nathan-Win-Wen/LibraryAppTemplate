/**
 * Library class
 */
public class Library {
    String name;
    Address location;
    Book[] books;
    Member[] members;

    /**
     * addBook(Book) : void
     * Creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
     *
     * @param book
     *          A new book object to add to the books list
     */
       
       public void String[] addBook (book) {
           String[] newBooks = new String[this.books.length + 1]
           for (int i = 0; i < this.books.length; i ++) {
            newBooks[i] = this.books[i];
           }
           
           newBooks[i] = book;
           
       }




    /**
     * addMember(Member) : void
     * Creates a new array which is a copy of this.members, but, whose length is
     * this.members.length + 1, to be able to add the new member.
     *
     * this.members is then replaced by the new array.
     *
     * @param member
     *          A new member object to add to the members list
     */
     public void String[] addMember (member) {
           String[] newMember = new String[this.members.length + 1]
           for (int i = 0; i < this.members.length; i ++) {
            newMember[i] = this.members[i];
           }
      
           newMember[i] = member;
           
       }






}
