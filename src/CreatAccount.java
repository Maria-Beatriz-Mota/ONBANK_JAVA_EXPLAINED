/* Facts: 
 A CLASS is a specification of a type, defining attributes and behaviors. It is the prime code, matrix code;
 A REFERENCE is what we use to connect the CLASS (matrix) to the OBJECT. 
 Where that REFERENCE acts like a new variable, that gets it's value from the ClASS (matrix) and put it to
 the object making the connection happen.  
 An OBJECT is an instance (Construction) of a CLASS, it is in the OBJECT where we define the values to the
 attributes.
 */

//  Objects of the class Account 
	public class CreatAccount {
// First Object
		public static void main(String[] args) {
/*Attribute and another observation: Here we are making the reference from the CLASS to our object by writing: "Account FirstAccount = new Account();" so we can get the values of the class Account and bring them to this new variable, the "FirstAccount". This variable will be the principal variable of our OBJECT.
We've done the reference of the class to the object (the first object); So now we can instance our first object oriented to the main CLASS (class Account). */
			Account FirstAccount = new Account();
			
/* Attribute and another observation: is that the dot"." at "FirstAccount.sale" is what makes the connection of the class Account to this new variable "FirstAccount" referenced from the class Account. */
			FirstAccount.sale = 200 * 3;
			FirstAccount.agency = 129;
			FirstAccount.number = 10293967;
			FirstAccount.owner = "Bia";
				
				System.out.println("The Account owner is: "+FirstAccount.owner+"\nYours agency is: "+FirstAccount.agency+"\nYours number is: "+FirstAccount.number+"\nThe value of your sale is: "+FirstAccount.sale);
		
//Attribute and other  reference (which is the reference of our second Object) to  instance our second object of the class Account.
			Account SecondAccount = new Account();
			SecondAccount.sale = 200 * 9;
				
			System.out.println("\nThe account owner is: "+SecondAccount.owner+"\nYours agency is: "+SecondAccount.agency+"\nYours number is: "+SecondAccount.number+"\nThe value of your sale is: "+SecondAccount.sale);
		

/*  What about the references? well here is one Example: 		
If we want to make a new reference to a same Object; we won't use the "CLASS something = new CLASS();" we'll do something like this (getting our first object as an example) : 
					Our First object :
					"Account FirstAccount = new Account();
					FirstAccount.sale = 200 * 3"; */
			
			Account ThirdAccount = FirstAccount;
			System.out.println("\n Showing the Example: "+ThirdAccount.sale);
			
/*Here notice that the value of the "ThirdAccount" is the same of the "FirstAccount" since we said that they were equals and they belongs to the same object, we haven't created a new object, but, we've done a new reference to Our first Object; 
And if we change the value in our variable "ThirdAccount.sale" our "FirstAccount.sale" will receive the same value of the "ThirdAccount.sale". Check it out below: */
			ThirdAccount.sale = 400; 
			System.out.println("\nShowing the second Example:"+"\nThe third account sale is: "+ThirdAccount.sale+"\nAnd the first account sale is: "+FirstAccount.sale);
/* Another demonstration to show that they are references of one object and are not references of two different objects is by seeing that the "ThirdAccount" and the "FirstAccount" are "located" at the same "memory" and the "SecondAccount" is "located" at another one, as shown below : */
			System.out.println("\n Showing the third Example:\n the third and the first account (Our First Object) location:\n" +ThirdAccount+"\n"+FirstAccount+"\n the Second account (our Second Object) location:\n"+SecondAccount);
	}
}