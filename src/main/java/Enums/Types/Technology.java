package Enums.Types;


public enum Technology {

    AGRICULTURE(20, null, ERA.ANCIENT),
    ANIMAL_HUSBANDRY(35, new Technology[]{AGRICULTURE}, ERA.ANCIENT),
    ARCHERY(35, new Technology[]{AGRICULTURE}, ERA.ANCIENT),
    MINING(35, new Technology[]{AGRICULTURE}, ERA.ANCIENT),
    POTTERY(35, new Technology[]{AGRICULTURE}, ERA.ANCIENT),
    BRONZE_WORKING(55, new Technology[]{MINING}, ERA.ANCIENT),
    CALENDER(70, new Technology[]{POTTERY}, ERA.ANCIENT),
    MASONRY(55, new Technology[]{MINING}, ERA.ANCIENT),
    THE_WHEEL(35, new Technology[]{ANIMAL_HUSBANDRY}, ERA.ANCIENT),
    TRAPPING(55, new Technology[]{ANIMAL_HUSBANDRY}, ERA.ANCIENT),
    WRITING(55, new Technology[]{POTTERY}, ERA.ANCIENT),


    CONSTRUCTION(100, new Technology[]{MASONRY}, ERA.CLASSICAL),
    HORSEBACK_RIDING(100, new Technology[]{THE_WHEEL}, ERA.CLASSICAL),
    IRON_WORKING(150, new Technology[]{BRONZE_WORKING}, ERA.CLASSICAL),
    MATHEMATICS(100, new Technology[]{ARCHERY, THE_WHEEL}, ERA.CLASSICAL),
    PHILOSOPHY(100, new Technology[]{WRITING}, ERA.CLASSICAL),

    ENGINEERING(250, new Technology[]{MATHEMATICS, CONSTRUCTION}, ERA.MEDIEVAL),
    CURRENCY(250, new Technology[]{MATHEMATICS}, ERA.MEDIEVAL),
    CIVIL_SERVICE(400, new Technology[]{PHILOSOPHY, TRAPPING}, ERA.MEDIEVAL),
    CHIVALRY(440, new Technology[]{CIVIL_SERVICE, HORSEBACK_RIDING, CURRENCY}, ERA.MEDIEVAL),
    METAL_CASTING(240, new Technology[]{IRON_WORKING}, ERA.MEDIEVAL),
    STEEL(440, new Technology[]{METAL_CASTING}, ERA.MEDIEVAL),
    THEOLOGY(250, new Technology[]{CALENDER, PHILOSOPHY}, ERA.MEDIEVAL),
    EDUCATION(440, new Technology[]{THEOLOGY}, ERA.MEDIEVAL),
    MACHINERY(440, new Technology[]{ENGINEERING}, ERA.MEDIEVAL),
    PHYSICS(440, new Technology[]{ENGINEERING, METAL_CASTING}, ERA.MEDIEVAL),


    ACOUSTICS(650, new Technology[]{EDUCATION}, ERA.RENAISSANCE),
    ARCHAEOLOGY(1300, new Technology[]{ACOUSTICS}, ERA.RENAISSANCE),
    BANKING(650, new Technology[]{EDUCATION, CHIVALRY}, ERA.RENAISSANCE),
    GUNPOWDER(680, new Technology[]{PHYSICS, STEEL}, ERA.RENAISSANCE),
    METALLURGY(900, new Technology[]{GUNPOWDER}, ERA.RENAISSANCE),
    CHEMISTRY(900, new Technology[]{GUNPOWDER}, ERA.RENAISSANCE),
    PRINTING_PRESS(650, new Technology[]{MACHINERY, PHYSICS}, ERA.RENAISSANCE),
    ECONOMICS(900, new Technology[]{PRINTING_PRESS, BANKING}, ERA.RENAISSANCE),
    FERTILIZER(1300, new Technology[]{CHEMISTRY}, ERA.RENAISSANCE),
    MILITARY_SCIENCE(1300, new Technology[]{ECONOMICS, CHEMISTRY}, ERA.RENAISSANCE),
    RIFLING(1425, new Technology[]{METALLURGY}, ERA.RENAISSANCE),
    SCIENTIFIC_THEORY(1300, new Technology[]{ACOUSTICS}, ERA.RENAISSANCE),




    BIOLOGY (1680 , new Technology[]{ ARCHAEOLOGY, SCIENTIFIC_THEORY}, ERA.INDUSTRIAL),
    STEAM_POWER(1680, new Technology[]{SCIENTIFIC_THEORY,MILITARY_SCIENCE}, ERA.INDUSTRIAL),
    DYNAMITE (1900, new Technology[]{ FERTILIZER, RIFLING}, ERA.INDUSTRIAL),
    RAILROAD(1900 , new Technology[]{ STEAM_POWER}, ERA.INDUSTRIAL),
    REPLACEABLE_PARTS(1900, new Technology[]{ STEAM_POWER}, ERA.INDUSTRIAL),
    ELECTRICITY ( 1900, new Technology[]{BIOLOGY, STEAM_POWER}, ERA.INDUSTRIAL),
    RADIO (2200 , new Technology[]{ELECTRICITY}, ERA.INDUSTRIAL),
    TELEGRAPH(2200, new Technology[]{ELECTRICITY}, ERA.INDUSTRIAL);
    private final int trophyCost;
    private final Technology[] neededTechnology;
    private final ERA era;

    Technology(int trophyCost, Technology[] neededTechnology, ERA era) {
        this.era = era;
        this.trophyCost = trophyCost;
        this.neededTechnology = neededTechnology;
    }

    public ERA getEra() {
        return era;
    }

    public int getTrophyCost() {
        return trophyCost;
    }

    public Technology[] getNeededTechnology() {
        return neededTechnology;
    }
}
