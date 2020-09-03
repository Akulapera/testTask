package ru.gdcloud.manager.tests;
import ru.gdcloud.manager.model.LoginPasswordData;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @org.testng.annotations.DataProvider
    public Iterator<Object[]> invalidLoginPassword() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"TESTERRRR", "123456789014567890"});
        list.add(new Object[]{"89", "123"});
        return list.iterator();
    }

    @org.testng.annotations.DataProvider
    public Iterator<Object[]> invalidLoginPasswordCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader((new FileReader
                ("src/test/resources/LogPas2.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]
                    {new LoginPasswordData()
                            .setLogin(split[0])
                            .setPassword(split[1])});
            line = reader.readLine();
        }
        return list.iterator();
    }
}
