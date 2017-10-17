package com.hw.hw3.continent;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Country {
    private static Continent cont;  

    List<String> AF = new ArrayList<>(Arrays.asList("Algeria", "Angola", "Benin", "Botswana", "Burkina", 
                                                                                            "Burundi", "Cameroon", "Cape Verde", "Central African Republic", "Chad", 
                                                                                            "Comoros", "Congo", "Democratic Republic of Congo", "Djibouti", "Egypt", 
                                                                                            "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia", 
                                                                                            "Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast", "Kenya", 
                                                                                            "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", 
                                                                                            "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", 
                                                                                            "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Principe", 
                                                                                            "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", 
                                                                                            "South Sudan", "Sudan", "Swaziland", "Tanzania", "Togo", 
                                                                                            "Tunisia", "Uganda", "Zambia", "Zimbabwe"));

    List<String> AS = new ArrayList<>(Arrays.asList("Afghanistan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", 
                                                                                            "Myanmar", "Cambodia", "China", "East Timor", "India", 
                                                                                            "Indonesia", "Iran", "Iraq", "Israel", "Japan", 
                                                                                            "Jordan", "Kazakhstan", "North Korea", "South Korea", "Kuwait", 
                                                                                            "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", 
                                                                                            "Mongolia", "Nepal", "Oman", "Pakistan", "Philippines", 
                                                                                            "Qatar", "Russian Federation", "Saudi Arabia", "Singapore", "Sri Lanka", 
                                                                                            "Syria", "Tajikistan", "Thailand", "Turkey", "Turkmenistan", 
                                                                                            "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen"));                                                                                          
    
    List<String> EU = new ArrayList<>(Arrays.asList("Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", 
                                                                                            "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia", 
                                                                                            "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", 
                                                                                            "France", "Georgia", "Germany", "Greece", "Hungary", 
                                                                                            "Iceland", "Ireland", "Italy", "Latvia", "Liechtenstein", 
                                                                                            "Lithuania", "Luxembourg", "Macedonia", "Malta", "Moldova", 
                                                                                            "Monaco", "Montenegro", "Netherlands", "Norway", "Poland", 
                                                                                            "Portugal", "Romania", "San Marino", "Serbia", "Slovakia", 
                                                                                            "Slovenia", "Spain", "Sweden", "Switzerland", "Ukraine", 
                                                                                            "United Kingdom", "Vatican City"));
    
    List<String> NA = new ArrayList<>(Arrays.asList("Antigua and Barbuda", "Bahamas", "Barbados", "Belize", "Canada", 
                                                                                            "Costa Rica", "Cuba", "Dominica", "Dominican Republic", "El Salvador", 
                                                                                            "Grenada", "Guatemala", "Haiti", "Honduras", "Jamaica", 
                                                                                            "Mexico", "Nicaragua", "Panama", "Saint Kitts and Nevis", "Saint Lucia", 
                                                                                            "Saint Vincent and the Grenadines", "Trinidad and Tobago", "United States of America"));
    
    List<String> AO = new ArrayList<>(Arrays.asList("Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", 
                                                                                            "Nauru", "New Zealand", "Palau", "Papua New Guinea", "Samoa", 
                                                                                            "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu"));
    
    List<String> SA = new ArrayList<>(Arrays.asList("Argentina", "Bolivia", "Brazil", "Chile", "Colombia", 
                                                                                            "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", 
                                                                                            "Uruguay", "Venezuela"));
 
    public String getContinent(String str) {
        if (AF.contains(str)) {
            return cont.AFRICA.getDescription(); 
        } else if (AS.contains(str)) {
            return cont.ASIA.getDescription(); 
        } else if (EU.contains(str)) {
            return  cont.EUROPE.getDescription(); 
        } else if (NA.contains(str)) {
            return cont.NORTH_AMERICA.getDescription();
        } else if (SA.contains(str)) {
            return cont.SOUTH_AMERICA.getDescription();
        } else if (AO.contains(str)) {
            return cont.AUSTRALIA_OCEANIA.getDescription();
        } else {
            return cont.UNKNOWN.getDescription();
        }
    }
}
