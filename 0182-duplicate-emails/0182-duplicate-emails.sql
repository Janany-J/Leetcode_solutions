SELECT Email from Person
Group By email
Having count(email) > 1;
