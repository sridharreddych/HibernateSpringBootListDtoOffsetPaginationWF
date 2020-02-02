package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
/*
 * 
 * Offset Pagination - Trigger COUNT(*) OVER And Return List<dto>

Description: Typically, in offset pagination, there is one query needed for fetching the data and one for counting the total number of records. But, we can fetch this information in a single database rountrip via a SELECT COUNT subquery nested in the main SELECT. Even better, for databases vendors that support Window Functions there is a solution relying on COUNT(*) OVER() as in this application that uses this window function in a native query against MySQL 8. So, prefer this one instead of SELECT COUNT subquery.

Key points:

create a DTO projection that contains getters for the columns that should be fetched and an extra-column for mapping the return of the COUNT(*) OVER() window function
write a native query relying on this window function
 * 
 * 
 * 
 */
