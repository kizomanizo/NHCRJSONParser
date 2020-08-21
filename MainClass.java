public class MainClass {

    public static void main (String[] args) {
        String samplePayload = "{\"clients\":[{\"SendingFacility\":\"Mirembe MHH\",\"SendingApplication\":\"AfyaCare\",\"MessageTimestamp\":\"20200603061940\",\"PostorUpdate\":\"P\",\"uuid\":\"52c9fa36-6b7f-483f-8c4a-1ad033e78618\",\"firstname\":\"Mohamed\",\"middlename\":\"Abdallah\",\"lastname\":\"Tluway\",\"othername\":\"Mkali\",\"uln\":\"981426-6090\",\"national_id\":\"06108133-18158-34499-44\",\"voter_id\":\"T-2143-1382-688-4\",\"dl_id\":\"4004504459\",\"nhif_id\":\"773406259824\",\"ichf_id\":\"947294-2245\",\"rita_id\":\"826164-9305\",\"ctc_id\":\"1917505390\",\"tb_id\":\"2681333920\",\"sex\":\"MALE\",\"dob\":\"2020-03-15 21:55:43\",\"region\":\"Manyara\",\"council\":\"Kiteto\",\"ward\":\"Ayasanda\",\"village\":\"Robayambao\",\"hamlet\":\"Tutani\",\"place_of_birth\":\"Geita\",\"phone_prefix\":\"0754\",\"phone_suffix\":\"886287\",\"family_linkages\":\"Jafari Quang\",\"other_linkages\":\"\",\"place_encountered\":\"Mirembe MMHH\",\"status\":0},{\"SendingFacility\":\"Mirembe MHH\",\"SendingApplication\":\"AfyaCare\",\"MessageTimestamp\":\"20200603061940\",\"PostorUpdate\":\"P\",\"uuid\":\"52c9fa36-6b7f-483f-8c4a-1ad033e78618\",\"firstname\":\"Mohamed\",\"middlename\":\"Abdallah\",\"lastname\":\"Tluway\",\"othername\":\"Mkali\",\"uln\":\"981426-6090\",\"national_id\":\"06108133-18158-34499-44\",\"voter_id\":\"T-2143-1382-688-4\",\"dl_id\":\"4004504459\",\"nhif_id\":\"773406259824\",\"ichf_id\":\"947294-2245\",\"rita_id\":\"826164-9305\",\"ctc_id\":\"1917505390\",\"tb_id\":\"2681333920\",\"sex\":\"FEMALE\",\"dob\":\"2020-03-15 21:55:43\",\"region\":\"Manyara\",\"council\":\"Kiteto\",\"ward\":\"Ayasanda\",\"village\":\"Robayambao\",\"hamlet\":\"Tutani\",\"place_of_birth\":\"Geita\",\"phone_prefix\":\"0754\",\"phone_suffix\":\"886287\",\"family_linkages\":\"Jafari Quang\",\"other_linkages\":\"\",\"place_encountered\":\"Mirembe MMHH\",\"status\":0}]}";
        String jsoNtoTxt = new AfyacareJSONParser().JSONtoTxt(samplePayload);
        System.out.println(jsoNtoTxt);
    }
} 