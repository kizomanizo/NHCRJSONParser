public class MainClass {

    public static void main (final String[] args) {
        final String samplePayload = "{\"clients\":[{\"messageTimestamp\":\"20200603061940\",\"postOrUpdate\":\"P\",\"uuid\":\"52c9fa36-6b7f-483f-8c4a-1ad033e78618\",\"firstName\":\"Robert\",\"middleName\":\"Amina\",\"lastName\":\"Jongwe\",\"otherName\":\"Raia\",\"uln\":\"981426-6090\",\"dlId\":\"4004504459\",\"nhifId\":\"773406259824\",\"ichfId\":\"947294-2245\",\"ctcId\":\"1917505390\",\"tbId\":\"2681333920\",\"sex\":1,\"dob\":\"2020-03-15 21:55:43\",\"permanentRegion\":\"Manyara\",\"permanentCouncil\":\"Kiteto\",\"permanentWard\":\"Ayasanda\",\"permanentVillage\":\"Robayambao\",\"permanenthamlet\":\"Tutani\",\"placeOfBirth\":\"Geita\",\"phonePrefix\":\"0754\",\"phoneSuffix\":\"886287\",\"familyLinkages\":\"Jafari Quang\",\"otherLinkages\":\"\",\"placeEncountered\":\"Mirembe MMHH\",\"clientStatus\":0},{\"messageTimestamp\":\"20200603061940\",\"postOrUpdate\":\"P\",\"uuid\":\"52c9fa36-6b7f-483f-8c4a-1ad020e78618\",\"firstName\":\"John\",\"middleName\":\"Mteja\",\"lastName\":\"Wakwetu\",\"otherName\":\"Jomwa\",\"uln\":\"981426-6092\",\"dlId\":\"4004504460\",\"nhifId\":\"773406259825\",\"ichfId\":\"947294-2246\",\"ctcId\":\"1917505392\",\"tbId\":\"2681333922\",\"sex\":1,\"dob\":\"2020-03-15 21:55:43\",\"permanentRegion\":\"Arusha\",\"permanentCouncil\":\"Matejoo\",\"permanentWard\":\"Majengo\",\"permanentVillage\":\"Ngumi ya Kichwa\",\"permanenthamlet\":\"Tutani\",\"placeOfBirth\":\"Dar es Salaam\",\"phonePrefix\":\"0754\",\"phoneSuffix\":\"886289\",\"familyLinkages\":\"\",\"otherLinkages\":\"\",\"placeEncountered\":\"Mirembe MMHH\",\"clientStatus\":0}]}";
        final String jsonToTxt = new AfyacareJSONParser().jsonToString(samplePayload);
        System.out.println(jsonToTxt);
    }
}

                                        

                        
            