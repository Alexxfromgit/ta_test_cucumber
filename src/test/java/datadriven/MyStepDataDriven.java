package datadriven;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;
import java.util.Map;

public class MyStepDataDriven {

    @Given("^items available$")
    public void itemsAvailable(DataTable arg) {
        System.out.println("START GIVEN DATADRIVEN");
        List<Map<String, String>> table = arg.asMaps(String.class, String.class);
        System.out.println(table.get(0).get("Name"));
        System.out.println(table.get(1).get("Name"));
        System.out.println(table.get(2).get("Name"));

        System.out.println(table.get(0).get("Available"));
        System.out.println(table.get(1).get("Available"));
        System.out.println(table.get(2).get("Available"));

        System.out.println(table.get(0).get("Quantity"));
        System.out.println(table.get(1).get("Quantity"));
        System.out.println(table.get(2).get("Quantity"));
        System.out.println("FINISH GIVEN DATADRIVEN");
//        List<List<String>> table = arg.asLists(String.class);
//        System.out.print(table.get(0).get(0));
//        System.out.print(table.get(0).get(1));
//        System.out.println(table.get(0).get(2));
//
//        System.out.print(table.get(1).get(0));
//        System.out.print(table.get(1).get(1));
//        System.out.println(table.get(1).get(2));
    }
}
