class InnostaxTech {
    private String customerId;
    private String customerName;
    protected Services serviceTheyNeed; 

    enum Services {
        WEB, APPDEV, ITCONSULTING, LEGACYSOFTWAREMODERIZATION
    }

    public void getCustomerDetails() {
        System.out.println("------Customer Details-------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Service: " + serviceTheyNeed);
    }

    public void setCustomerDetails(String customerId, String customerName, String serviceTheyNeed) {
        this.customerId = customerId;
        this.customerName = customerName;
        try {
            this.serviceTheyNeed = Services.valueOf(serviceTheyNeed.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Service Selected. Please choose from: WEB, APPDEV, ITCONSULTING, LEGACYSOFTWAREMODERIZATION.");
            this.serviceTheyNeed = null;
        }
    }
}

class Team extends InnostaxTech {
    public void teamCreating() {
        if (serviceTheyNeed != null) {
            System.out.println("Team is creating a " + serviceTheyNeed + " project tailored to their needs.");
        } else {
            System.out.println("No valid service selected, cannot create a team.");
        }
    }
}

public class Project {
    public static void main(String[] args) {
        InnostaxTech s = new InnostaxTech();
        Team e1 = new Team(); 

        try {
            s.setCustomerDetails("1", "Rohit Upreti", "WEB"); 
            s.getCustomerDetails();

            e1.setCustomerDetails("2", "Raju", "APPDEV");
            e1.getCustomerDetails();
            e1.teamCreating();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Innostax Pvt. Limited");
        }
    }
}
