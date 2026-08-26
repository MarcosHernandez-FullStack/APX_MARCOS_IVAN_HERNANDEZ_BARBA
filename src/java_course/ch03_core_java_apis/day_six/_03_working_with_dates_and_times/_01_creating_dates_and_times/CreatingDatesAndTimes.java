//LocalDate: contiene solo una fecha, sin hora ni zona horaria.
LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
LocalDate date2 = LocalDate.of(2015, 1, 20);

//LocalTime: solo contiene una hora, sin fecha ni zona horaria.
LocalTime time1 = LocalTime.of(6, 15); // hour and minute
LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds


//LocalDateTime: contiene tanto la fecha como la hora, pero no la zona horaria.
LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
