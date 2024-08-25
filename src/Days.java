public enum Days {
    MONDAY("ДҮЙШӨМБУ"),
    TUESDAY("ШЕЙШЕМБИ"),
    WEDNESDAY("ШАРШЕМБИ"),
    THURSDAY("ЖЕКШЕМБИ"),
    FRIDAY("ЖУМА"),
    SATURDAY("ИШЕМБИ"),
    SUNDAY("ЖЕКШЕМБИ");

    private final String kyrgyz;


    Days(String kyrgyzName) {
        this.kyrgyz = kyrgyzName;

    }

    public String languages (String language){
        return switch (language){
            case "kyrgyz" -> kyrgyz;
            default -> name();
        };
    }



}
