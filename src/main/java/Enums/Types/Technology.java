package Enums.Types;


public enum Technology {

    AGRICULTURE(20, null, "AGRICULTURE"),
    ANIMAL_HUSBANDRY(35, new Technology[]{AGRICULTURE}, "ANIMAL_HUSBANDRY"),
    ARCHERY(35, new Technology[]{AGRICULTURE}, "ARCHERY"),
    MINING(35, new Technology[]{AGRICULTURE}, "MINING"),
    POTTERY(35, new Technology[]{AGRICULTURE}, "POTTERY"),
    BRONZE_WORKING(55, new Technology[]{MINING}, "BRONZE_WORKING"),
    CALENDER(70, new Technology[]{POTTERY}, "CALENDER"),
    MASONRY(55, new Technology[]{MINING}, "MASONRY"),
    THE_WHEEL(35, new Technology[]{ANIMAL_HUSBANDRY}, "THE_WHEEL"),
    TRAPPING(55, new Technology[]{ANIMAL_HUSBANDRY}, "TRAPPING"),
    WRITING(55, new Technology[]{POTTERY}, "WRITING"),
    CONSTRUCTION(100, new Technology[]{MASONRY}, "CONSTRUCTION"),
    HORSEBACK_RIDING(100, new Technology[]{THE_WHEEL}, "HORSEBACK_RIDING"),
    IRON_WORKING(150, new Technology[]{BRONZE_WORKING}, "IRON_WORKING"),
    MATHEMATICS(100, new Technology[]{ARCHERY, THE_WHEEL}, "MATHEMATICS"),
    PHILOSOPHY(100, new Technology[]{WRITING}, "PHILOSOPHY"),
    ENGINEERING(250, new Technology[]{MATHEMATICS, CONSTRUCTION}, "ENGINEERING"),
    CURRENCY(250, new Technology[]{MATHEMATICS}, "CURRENCY"),
    CIVIL_SERVICE(400, new Technology[]{PHILOSOPHY, TRAPPING}, "CIVIL_SERVICE"),
    CHIVALRY(440, new Technology[]{CIVIL_SERVICE, HORSEBACK_RIDING, CURRENCY}, "CHIVALRY"),
    METAL_CASTING(240, new Technology[]{IRON_WORKING}, "METAL_CASTING"),
    STEEL(440, new Technology[]{METAL_CASTING}, "STEEL"),
    THEOLOGY(250, new Technology[]{CALENDER, PHILOSOPHY}, "THEOLOGY"),
    EDUCATION(440, new Technology[]{THEOLOGY}, "EDUCATION"),
    MACHINERY(440, new Technology[]{ENGINEERING}, "MACHINERY"),
    PHYSICS(440, new Technology[]{ENGINEERING, METAL_CASTING}, "PHYSICS"),
    ACOUSTICS(650, new Technology[]{EDUCATION}, "PHYSICS"),
    ARCHAEOLOGY(1300, new Technology[]{ACOUSTICS}, "ARCHAEOLOGY"),
    BANKING(650, new Technology[]{EDUCATION, CHIVALRY}, "BANKING"),
    GUNPOWDER(680, new Technology[]{PHYSICS, STEEL}, "GUNPOWDER"),
    METALLURGY(900, new Technology[]{GUNPOWDER}, "METALLURGY"),
    CHEMISTRY(900, new Technology[]{GUNPOWDER}, "CHEMISTRY"),
    PRINTING_PRESS(650, new Technology[]{MACHINERY, PHYSICS}, "PRINTING_PRESS"),
    ECONOMICS(900, new Technology[]{PRINTING_PRESS, BANKING}, "ECONOMICS"),
    FERTILIZER(1300, new Technology[]{CHEMISTRY}, "FERTILIZER"),
    MILITARY_SCIENCE(1300, new Technology[]{ECONOMICS, CHEMISTRY}, "MILITARY_SCIENCE"),
    RIFLING(1425, new Technology[]{METALLURGY}, "RIFLING"),
    SCIENTIFIC_THEORY(1300, new Technology[]{ACOUSTICS}, "SCIENTIFIC_THEORY"),
    BIOLOGY(1680, new Technology[]{ARCHAEOLOGY, SCIENTIFIC_THEORY}, "BIOLOGY"),
    STEAM_POWER(1680, new Technology[]{SCIENTIFIC_THEORY, MILITARY_SCIENCE}, "STEAM_POWER"),
    DYNAMITE(1900, new Technology[]{FERTILIZER, RIFLING}, "DYNAMITE"),
    RAILROAD(1900, new Technology[]{STEAM_POWER}, "RAILROAD"),
    REPLACEABLE_PARTS(1900, new Technology[]{STEAM_POWER}, "REPLACEABLE_PARTS"),
    ELECTRICITY(1900, new Technology[]{BIOLOGY, STEAM_POWER}, "ELECTRICITY"),
    RADIO(2200, new Technology[]{ELECTRICITY}, "RADIO"),
    TELEGRAPH(2200, new Technology[]{ELECTRICITY}, "TELEGRAPH"),
    ;
    private final int trophyCost;
    private final Technology[] neededTechnology;
    private final String name;


    Technology(int trophyCost, Technology[] neededTechnology, String name) {
        this.trophyCost = trophyCost;
        this.neededTechnology = neededTechnology;
        this.name = name;
    }

    public int getTrophyCost() {
        return trophyCost;
    }

    public String getName() {
        return name;
    }

    public Technology[] getNeededTechnology() {
        return neededTechnology;
    }

}
