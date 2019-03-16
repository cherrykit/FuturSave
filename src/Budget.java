
public class Budget {

	//These are used to keep track of expenses
	
	//Budget for all categories in $
	public int[] BudgetCap = new int[4];
	
	//Amount spent in each category in $
    public int[] BudgetUsed = {0,0,0,0};
    
    //Last amount, percentage of budget and category entered (saved for use in case of confirmation of purchase)
    public int lastAmt = 0;
    public int lastPer = 0;
    public String lastCat = "";
    
    //interacts with arrays containing information and returns percentage of budget used after purchase
    public int purchase(int c, int a) {
    	
    	BudgetUsed[c] += a;
    	
    	return 100 * BudgetUsed[c]/BudgetCap[c];
    	
    }
    
    //Initialises budget amounts for all categories
    public void init(int f, int so, int sc, int g) {
    	
    	BudgetCap[0] = f;
    	BudgetCap[1] = so;
    	BudgetCap[2] = sc;
    	BudgetCap[3] = g;
    	
    }
	
}
